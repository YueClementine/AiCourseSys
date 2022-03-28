package com.yuebing.aicoursesys.controller;
//导包
import java.io.File;
import java.util.*;

import com.yuebing.aicoursesys.domain.Ppt;
import com.yuebing.aicoursesys.domain.UserExample;
import com.yuebing.aicoursesys.domain.Video;
import com.yuebing.aicoursesys.mapper.UserMapper;
import com.yuebing.aicoursesys.service.UploadPptService;
import com.yuebing.aicoursesys.service.UploadVideoService;
import com.yuebing.aicoursesys.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

@RestController
public class VideoUploadController {
    @Autowired
    private UploadPptService uploadPptService;

    @Autowired
    private UploadVideoService uploadVideoService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserMapper userMapper;


    //实现接收的方法
    @CrossOrigin
    @PostMapping(value = "/uploadVideo")
    @ResponseBody
    public Map<String,String> savaVideotest(@RequestParam("file") MultipartFile file,@RequestParam String SavePath)
            throws IllegalStateException {
        Map<String,String> resultMap = new HashMap<>();
        try{
            //获取文件后缀，因此此后端代码可接收一切文件，上传格式前端限定
            String fileExt = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1)
                    .toLowerCase();
            // 重构文件名称
            System.out.println("前端传递的保存路径："+SavePath);
            String pikId = UUID.randomUUID().toString().replaceAll("-", "");
            String newVideoName = pikId + "." + fileExt;
            System.out.println("重构文件名防止上传同名文件："+newVideoName);
            //保存视频
            File fileSave = new File(SavePath, newVideoName);
            file.transferTo(fileSave);
            //构造Map将视频信息返回给前端
            //视频名称重构后的名称
            resultMap.put("newVideoName",newVideoName);
            //正确保存视频则设置返回码为200
            resultMap.put("resCode","200");
            //返回视频保存路径
            resultMap.put("VideoUrl", newVideoName);
            return resultMap;

        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
            //保存视频错误则设置返回码为400
            resultMap.put("resCode","400");
            return  resultMap ;

        }
    }

    @CrossOrigin
    @PostMapping(value = "insertppt")
    @ResponseBody
    public Boolean insertFileInfo(@RequestParam("filename") String filename, @RequestParam("fileaddress") String fileAddress, HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        String username = jwtTokenUtil.getUsernameFromToken(token);
        UserExample userExample = new UserExample();
        userExample.or().andUsernameEqualTo(username);
        long userid = userMapper.selectByExample(userExample).get(0).getUserid();

        Ppt ppt = new Ppt();
        ppt.setPptaddress(fileAddress);
        ppt.setUserid(userid);
        ppt.setPptname(filename);
        return uploadPptService.insertPptInfo(ppt);
    }

    @CrossOrigin
    @PostMapping(value = "insertvideo")
    @ResponseBody
    public Boolean insertVideoInfo(@RequestParam("videoname") String filename, @RequestParam("videoaddress") String fileAddress, HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        String username = jwtTokenUtil.getUsernameFromToken(token);
        UserExample userExample = new UserExample();
        userExample.or().andUsernameEqualTo(username);
        long userid = userMapper.selectByExample(userExample).get(0).getUserid();
        Video video = new Video();
        video.setUserid(userid);

        video.setVideoaddress(fileAddress);
        video.setVideoname(filename);
        return uploadVideoService.insertVideo(video);
    }


}

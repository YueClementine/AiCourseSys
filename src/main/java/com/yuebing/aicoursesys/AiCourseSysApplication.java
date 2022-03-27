package com.yuebing.aicoursesys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.util.unit.DataSize;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.servlet.MultipartConfigElement;

@CrossOrigin
@SpringBootApplication
@MapperScan("com.yuebing.aicoursesys.mapper")
public class AiCourseSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiCourseSysApplication.class, args);
    }

    /**
     * 文件上传配置
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //单个文件最大
        factory.setMaxFileSize(DataSize.parse("400MB")); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize(DataSize.parse("400MB"));
        return factory.createMultipartConfig();
    }


}

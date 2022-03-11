package com.yuebing.aicoursesys.utils;

import io.jsonwebtoken.*;

import java.util.Date;
import java.util.UUID;

public class JwtUtils {
    //过期时间
    private static long time = 1000*60*60*24;
    //密钥
    private static String SING = "adADafnjk21^TJSVFD%$JFGE&^%DGHJDF^&min";

    /**
     * 创建token方法
     * @return
     */
    public static String createToken(){
        JwtBuilder jwtBuilder = Jwts.builder();
        String jwtToken = jwtBuilder
                //header
                .setHeaderParam("typ","JWT")
                .setHeaderParam("alg","HS256")
                //payload
                .claim("username","admin")
                .claim("role","admin")
                .setExpiration(new Date(System.currentTimeMillis()+1000*60*60*24)) //过期时间
                .setId(UUID.randomUUID().toString())
                //signature
                .signWith(SignatureAlgorithm.HS256,SING)
                .compact();

        return jwtToken;
    }

    /**
     * 验证token
     * @param token
     * @return
     */
    public static boolean checkToken(String token){
        if(token==null){
            return false;
        }
        try {
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey(SING).parseClaimsJws(token);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

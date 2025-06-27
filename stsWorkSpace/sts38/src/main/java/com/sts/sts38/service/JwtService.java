package com.sts.sts38.service;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JwtService {
    // String accessKey = "";
    String secretKey = "12345678901234567890123456789012";
    public String create(String id){
        Algorithm algorithm = Algorithm.HMAC256(secretKey);
        String jwtToken = JWT.create()
                            .withSubject("문서제목")
                            .withClaim("id",id)
                            .withClaim("msg", "abckj")
                            .withClaim("nonce", UUID.randomUUID().toString())
                            .sign(algorithm);
        return jwtToken;
    }

    public String Verify(String token){
        DecodedJWT decodedJWT;
        try {
            Algorithm algorithm = Algorithm.HMAC256(secretKey);
            JWTVerifier verifier = JWT.require(algorithm).build();
                
            decodedJWT = verifier.verify(token);
            String payload = decodedJWT.getClaims().get("id").asString();
            String msg = decodedJWT.getClaims().get("msg").asString();
            return payload+":"+msg;
        } catch (JWTVerificationException exception){
            throw new RuntimeException("잘못된 토큰");
        }
    }
}

// src/main/java/com/exemple/escola_projeto/config/JwtUtil.java
package com.exemple.escola_projeto.config;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {

    private static final String SECRET_KEY = "uma-chave-muito-secreta"; 

    /**
     * Gera um JWT SEM expiração.
     */
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}

package com.bright.star.infrastructure.auth;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/12
 * @description
 **/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@Component
public class JWTAccessToken {

    private static final String JWT_TOKEN_SIGNING_PRIVATE_KEY = "601304E0-8AD4-40B0-BD51-0B432DC47461";

    @Autowired
    public JWTAccessToken(UserDetailsService userDetailService) {
    }

}

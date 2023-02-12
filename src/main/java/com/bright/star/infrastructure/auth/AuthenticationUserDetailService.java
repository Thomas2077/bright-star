package com.bright.star.infrastructure.auth;

import com.bright.star.service.app.UserAuthService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/12
 * @description
 **/
@Component
@AllArgsConstructor
public class AuthenticationUserDetailService implements UserDetailsService {

    private final UserAuthService userAuthService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new AuthenticUser(userAuthService.getById(String.valueOf(username)));
    }
}

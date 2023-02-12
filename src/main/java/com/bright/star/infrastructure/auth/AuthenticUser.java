package com.bright.star.infrastructure.auth;

import com.bright.star.infrastructure.persistence.entity.UserAuth;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/12
 * @description
 **/
public class AuthenticUser extends UserAuth implements UserDetails {
    /**
     * 该用户拥有的授权，譬如读取权限、修改权限、增加权限等等
     */
    private Collection<GrantedAuthority> authorities = new HashSet<>();

    public AuthenticUser(){
        super();
        authorities.add(new SimpleGrantedAuthority(getUserRole()));
    }

    public AuthenticUser(UserAuth userAuth) {
        this();
        BeanUtils.copyProperties(userAuth, this);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getUsername() {
        return getUserCode();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

package com.ukim.mk.demo15544543.model.enumerations;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    ROLE_BASIC, ROLE_PREMIUM;

    @Override
    public String getAuthority() {
        return name();
    }
}

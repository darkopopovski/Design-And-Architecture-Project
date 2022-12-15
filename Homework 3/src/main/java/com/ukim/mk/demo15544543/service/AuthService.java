package com.ukim.mk.demo15544543.service;

import com.ukim.mk.demo15544543.model.Users;
import org.springframework.security.core.userdetails.User;

public interface AuthService {
    Users login(String username, String password);
}


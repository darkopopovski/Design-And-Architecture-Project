package com.ukim.mk.demo15544543.service;


import com.ukim.mk.demo15544543.model.Users;
import com.ukim.mk.demo15544543.model.enumerations.Role;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsersService  extends UserDetailsService {


    Users findById(Integer user_id);
    List<Users> listAll();
    Users register(Integer user_id, String user_username, String user_password, String user_email, String user_name, Role role);
}

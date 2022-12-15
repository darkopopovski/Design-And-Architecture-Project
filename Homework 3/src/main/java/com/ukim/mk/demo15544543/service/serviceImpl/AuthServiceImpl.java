package com.ukim.mk.demo15544543.service.serviceImpl;

import com.ukim.mk.demo15544543.model.Users;
import com.ukim.mk.demo15544543.model.exceptions.InvalidArgumentsException;
import com.ukim.mk.demo15544543.model.exceptions.InvalidUserCredentialsException;
import com.ukim.mk.demo15544543.repo.UsersRepository;
import com.ukim.mk.demo15544543.service.AuthService;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UsersRepository userRepository;

    public AuthServiceImpl(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users login(String username, String password) {
        if (username==null || username.isEmpty() || password==null || password.isEmpty()) {
            throw new InvalidArgumentsException();
        }
        return userRepository.findByUsernameAndPassword(username,password).orElseThrow(InvalidUserCredentialsException::new);
    }

}


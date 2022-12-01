package com.ukim.mk.demo15544543;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Demo15544543Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo15544543Application.class, args);
    }
    @Bean
    PasswordEncoder passwordEncoder ()
    {
        return new BCryptPasswordEncoder();
    }
}

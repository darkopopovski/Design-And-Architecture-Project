package com.ukim.mk.demo15544543.model;


import com.ukim.mk.demo15544543.model.enumerations.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Users {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer user_id;


    public Users(String user_username, String user_password, String user_name, String user_email,Role role) {
        this.user_username = user_username;
        this.user_password = user_password;
        this.user_name = user_name;
        this.user_email = user_email;
        this.role = role;
    }

    String user_username;
    String user_password;
    String user_name;
    String user_email;

    @Enumerated(value = EnumType.STRING)
    private Role role;


    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

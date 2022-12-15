package com.ukim.mk.demo15544543.repo;


import com.ukim.mk.demo15544543.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users,Integer> {

    @Query(value="select * from users where user_username=?",nativeQuery = true)
    Optional<Users> findByUsername(String user_username);
    @Query(value="select * from users where user_username=? and user_password=?",nativeQuery = true)
    Optional<Users> findByUsernameAndPassword(String user_username, String password);

}

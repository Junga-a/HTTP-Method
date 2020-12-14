package com.example.study.repository;

import com.example.study.Model.entity.User;
import com.example.study.repository.StudyApplicationTests;
import com.example.study.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class userRepositoryTest extends StudyApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void create(){
        User user = new User();
        user.setAccount("TestUser01");
        user.setEmail("TestUser01@gmail.com");
        user.setPhoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser01");

        User newUser = userRepository.save(user);
        System.out.println("newUser: " +newUser);

    }
//    public void read(){
//
//    }
//    public void update(){
//
//    }
//    public void delete(){
//
//    }
}

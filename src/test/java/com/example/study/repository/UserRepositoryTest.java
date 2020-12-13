package com.example.study.repository;

import com.example.study.StudyApplication;
import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Iterator;

public class UserRepositoryTest extends StudyApplication {
    //Dependency Injection(DI)
    @Autowired
    private UserRepository userRepository;
    @Test
    public void create(){
        //String sql=insert into user(%s,%s,%d)value(account,email,age);
        User user = new User();
        user.setAccount("TestUser01");
        user.setEmail("TestUser01@gmail.com");
        user.setphoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser01");

        User newUser = userRepository.save(user);
        System.out.printlm("newUser: " +newUser);

    }
    public void read(){

    }
    public void update(){

    }
    public void delete(){

    }
}

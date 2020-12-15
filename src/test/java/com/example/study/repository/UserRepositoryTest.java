package com.example.study.repository;

import com.example.study.Model.entity.User;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Optional;

class UserRepositoryTest extends StudyApplicationTests {
    private UserRepository userRepository;

    @Test
    public void create() {
        User user = new User();
        user.setAccount("TestUser01");
        user.setEmail("TestUser01@gmail.com");
        user.setPhoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser01");

        User newUser = userRepository.save(user);
        System.out.println("newUser: " + newUser);

    }
    public void read(){
        Optional<User> user=userRepository.findById(2L);
        user.ifPresent(selectUser->{
            System.out.println("user: "+selectUser);
            System.out.println("email: "+selectUser.getEmail());
        });

    }

    public void update(){
        Optional<User> user=userRepository.findById(2L);
        user.ifPresent(selectUser->{
            selectUser.setAccount("PPPP");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method()");
            userRepository.save(selectUser);
        });

    }
    public void delete(){
        Optional<User> user=userRepository.findById(2L);
        user.ifPresent(selectUser->{
            userRepository.delete(selectUser);
        });

        Optional<User> deleteUser=userRepository.findById(2L);

        if(deleteUser.isPresent()){
            System.out.println("데이터 존재: "+deleteUser.get());
        }
        else{
            System.out.println("데이터 삭제 데이터 없음");
        }
    }
}
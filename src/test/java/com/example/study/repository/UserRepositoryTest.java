package com.example.study.repository;

import com.example.study.Model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Optional;

class UserRepositoryTest extends StudyApplicationTests {
    private UserRepository userRepository;

    @Test
    public void create() {
        String account = "Test01";
        String password = "Test01";
        String status = "REGISTERED";
        String email = "Test01@gmail.com";
        String phoneNumber = "010-1111-2222";
        LocalDateTime registeredAt = LocalDateTime.now();
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy= "AdminServer";

        User user=new User();
        user.setAccount(account);
        user.setPassword(password);
        user.setStatus(status);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setRegisteredAt(registeredAt);
        user.setCreatedAt(createdAt);
        user.setCreatedBy(createdBy);

        User newUser=userRepository.save(user);
        Assertions.assertNotNull(newUser);
    }



//    public void read() {
//        User user =userRepository.findByFirstPhoneNumberOrderDesc("010-1111-2222");
//        Assertions.assertNotNull(user);
//    }
//
//    public void update() {
//        Optional<User> user = userRepository.findById(2L);
//        user.ifPresent(selectUser -> {
//            selectUser.setAccount("PPPP");
//            selectUser.setUpdatedAt(LocalDateTime.now());
//            selectUser.setUpdatedBy("update method()");
//            userRepository.save(selectUser);
//        });
//
//    }
//
//    public void delete() {
//        Optional<User> user = userRepository.findById(2L);
//        user.ifPresent(selectUser -> {
//            userRepository.delete(selectUser);
//        });
//
//        Optional<User> deleteUser = userRepository.findById(2L);
//
//        if (deleteUser.isPresent()) {
//            System.out.println("데이터 존재: " + deleteUser.get());
//        } else {
//            System.out.println("데이터 삭제 데이터 없음");
//        }
    }

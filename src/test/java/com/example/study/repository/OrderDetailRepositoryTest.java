package com.example.study.repository;


import com.example.study.Model.entity.OrderDetail;
import com.example.study.Model.entity.OrderDetail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create() {
        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setOrderAt(LocalDate.now());
        orderDetail.setId(7L);
        orderDetail.setId(1L);

        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);
        Assertions.assertNotNull(newOrderDetail);
    }


}
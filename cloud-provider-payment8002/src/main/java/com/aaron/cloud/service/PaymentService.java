package com.aaron.cloud.service;

import com.aaron.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author liuwenchao
 * @create 2020-06-09 22:37
 **/
public interface PaymentService {
    int create(Payment payment); //写

    Payment getPaymentById(@Param("id") Long id);  //读取

}

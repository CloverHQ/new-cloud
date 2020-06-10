package com.aaron.cloud.service.impl;

import com.aaron.cloud.dao.PaymentDao;
import com.aaron.cloud.entities.Payment;
import com.aaron.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liuwenchao
 * @create 2020-06-09 22:38
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}

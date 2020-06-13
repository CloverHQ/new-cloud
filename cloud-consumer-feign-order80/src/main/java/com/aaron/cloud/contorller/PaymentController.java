package com.aaron.cloud.contorller;

import com.aaron.cloud.entities.CommonResult;
import com.aaron.cloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuwenchao
 * @create 2020-06-13 19:40
 **/
@RestController
@RequestMapping("/consumer")
public class PaymentController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentTimeout(){
        return paymentFeignService.paymentTimeout();
    }
}

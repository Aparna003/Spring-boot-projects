package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service// used for utility classes
public class OrderService {
    private PaymentService paymentService;


    public OrderService(){}
    @Autowired
    public OrderService(PaymentService paymentService,int x){
            this.paymentService = paymentService;
    }

    public void placeOrder() {
//        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}

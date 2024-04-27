package com.vania.controllers;

import com.vania.entities.Payment;
import com.vania.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PutMapping("/payment")
    public Payment payment(@RequestBody Payment payment){
        return paymentService.payment(payment);
    }

    @GetMapping("/payment/{id}")
    public Payment getPaymentById(@PathVariable String id){
        return paymentService.getPaymentById(id);
    }

    @GetMapping("/payments")
    public List<Payment> getAllPayment(){
        return paymentService.getAllPayment();
    }
}

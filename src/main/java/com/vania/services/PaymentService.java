package com.vania.services;

import com.vania.entities.Payment;

import java.util.List;

public interface PaymentService {
    Payment payment(Payment payment);
    Payment getPaymentById(String id);
    List<Payment> getAllPayment();
}

package com.vania.services;

import com.vania.entities.Order;
// import com.vania.entities.Payment;

import java.math.BigDecimal;
import java.util.List;

public interface OrderService {
    Order ordering(Order order);
    Order getOrderById(String id);
    List<Order> getListOfOrder();
    List<Order> getUnpaidOrder();
    BigDecimal getTotalIncome();
}

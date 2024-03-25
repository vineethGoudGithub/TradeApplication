package com.sathya.orm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sathya.orm.entity.OrderMaster;
import com.sathya.orm.entity.TradeDetails;
import com.sathya.orm.service.OrderService;

import java.math.BigDecimal;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public OrderMaster createOrder(@RequestParam Long tradeId,
                                   @RequestParam int quantity,
                                   @RequestParam BigDecimal pricePerUnit,
                                   @RequestParam String tradeType) {
        // Implement logic to fetch tradeDetails based on tradeId
        // For simplicity, let's assume it's provided directly
        TradeDetails tradeDetails = new TradeDetails();
        tradeDetails.setTradeId(tradeId);
        
        return orderService.createOrder(tradeDetails, quantity, pricePerUnit, tradeType);
    }
}


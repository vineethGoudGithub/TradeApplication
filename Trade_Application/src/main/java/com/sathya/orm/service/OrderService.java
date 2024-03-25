package com.sathya.orm.service;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.orm.entity.OrderMaster;
import com.sathya.orm.entity.TradeDetails;
import com.sathya.orm.repository.OrderMasterRepository;

@Service
public class OrderService {
 @Autowired
 private OrderMasterRepository orderMasterRepository;

 public OrderMaster createOrder(TradeDetails tradeDetails, int quantity, BigDecimal pricePerUnit, String tradeType) {
     OrderMaster order = new OrderMaster();
     order.setTradeDetails(tradeDetails);
     order.setQuantity(quantity);
     order.setPricePerUnit(pricePerUnit);
     order.setTradeType(tradeType);
     order.setStatus("created");
     return orderMasterRepository.save(order);
 }
}

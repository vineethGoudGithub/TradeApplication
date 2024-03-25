package com.sathya.orm.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.orm.entity.TradeDetails;
import com.sathya.orm.repository.TradeDetailsRepository;

import java.util.List;

@Service
public class TradeService {
 @Autowired
 private TradeDetailsRepository tradeDetailsRepository;

 public List<TradeDetails> getAllTrades() {
     return tradeDetailsRepository.findAll();
 }

 public TradeDetails saveTrade(TradeDetails tradeDetails) {
     return tradeDetailsRepository.save(tradeDetails);
 }

 public void deleteTrade(Long tradeId) {
     tradeDetailsRepository.deleteById(tradeId);
 }
}

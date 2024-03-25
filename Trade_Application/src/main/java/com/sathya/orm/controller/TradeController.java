package com.sathya.orm.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sathya.orm.entity.TradeDetails;
import com.sathya.orm.service.TradeService;

import java.util.List;

@RestController
@RequestMapping("/trades")
public class TradeController {
 @Autowired
 private TradeService tradeService;

 @GetMapping
 public List<TradeDetails> getAllTrades() {
     return tradeService.getAllTrades();
 }

 @PostMapping
 public TradeDetails saveTrade(@RequestBody TradeDetails tradeDetails) {
     return tradeService.saveTrade(tradeDetails);
 }

 @DeleteMapping("/{tradeId}")
 public void deleteTrade(@PathVariable Long tradeId) {
     tradeService.deleteTrade(tradeId);
 }
}

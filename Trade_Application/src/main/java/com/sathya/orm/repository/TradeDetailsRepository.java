package com.sathya.orm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathya.orm.entity.TradeDetails;

public interface TradeDetailsRepository extends JpaRepository<TradeDetails, Long> {
	
	
}

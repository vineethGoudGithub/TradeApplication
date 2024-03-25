package com.sathya.orm.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
	public class OrderMaster {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long orderId;
	    @OneToOne
	    private TradeDetails tradeDetails;
	    private int quantity;
	    private BigDecimal pricePerUnit;
	    private String tradeType;
	    private String status;

	 
	}



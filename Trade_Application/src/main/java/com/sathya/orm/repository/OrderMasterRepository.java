package com.sathya.orm.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.sathya.orm.entity.OrderMaster;

public interface OrderMasterRepository extends JpaRepository<OrderMaster, Long> {
	
}

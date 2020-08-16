package com.hareesh.springstatemachine.springstatemachinedemo.repository;

import com.hareesh.springstatemachine.springstatemachinedemo.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

package com.lollipop.sccrm.domain.repository;

import com.lollipop.sccrm.domain.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

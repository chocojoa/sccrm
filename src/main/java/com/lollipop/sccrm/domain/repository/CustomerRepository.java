package com.lollipop.sccrm.domain.repository;

import com.lollipop.sccrm.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

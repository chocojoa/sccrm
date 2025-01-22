package com.lollipop.sccrm.domain.repository;

import com.lollipop.sccrm.domain.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}

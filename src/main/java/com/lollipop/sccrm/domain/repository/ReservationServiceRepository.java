package com.lollipop.sccrm.domain.repository;

import com.lollipop.sccrm.domain.entity.ReservationService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationServiceRepository extends JpaRepository<ReservationService, Long> {
}

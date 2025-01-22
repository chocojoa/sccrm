package com.lollipop.sccrm.domain.repository;

import com.lollipop.sccrm.domain.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}

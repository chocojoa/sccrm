package com.lollipop.sccrm.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "reservations")
public class Reservation extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "reservation_date", nullable = false)
    private Instant reservationDate;

    @ColumnDefault("'Pending'")
    @Lob
    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "reservation")
    private Set<Payment> payments = new LinkedHashSet<>();

    @OneToMany(mappedBy = "reservation")
    private Set<ReservationPackage> reservationPackages = new LinkedHashSet<>();

    @OneToMany(mappedBy = "reservation")
    private Set<ReservationService> reservationServices = new LinkedHashSet<>();

}
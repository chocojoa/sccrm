package com.lollipop.sccrm.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 30)
    private String fullName;

    @Column(name = "phone_number", nullable = false, length = 20)
    private String phoneNumber;

    @Column(name = "email", length = 60)
    private String email;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Lob
    @Column(name = "gender")
    private String gender;

    @Lob
    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "customer")
    private Set<Reservation> reservations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "customer")
    private Set<User> users = new LinkedHashSet<>();

}
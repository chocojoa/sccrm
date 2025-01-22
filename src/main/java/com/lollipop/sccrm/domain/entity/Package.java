package com.lollipop.sccrm.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "packages")
public class Package extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "package_id", nullable = false)
    private Long id;

    @Column(name = "package_name", nullable = false, length = 100)
    private String packageName;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @OneToMany(mappedBy = "packageField")
    private Set<PackageService> packageServices = new LinkedHashSet<>();

    @OneToMany(mappedBy = "packageField")
    private Set<ReservationPackage> reservationPackages = new LinkedHashSet<>();

}
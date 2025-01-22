package com.lollipop.sccrm.domain.repository;

import com.lollipop.sccrm.domain.entity.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<Package, Long> {
}

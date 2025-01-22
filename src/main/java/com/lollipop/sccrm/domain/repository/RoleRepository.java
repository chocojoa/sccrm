package com.lollipop.sccrm.domain.repository;

import com.lollipop.sccrm.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}

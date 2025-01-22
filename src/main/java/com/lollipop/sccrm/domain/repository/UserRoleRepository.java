package com.lollipop.sccrm.domain.repository;

import com.lollipop.sccrm.domain.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}

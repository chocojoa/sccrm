package com.lollipop.sccrm.domain.repository;

import com.lollipop.sccrm.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.example.my_springboot_structure.domain.user.repository;

import com.example.my_springboot_structure.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long> {
}

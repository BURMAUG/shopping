package com.burmau.shop.repository;

import com.burmau.shop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserBy(String username);
}

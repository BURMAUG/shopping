package com.burmau.shop.repository;

import com.burmau.shop.model.User;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserBy(String username);
=======
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
>>>>>>> 6d726dc (most classes and packages)
}

package com.burmau.shop.service;

import com.burmau.shop.model.User;
import com.burmau.shop.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public User register(User user){
        user.setUsername(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}

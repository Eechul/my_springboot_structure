package com.example.my_springboot_structure.domain.user.service;

import com.example.my_springboot_structure.domain.user.entity.User;
import com.example.my_springboot_structure.domain.user.exception.UserNotFoundException;
import com.example.my_springboot_structure.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("user id: " + id + " / Not found"));
    }

}

package com.example.my_springboot_structure.domain.user.service;

import com.example.my_springboot_structure.domain.user.entity.User;

public interface UserService {

    User findById(Long id);
}

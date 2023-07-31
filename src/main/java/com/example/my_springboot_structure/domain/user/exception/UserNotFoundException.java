package com.example.my_springboot_structure.domain.user.exception;


import com.example.my_springboot_structure.global.code.ErrorCode;
import com.example.my_springboot_structure.global.error.exception.BusinessException;

public class UserNotFoundException extends BusinessException {

    public UserNotFoundException(String message) {
        super(message, ErrorCode.USER_NOT_FOUND);
    }

    public UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}

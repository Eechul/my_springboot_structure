package com.example.my_springboot_structure.global.code;

import com.example.my_springboot_structure.global.error.exception.BusinessException;

public class InvalidValueException extends BusinessException {

    public InvalidValueException(String message) {
        super(message, ErrorCode.INVALID_TYPE_VALUE);
    }
    public InvalidValueException(String value, ErrorCode errorCode) {
        super(value, errorCode);
    }
}

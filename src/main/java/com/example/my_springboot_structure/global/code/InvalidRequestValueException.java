package com.example.my_springboot_structure.global.code;

import com.example.my_springboot_structure.global.error.exception.BusinessException;

public class InvalidRequestValueException extends BusinessException {

    public InvalidRequestValueException(String message) {
        super(message, ErrorCode.INVALID_REQUEST_VALUE);
    }
    public InvalidRequestValueException(String value, ErrorCode errorCode) {
        super(value, errorCode);
    }
}

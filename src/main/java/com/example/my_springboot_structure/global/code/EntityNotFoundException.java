package com.example.my_springboot_structure.global.code;

import com.example.my_springboot_structure.global.error.exception.BusinessException;

public class EntityNotFoundException extends BusinessException {

    public EntityNotFoundException(String message) {
        super(message, ErrorCode.ENTITY_NOT_FOUND);
    }
    public EntityNotFoundException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }
}

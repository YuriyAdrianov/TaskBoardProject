package com.yuriyadr.taskboard.exception;

import com.yuriyadr.taskboard.exception.AppException;

public class NotFoundException extends AppException {
    public NotFoundException(Long id) {
        super("Object with id: " + id + " not found. 404");
    }
}

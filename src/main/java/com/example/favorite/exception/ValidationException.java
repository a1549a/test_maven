package com.example.favorite.exception;

import javax.validation.ConstraintViolation;
import java.util.Set;

public class ValidationException extends RuntimeException {

    private final Set<ConstraintViolation<Object>> constraintViolations;

    public ValidationException(Set<ConstraintViolation<Object>> constraintViolations) {
        this.constraintViolations = constraintViolations;
    }

    public Set<ConstraintViolation<Object>> getConstraintViolations() {
        return constraintViolations;
    }
}

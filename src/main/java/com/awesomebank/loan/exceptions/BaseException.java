package com.awesomebank.loan.exceptions;

import lombok.Getter;

@Getter
public abstract class BaseException extends RuntimeException {
    private final String message;

    protected BaseException(String msg)
    {
        this.message = msg;
    }
}

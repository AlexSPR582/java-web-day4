package com.alexander.day4_1.exception;

public class ArrayException extends Exception {
    public ArrayException() {
        super();
    }

    public ArrayException(String message) {
        super(message);
    }

    public ArrayException(Throwable throwable) {
        super(throwable);
    }

    public ArrayException(String message, Throwable throwable) {
        super(message, throwable);
    }
}

package com.alexander.day4_2.exception;

public class ProgramException extends Exception {
    public ProgramException() {
        super();
    }

    public ProgramException(String message) {
        super(message);
    }

    public ProgramException(Throwable throwable) {
        super(throwable);
    }

    public ProgramException(String message, Throwable throwable) {
        super(message, throwable);
    }
}

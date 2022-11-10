package com.brunoyam.homeworks.threats.normal;

public class WrongLoginException extends Exception{
    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }
}

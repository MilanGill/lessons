package com.brunoyam.homeworks.threats.normal;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
    }
}

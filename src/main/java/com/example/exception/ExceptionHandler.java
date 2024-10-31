package com.example.exception;

public class ExceptionHandler extends Exception {

    public ExceptionHandler(){
        System.out.println("Insufficient funds for withdrawal of: $");
    }
}

package com.example.assignnment4.exception;

public class RestrictedInfo extends Exception{
    @Override
    public String getMessage() {
        return "classifiedInfo";
    }
}
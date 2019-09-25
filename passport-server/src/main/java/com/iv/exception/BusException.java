package com.iv.exception;

public class BusException extends RuntimeException {

    private String errorMsg;

    public BusException(String errorMsg) {

        this.errorMsg = errorMsg;
    }

    public String getErrorMsg(){
        return errorMsg;
    }
}
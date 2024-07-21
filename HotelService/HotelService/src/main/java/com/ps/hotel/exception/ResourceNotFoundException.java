package com.ps.hotel.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("This hotel is not found");
    }

    public ResourceNotFoundException(String s) {
        super(s);
    }
}

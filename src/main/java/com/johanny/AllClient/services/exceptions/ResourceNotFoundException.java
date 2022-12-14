package com.johanny.AllClient.services.exceptions;

public class ResourceNotFoundException extends  RuntimeException {

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}

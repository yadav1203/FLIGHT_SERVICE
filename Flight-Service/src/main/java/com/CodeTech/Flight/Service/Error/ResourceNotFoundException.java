package com.CodeTech.Flight.Service.Error;

public class ResourceNotFoundException extends RuntimeException{


    public ResourceNotFoundException(String message){

        super(message);
    }
}

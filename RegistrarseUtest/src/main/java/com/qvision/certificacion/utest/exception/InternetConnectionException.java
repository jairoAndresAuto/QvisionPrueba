package com.qvision.certificacion.utest.exception;

public class InternetConnectionException extends RuntimeException {

    public static final String INTERNET_FAILED = "Validar conexión a internet, por favor";

    public InternetConnectionException(String message) {
        super(message);
    }
}
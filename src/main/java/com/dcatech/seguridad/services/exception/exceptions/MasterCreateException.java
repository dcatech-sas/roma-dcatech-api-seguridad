package com.dcatech.seguridad.services.exception.exceptions;

public class MasterCreateException extends Exception {
    public static final String DESCRIPCION = "No es posible crear el registro ";

    public MasterCreateException() {
        super(DESCRIPCION);
    }

    public MasterCreateException(String message) {
        super(DESCRIPCION + ": " + message);
    }
}

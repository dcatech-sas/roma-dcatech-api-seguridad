package com.dcatech.seguridad.services.exception.exceptions;

public class MasterResourceExistsException extends Exception {

    public static final String DESCRIPCION = "Existe";

    public MasterResourceExistsException() {
        super(DESCRIPCION);
    }

    public MasterResourceExistsException(String message) {
        super(DESCRIPCION + ": " + message);
    }
}

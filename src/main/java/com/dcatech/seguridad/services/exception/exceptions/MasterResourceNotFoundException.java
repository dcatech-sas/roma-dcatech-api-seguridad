package com.dcatech.seguridad.services.exception.exceptions;

public class MasterResourceNotFoundException extends Exception {

    public static final String DESCRIPCION = "Registro no encontrado";

    public MasterResourceNotFoundException() {
        super(DESCRIPCION);
    }

    public MasterResourceNotFoundException(String message) {
        super(DESCRIPCION + ": " + message);
    }
}

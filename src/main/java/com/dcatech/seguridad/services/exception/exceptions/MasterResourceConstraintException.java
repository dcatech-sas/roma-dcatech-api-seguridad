package com.dcatech.seguridad.services.exception.exceptions;

public class MasterResourceConstraintException extends Exception {

    public static final String DESCRIPCION = "Violación de registro de llave unica";

    public MasterResourceConstraintException() {
        super(DESCRIPCION);
    }

    public MasterResourceConstraintException(String message) {
        super(DESCRIPCION + ": " + message);
    }
}

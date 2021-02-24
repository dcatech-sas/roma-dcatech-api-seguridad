package com.dcatech.seguridad.services.exception.exceptions;

public class MasterResourceInvalidSalarioException extends Exception {

    public static final String DESCRIPCION = "El salario que trata de registrar está por debajo del mínimo legal vigente";

    public MasterResourceInvalidSalarioException() {
        super(DESCRIPCION);
    }

    public MasterResourceInvalidSalarioException(String message) {
        super(DESCRIPCION + ": " + message);
    }
}

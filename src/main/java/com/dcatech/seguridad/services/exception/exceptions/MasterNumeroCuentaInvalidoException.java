package com.dcatech.seguridad.services.exception.exceptions;

public class MasterNumeroCuentaInvalidoException extends Exception {
    public static final String DESCRIPCION = "El numero de cuenta debe ser numérico.";

    public MasterNumeroCuentaInvalidoException() {
        super(DESCRIPCION);
    }
}

package com.dcatech.seguridad.services.exception.exceptions;

public class MasterDeleteException extends Exception {
    public static final String DESCRIPCION = "No es posible eliminar el registro ";

    public MasterDeleteException() {
        super(DESCRIPCION);
    }

    public MasterDeleteException(String message) {
        super(DESCRIPCION + ": " + message);
    }
}

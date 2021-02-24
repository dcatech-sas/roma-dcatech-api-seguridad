package com.dcatech.seguridad.services.exception.exceptions;

public class MasterEditException extends Exception {
    public static final String DESCRIPCION = "No ha sido posible editar el registro ";

    public MasterEditException() {
        super(DESCRIPCION);
    }

    public MasterEditException(String message) {
        super(DESCRIPCION + ": " + message);
    }
}

package com.dcatech.seguridad.services.exception.exceptions;

public class MasterResourceTipoContratoException extends Exception {
    public static final String DESCRIPCION = "Error en el campo TipoContrato";

    public MasterResourceTipoContratoException() {
        super(DESCRIPCION);
    }

    public MasterResourceTipoContratoException(String message) {
        super(DESCRIPCION + " " + message);
    }
}

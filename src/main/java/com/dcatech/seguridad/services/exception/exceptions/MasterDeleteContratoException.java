package com.dcatech.seguridad.services.exception.exceptions;

public class MasterDeleteContratoException extends Exception {
    public static final String DESCRIPCION = "El contrato tiene plantillas asociadas";

    public MasterDeleteContratoException() {
        super(DESCRIPCION);
    }
}

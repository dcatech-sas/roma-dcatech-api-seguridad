package com.dcatech.seguridad.services.exception.exceptions;

public class MasterResourceContratoFijoException extends Exception {

    public static final String DESCRIPCION = "El contrato a registrar es FIJO, la fecha de terminación es requerida.";

    public MasterResourceContratoFijoException() {
        super(DESCRIPCION);
    }

    public MasterResourceContratoFijoException(String message) {
        super(DESCRIPCION + ": " + message);
    }
}

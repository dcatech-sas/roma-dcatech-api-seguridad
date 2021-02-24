package com.dcatech.seguridad.services.exception.exceptions;

public class MasterPlantillaRequeridaException extends Exception {
    public static final String DESCRIPCION = "El contrato requiere una plantilla de tipo general.";

    public MasterPlantillaRequeridaException() {
        super(DESCRIPCION);
    }
}

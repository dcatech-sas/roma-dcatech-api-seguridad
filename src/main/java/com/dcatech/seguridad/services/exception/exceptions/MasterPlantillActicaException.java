package com.dcatech.seguridad.services.exception.exceptions;

public class MasterPlantillActicaException extends Exception {
    public static final String DESCRIPCION = "No es posible asociar plantilla en estado inactivo.";

    public MasterPlantillActicaException() {
        super(DESCRIPCION);
    }
}

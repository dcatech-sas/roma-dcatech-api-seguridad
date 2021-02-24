package com.dcatech.seguridad.services.exception.exceptions;

public class MasterPlantillaVaciaException extends Exception {

    private static final String DESCRIPCION = "La plantilla no tiene conceptos asociados";

    public MasterPlantillaVaciaException() {
        super(DESCRIPCION);
    }
}

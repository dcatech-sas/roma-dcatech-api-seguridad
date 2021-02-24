package com.dcatech.seguridad.services.exception.exceptions;

public class MasterTipoPlantillaException extends Exception {
    private static final String DESCRIPION = "El contrato ya contiene este tipo de plantilla";

    public MasterTipoPlantillaException() {
        super(DESCRIPION);
    }

    public MasterTipoPlantillaException(String message) {
        super(DESCRIPION + " : " + message);
    }
}

package com.example.actividadmvp;

public class Presentator {
    private IPresentator iPresentator;
    private ValidationModel validationModel;

    public Presentator(IPresentator iPresentator) {
        this.iPresentator = iPresentator;
        this.validationModel = new ValidationModel();
    }

    public void showSecurityPassword(String clave){
        validationModel.validacionString(clave);
    }
}

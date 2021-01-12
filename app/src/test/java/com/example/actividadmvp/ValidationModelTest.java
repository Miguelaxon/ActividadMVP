package com.example.actividadmvp;

import android.graphics.Color;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationModelTest {
    private ValidationModel validationModel;

    @Before
    public void setUp() throws Exception {
        validationModel = new ValidationModel();
    }

    @Test
    public void validacionString() {
    }

    @Test
    public void getEstadoClave() {
        //GIVEN
        String testPassword = "debil";
        String testPassword2 = "claveDebil";
        String testPassword3 = "claveMuyFuerte";
        //WHEN
        validationModel.validacionString(testPassword);
        validationModel.validacionString(testPassword2);
        validationModel.validacionString(testPassword3);
        //THEN
        assertEquals(Color.RED, validationModel.getEstadoClave());
    }

    @Test
    public void getMensaje() {
        //GIVEN
        String testPassword = "debil";
        String testPassword2 = "claveDebil";
        //WHEN
        validationModel.validacionString(testPassword2);
        //THEN
        assertEquals("Clave débil", validationModel.getMensaje());
    }
}
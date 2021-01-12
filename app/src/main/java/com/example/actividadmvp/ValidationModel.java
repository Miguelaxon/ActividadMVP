package com.example.actividadmvp;

import android.content.Context;
import android.graphics.Color;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import com.example.actividadmvp.databinding.ActivityMainBinding;

public class ValidationModel extends AppCompatActivity {
    private String mensaje;
    private int estadoClave;

    public int getEstadoClave() {
        return estadoClave;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void validacionString(String texto){
        int largo = texto.length();
        if (largo == 0) {
            estadoClave = Color.WHITE;
            mensaje = "";
        } else if (largo > 0 && largo < 6) {
            estadoClave = Color.RED;
            mensaje = "Clave muy débil";
        } else if (largo > 6 && largo < 11) {
            for (int i = 0; i < largo; i++) {
                if (Character.isUpperCase(texto.charAt(i)) == true) {
                    estadoClave = Color.YELLOW;
                    mensaje = "Clave débil";
                }
            }
        } else if (largo > 11) {
            for (int i = 0; i < largo; i++) {
                if (Character.isUpperCase(texto.charAt(i)) == true) {
                    estadoClave = Color.GREEN;
                    mensaje = "Clave fuerte";
                }
            }
        }
    }
}

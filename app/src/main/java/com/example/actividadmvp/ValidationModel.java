package com.example.actividadmvp;

import android.content.Context;
import android.graphics.Color;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import com.example.actividadmvp.databinding.ActivityMainBinding;

public class ValidationModel extends AppCompatActivity {
    private ActivityMainBinding binding;
    private String estadoClave = "password";
    private String mensaje;

    public void validacionString(String texto){
        int largo = texto.length();
        if (texto.equals(texto.toUpperCase())) {
            if (largo < 0 && largo > 6) {
                estadoClave = "rojo";
                binding.textview.setBackgroundColor(Color.RED);
                Toast.makeText(ValidationModel.this, "Clave muy débil",
                        Toast.LENGTH_SHORT).show();
                //mensaje = "Clave muy débil";
            } else if (largo < 6 && largo > 11) {
                estadoClave = "amarillo";
                binding.textview.setBackgroundColor(Color.YELLOW);
                Toast.makeText(ValidationModel.this, "Clave débil",
                        Toast.LENGTH_SHORT).show();
                //mensaje = "Clave débil";
            } else if (largo < 11 && largo > 16) {
                estadoClave = "verde";
                binding.textview.setBackgroundColor(Color.GREEN);
                Toast.makeText(ValidationModel.this, "Clave fuerte",
                        Toast.LENGTH_SHORT).show();
                //mensaje = "Clave fuerte";
            } else if (largo < 16) {
                estadoClave = "rojo";
                binding.textview.setBackgroundColor(Color.RED);
                Toast.makeText(ValidationModel.this,
                        "Clave muy larga, hasta 15 caracteres", Toast.LENGTH_SHORT).show();
                //mensaje = "Clave muy larga, hasta 15 caracteres";
            }
            estadoClave = "rojo";
            binding.textview.setBackgroundColor(Color.RED);
            Toast.makeText(ValidationModel.this, "Clave sin mayúsculas",
                    Toast.LENGTH_SHORT).show();
            //mensaje = "Clave sin mayúsculas";
        }
    }
}

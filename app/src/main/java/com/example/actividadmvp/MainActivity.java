package com.example.actividadmvp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.actividadmvp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IPresentator {
    private ActivityMainBinding binding;
    private Presentator presentator;
    private IPresentator iPresentator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presentator = new Presentator(iPresentator);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = binding.editTextTextPassword.getText().toString();
                showClave(password);
                binding.textview.setBackgroundColor(colorClave());
                binding.textview.setText(mensajeClave());
            }
        });
    }

    @Override
    public void showClave(String clave) {
        presentator.showSecurityPassword(clave);
    }

    @Override
    public int colorClave() {
        return presentator.colorPassword();
    }

    @Override
    public String mensajeClave() {
        return presentator.mensajePassword();
    }
}
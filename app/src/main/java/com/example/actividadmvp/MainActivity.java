package com.example.actividadmvp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
        binding.editTextTextPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String password = binding.editTextTextPassword.getText().toString();
                showClave(password);
                binding.textview.setBackgroundColor(colorClave());
                binding.textview.setText(mensajeClave());
            }

            @Override
            public void afterTextChanged(Editable s) {

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
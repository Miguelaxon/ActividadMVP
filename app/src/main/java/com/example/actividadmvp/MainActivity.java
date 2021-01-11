package com.example.actividadmvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.actividadmvp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IPresentator {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
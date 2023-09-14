package com.example.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.sampleapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding = null;
    private Calculator calculator = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonCalc.setOnClickListener(v -> {
            String strA = binding.edittextA.getText().toString();
            String strB = binding.edittextB.getText().toString();

            Log.i("SampleApp",  strA + strB);

            int a = Integer.parseInt(binding.edittextA.getText().toString());
            int b = Integer.parseInt(binding.edittextB.getText().toString());

            int result = calculator.sum(a, b);

            binding.textviewResult.setText(Integer.toString(result));
        });
    }


}
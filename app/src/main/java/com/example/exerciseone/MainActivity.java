package com.example.exerciseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.exerciseone.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Log.i("베이자Beyza", "onCreate 실행합니다!");

        binding.buttonOne.setOnClickListener(v -> printLog("버튼1 클릭 했습니다!"));
        binding.buttonTwo.setOnClickListener(v -> printLog("버튼2 클릭 했습니다!도!!"));
        binding.buttonThree.setOnClickListener(v -> printLog("버튼3 클릭 했습니다도!!!"));
        binding.buttonFour.setOnClickListener(v -> printLog("버튼4 클릭 즐겁!"));
        binding.button.setOnClickListener(v -> {
            Log.i("베이자Beyza", "텍스트뷰 내용: " + binding.textView.getText());
            Log.i("베이자Beyza", "EDIT_TEXT 내용: " + binding.edit.getText());
        });
    }

    private void printLog(String message) {
        Log.i("베이자Beyza", message);
    }
}
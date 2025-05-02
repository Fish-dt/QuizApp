package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button generalButton = findViewById(R.id.generalButton);
        Button scienceButton = findViewById(R.id.scienceButton);
        Button historyButton = findViewById(R.id.historyButton);

        generalButton.setOnClickListener(v -> startQuiz("general"));
        scienceButton.setOnClickListener(v -> startQuiz("science"));
        historyButton.setOnClickListener(v -> startQuiz("history"));
    }

    private void startQuiz(String category) {
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }
} 
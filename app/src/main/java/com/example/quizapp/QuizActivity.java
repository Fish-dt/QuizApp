package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView;
import java.util.List;

public class QuizActivity extends AppCompatActivity {
    private List<Question> currentQuestions;
    private int currentQuestionIndex = 0;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        String category = getIntent().getStringExtra("category");
        if (category == null) category = "general";

        switch (category) {
            case "general":
                currentQuestions = QuestionDataSource.generalKnowledgeQuestions;
                break;
            case "science":
                currentQuestions = QuestionDataSource.scienceQuestions;
                break;
            case "history":
                currentQuestions = QuestionDataSource.historyQuestions;
                break;
            default:
                currentQuestions = QuestionDataSource.generalKnowledgeQuestions;
        }

        displayQuestion();
        setupOptionClickListeners();
    }

    private void displayQuestion() {
        if (currentQuestionIndex < currentQuestions.size()) {
            Question question = currentQuestions.get(currentQuestionIndex);
            ((TextView) findViewById(R.id.questionText)).setText(question.getQuestionText());
            ((TextView) findViewById(R.id.option1Text)).setText(question.getOptions().get(0));
            ((TextView) findViewById(R.id.option2Text)).setText(question.getOptions().get(1));
            ((TextView) findViewById(R.id.option3Text)).setText(question.getOptions().get(2));
            ((TextView) findViewById(R.id.option4Text)).setText(question.getOptions().get(3));
        } else {
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("score", score);
            intent.putExtra("total", currentQuestions.size());
            startActivity(intent);
            finish();
        }
    }

    private void setupOptionClickListeners() {
        MaterialCardView option1Card = findViewById(R.id.option1Card);
        MaterialCardView option2Card = findViewById(R.id.option2Card);
        MaterialCardView option3Card = findViewById(R.id.option3Card);
        MaterialCardView option4Card = findViewById(R.id.option4Card);

        if (option1Card != null && option2Card != null && option3Card != null && option4Card != null) {
            option1Card.setOnClickListener(v -> checkAnswer(0));
            option2Card.setOnClickListener(v -> checkAnswer(1));
            option3Card.setOnClickListener(v -> checkAnswer(2));
            option4Card.setOnClickListener(v -> checkAnswer(3));
        } else {
            Toast.makeText(this, "Error: Could not find option cards", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    private void checkAnswer(int selectedAnswerIndex) {
        Question question = currentQuestions.get(currentQuestionIndex);
        if (selectedAnswerIndex == question.getCorrectAnswerIndex()) {
            score++;
            showToast("Correct!");
        } else {
            showToast("Wrong! The correct answer was: " + question.getOptions().get(question.getCorrectAnswerIndex()));
        }

        currentQuestionIndex++;
        displayQuestion();
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
} 
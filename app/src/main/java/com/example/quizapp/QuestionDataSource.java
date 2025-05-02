package com.example.quizapp;

import java.util.Arrays;
import java.util.List;

public class QuestionDataSource {
    public static final List<Question> generalKnowledgeQuestions = Arrays.asList(
        new Question(
            "What is the capital of France?",
            Arrays.asList("London", "Paris", "Berlin", "Madrid"),
            1
        ),
        new Question(
            "Which planet is known as the Red Planet?",
            Arrays.asList("Venus", "Mars", "Jupiter", "Saturn"),
            1
        ),
        new Question(
            "What is the largest mammal in the world?",
            Arrays.asList("Elephant", "Blue Whale", "Giraffe", "Hippopotamus"),
            1
        ),
        new Question(
            "Who painted the Mona Lisa?",
            Arrays.asList("Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Michelangelo"),
            2
        ),
        new Question(
            "What is the chemical symbol for gold?",
            Arrays.asList("Ag", "Fe", "Au", "Cu"),
            2
        ),
        new Question(
            "Which country is home to the kangaroo?",
            Arrays.asList("New Zealand", "South Africa", "Australia", "Brazil"),
            2
        ),
        new Question(
            "What is the largest ocean on Earth?",
            Arrays.asList("Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"),
            3
        ),
        new Question(
            "Who wrote 'Romeo and Juliet'?",
            Arrays.asList("Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain"),
            1
        ),
        new Question(
            "What is the currency of Japan?",
            Arrays.asList("Yuan", "Won", "Yen", "Ringgit"),
            2
        ),
        new Question(
            "Which element has the chemical symbol 'O'?",
            Arrays.asList("Gold", "Oxygen", "Osmium", "Oganesson"),
            1
        )
    );

    public static final List<Question> scienceQuestions = Arrays.asList(
        new Question(
            "What is the chemical formula for water?",
            Arrays.asList("H2O", "CO2", "O2", "H2SO4"),
            0
        ),
        new Question(
            "What is the unit of electrical resistance?",
            Arrays.asList("Volt", "Ampere", "Ohm", "Watt"),
            2
        ),
        new Question(
            "Which gas do plants absorb during photosynthesis?",
            Arrays.asList("Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen"),
            2
        ),
        new Question(
            "What is the atomic number of hydrogen?",
            Arrays.asList("1", "2", "3", "4"),
            0
        ),
        new Question(
            "Which planet is closest to the Sun?",
            Arrays.asList("Venus", "Mercury", "Earth", "Mars"),
            1
        ),
        new Question(
            "What is the main component of the Sun?",
            Arrays.asList("Oxygen", "Hydrogen", "Helium", "Carbon"),
            1
        ),
        new Question(
            "What is the speed of light?",
            Arrays.asList("300,000 km/s", "150,000 km/s", "450,000 km/s", "600,000 km/s"),
            0
        ),
        new Question(
            "Which scientist proposed the theory of relativity?",
            Arrays.asList("Isaac Newton", "Albert Einstein", "Galileo Galilei", "Stephen Hawking"),
            1
        ),
        new Question(
            "What is the pH value of pure water?",
            Arrays.asList("5", "6", "7", "8"),
            2
        ),
        new Question(
            "Which element is the most abundant in Earth's crust?",
            Arrays.asList("Iron", "Oxygen", "Silicon", "Aluminum"),
            1
        )
    );

    public static final List<Question> historyQuestions = Arrays.asList(
        new Question(
            "In which year did World War II end?",
            Arrays.asList("1943", "1944", "1945", "1946"),
            2
        ),
        new Question(
            "Who was the first President of the United States?",
            Arrays.asList("Thomas Jefferson", "George Washington", "Abraham Lincoln", "John Adams"),
            1
        ),
        new Question(
            "Which ancient civilization built the pyramids?",
            Arrays.asList("Greeks", "Romans", "Egyptians", "Mayans"),
            2
        ),
        new Question(
            "When did the Titanic sink?",
            Arrays.asList("1910", "1911", "1912", "1913"),
            2
        ),
        new Question(
            "Who discovered America?",
            Arrays.asList("Vasco da Gama", "Christopher Columbus", "Ferdinand Magellan", "James Cook"),
            1
        ),
        new Question(
            "In which year did the French Revolution begin?",
            Arrays.asList("1776", "1789", "1799", "1804"),
            1
        ),
        new Question(
            "Who was the first man to walk on the moon?",
            Arrays.asList("Buzz Aldrin", "Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
            1
        ),
        new Question(
            "Which empire was ruled by Julius Caesar?",
            Arrays.asList("Greek Empire", "Roman Empire", "Egyptian Empire", "Persian Empire"),
            1
        ),
        new Question(
            "When was the Declaration of Independence signed?",
            Arrays.asList("1775", "1776", "1777", "1778"),
            1
        ),
        new Question(
            "Who was the first female Prime Minister of the United Kingdom?",
            Arrays.asList("Theresa May", "Margaret Thatcher", "Indira Gandhi", "Golda Meir"),
            1
        )
    );
} 
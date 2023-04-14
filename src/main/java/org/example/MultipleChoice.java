package org.example;
import java.util.*;

public class MultipleChoice extends Question {
    private ArrayList<String> options;

    private Integer correctAnswer;

    MultipleChoice (String question, ArrayList<String> options, Integer correctAnswer) {
        super(question);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public Boolean checkAnswer(Integer answer) {
        return (answer == this.correctAnswer);
    }
}
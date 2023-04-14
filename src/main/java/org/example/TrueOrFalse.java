package org.example;

import java.util.ArrayList;

public class TrueOrFalse extends Question {

        private ArrayList<String> options;

        private Boolean correctAnswer;

        TrueOrFalse (String question, ArrayList<String> options, Boolean correctAnswer) {
            super(question);
            this.options = options;
            this.correctAnswer = correctAnswer;
        }

        public Boolean checkAnswer(Boolean answer) {
            return (answer == this.correctAnswer);
        }
}

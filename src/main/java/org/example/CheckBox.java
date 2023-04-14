package org.example;

import java.util.ArrayList;

public class CheckBox extends Question {
        private ArrayList<String> options;

        private ArrayList<Integer> correctAnswers;

        CheckBox (String question, ArrayList<String> options, ArrayList<Integer> correctAnswers) {
            super(question);
            this.options = options;
            this.correctAnswers = correctAnswers;
        }

        public Boolean checkAnswers(ArrayList<Integer> answer) {
            return (answer == this.correctAnswers);
        }
}

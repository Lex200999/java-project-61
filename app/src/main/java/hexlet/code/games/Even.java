package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int GREATEST_NUMBER = 100;
    public static void even() {
        Engine.setCondition(RULES);
        Random random = new Random();
        String[] correctAnswer = new String[Engine.getVictoryCondition()];
        String[] question = new String[Engine.getVictoryCondition()];
        for (int i = 0; i <  Engine.getVictoryCondition(); i++) {
            int randomNumber = random.nextInt(GREATEST_NUMBER);
            correctAnswer[i] = evenGame(randomNumber);
            question[i] = String.valueOf(randomNumber);
        }
        Engine.setCorrectAnswer(correctAnswer);
        Engine.setQuestion(question);
        Engine.theGame();
    }
    private static String evenGame(int x) {
        String correctAnswer;
        if (x % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return correctAnswer;
    }
}

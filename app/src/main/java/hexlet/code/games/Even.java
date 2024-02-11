package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int GREATEST_NUMBER = 100;
    public static void even() {
        Engine.setCondition(RULES);
        Random random = new Random();
        String[][] data = new String[Engine.getVictoryCondition()][2];
        for (int i = 0; i < Engine.getVictoryCondition(); i++) {
            for (int j = 0; j < 2; j++) {
                int randomNumber = random.nextInt(GREATEST_NUMBER);
                String question = String.valueOf(randomNumber);
                String correctAnswer;
                if (evenGame(randomNumber)) {
                    correctAnswer = "yes";
                } else {
                    correctAnswer = "no";
                }
                data[i][j] = question;
                j++;
                data[i][j] = correctAnswer;
            }
        }
        Engine.play(data);
    }
    private static boolean evenGame(int x) {
        return x % 2 == 0;
    }
}

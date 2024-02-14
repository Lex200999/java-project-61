package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final int NUMBER_OF_OPERATIONS = 2;
    private static final int MAX = 30;
    private static final String[] OPERATIONS = {"+", "-", "*"};
    public static void calc() {
        Random random = new Random();
        String[][] data = new String[Engine.VICTORY][2];
        for (int i = 0; i < Engine.VICTORY; i++) {
            for (int j = 0; j < 2; j++) {
                int x = Utils.getRandomInt(1, MAX);
                int y = Utils.getRandomInt(1, MAX);
                int numOperations = random.nextInt(NUMBER_OF_OPERATIONS);
                String question = x + " " + OPERATIONS[numOperations] + " " + y;
                String correctAnswer = String.valueOf(calcGame(x, y, numOperations));
                data[i][j] = question;
                j++;
                data[i][j] = correctAnswer;
            }
        }
        Engine.play(data, RULES);
    }
    private static Integer calcGame(int x, int y, int operator) {
        switch (OPERATIONS[operator]) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            default:
                return null;
        }
    }
}

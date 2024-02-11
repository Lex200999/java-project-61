package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final int GREATEST_NUMBER = 30;
    private static final int NUMBER_OF_OPERATIONS = 2;
    public static void calc() {
        Engine.setCondition(RULES);
        Random random = new Random();
        String[][] data = new String[Engine.getVictoryCondition()][2];
        String[] operations = {"+", "-", "*"};
        for (int i = 0; i < Engine.getVictoryCondition(); i++) {
            for (int j = 0; j < 2; j++) {
                int x = random.nextInt(GREATEST_NUMBER);
                int y = random.nextInt(GREATEST_NUMBER);
                int numOperations = random.nextInt(NUMBER_OF_OPERATIONS);
                String question = x + " " + operations[numOperations] + " " + y;
                String correctAnswer = String.valueOf(calcGame(x, y, numOperations));
                data[i][j] = question;
                j++;
                data[i][j] = correctAnswer;
            }
        }
        Engine.play(data);
    }
    private static int calcGame(int x, int y, int operator) {
        Integer correctAnswer;
        String[] operations = {"+", "-", "*"};
        switch (operations[operator]) {
            case "+":
                correctAnswer = x + y;
                break;
            case "-":
                correctAnswer = x - y;
                break;
            case "*":
                correctAnswer = x * y;
                break;
            default:
                correctAnswer = null;
                break;
        }
        return correctAnswer;
    }
}

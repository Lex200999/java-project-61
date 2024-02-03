package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final int GREATEST_NUMBER = 30;
    private static final int NUMBER_OF_OPERATIONS = 3;
    public static void calc() {
        Engine.setCondition(RULES);
        Random random = new Random();
        String[] correctAnswer = new String[Engine.getVictoryCondition()];
        String[] question = new String[Engine.getVictoryCondition()];
        String[] operations = {"+", "-", "*"};
        for (int i = 0; i < Engine.getVictoryCondition(); i++) {
            int x = random.nextInt(GREATEST_NUMBER);
            int y = random.nextInt(GREATEST_NUMBER);
            int numOperations = random.nextInt(NUMBER_OF_OPERATIONS);
            correctAnswer[i] = String.valueOf(calcGame(x, y, numOperations));
            question[i] = x + operations[numOperations] + y;
        }
        Engine.setCorrectAnswer(correctAnswer);
        Engine.setQuestion(question);
        Engine.theGame();
    }
    private static int calcGame(int x, int y, int operator) {
        int correctAnswer = 0;
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
                break;
        }
        return correctAnswer;
    }
}

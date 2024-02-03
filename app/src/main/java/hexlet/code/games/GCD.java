package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int GREATEST_NUMBER = 100;
    public static void gcd() {
        Engine.setCondition(RULES);
        String[] correctAnswer = new String[Engine.getVictoryCondition()];
        String[] question = new String[Engine.getVictoryCondition()];
        for (int i = 0; i < Engine.getVictoryCondition(); i++) {
            int x = (int) (Math.random() * GREATEST_NUMBER) + 1;
            int y = (int) (Math.random() * GREATEST_NUMBER) + 1;
            correctAnswer[i] = gcdGame(x, y);
            question[i] = x + " " + y;
        }
        Engine.setCorrectAnswer(correctAnswer);
        Engine.setQuestion(question);
        Engine.theGame();
    }
    private static String gcdGame(int a, int b) {
        while (b != 0) {
            int z = b;
            b = a % b;
            a = z;
        }
        return Integer.toString(a);
    }
}

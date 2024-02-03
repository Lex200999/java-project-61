package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int GREATEST_NUMBER = 200;
    public static void prime() {
        Engine.setCondition(RULES);
        Random random = new Random();
        String[] correctAnswer = new String[Engine.getVictoryCondition()];
        String[] question = new String[Engine.getVictoryCondition()];
        for (int i = 0; i < Engine.getVictoryCondition(); i++) {
            int number = random.nextInt(GREATEST_NUMBER);
            correctAnswer[i] = isPrime(number);
            question[i] = String.valueOf(number);
        }
        Engine.setCorrectAnswer(correctAnswer);
        Engine.setQuestion(question);
        Engine.theGame();
    }

    private static String isPrime(int num) {
        if (num <= 1) {
            return "no";
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}

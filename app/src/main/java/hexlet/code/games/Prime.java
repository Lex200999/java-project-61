package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int GREATEST_NUMBER = 200;
    public static void prime() {
        Engine.setCondition(RULES);
        Random random = new Random();
        String[][] data = new String[Engine.getVictoryCondition()][2];
        for (int i = 0; i < Engine.getVictoryCondition(); i++) {
            for (int j = 0; j < 2; j++) {
                int number = random.nextInt(GREATEST_NUMBER);
                String question = String.valueOf(number);
                String correctAnswer;
                if (isPrime(number)) {
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

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

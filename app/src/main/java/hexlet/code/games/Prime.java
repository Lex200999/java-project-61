package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void prime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        Engine.setUserName(userName);
        System.out.println("Hello, " + Engine.getUserName() + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random random = new Random();

        final int greatestNumber = 200;

        int i;
        for (i = 0; i < Engine.getVictoryCondition(); i++) {
            int number = random.nextInt(greatestNumber);
            String correctAnswer;
            if (isPrime(number)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            String question = Integer.toString(number);
            if (!(Engine.testString(question, correctAnswer))) {
                break;
            }
        }
        if (i == Engine.getVictoryCondition()) {
            System.out.println("Congratulations, " + Engine.getUserName() + "!");
        }
    }

    public static boolean isPrime(int num) {
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

package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void even() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        Engine.setUserName(userName);
        System.out.println("Hello, " + Engine.getUserName() + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();

        final int greatestNumber = 100;

        int i;
        for (i = 0; i <  Engine.getVictoryCondition(); i++) {
            int randomNumber = random.nextInt(greatestNumber);
            String correctAnswer;
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            String question = Integer.toString(randomNumber);
            if (!(Engine.testString(question, correctAnswer))) {
                break;
            }
        }
        if (i == Engine.getVictoryCondition()) {
            System.out.println("Congratulations, " + Engine.getUserName() + "!");
        }
    }
}

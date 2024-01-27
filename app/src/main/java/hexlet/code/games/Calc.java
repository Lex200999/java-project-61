package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        Engine.setUserName(userName);
        System.out.println("Hello, " + Engine.getUserName() + "!");
        System.out.println("What is the result of the expression?");
        Random random = new Random();

        final int greatestNumber = 30;
        final int numberOfOperations = 3;

        String[] operations = {"+", "-", "*"};
        int i;
        for (i = 0; i <= 2; i++) {
            int x = random.nextInt(greatestNumber);
            int y = random.nextInt(greatestNumber);
            int numOperations = random.nextInt(numberOfOperations);
            int correctAnswer = 0;
            switch (operations[numOperations]) {
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
            String question = x + " " + operations[numOperations] + " " + y;
            if (!(Engine.testString(question, Integer.toString(correctAnswer)))) {
                break;
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + Engine.getUserName() + "!");
        }
    }
}

package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void gcd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        Engine.setUserName(userName);
        System.out.println("Hello, " + Engine.getUserName() + "!");
        System.out.println("Find the greatest common divisor of given numbers.");

        final int greatestNumber = 100;

        int i;
        for (i = 0; i <= 2; i++) {
            int x = (int) (Math.random() * greatestNumber) + 1;
            int y = (int) (Math.random() * greatestNumber) + 1;
            int firstNumber = x;
            int secondNumber = y;
            while (y != 0) {
                int z = y;
                y = x % y;
                x = z;
            }
            String  question = firstNumber + " " + secondNumber;
            if (!(Engine.testString(question, Integer.toString(x)))) {
                break;
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + Engine.getUserName());
        }
    }
}

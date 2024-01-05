package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {
    public static void even() {
        Scanner userName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("What is your name? ");
        String userN = userName.next();
        System.out.println("Hello, " + userN + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner playerRes = new Scanner(System.in);
        Random random = new Random();
        int i;
        for (i = 0; i <= 2; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            String correctAnswer;
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            System.out.print("Your answer: ");
            String playersResponse = playerRes.nextLine();
            if (correctAnswer.equals(playersResponse)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + playersResponse + "'" + " is wrong answer ;(");
                System.out.println(". Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userN + "!");
                break;
            }
        }
        if (i > 0) {
            System.out.println("Congratulations, " + userN + "!");
        }

    }

}

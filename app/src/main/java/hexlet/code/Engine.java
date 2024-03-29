package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int VICTORY = 3;

    public static void play(String[][] data, String condition) {
        Scanner scanner = new Scanner(System.in);
        Scanner playerRes = new Scanner((System.in));
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(condition);
        int winningRounds = 0;
        for (int i = 0; i < VICTORY; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Question: " + data[i][j]);
                System.out.print("Your answer: ");
                String playerResponse = playerRes.nextLine();
                j++;
                if (playerResponse.equals(data[i][j])) {
                    System.out.println("Correct!");
                    winningRounds++;
                } else {
                    System.out.print("'" + playerResponse + "'" + " is wrong answer ;(");
                    System.out.println(". Correct answer was '" + data[i][j] + "'.");
                    break;
                }
            }
            if (i == winningRounds) {
                break;
            }
        }
        if (winningRounds == VICTORY) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}

package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int VICTORY = 3;
    private static String condition;
    private static String[] question = new String[VICTORY];
    private static String[] correctAnswer = new String[VICTORY];
    public static void setCondition(String conditionApp) {
        condition = conditionApp;
    }
    public static int getVictoryCondition() {
        return VICTORY;
    }
    public static void setQuestion(String[] questionApp) {
        question = questionApp;
    }
    public static void setCorrectAnswer(String[] correctAnswerApp) {
        correctAnswer = correctAnswerApp;
    }

    public static void theGame() {
        Scanner scanner = new Scanner(System.in);
        Scanner playerRes = new Scanner((System.in));
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(condition);
        int winningRounds = 0;
        for (int i = 0; i < VICTORY; i++) {
            System.out.println("Question: " + question[i]);
            System.out.print("Your answer: ");
            String playerResponse = playerRes.nextLine();
            if (playerResponse.equals(correctAnswer[i])) {
                System.out.println("Correct!");
                winningRounds++;
            } else {
                System.out.print("'" + playerResponse + "'" + " is wrong answer ;(");
                System.out.println(". Correct answer was '" + correctAnswer[i] + "'.");
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

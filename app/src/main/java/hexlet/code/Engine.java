package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String userName;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String name) {
        userName = name;
    }

    public static boolean testString(String question, String correctAnswer) {
        Scanner playerRes = new Scanner(System.in);
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        String playersResponse = playerRes.nextLine();
        if (correctAnswer.equals(playersResponse)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.print("'" + playersResponse + "'" + " is wrong answer ;(");
            System.out.println(". Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + getUserName());
        }
        return false;
    }
}

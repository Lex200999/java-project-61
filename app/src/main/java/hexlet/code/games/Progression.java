package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        Engine.setUserName(userName);
        System.out.println("Hello, " + Engine.getUserName() + "!");
        System.out.println("What number is missing in the progression?");
        Random random = new Random();

        final int greatestNumber = 30;
        final int forFindNumberTenFirstMeaning = 6;
        final int forFindNumberTenSecondMeaning = 5;
        final int numberOfCycleTen = 9;

        int i;
        for (i = 0; i < Engine.getVictoryCondition(); i++) {
            int lengthVer = (int) (Math.random() * forFindNumberTenFirstMeaning) + forFindNumberTenSecondMeaning;
            String[] versions = new String[lengthVer];
            int invisible = random.nextInt(lengthVer);
            int firstSymbol = (int) (Math.random() * greatestNumber) + 1;
            int cycle = (int) (Math.random() * numberOfCycleTen) + 1;
            for (int j = 0; j < lengthVer; j++) {
                versions[j] = String.valueOf(firstSymbol);
                firstSymbol += cycle;
            }
            String correctAnswer = versions[invisible];
            versions[invisible] = "..";
            String question = "";
            for (int index = 0; index < lengthVer; index++) {
                question = question + versions[index] + " ";
            }
            if (!(Engine.testString(question, correctAnswer))) {
                break;
            }
        }
        if (i == Engine.getVictoryCondition()) {
            System.out.println("Congratulations, " + Engine.getUserName() + "!");
        }
    }
}

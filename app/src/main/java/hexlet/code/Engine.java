package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Games.even;
import static hexlet.code.Games.calc;
import static hexlet.code.Games.gcd;
import static hexlet.code.Games.progression;
import static hexlet.code.Games.prime;

public class Engine {
    public static void algorithm() {
        Scanner userName = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        System.out.print("Your choice: ");
        String choice = number.next();
        if (choice.equals("0")) {
            return;
        }
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userN = userName.next();
        System.out.println("Hello, " + userN + "!");

        final int numberOfRoundsToWin = 3;

        if (choice.equals("2")) {
            if (even() == numberOfRoundsToWin) {
                System.out.println("Congratulations, " + userN + "!");
            } else {
                System.out.println("Let's try again, " + userN + "!");
            }
        }
        if (choice.equals("3")) {
            if (calc() == numberOfRoundsToWin) {
                System.out.println("Congratulations, " + userN + "!");
            } else {
                System.out.println("Let's try again, " + userN + "!");
            }
        }
        if (choice.equals("4")) {
            if (gcd() == numberOfRoundsToWin) {
                System.out.println("Congratulations, " + userN + "!");
            } else {
                System.out.println("Let's try again, " + userN + "!");
            }
        }
        if (choice.equals("5")) {
            if (progression() == numberOfRoundsToWin) {
                System.out.println("Congratulations, " + userN + "!");
            } else {
                System.out.println("Let's try again, " + userN + "!");
            }
        }
        if (choice.equals("6")) {
            if (prime() == numberOfRoundsToWin) {
                System.out.println("Congratulations, " + userN + "!");
            } else {
                System.out.println("Let's try again, " + userN + "!");
            }
        }
        number.close();
    }
}

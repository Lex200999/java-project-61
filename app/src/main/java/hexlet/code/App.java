package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greeting;
import static hexlet.code.Games.even;

public class App {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String choice = number.next();
        if (choice.equals("1")) {
            greeting();
        }
        if (choice.equals("2")) {
            even();
        }
        number.close();
    }

}

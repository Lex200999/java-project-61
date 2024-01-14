package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {
    public static int even() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner playerRes = new Scanner(System.in);
        Random random = new Random();
        int upperLimit = 100;
        int i;
        for (i = 0; i <= 2; i++) {
            int randomNumber = random.nextInt(upperLimit);
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
                break;
            }
        }
        return i;
    }
    public static int calc() {
        System.out.println("What is the result of the expression?");
        Scanner playerRes = new Scanner(System.in);
        Random random = new Random();
        int upperLimit = 30;
        int numOfOperations = 3;
        String[] operations = {"+", "-", "*"};
        int i;
        for (i = 0; i <= 2; i++) {
            int x = random.nextInt(upperLimit);
            int y = random.nextInt(upperLimit);
            int numOperations = random.nextInt(numOfOperations);
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
            System.out.println("Question: " + x + " " + operations[numOperations] + " " + y);
            System.out.print("Your answer: ");
            String playersResponse = playerRes.nextLine();
            if (correctAnswer == Integer.parseInt(playersResponse)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + playersResponse + "'" + " is wrong answer ;(");
                System.out.println(". Correct answer was '" + correctAnswer + "'.");
                break;
            }
        }
        return i;
    }
    public static int gcd() {
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner playerRes = new Scanner(System.in);
        int upperLimit = 100;
        int i;
        for (i = 0; i <= 2; i++) {
            int x = (int) (Math.random() * upperLimit) + 1;
            int y = (int) (Math.random() * upperLimit) + 1;
            System.out.println("Question: " + x + " " + y);
            while (y != 0) {
                int z = y;
                y = x % y;
                x = z;
            }
            System.out.print("Your answer: ");
            String playerResponse = playerRes.nextLine();
            if (Integer.parseInt(playerResponse) == x) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + playerResponse + "'" + " is wrong answer ;(");
                System.out.println(". Correct answer was '" + x + "'.");
                break;
            }
        }
        return i;
    }
    public static int progression() {
        System.out.println("What number is missing in the progression?");
        Scanner playerRes = new Scanner(System.in);
        Random random = new Random();
        int upperLimit = 30;
        int forFindNumber10_1 = 6;
        int forFindNumber10_2 = 5;
        int numberCycle_10 = 9;
        int i;
        for (i = 0; i <= 2; i++) {
            int lengthVer = (int) (Math.random() * forFindNumber10_1) + forFindNumber10_2;
            String[] versions = new String[lengthVer];
            int invisible = random.nextInt(lengthVer);
            int firstSymbol = (int) (Math.random() * upperLimit) + 1;
            int cycle = (int) (Math.random() * numberCycle_10) + 1;
            for (int j = 0; j < lengthVer; j++) {
                versions[j] = String.valueOf(firstSymbol);
                firstSymbol += cycle;
            }
            String correctAnswer = versions[invisible];
            versions[invisible] = "..";
            System.out.print("Question: ");
            for (int index = 0; index < lengthVer; index++) {
                System.out.print(versions[index] + " ");
            }
            System.out.print("\n" + "Your answer: ");
            String playerResponse = playerRes.nextLine();
            if (playerResponse.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + playerResponse + "'" + " is wrong answer ;(");
                System.out.println(". Correct answer was '" + correctAnswer + "'.");
                break;
            }
        }
        return i;
    }
    public static int prime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner playerRes = new Scanner(System.in);
        Random random = new Random();
        int upperLimit = 200;
        int i;
        for (i = 0; i <= 2; i++) {
            int number = random.nextInt(upperLimit);
            String correctAnswer;
            if (isPrime(number)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String playerResponse = playerRes.nextLine();
            if (playerResponse.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + playerResponse + "'" + " is wrong answer ;(");
                System.out.println(". Correct answer was '" + correctAnswer + "'.");
                break;
            }
        }
        return i;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

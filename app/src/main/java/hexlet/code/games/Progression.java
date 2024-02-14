package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    public static final int MAX_COUNT_CYCLE = 10;
    private static final int QUANTITY_VER_FROM = 5;
    private static final int QUANTITY_VER_TO = 6;
    private static final int FIRST_NUMBER = 30;
    public static void progression() {
        Random random = new Random();
        String[][] data = new String[Engine.VICTORY][2];
        for (int i = 0; i < Engine.VICTORY; i++) {
            for (int j = 0; j < 2; j++) {
                int lengthVer = Utils.getRandomInt(QUANTITY_VER_FROM, QUANTITY_VER_TO);
                int cycle = Utils.getRandomInt(1, MAX_COUNT_CYCLE);
                int firstSymbol = Utils.getRandomInt(1, FIRST_NUMBER);
                int invisible = random.nextInt(lengthVer);
                int[] arrayInt = progressionGame(lengthVer, cycle, firstSymbol);
                String[] array = new String[lengthVer];
                for (int k = 0; k < arrayInt.length; k++) {
                    array[k] = String.valueOf(arrayInt[k]);
                }
                String correctAnswer = array[invisible];
                array[invisible] = "..";
                String question = String.join(" ", array);
                data[i][j] = question;
                j++;
                data[i][j] = correctAnswer;
            }
        }
        Engine.play(data, RULES);
    }
    private static int[] progressionGame(int length, int cycle, int firstSymbol) {
        int[] versions = new int[length];
        for (int j = 0; j < length; j++) {
            versions[j] = firstSymbol;
            firstSymbol += cycle;
        }
        return versions;
    }
}

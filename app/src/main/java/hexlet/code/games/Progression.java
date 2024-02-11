package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    private static final int GREATEST_NUMBER = 30;
    private static final int FOR_FIND_NUMBER_TEN_FIRST = 6;
    private static final int FOR_FIND_NUMBER_TEN_SECOND = 5;
    private static final int NUMBER_OF_CYCLE_TEN = 9;
    public static void progression() {
        Engine.setCondition(RULES);
        Random random = new Random();
        String[][] data = new String[Engine.getVictoryCondition()][2];
        for (int i = 0; i < Engine.getVictoryCondition(); i++) {
            for (int j = 0; j < 2; j++) {
                int lengthVer = (int) (Math.random() * FOR_FIND_NUMBER_TEN_FIRST) + FOR_FIND_NUMBER_TEN_SECOND;
                int cycle = (int) (Math.random() * NUMBER_OF_CYCLE_TEN) + 1;
                int firstSymbol = (int) (Math.random() * GREATEST_NUMBER) + 1;
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
        Engine.play(data);
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

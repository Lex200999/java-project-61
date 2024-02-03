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
        String[] correctAnswer = new String[Engine.getVictoryCondition()];
        String[] question = new String[Engine.getVictoryCondition()];
        for (int i = 0; i < Engine.getVictoryCondition(); i++) {
            int lengthVer = (int) (Math.random() * FOR_FIND_NUMBER_TEN_FIRST) + FOR_FIND_NUMBER_TEN_SECOND;
            int invisible = random.nextInt(lengthVer);

            String[] array = progressionGame(lengthVer);
            correctAnswer[i] = array[invisible];
            array[invisible] = "..";
            question[i] = String.join(" ", array);
        }
        Engine.setCorrectAnswer(correctAnswer);
        Engine.setQuestion(question);
        Engine.theGame();
    }
    private static String[] progressionGame(int length) {
        String[] versions = new String[length];
        int firstSymbol = (int) (Math.random() * GREATEST_NUMBER) + 1;
        int cycle = (int) (Math.random() * NUMBER_OF_CYCLE_TEN) + 1;
        for (int j = 0; j < length; j++) {
            versions[j] = String.valueOf(firstSymbol);
            firstSymbol += cycle;
        }
        return versions;
    }
}

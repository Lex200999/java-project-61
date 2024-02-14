package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void even() {
        String[][] data = new String[Engine.VICTORY][2];
        for (int i = 0; i < Engine.VICTORY; i++) {
            for (int j = 0; j < 2; j++) {
                int randomNumber = Utils.getRandomInt(1, 100);
                String question = String.valueOf(randomNumber);
                String correctAnswer;
                if (evenGame(randomNumber)) {
                    correctAnswer = "yes";
                } else {
                    correctAnswer = "no";
                }
                data[i][j] = question;
                j++;
                data[i][j] = correctAnswer;
            }
        }
        Engine.play(data, RULES);
    }
    private static boolean evenGame(int x) {
        return x % 2 == 0;
    }
}

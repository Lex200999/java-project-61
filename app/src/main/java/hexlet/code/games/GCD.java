package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int GREATEST_NUMBER = 100;
    public static void gcd() {
        Engine.setCondition(RULES);
        String[][] data = new String[Engine.getVictoryCondition()][2];
        for (int i = 0; i < Engine.getVictoryCondition(); i++) {
            for (int j = 0; j < 2; j++) {
                int x = (int) (Math.random() * GREATEST_NUMBER) + 1;
                int y = (int) (Math.random() * GREATEST_NUMBER) + 1;
                data[i][j] = x + " " + y;
                j++;
                data[i][j] = String.valueOf(gcdGame(x, y));
            }
        }
        Engine.play(data);
    }
    private static int gcdGame(int a, int b) {
        while (b != 0) {
            int z = b;
            b = a % b;
            a = z;
        }
        return a;
    }
}

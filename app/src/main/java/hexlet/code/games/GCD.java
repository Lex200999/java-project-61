package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MAX = 100;
    public static void gcd() {
        String[][] data = new String[Engine.VICTORY][2];
        for (int i = 0; i < Engine.VICTORY; i++) {
            for (int j = 0; j < 2; j++) {
                int x = Utils.getRandomInt(1, MAX);
                int y = Utils.getRandomInt(1, MAX);
                data[i][j] = x + " " + y;
                j++;
                data[i][j] = String.valueOf(gcdGame(x, y));
            }
        }
        Engine.play(data, RULES);
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

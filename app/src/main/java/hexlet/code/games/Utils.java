package hexlet.code.games;

public class Utils {
    public static int getRandomInt(int from, int to) {
        return (int) ((Math.random() * to) + from);
    }
}

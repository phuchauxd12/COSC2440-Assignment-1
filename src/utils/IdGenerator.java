package utils;

public class IdGenerator {
    public static String randomId() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            s.append((int) Math.floor(Math.random() * 10));
        }
        return s.toString();
    }
}

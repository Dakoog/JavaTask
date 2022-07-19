package logic;

public class Implications {
    public static Boolean impl(Boolean p, Boolean q) {
        return (Boolean.compare(p, q) < 1);
    }
}

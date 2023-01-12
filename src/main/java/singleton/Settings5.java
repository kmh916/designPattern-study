package singleton;

public class Settings5 {

    private static final Settings5 INSTANCE = new Settings5();

    private Settings5() {}

    public static Settings5 getInstance() {
        return INSTANCE;
    }
}

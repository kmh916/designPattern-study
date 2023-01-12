package singleton;

public class Settings4 {

    private static Settings4 instance;

    private Settings4() {}

    public static Settings4 getInstance() {
        if (instance == null) {
            synchronized (Settings4.class) {
                if (instance == null) {
                    instance = new Settings4();
                }
            }
        }
        return instance;
    }
}

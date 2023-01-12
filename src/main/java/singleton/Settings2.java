package singleton;

public class Settings2 {

    private static Settings2 instance;

    private Settings2() {
    }

    public static Settings2 getInstance() {
        if (instance == null) {
            instance = new Settings2();
        }
        return instance;
    }
}

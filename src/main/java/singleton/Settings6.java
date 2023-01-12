package singleton;

public class Settings6 {

    private Settings6() {
    }

    private static class SettingsHolder {
        private static final Settings6 INSTANCE = new Settings6();
    }

    public static Settings6 getInstance() {
        return SettingsHolder.INSTANCE;
    }
}

package singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BreakSingletonTest {

    @Test
    @DisplayName("1. 리플렉션을 사용하여 객체를 생성하여 객체 동일성을 깨뜨린다.")
    void break1() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings6 settingsA = Settings6.getInstance();

        Constructor<Settings6> constructor = Settings6.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings6 settingsB = constructor.newInstance();

        // 통과 -> 객체 참조값이 다름
        assertTrue(settingsA != settingsB);
    }

    @Test
    @DisplayName("2. 객체 직렬화 & 역직렬화를 통해 객체 동일성을 깨뜨린다.")
    void break2() {
        Settings7 settingsA = Settings7.getInstance();

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obj.out"))) {
            out.writeObject(settingsA);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Settings7 settingsB = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.out"))) {
            settingsB = (Settings7) in.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 통과 -> 객체 참조값이 다름
        assertTrue(settingsA != settingsB);
    }

    // enum은 리플렉션으로 생성할 수 없고 IllegalArgumentException를 던진다.

    @Test
    @DisplayName("3. Enum을 리플렉션으로 생성하기 - 생성자 파라미터 1개")
    void break3() {
        Constructor<?>[] constructors = SettingEnum.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                SettingEnum instance = (SettingEnum) constructor.newInstance("INSTANCE");
            });
        }
    }


    // ENUM은 기본 생성자가 존재하지 않고 name을 인자로 가지는 생성자가 존재하기 때문에
    // NoSuchMethodException를 던진다.
    @Test
    @DisplayName("4. Enum을 리플렉션으로 생성하기 - 생성자 파라미터 0개")
    void break4() {
        Assertions.assertThrows(NoSuchMethodException.class, () -> {
            Constructor<SettingEnum> declaredConstructor = SettingEnum.class.getDeclaredConstructor();
        });
    }

    // enum은 직렬화 & 역직렬화시에도 동일성을 보장한다.
    @Test
    @DisplayName("5. 객체 직렬화 & 역직렬화를 통해 객체 동일성을 깨뜨린다.")
    void break5() {
        SettingEnum settingsA = SettingEnum.INSTANCE;

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obj.out"))) {
            out.writeObject(settingsA);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        SettingEnum settingsB = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.out"))) {
            settingsB = (SettingEnum) in.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 통과 -> 객체 참조값이 같음
        assertTrue(settingsA == settingsB);
    }
}

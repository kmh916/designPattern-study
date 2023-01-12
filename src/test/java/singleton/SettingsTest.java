package singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SettingsTest {

    @Test
    @DisplayName("getInstance를 2번 호출해도 같은 객체를 반환한다.")
    void getInstance() {
        Settings instance1 = Settings.getInstance();
        Settings instance2 = Settings.getInstance();

        assertTrue(instance1 == instance2);
    }

    /**     출력 결과
     *      singleton.Settings@48b338ca
     *      singleton.Settings@768f4284
     * */
    @Test
    @DisplayName("멀티 쓰레드는 환경에서 다른 참조값을 가질수 있다.")
    void getInstance2() throws InterruptedException {
        Thread t1 = new TestThread();
        Thread t2 = new TestThread();

        t1.start();
        t2.start();

        // t1 , t2가 종료되기 전에 테스트를 진행하는 쓰레드가 종료되지 않게 지연함
        Thread.sleep(100L);
    }


    /**
     *   출력 결과 -> 참조값이 동일하다.
     *   singleton.Settings3@5e4d06df
     *   singleton.Settings3@5e4d06df
     *   singleton.Settings3@5e4d06df
     *   singleton.Settings3@5e4d06df
     *   singleton.Settings3@5e4d06df
     * */
    @Test
    @DisplayName("synchronized 키워드로 싱글톤을 보장한다.")
    void getInstance3() throws InterruptedException {
        Thread t1 = new TestThread2();
        Thread t2 = new TestThread2();
        Thread t3 = new TestThread2();
        Thread t4 = new TestThread2();
        Thread t5 = new TestThread2();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        Thread.sleep(100L);
    }

}

class TestThread extends Thread {

    @Override
    public void run() {
        Settings2 instance = Settings2.getInstance();
        System.out.println(instance);
    }
}

class TestThread2 extends Thread {

    @Override
    public void run() {
        Settings3 instance = Settings3.getInstance();
        System.out.println(instance);
    }
}
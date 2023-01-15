package factory_method.after;

import org.junit.jupiter.api.Test;

class DIClientTest {

    @Test
    void bizLogicTest1() {
        DIClient diClient = new DIClient(new WhiteShipFactory());
        diClient.bizLogic("하얀배 1호","kmh102808@gmail.com");
    }

    @Test
    void bizLogicTest2() {
        DIClient diClient = new DIClient(new BlackShipFactory());
        diClient.bizLogic("검은배 1호","kmh102808@gmail.com");
    }
}
package abstract_factory;

import abstract_factory.factory.ShipFactory;
import abstract_factory.factory.WhiteShipFactory;
import abstract_factory.factory.WhiteShipLegacyPartsFactory;
import abstract_factory.factory.WhiteShipPartsFactory;
import abstract_factory.product.Ship;
import abstract_factory.product.parts.LegacyWhiteAnchor;
import abstract_factory.product.parts.LegacyWhiteWheel;
import abstract_factory.product.parts.WhiteAnchor;
import abstract_factory.product.parts.WhiteWheel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;


public class AbstractFactoryTest {

    @Test
    void testLegacy() {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipLegacyPartsFactory());
        Ship ship = shipFactory.orderShip("고잉메리호", "kmh102808@gmail.com");


        assertAll(
                () -> assertThat(ship.getAnchor()).isInstanceOf(LegacyWhiteAnchor.class),
                () -> assertThat(ship.getWheel()).isInstanceOf(LegacyWhiteWheel.class)
        );
    }

    @Test
    void test() {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.orderShip("써니호", "kmh102808@gmail.com");

        assertAll(
                () -> assertThat(ship.getAnchor()).isInstanceOf(WhiteAnchor.class),
                () -> assertThat(ship.getWheel()).isInstanceOf(WhiteWheel.class)
        );
    }
}

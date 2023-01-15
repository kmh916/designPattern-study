package abstract_factory.factory;

import abstract_factory.product.BlackShip;
import abstract_factory.product.Ship;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip(String name) {
        return new BlackShip(name);
    }
}

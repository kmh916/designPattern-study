package abstract_factory.factory;

import abstract_factory.product.Ship;
import abstract_factory.product.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    private final ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip(String name) {
        Ship ship = new WhiteShip(name);
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}

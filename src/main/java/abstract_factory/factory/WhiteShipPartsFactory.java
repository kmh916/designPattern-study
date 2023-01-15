package abstract_factory.factory;

import abstract_factory.product.parts.Anchor;
import abstract_factory.product.parts.Wheel;
import abstract_factory.product.parts.WhiteAnchor;
import abstract_factory.product.parts.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory{

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}

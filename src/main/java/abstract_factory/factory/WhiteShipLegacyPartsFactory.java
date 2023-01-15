package abstract_factory.factory;

import abstract_factory.product.parts.Anchor;
import abstract_factory.product.parts.LegacyWhiteAnchor;
import abstract_factory.product.parts.LegacyWhiteWheel;
import abstract_factory.product.parts.Wheel;

public class WhiteShipLegacyPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new LegacyWhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new LegacyWhiteWheel();
    }
}

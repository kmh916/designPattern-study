package abstract_factory.factory;

import abstract_factory.product.parts.Anchor;
import abstract_factory.product.parts.Wheel;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}

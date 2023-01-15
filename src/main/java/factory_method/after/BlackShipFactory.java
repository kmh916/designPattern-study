package factory_method.after;

public class BlackShipFactory implements ShipFactory{

    @Override
    public Ship createShip(String name) {
        return new BlackShip(name);
    }
}

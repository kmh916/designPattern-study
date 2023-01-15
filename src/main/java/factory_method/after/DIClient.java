package factory_method.after;

public class DIClient {

    private final ShipFactory shipFactory;

    public DIClient(ShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    void bizLogic(String name, String email) {
        Ship ship = shipFactory.orderShip(name, email);
        System.out.println(ship);
    }

}

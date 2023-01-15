package abstract_factory.product;

public class BlackShip extends Ship {
    public BlackShip(String name) {
        setName(name);
        setColor("black");
        setLogo("⚓");
    }
}

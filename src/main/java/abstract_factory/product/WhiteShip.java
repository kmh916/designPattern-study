package abstract_factory.product;

public class WhiteShip extends Ship {
    public WhiteShip(String name) {
        setName(name);
        setColor("white");
        setLogo("\uD83D\uDEE5️");
    }
}

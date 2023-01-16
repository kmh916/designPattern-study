package abstract_factory.chicken;

public class GoldenOliveChicken extends FriedChicken {

    public GoldenOliveChicken(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "비비큐 황금 올리브 치킨~~";
    }
}

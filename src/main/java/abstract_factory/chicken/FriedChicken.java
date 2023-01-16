package abstract_factory.chicken;

public class FriedChicken implements Chicken {
    private String name;
    private int price;

    public FriedChicken(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "바삭바삭 후라이드 치킨";
    }
}

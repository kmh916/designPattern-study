package factory_method.velog;

public class SeasonedChicken implements Chicken {

    private String name;
    private int price;

    public SeasonedChicken(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "새콤달콤 양념 치킨";
    }
}

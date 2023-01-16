package abstract_factory.chicken;

public class SunFlowerFriedChicken extends FriedChicken {
    public SunFlowerFriedChicken(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "BHC 해바라기 후라이드 치킨~~";
    }
}

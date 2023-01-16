package factory_method.velog;

public class FriedChickenFactory implements ChickenShop{

    @Override
    public Chicken makeChicken() {
        return new FriedChicken("후라이드 치킨", 20000);
    }
}

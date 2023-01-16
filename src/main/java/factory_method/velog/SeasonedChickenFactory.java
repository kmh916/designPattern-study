package factory_method.velog;

public class SeasonedChickenFactory implements ChickenShop{

    @Override
    public Chicken makeChicken() {
        return new SeasonedChicken("양념 치킨", 20000);
    }
}

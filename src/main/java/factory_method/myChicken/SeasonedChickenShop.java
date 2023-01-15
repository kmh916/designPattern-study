package factory_method.myChicken;

public class SeasonedChickenShop implements ChickenShop{

    @Override
    public Chicken makeChicken() {
        return new SeasonedChicken();
    }
}

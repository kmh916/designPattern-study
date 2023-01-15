package factory_method.myChicken;

public class FriedChickenShop implements ChickenShop{

    @Override
    public Chicken makeChicken() {
        return new FriedChicken();
    }
}

package factory_method.velog;

public class SeasonedChickenFactory implements ChickenShop{

    @Override
    public Chicken makeChicken() {
        return new SeasonedChicken("μλ μΉν¨", 20000);
    }
}

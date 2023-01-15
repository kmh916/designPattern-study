package factory_method.myChicken;

public class Customer {
    private Chicken orderChicken(ChickenShop chickenShop) {
        return chickenShop.serveChicken();
    }

    public void eatFriedChicken() {
        Chicken chicken = orderChicken(new FriedChickenShop());
        System.out.println(chicken);
    }

    public void eatSeasonedChicken() {
        Chicken chicken = orderChicken(new SeasonedChickenShop());
        System.out.println(chicken);
    }
}

package factory_method.myChicken;

public class Customer {
    private Chicken orderChicken(ChickenShop chickenShop) {
        return chickenShop.serveChicken();
    }

    public void eatChicken() {
        Chicken chicken = orderChicken(new FriedChickenShop());
        System.out.println(chicken);
    }
}

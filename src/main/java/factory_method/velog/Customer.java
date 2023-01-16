package factory_method.velog;

public class Customer {
    private Chicken orderChicken(ChickenShop chickenShop) {
        return chickenShop.serveChicken();
    }

    private void eatChicken(Chicken chicken) {
        System.out.println("냠냠 맛있는 "+chicken);
    }

    public void eatFriedChicken() {
        Chicken chicken = orderChicken(new FriedChickenFactory());
        eatChicken(chicken);
    }

    public void eatSeasonedChicken() {
        Chicken chicken = orderChicken(new SeasonedChickenFactory());
        eatChicken(chicken);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.eatFriedChicken();
        System.out.println("===================================");
        customer.eatSeasonedChicken();
    }
}

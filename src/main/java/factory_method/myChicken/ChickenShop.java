package factory_method.myChicken;

public interface ChickenShop {

    default Chicken serveChicken() {
        Chicken chicken = makeChicken();
        return chicken;
    }



    Chicken makeChicken();
}

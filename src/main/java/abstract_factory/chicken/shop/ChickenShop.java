package abstract_factory.chicken.shop;


import abstract_factory.chicken.FriedChicken;
import abstract_factory.chicken.SeasonedChicken;

public interface ChickenShop {
    FriedChicken makeFriedChicken();

    SeasonedChicken makeSeasonedChicken();
}

package abstract_factory.chicken.shop;

import abstract_factory.chicken.FriedChicken;
import abstract_factory.chicken.GoldenOliveChicken;
import abstract_factory.chicken.GoldenOliveSeasonedChicken;
import abstract_factory.chicken.SeasonedChicken;

public class BBQ implements ChickenShop {
    @Override
    public FriedChicken makeFriedChicken() {
        return new GoldenOliveChicken("비비큐 황금 올리브 취킨", 35000);
    }

    @Override
    public SeasonedChicken makeSeasonedChicken() {
        return new GoldenOliveSeasonedChicken("비비큐 황금 올리브 양념 치킨", 36000);
    }
}

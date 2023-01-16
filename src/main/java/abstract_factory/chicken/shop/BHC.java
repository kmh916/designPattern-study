package abstract_factory.chicken.shop;

import abstract_factory.chicken.FriedChicken;
import abstract_factory.chicken.MachoKing;
import abstract_factory.chicken.SeasonedChicken;
import abstract_factory.chicken.SunFlowerFriedChicken;

public class BHC implements ChickenShop {
    @Override
    public FriedChicken makeFriedChicken() {
        return new SunFlowerFriedChicken("BHC 해바라기 후라이드 치킨", 20000);
    }

    @Override
    public SeasonedChicken makeSeasonedChicken() {
        return new MachoKing("BHC 마초킹", 21000);
    }
}

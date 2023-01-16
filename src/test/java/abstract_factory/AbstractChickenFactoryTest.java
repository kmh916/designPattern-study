package abstract_factory;

import abstract_factory.chicken.*;
import abstract_factory.chicken.shop.BBQ;
import abstract_factory.chicken.shop.BHC;
import abstract_factory.chicken.shop.ChickenShop;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractChickenFactoryTest {

    @Test
    void bbqAndBhcTest() {
        ChickenShop shop1 = new BBQ();
        ChickenShop shop2 = new BHC();
        FriedChicken friedChicken1 = shop1.makeFriedChicken();
        SeasonedChicken seasonedChicken1 = shop1.makeSeasonedChicken();
        FriedChicken friedChicken2 = shop2.makeFriedChicken();
        SeasonedChicken seasonedChicken2 = shop2.makeSeasonedChicken();

        assertThat(friedChicken1).isInstanceOf(GoldenOliveChicken.class);
        assertThat(seasonedChicken1).isInstanceOf(GoldenOliveSeasonedChicken.class);
        assertThat(friedChicken2).isInstanceOf(SunFlowerFriedChicken.class);
        assertThat(seasonedChicken2).isInstanceOf(MachoKing.class);

    }
}

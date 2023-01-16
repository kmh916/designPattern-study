package abstract_factory.chicken;

public class GoldenOliveSeasonedChicken extends SeasonedChicken {
    public GoldenOliveSeasonedChicken(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "비비큐 황금 올리브 양념 치킨~";
    }
}

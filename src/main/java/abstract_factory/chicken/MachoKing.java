package abstract_factory.chicken;

public class MachoKing extends SeasonedChicken {
    public MachoKing(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "BHC 맛초킹~~";
    }
}

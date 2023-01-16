package factory_method.velog;

public interface ChickenShop {

    default Chicken serveChicken() {
        System.out.println("잠시만 기다려 주세요 치킨을 만들어 드리겠습니다.");
        Chicken chicken = makeChicken();
        System.out.println("치킨이 완성되었습니다 맛있게 드세요 *^ㅡ^*");
        return chicken;
    }

    Chicken makeChicken();
}

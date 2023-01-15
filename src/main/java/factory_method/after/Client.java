package factory_method.after;

public class Client {

    public static void main(String[] args) {
        Ship whiteship  = new WhiteShipFactory().orderShip("WhiteShip","kmh102808@gmail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("BlackShip","kmh102808@gmail.com");
        System.out.println(blackship);
    }

}

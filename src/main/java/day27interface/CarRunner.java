package day27interface;

public class CarRunner {
    public static void main(String[] args) {

        Engine.stop();//stop() methodu static old. "interface" ismi ile ulastim.

        Honda h = new Honda();
        h.eco();//eco methodu static olmadigindan "object" ile ulastim.



















    }
}

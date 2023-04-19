package day27interface;

public class Honda implements Engine,Brake{


    @Override
    public void start() {
        System.out.println("Start..");
    }

    @Override
    public void payment() {
        System.out.println("Make a payment for break..");
        System.out.println("Make a payment for engine..");
    }


    @Override
    public void slow() {
        System.out.println("Be slow..");
    }
}

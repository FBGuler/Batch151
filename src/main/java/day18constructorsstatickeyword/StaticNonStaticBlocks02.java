package day18constructorsstatickeyword;

public class StaticNonStaticBlocks02 {

    public StaticNonStaticBlocks02(){
        System.out.println("Constractor 1");
    }

    public StaticNonStaticBlocks02(int price){
        System.out.println("Constractor 2");

    }

    public StaticNonStaticBlocks02(String name){
        System.out.println("Constractor 3");

    }

    public StaticNonStaticBlocks02(boolean isOld){
        System.out.println("Constractor 4");

    }

    /*
    Non-static block constractor lerde calistirilmasi gereken ortak kodlari icerir,
    non-static block icine yazilan kodlar her constractor icin calistirilir.
    Birden fazla non static block varsa ustteki once calisir.
     */

    {
        System.out.println("I am constructor1");
    }

    {
        System.out.println("I am constructor2");
    }

    public static void main(String[] args) {
        StaticNonStaticBlocks02 obj1 = new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2 = new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3 = new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4 = new StaticNonStaticBlocks02(false);

    }



}

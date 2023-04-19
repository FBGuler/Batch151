package day_11_practice;

public class C02_Static {

    static String okulIsmi = "Yildiz Koleji";

    static int okulNo;

    static boolean okulAcikMi;







    public static void main(String[] args) {

                /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

                */


        System.out.println(C02_Static.okulAcikMi);//false
        System.out.println(C02_Static.okulNo);//0

        okulNo = 102;

        System.out.println(okulNo);//102
        System.out.println(C02_Static.okulNo);//120

        staticMethod();
        System.out.println( );//200


    }

    private static void staticMethod(){
        okulNo= 200;
        System.out.println(okulNo);//200
    }


}

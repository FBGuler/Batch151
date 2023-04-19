package day01variablescanner;

public class MethodCreation {

    public static void main(String[] args) {


        //static ====> protokol tribunu VIP class

        //Karenin alanini veren kodu yaziniz
        kareninAlani(7);


        //Dikdortgenin alanini veren kodu yaziniz

        dikdortgeninAlani(10,20) ;

        System.out.println("Dikdortgenin Alani " + (dikdortgeninAlani(10,20) +2));

        //



    }

    private static int dikdortgeninAlani(int a, int b) {
       return a*b ;
    }

    /* return type i int old icin bir deger dondurur ve bu degeri kullanabiliriz.
       Method kullanabiliriz.
       Ekleme cikarma carpma bolme istedigimiz gibi elde edilen datayi kullanabiliriz.

     */

    private static void kareninAlani(int a) {

        System.out.println("Karenin Alani  : " + (a*a));
    }
}

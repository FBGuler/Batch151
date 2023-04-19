package day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {

    public static void main(String[] args) {

        /*
        -Javada farkli data type lari arasinda islem yapiliyorsa
        sonucu buyuk olan data type larinin turunde olur
        -Karsilastirma operatorunde sonuc hep boolean doner

        <   Kucuktur
        >   Buyuktur
        ==  Esittir
        !=  Esit degildir
        <=  Kucuk esittir
        >=  Buyuk esittir
        &&  And (ve) operatoru
        ||  Veya Operatoru

         */

        System.out.println(4*(5+2)/3); //9
        // int/int ==> int olacagindan 9.3333 yerine virgul sonrasini siler tamsayi verir.

        System.out.println(6*16/8);

        double sonuc = 4*(5+2)/3;
        System.out.println(sonuc); //9.0
        
        double sonuc2 = 4.0*(5+2)/3;
        System.out.println("sonuc2 = " + sonuc2); //9.333333333333334

        System.out.println(4.0*(1+5)/3); // 8.0

        int sayi1 =5;
        int sayi2 =2;
        double sayi3 =2;

        System.out.println(sayi1/sayi2); //2
        System.out.println(sayi1/sayi3); //2.5
        System.out.println(sayi1+sayi3/sayi2);//6.0

        boolean first = 2<4;
        boolean second = 2+6 != 8;
        boolean third = 2+3*5<20 ;

        System.out.println(first); //T
        System.out.println(second);//F
        System.out.println(third);//T

        System.out.println(first && second); //F
        System.out.println(first || second || third); //T





















        
        

























    }
}

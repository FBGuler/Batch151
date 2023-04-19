package day04memorykullanimiwrapperclass;

public class C4_MantikOperatorleri {
    public static void main(String[] args) {

        /*
        Javada islem yaptiran

        ==  Esittir
        !=  Esit degildir
        <   Kucuktur
        >   Buyuktur
        =   atama operatoru
        ||  veya operatoru
        &   tek ve operatoru
        &&  cift ve operatoru


        1<4<5 ===> matematik uclu karsilastirma yapar Ancak java uclu karsilastirma yapamaz

        1<4  &&  4<5 ; ===> Java bu sekilde ikili kiyas yapip mantik operatorleriyle birlestirme yapar.


        && ==> ve hem operatoru mukemmelliyetci yapidadir. True dondurmesi icin her iki sartinida saglamasi gerekir.
        & ile && arasindaki fark
        ( 3<5 && 3<9 && 11<2 && 4<8 && 2<3 ) ==> False ( Ilk buldugu false la kodu kiriyor ve false veriyor. Yani bu daha hizli calisiyor)
        ( 3<5 & 3<9 & 11<2 & 4<8 & 2<3 )     ==> False ( Butun satiri tariyor. daha yavas calisir)



        Cay  ve   Limon
         +   &&     +   ===>  True;
         +   &&     -   ===>  False;
         -   &&     -   ===>  False;
         -   &&     +   ===>  False;

         ||  ==> veya operatoru Polyanaci yapidadir. En ufak pozitif durumda pozitif verir. True dondurur.

        Cay  veya   Limon
         +   ||     +   ===>  True;
         +   ||     -   ===>  True;
         -   ||     -   ===>  False;
         -   ||     +   ===>  True

      */

        System.out.println(5+2==8); //false

        boolean sonuc1 = 5>4 && 7<9 && 6+3 ==9 && 5+2 !=8 ; //True
        System.out.println("sonuc1 = " + sonuc1);

        boolean sonuc2 =5>4 && 7>9 && 6+3 ==9 && 5+2 != 7 ; //False
        System.out.println("sonuc2 = " + sonuc2);

        int sayi1 = 15;
        System.out.println(10<sayi1 || sayi1< 20); //True

        int sayi2 = 5;
        System.out.println(sayi2< 10 || sayi2>20 ); //True

        short a = 1000;
        System.out.println(a<15000 || a>28000 || a<-23);

        System.out.println(a<=1000 && a==1000 && a<12 );





    }












}

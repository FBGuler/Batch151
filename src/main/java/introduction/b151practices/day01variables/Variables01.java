package introduction.b151practices.day01variables;

public class Variables01 {

    public static void main(String[] args) {
        //java bu satiri okumaz. Kendimize veya baskasina aciklamadir
        /*
        * java bu satirlarida okumaz
        * */


        //Variable olusturmak
        //data type + variable name + atama operatoru + data + noktali virgul
            int           age             =              13       ;
         // Varibale Declaration       Assignment               Statement

         /*java cumlesi ===> Statement
          Java'da "=" assignment operator. Sagdaki degeri alir soldaki kutuya koyar.
          Java'da esittir demek "==", Matematikte "=" ==> java'da "=="
          Eger variable declaration yapar, assignment yapmazsaniz java kendi (Default) degerlerini yukler
          Default deger Sayilar icin Sifirdir

          Data Type + variable name ==> Variable declaration
          Assignment operator (atama operatoru) + variable degeri ==> Assignment

          */

          /* javada temel de iki tip data vardir
              1)primitive data type :
              char, boolean, byte, short, int, long, float, double

              2)non-primitive data type:
              String
           */

        //Ornek 1 : Ogrenci ismi icin variable olusturunuz ve deger olarak Ali Can atayiniz.
        //String'lere verilen degerler daima cift tirnak icinde olmalidir.

         String studentName = "Ali Can" ;

         //Stringler icin "default value" "null" dir.
        // null demek 0 demek degildir, cunku o da coding de bir degerdir. "null" demek ici bos obje demek.
        // {} bunun gibi bos kume. {0} bu degil.

        //char data type:
        // Tek karakter icin kullanilir. ornegin ===> A, v, 5, ?
        //Ornek 2: char data type'inde bir ismin ilk harfi olarak bir variable olusturunuzve bir deger atayiniz.
        //Note: char data type'inda degerler tek tirnak icinde konulmalidir.

        char isminIlkHarfi = 'A'  ;

        //boolean data type:
        //boolean lar iki farkli deger alabilirler true (dogru) veya false (yanlis)
        //Ornek 3: boolean data tipinde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.

        boolean emeklimisin = false ;

        //byte data type:
        //tam sayilar icindir, hafizada 1 byte yer kaplar.
        //byte: -128 den +127 e kadar tamsayi degerleri icin kullanilabilir.
        //Ornek 4: byte data typeinda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.

        byte studentAge  = 23 ;

        //short data type :
        // tamsayilar icindir ve hafizada 2 byte yer kaplar.
        //short : -32768 ile 32767 arasindaki tamsayilar icin kullanilir

        short okuldakiOgrenciSayisi = 1300 ;

        //int data type:
        //tam sayilar icindir. hafizada 4 byte yer kaplar
        //int  : -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir.
        // Ornek 5: ulke nufusu icin bir variable olusturunuz ve deger atamasi yapiniz

        int countryPopulation = 1500000  ;

        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar.
        //long : -9,223,372,036,854,775,808 ile -9,223,372,036,854,775,807
        //Ornek 6: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        // Not; bir deger long ise sonuna 'L' ya da 'l' konur.
        //Eger long'a atadigimiz deger int lerin kapsamindaysa sonuna L koymaya gerek yoktur.
        //Long dememize ragmen sonuna eger eger L koymazsak java onu eger int araliginda ise int olaka kabul eder.

        long insanVucudundakiHucreSayisi = 5367289987L  ;
        long weight = 1234565; //int'lerin araliginda ise sonuna L koymaya gerek yok

        //float data type:
        //float virgullu sayilar (Decimal numbers) ===> ondalik sayilar icin kullanilir.
        //fiyatlandirmalar icin tercih edilebilir (12.99)
        //Ornek 7: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.
        //Not: java ondalikli sayilari yani "Decimal numbers) otomatic olarak "double"kabul eder
        //     siz data type ini float yazarsaniz hata alirsiniz.
        //     float olmasinda israr ediyorsaniz sonuna"F" ya da "f" koymalisiniz.
        //     float memory de 4 byte yer kaplar, double 8 byte yer kaplar.

        float gomlekFiyati = 12.99F ;
        float ayakkabiFiyati = 15.99F ;

        System.out.println(gomlekFiyati+ayakkabiFiyati);
        // System.out.println(); kodu parantez icine yazdiklarimizi ekrana yazdirir.

        int a=12;
        int b=13;
        System.out.println(a+b);
        // System.out.println(); ekrana yazdirir ve 'pointer' i bir sonraki satira koyar
        // System.out.print(); ekrana yazdirir ve 'pointer' i ayni satirda tutar

        int c =313 ;
        int d =314;
        System.out.print(c);
        System.out.println(d);

        //double data type:
        //double memoryde daha fazla yer kaplar. Virgulden sonraki rakam daha fazla alir. 8 byte yer kaplar.
        // double virgullu sayilar (Decimal numbers) ===> ondalik sayilar icin kullanilir
        //ornek 8: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturunuz ve agirliklari farkini ekrana yazdiriniz.

        double weightCell  = 0.000000000000112 ;
        double weightAmip  = 0.000000000000023 ;
        //System.out.println(); Kisa yolu 'sout' enter.
        System.out.println(weightCell-weightAmip) ;




















    }





}

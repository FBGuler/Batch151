package day04memorykullanimiwrapperclass;

public class C03_WrapperClass {

    /*
     Javada sonucta bir urundur.
     Oracle firmasinin bir urunudur. Developerlar sadece data
     barindiri primitive data typelarinin non primitive ler gibi method' da barindirmasini istemislerdir.
     Bunun uzerine Java primitive data type latina method ekleyerek, ozel bir class olusturmustur.
     Bunada wrapper (sarmalama, durum) class  denir.


              Primitive          Non-Primitive
                byte        ==>       Byte
                short       ==>       Short
                int         ==>       Integer    ****
                long        ==>       Long
                float       ==>       Float
                double      ==>       Double
                boolean     ==>       Boolean
                char        ==>       Character  ****



     */

    public static void main(String[] args) {

        byte primitiveByte = 12;
        Byte wrapperByte =12;

        // byte data type nin en buyuk ve en kucuk degerlerini ekrana yazdirin.

        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Byte.MIN_VALUE); //-128

        //Ex. int data type inin max degeri ile byte data type inin minimum
        // degeri toplamini hesaplatan methodu olusturunuz

        int intMax = Integer.MAX_VALUE ;
        byte byteMin = Byte.MIN_VALUE ;

        System.out.println( "intMax + byteMin==>" + (intMax + byteMin));

        // ******* Primitive Data Type larini Wrapper Classlara Nasil Ceviririz *******

        float primitiveFloat = 12.33f;
        Float wrapperFloat = primitiveFloat; // Autoboxing =Java otomatik yapar

        // Kutulama Java bunu otomatik olarak yapar kucuk kutuyu buyuk kutuya yerlestirilir.

        // ************* Wrapper Classlari Primitive Data Type larina Nasil Ceviririz ********

        Character wrapperChar ='a';
        char primitiveChar = wrapperChar; //Unboxing =kucuk kutuyu buyuk kutudan cikarma Java bunuda otomatik yapar

        // Ex Verilen iki String datanin toplamini veren kodu yaziniz

         String str1 = "12345";
         String str2 = "678";
        System.out.println(str1+str2); //Concatination ==> yanyana yazdirir
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));
        //valueOf() ==> String bir datayi Integere donusturur.

        /*
        Javada "+" sembolu iki int icin matematikteki gibi toplama islemi yapar.
        Iki String data arasinda ya da bir String bir Integer arasinda ise yanyana yazdirir.
        Buna 'concatinatioan' denir.
        Java matematik bilir islem onceligine gore calisir.
             i) Uslu Sayilar
             ii) Parantez ici
             iii) carpma/bolme
             iv)toplama/cikarma
          */

        String harf = "A";
        int sayi =7;
        //harf+sayi==>A7
        /*
        8+3+K
         */

         String a="K";
         int b=3,c=5,d=2 ;
        System.out.println(a+b*c/d);//K7























    }










}

package day05typecastingasciivaluestringmanipulations;

public class C03TypeCasting {
    public static void main(String[] args) {

        /*
        Numeric Data type larinin birbirine donusturulmesine Type Casting denir.
        Numeric Data Type'lari byte<short<int<long<float<double

        Kucuk data tiplerini buyuk data tiplerine donusturmesine
        Auto Widening (Otomatik Genisletme)== Kucuk kutunun buyuk kutu icerisine yerlestirilmesi.

        Buyuk kutunun kucuk kutuya donusturulmesinde Java sorumlulugu kabul etmez.
        Data kaybi olabileceginden code'u yazanlara birakir.
        Buna Explicit Narrowing (Aciktan daraltma ) denir.
        */

        byte age = 13;
        int ageInt =age; //AutoWidening

        // long data type nin shorta cevir

        long population =12345;
        short populationShort = (short) population; //ExplicitNarrowing

        // int data type ni float a ceviriniz.

        int x = 16;
        float xy = x;


































    }
}

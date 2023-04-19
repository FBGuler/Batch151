package day06typecastingstringmanipulation;

public class TypeCasting {
    public static void main(String[] args) {



        // ****************** ExplicitNarrowing********************
        // short data type inde bir variable olusturup byte data type ina ceviren kodu giriniz.
        /*
        Explicit yaparken dikkat edilmeli, cunku cok ciddi data kaybi hatta datanin degismesine neden olabilir.
        Eger calistigimiz variable in sinirlari disinda ise Java sayiyi mod islemine alir ve kalani yazdirir.
        Kalan bolenin yarisindan fazlaysa kalan sayiyi java kucultmek isteyecegi icin bolumu bir buyuterek kalani
        eksi isaretli olacak sekilde yazdirir.

         */
        short num = 260;
        byte numByte =(byte) num;
        System.out.println("numByte = " + numByte); //4
        
        short num2 = 1023;
        byte xnum2 = (byte) num2;
        System.out.println("xnum2 = " + xnum2);//-1
        
        short num3 =1000;
        byte num3Byte = (byte) num3;
        System.out.println("num3Byte = " + num3Byte);//-24
        
        int intSayi =8880;
        short intSayi1= (short) intSayi; //32768 +32768 +0
        System.out.println("intSayi1 = " + intSayi1);//8880 Short containera sigdigi icin kayip olmaz




        
        
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

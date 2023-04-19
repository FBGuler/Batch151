package practices01;

import java.util.Locale;

public class day01 {
    public static void main(String[] args) {


        // Ex 1: Herhangi bir 3 ögenin fiyatları için double data tipinde degiskenler olusturunuz. Fiyatların
        //toplamını konsola yazdırınız.
        
        double a = 1.5;
        double b = 2.5;
        double c = 3.5;

        System.out.println(a+b+c);

        // Ex 2:Herhangi bir 3 öge için float, long ve integer data tipinde degiskenler olusturunuz. Bu
        //degiskenlerin degerlerinin çarpımını konsolda yazdırınız.


            float x = 1.45f;
            long y = 23456L;
            int z = 14;
        System.out.println("x*y*z= " + (x*y*z));


        // Ex 3:Basit faizi bulmak için bir kod yazınız.
        //Not: Basit faiz formülü = anapara * oran * yılDegeri /100
        double anapara = 10.000;
        int yildegeri = 3;
        int oran = 2;

        System.out.println(anapara*oran*yildegeri/100);

        //Ex 4: Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
        //Sonrasında bu double değişkenin değerini konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.
        
        byte xy = 120;
        double xy1 = xy;
        System.out.println("xy1 = " + xy1);



        byte age = 23;
        double newAge = age;
        System.out.println(newAge);
        

        // ex 5: Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        //yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
        //değişken arasındaki farkı yazdırınız.
        
        String scr = "103";
        byte scr1 = Byte.parseByte(scr);
        System.out.println("scr1 = " + scr1);//103
        
        String xv = "2351";
        short xv1 = Short.valueOf(xv);
        System.out.println("xv1 = " + xv1);//2351

        System.out.println(xv1-scr1); //2248

        //ex 6: Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        //ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        //yazdırınız.
        //Örnek: 
             /*
               mIAMI - Miami
               miami - Miami
               MIAMI - Miami
               mIaMi - Miami vb.
             */
        System.out.println();
        String sehirIsmi = "MIamI";
        System.out.println(sehirIsmi.trim().substring(0,1).toUpperCase()+sehirIsmi.substring(1).toLowerCase());


        // Ex 7: Verilen iki String datanin toplamini veren kodu yaziniz
        System.out.println();
        String str1 = "12345";
        String str2 = "678";

        int str1x = Integer.valueOf(str1);
        int str2x = Integer.valueOf(str2);
        System.out.println(str1x + str2x);

        








        
    }
}
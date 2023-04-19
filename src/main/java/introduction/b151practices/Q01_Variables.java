package introduction.b151practices;

public class Q01_Variables {

    public static void main(String[] args) {


        //Bir variable baslat
        int age = 34;
        int number = 55;
        String isim = "Ali";

        System.out.println(age);
        System.out.println("number = " + number);
        System.out.println("age = " + age);
        System.out.println("isim = " + isim);

        //Variable degerini kopyala.
        int hisAge = age;
        System.out.println("hisAge = " + hisAge);

        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //Ayni satirda coklu variable deklere et.
        int year = 2022, month = 3, day = 15;
        System.out.println("year = " + year);
        System.out.println("day = " + day);

        //Bir variable degerini guncelle.
        year = 2023;
        System.out.println("year = " + year);
        year = 2050;
        System.out.println("year = " + year);
        year = year + 5;
        System.out.println("year = " + year);
        //Bir variable deklere et : x
        double x;

        //Bir variable başlat : y
        double y = 100.543;

        //Başka bir variable başlat : z
        double z = 43;

        //x değişkenini y değişkeni ile başlat
        x = y;

        //x degiskenini güncelle
        x = 3.14;

        //Değişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);





    }
}














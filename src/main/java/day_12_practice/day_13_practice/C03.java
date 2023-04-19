package day_12_practice.day_13_practice;


public class C03 {

    // Bu class calıstıgında output ne olur. Calısma mantıgını anlatınız
    int fiyat = 300000;
    int yil = 2023;
    String marka = "Opel";
    public C03(int fiyat, int yil, String marka) {
    }
    public C03() {

    }
    public static void main(String[] args) {

        C03 obj1 = new C03();

        System.out.println(obj1.fiyat);
        System.out.println(obj1.yil-3);
        System.out.println(obj1.marka.replace("Opel","Mercedes"));

        C03 obj2 = new C03(500000,2021,"Citroen");
        System.out.println(obj2.fiyat + ", " + obj2.yil + ", " + obj2.marka);


    }








}
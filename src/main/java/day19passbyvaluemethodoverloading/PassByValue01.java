package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    /*
    1)Java passbyvalue kullanir.
    2)yani, Javanin methodlarin orijinal degerinin degismesine izin vermez.
    3)Methodlara deger yollarken original degerin copyasini methoda yollar
      Method kopya degeri uzerinden islemler yapiliyor.
    4)Java esnek bir dildir, eger original degeri degistirmek istersek yazdigimiz kod ile
      yapabiliriz.

      Pass By Referance:
      1)Pass by referance da methoda referance yollanir.
      2) Referance adres demektir, adres yollaninca method adresi kullanarak original degeri degistirir.
        Bu yuzden C# C++ gibi Pass by referance kullanan method variable original degerini degistirir
     */
    public static void main(String[] args) {

        int shirtPrice = 100;
        System.out.println("shirtPrice = " + shirtPrice);

        //burda pass by value sayesinde shirtprice degeri koruma altina alinir.

        int studentShirtPrice = discount("student",shirtPrice);
        //methoda gonderirken degeri degil kopyasini gonderir ve degisen deger kopyasi olur original degil.
        System.out.println("studentShirtPrice = " + studentShirtPrice);
        System.out.println("shirtPrice = " + shirtPrice);


        
        
    }

    public static int discount(String type, int price){
        switch (type){
            case"student" :
                price = price -10;
                break;
            case"veteran" :
                price = price - 20;
                break;
            case"senior":
                price = price-5;
                break;
            default:
                price = price;
        }
        return price;
    }


}

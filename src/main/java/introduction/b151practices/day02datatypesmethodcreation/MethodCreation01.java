package introduction.b151practices.day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    javada method nasil olusturulur

    1)main method un disinda class in icinde olusturulur
    2)Access Modifier + return type + Method ismi + () + {}
 public   static(yazilir cunku main method static)    +  int        +  toplamaYap + (int a, int b) + { return a+b ;}
    Olusturulan methodlar nasil kullanilir?
    1)main methodun icinden kullanilir.
    2)methodun ismi + () yazin
    3) islem yapacaginiz parametreler parantezin icine koyulur
    ==> Cok onemli= main method static oldugu icin main method icerisinde kullanacaginiz her sey static olmalidir.

  */
    public static void main(String[] args) {
          int sonuc =  toplamaYap(3,5) ;
        System.out.println(sonuc);

        long carpmaSonuc =  multiply(3,5) ;
        System.out.println(carpmaSonuc);

        int ucluSonuc  = firstTwoMultiplyThirdAdd (3,4,5) ;
        System.out.println(ucluSonuc);

        double kup = getCube (3.5) ;
        System.out.println(kup);

        print("Hello World");

    }
    // Ornek1: toplama islemi yapan bir method olustur
    public static int toplamaYap (int a, int b) {

        return a+b;
    }
    //Ornek 2 :2 sayiyi carpma islemi yapan bir method olusturun.
    protected static long multiply (int a, int b) {

        return a*b ;
    }

    //Ornek 3: Verilen uc sayidan ilk ikisini carpan ve sonuncu sayi ile toplayan bir method olusturunuz.

    private static int firstTwoMultiplyThirdAdd (int a, int b, int c) {
        return a*b+c ;
    }
    //Ornek 4: Verilen bir ondalik sayinin kupunu hesaplayan method olusturup kullaniniz.
    // Note: Onemli == Access Modifier i default yapmak isterseniz access modifier yazmayiniz. Bos kalacak.
    static double getCube (double a ){
        return a*a*a ;
    }
    //Ornek 5: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    private static void print (String str) {
        System.out.println(str);


    }
    // Onemli ==Method un return type i void ise method body icinde return keyword yazilmaz.
    //eger bir method yeni bir data uretmiyorsa return type void olur. Ve void method method body disina yazilir.
    








}

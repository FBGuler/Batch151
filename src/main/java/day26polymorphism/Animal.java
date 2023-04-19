package day26polymorphism;

public class Animal {
    /*
    1)Parents class daki methodu child class icinde ozellestirreek kullanmaya Overriding denir
    2)Overriding de methodun parantezine ve methodun ismine dokunulmaz.(==> Method signature)
    3)Private methodlar override edilemez.
    4)Child class daki methodun
    5)Animal HAS A Cat.
      Cat IS AN Animal.
    Child class da override edilen methodun return type i ile Parent
    taki methodun return type i arasinda IS A iliskisi varsa return type
    degistirilebilir.

    6)Eger methodun return type i primitive ise Overriding yaparken
    type degistirilemez.Cunku return typr ya ayni olur ya da parenttan secilir, ama
    primitiveler arasinda parent-child iliskisi olmadigindan parenttan secmek
    mevzubahis olamaz, o zaman tek secenek aynisi olmalidir.

    7)Child a override edilen methodun return type i ile parent taki methodun return type i arasinda IS A
    iliskisi yoksa return type i degistirilemez.
    Mesela: Integer Wrapper class i ile Long Wrapper class i arasinda IS-A iliskisi yoktur o yuzden
    return type i degistiriledi.

    8)Methodun return type i void ise Overriding yaparken return type degistirilemez.
    9)Static methodlar override edilemezler. Cunku static methodlar tum child lar icin ortak methodlardir.
    Bir child bir ortak methodu degistirdiginde diger childlar bundan olumsuz etkilenir. Bu yuzden Java static
    methodlarin override edilmesine izin vermez.

    10)final methodlar override edilemezler. final methodlarin body si degistirilemez ama Override ederken
      method body i degistiririz bu bir celiskidir. Bu yuzden java final methodlarin override edilmesine musade etmez
               a) Final keyword unu Variable lar ile kullanabiliriz
                    i)final variable ise mutlaka deger atanmalıdır
                    ii) ilk atanan deger degistirilmez

               b) Final keyword unu Method lar ile kullanabiliriz
                    i)method final ise methodun body si degistirilemez
                    ii) methodun body si degistiriemeyince override yapmak mumkun olmaz

               c) Final keyword unu Class lar ile kullanabiliriz
                    => class final ise O classin child i olamaz

           ==>Polymorphism ==> Method Overloading + Method Overriding;



    * */





    public void eat(){
        System.out.println("Animals eat");
    }
    public void drink(){
        System.out.println("Animals drink");
    }
    public Animal create() {
        return new Animal();
    }
    public int add(int a, int b){
        return a+b;
    }

    public Integer multiply(int a, int b){
        return a*b;
    }

    final Double PI= 3.14;

    public final double circleArea (double r){
        return 3.14*r*r;
    }










}

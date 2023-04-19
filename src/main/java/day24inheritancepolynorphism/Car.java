package day24inheritancepolynorphism;
/*
    1) Inheritance'da object olustururken constructor'lar yukaridan(Parent)
       asagiya(Child) dogru calisir.
    2)Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
    3)super() her constructor'in ilk satirinda gorunmez olarak bulunur.
      Isterseniz gorunur sekilde de yazabilirsiniz
    4)Super() sizi parent class daki constractor a tasir.
    5)This() sizi ayni class icinde ki constructor lar arasinda gezdirir.
    6)this icinde bulundugunuz class daki variable lari cagirmaya yarar.
      super parent class daki variable lari cagirmaya yarar.
 */

/*
    1)Polymorphism ==> Coklu sekil
      Yani bir method un farkli sekillerde karsimiza cikmasi demek.
      Polimorphism = Overloading(+) * Overriding(-)
    2)Overriding, parent class daki method u child classin ihtiyaclarina gore ozellestirerek kullanmak demektir.
    3)Overriding de method un body si degistirilir.
    4)Overriding te method signiture dokunulmaz. Dokunursaniz Java kizar.

 */

public class Car {

    public void move(){
        System.out.println("Cars move...");
    }
    public void getBreak(){
        System.out.println("Cars break...");
    }
    public void engine(){
        System.out.println("Cars have engine...");
    }
    public String model = "Car";
    public int price = 0;

    public Car(){
        System.out.println("Car constructor 1");
    }

    public Car(int i){
        this();
        System.out.println("Car constructor 2");
    }
}

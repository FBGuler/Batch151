package day_14_practice;

public class Child extends Parent{

    public static void main(String[] args) {

        System.out.println(isim);//Ali
        System.out.println(soyisim);//Can
        method1();//parent static method1
        method2();//parent static method2

        Parent obj = new Parent();
        System.out.println(obj.yas);//30
        obj.method3();//parent instance method3
        obj.method4();//parent instance method4


        Child obj1 = new Child();
        System.out.println(obj1.yas);  // 30

        obj1.method3(); // parent instance method3
        obj1.method4(); // child instance method4










    }




}

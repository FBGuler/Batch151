package day28interface;

public class Cat implements Mammal{

    @Override
    public void eat() {

    }

    @Override
    public void dring() {

    }


    public static void main(String[] args) {
        //Interface lerde variable cagirirken "interface" adini kullanarak cagirin.
        //Bu hem static olmanin geregidir, hemde omkunurlugu artirir.

        System.out.println(Animal.age);
        System.out.println(Mammal.feedBaby);
        System.out.println(Mammal.age);









    }



}

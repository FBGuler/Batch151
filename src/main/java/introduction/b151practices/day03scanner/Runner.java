package introduction.b151practices.day03scanner;

public class Runner {
    public static void main(String[] args) {

        //Object nasil olusturulur.
        //Class Ismi  +  Object name  +  Atama Operatoru  +  "new"  + Costructor
             Car            myCar            =                new       Car ()  ;
        //"new" keyword'u sifirdan yeni bir obje olusturmak icin kullanilir.
        //Constractor Java'da nesneleri olusturmak icin kullanilan ozel bir methoddur.
        //Constractor = Class Ismi+ ()
        System.out.println(myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);
        myCar.hareket();
        myCar.dur();

        Student tomHanks = new Student ();
        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.grades = " + tomHanks.grades);
        System.out.println("tomHanks.address = " + tomHanks.address);
        tomHanks.feed();
        tomHanks.study();


    }
}


package day27interface;


    /*
    1) "interface"in icine "concrete method" konulamaz
    2)"interface" icindeki methodlarin abstract oldugunu Java bilir, bu yuzden "interface" icindeki
  "abstract method" larda "abstract" keyword kullanmaya gerek yoktur.
    3)"Interface" icindeki abstract methodlarin tamami "public" dir.
    Bu yuzden "interface" icinde abstract method olustururken "access modifier"
    yzmaya gerek yoktur.
    4)Bir interface i bir class in parente yapmak istedigimiz de "extends" keyword yerine "Implements"
    keyword kullaniniz.
    5)"Concrete child class" lar "parent interface" deki "abstract method" lari override etmek zorundadirlar.
    6)"interface" ler bir applicationda  "Concrete Child Class" larin yapmak zorunda olduklari
    fonksiyonlari barindirirlar. Bu yuzden "interface" lere "to-do list" de denir.
    7)Birden fazla "interface" icinde abstract methodlar olusturabilirsiniz.
      Abstarct methodlarin body si olmadigi icin child class lar ayni isimli methodlardan
      herhangi birini override ederek kullanabilirler.
    8)Birden fazla "interface" icinde abstract methodlar olusturdugunuzda bu methodlarin
    return type lari ayni olmak zorundadir.
    9)Normalde "interface" icinde "concrete method" konulamaz ama bazi ozel durumlarda
    "concrete method" koymamiz gerekirse
         i)"defult" keywordunu asagidaki gibi kullanarak "interface" icine "concrete method" koyabiliriz.
         defult void eco(){System.out.println("Uses gas less..");}
         ii)"static" keywordunu asagidaki gibi kullanarak "interface" icine "concrete method" koyabiliriz.
         static void stop (){System.out.println("Stops securely..");}
     10)Defult veya Static keywordunu kullanarak olusturdugunuz concrete methodlarin
     concrete child classlar tarafinda kullanilma zorunlulugu yoktur.
     11)Defult veya Static keywordunu kullanarak olusturdugunuz concrete methodlara object olusturarak
     ulasilabilir.
        "static" keywordunu kullanarak olusturdugunuz "concrete method"lara ulasmak icin "object"
        olusturmaya gerek yoktur, "interface ismi yeterlidir.
    12)"Interface" lerden object olusturulamaz. 

    */


public interface Engine {

    void start();
    void payment();

    default void eco(){
        System.out.println("Uses gas less..");
    }

    static void stop (){
        System.out.println("Stops securely..");
    }










}

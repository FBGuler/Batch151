package day25varargsinheritance;

public class Vehicle {
    /*
    1)Java da object class tum java class larinin ortak parent idir.
    2)Java da object class haric tum classlarin parent i vardir.
    3)Java da Parent tan child a olan iliskilere HAS A Relation Ship denir.
      Javada child dan parent a o lan iliskilere de IS A Relation Ship denir.
    4)Java da her classin bir tane defult constructoru vardir. Bu defult constructor classin icinde gorunmez cunku
      default constructor Object Classin icindedir.
     5)Child class ta bir obje olusturdugumuzda constractor ler
     en ustteki parents class tan baslatilarak alta dogru calistirilir.
     6)Child class daki constractorden parent classdaki constructor a gidebilmek icin super() kullanilir.
     7)Parent class da birden fazla constractor varsa istenilen constractor super() ifadesi
     icine yazilan parametre ile secileblir.
     8)Ayni class icindeki constractorleri secmek icin "this()" kullanilir.
     Ayni class ta birden fazla constractor varsa istenilen constractor this() icine yazilan
     parametreler yardimi ile secilebilir.
     9)super() ifadesini yazmak istege baglidir. siz yazmasanizda Java sanki super varmis gibi davranir.
     Ama codunuzu daha okunur kilmak icin tavsiye edilir.
     10)super() ve this() ifadeleri constructor icinde her zaman ilk satirda olmalidir.
     11)Bir constructor icinde super() ve this () ifadeleri sadece bir kere kullanilabilir.
     12)Inheritance ta variable lari ve methodlari cagirmak icin this veya super kullanilir.
     this==> kendi class'indan
     super==> parent class'indan veriable ya da method cagirmayi saglar.
     */

    public Vehicle (){

        System.out.println("Vehicle1");
    }
    public Vehicle (int price){

        System.out.println("Vehicle int parametreli");
    }





}

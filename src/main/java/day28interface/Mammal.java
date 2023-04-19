package day28interface;


  /*
  1)Child      Parent
    Class --> Class :extends
    interface --> interface : extends
    Class --> interface : implements
    interface --> Class : Olamaz...
    Ayni ise "extends", farkli ise "implements" kullan.
    "interface"i Class in childi yapma.

    abstract class ile interface arasindaki farklar nelerdir?
    *1)Abstract Classlar hem "abstract" hem de "concrete methodlar" icerebilir. Fakat interface ler sadece "abstract" method ecerir.
      Ama interface lerde istersek "defult" ve "static" keyword lari kullanarak "concrete" method uretebiliriz.
    *2)Abstarct Class lar multiple inheritance i desteklemez ama interfaceler destekler.
    *3)Abstract Class lar icinde her turlu variable olusturabilir, interface ler icindeki variable lere public, static ve final olmak zorundadir.
    4)  "interface"i Class in childi olamaz ama "abstract" class in child i olabilir.
    5)abstract class larda constractor vardir ama object uretemez, interface lerde constractor yoktur bu yuzden object uretilemez.


   */
public interface Mammal extends Animal{

  String feedBaby ="Milk";
  int age = 6;


}

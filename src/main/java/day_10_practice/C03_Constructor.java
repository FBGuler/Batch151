package day_10_practice;

public class C03_Constructor {


    // marka, model, yil, yakit  seklinde dort tane instance variable olusturalım.
    // Bu variable'lara default constructor kullanarak,
    // farkli bir class'dan "Mercedes", "C180", 2023, "Benzin" deger ataması yapınız ve yazdırınız

    String marka;
    String model;
    int yil;
    String yakit;


    /*objeyi olustururken icinde bulundugumuz class ismini degil
ulasmak istedigimiz variable'in bulundugu classin ismini yazarak
olusturduk. Olusturdugumuz objenin constructor'i(C03_Constructor();)
parametresiz olup buradan gitmek istedigimiz class'in default
constructor'ina ' gidecek. Default constructor gorunmuyor. Default
constructor parametresi ici bos oldugundan bir sey yapamadan
geri donus yapar. Bu nedenle biz instance variablelara kendimiz
olusturdugumuz objeyi kullanarak deger atamasi yapacagiz.
obj1 objesi uzerinden marka variable'ina "Mercedes"'i assign ettik.
obj1 uzerinden model variable'ina "C180" degerini assign ettik.
obje1 uzerinden yil variable'ina 2023'u assign ettik
obje1 uzerinden yakit variable'ina "Benzin" degerini atadik.

Sonra sout ile her bir deger verdigimiz variable'a bakacagiz. Sout
icine obje ismi (.) ve ekinde marka, model, yil, yakit yazinca yeni
degerlerini gorebildik.
 */



}



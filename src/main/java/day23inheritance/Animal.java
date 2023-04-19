package day23inheritance;

public class Animal {

    /*

    1)eat(){} method u gibi bir cok class in kullanmasi gereken methodlari her classa ayri ayri yazarsak;
      i)Tekrar yapmis oluruz, tekrar ideal cod da olmamalidir.
      ii)Ayni method u tekrar tekrar yazmak zaman kaybidir.
      iii)Tekrar tekrar yazilan methodun tamiri cok zaman alir.
      iv)Tekrar tekrar yazilan method un gelistirilmesi cok zaman alir.
      v)Method u tekrar tekrar yazmak "atomic yapi"ya terstir.
    2)private class memberlar child classlar tarafindan kullanilamazlar.
      public class memberlar child classlar tarafindan kullanilir.
      protected class memberlar farkli pacgate tarafindan kullanilir.
      defult class member lar ayni pagcage de child classlar tarafindan kullanilabilir.
    3)Java da bir class in sadece 1 tane parent i olabilir.
      Coklu Parent a "Multiple parent " derler, tekli parenta "Single Inheritance" derler
      Java "Multiple Inheritance" i desteklemez, Java "Single Inheritance " kullanilir.
     4)Apartman seklindeki inheritance yapisina "MultiLevel Inheritance" denir.Java multilevel inheritance yi destekler.



       */


    public void eat(){
        System.out.println("Animal eats..");
    }
    public void drink(){

        System.out.println("Animal drinks..");
    }












}

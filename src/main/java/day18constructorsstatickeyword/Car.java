package day18constructorsstatickeyword;

  public class Car {
      /*
      1)CONSTRUCTOR nasil olusturulur?
      Access Modifier+ Class Ismi +()+{}
      2)"Mothod ile "Constructor arasindaki farklar nelerdir?
        i)Methodlarda return type olur, Constructor lerde olmaz
        ii)Methodlar yaptiklari ise gore isimlendirilirler
        iii)"Methodlar bir aksiyor yapmak icin olusturulur, Constructor lar ise object olusturmak icindir
        iv)Method isimleri kucuk, Constractor isimleri class ismiyle ayni old icin buyuk harfle baslar
     3)Parametreli Constructor'lar olusturarak ayni
     class'dan farkli ozelliklere sahip object'ler olusturabiliriz.

       */


      String make = "Honda";
      String model = "Accord";
      int year = 2021;
      int price = 18000;
//      //Defult Constructor ==>
      //Defult Constructor ler parametre kullanmazlar o yuzden body si bostur.
      //Java kiskanctir. siz defult constructor u elle yazdiginizda java Object Class
      //icindeki defult constractor i kullandirmaz.

      public Car(){//() parametre yok  // {} body si bos

      }

      //Costum constructue==>
      //Costum constructue, bunda hem parametre hemde body dolu


      public Car(String make, String model, int year, int price) {
          this.make = make;
          this.model = model;
          this.year = year;
          this.price = price;
      }

      public Car(String make) {
          this.make = make;
      }


      public Car(String make, int price) {
          this.make = make;
          this.price = price;
      }
  }








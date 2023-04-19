package day17multidimensionalarraypaabyvalue;

public class PassByValue01 {
    /*
     Method olusturmak icin asagidaki 5 adimi takip ediniz.
     1)Access Modifier
     2) Return Type
     3) Method ismi
     4)Method Parantezi
     6) Methodun body'si

    not : main methodun icindeki tum methodlar static olmalidir
    bir methodu static yapmak icin access modifier ile return type in arasina
    static yazmak yeterlidir.

    Pas by Value:
    1)Java pass by value kullanir
    2)Yani; java methodlarin original degeri degistirmesine izin vermez
    3)Java methodlara deger yollarken original degerin kopyasini olusturur ve o kopyayi methoda yollar
      method kopya deger uzerinde degisiklik yapar boylece original deger korunmus olur
    4)Java esnek bir dildir, istersek yazdigimiz kod ile original degerin degismesinide temin edebiliriz.

    Pass by Referance :
    1) Pass by Referance da method a referance yollanir
    2)Referance adres demektir. adres yollaninca method adresi kullanarak original degere ulasir ve
     original degeri degistirir,
     Bu yuzden "C#" gibi Pass by referance kullanan dillerde method variable nin original degerini degistirir
    */
    public static void main(String[] args) {

        int shirtPrice = 200;
        System.out.println(discount("student",shirtPrice));//180
        System.out.println(shirtPrice);//200


        shirtPrice = discount("veteran",shirtPrice);
        System.out.println("shirtPrice = " + shirtPrice);//Originali de azalttik



    }
    //Discount methodu olusturunuz
      public static int discount (String type,int price){
    switch(type){
       case "student":
        price = price -20;
        break;
       case "veteran":
        price = price -40;
        break;
       case "senior":
        price = price -30;
        break;
       default:
        price =price;
    }
       return price;
    }
    }

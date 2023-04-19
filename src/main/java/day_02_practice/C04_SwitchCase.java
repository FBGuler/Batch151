package day_02_practice;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {



            /*

           Bir restoranda, müşteriler menüden yemeklerini seçerler.
           Restoran, müşterilerin seçtiği yemeği pişirmek için bir
           program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
           secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
           belirlendigi bir program yaziniz

           hamburger == 200TL
           pizza == 500TL
           tavuk == 700 TL

           */

                String yemek="hamburger";

                switch(yemek){
                    case"hamburger":
                        System.out.println("Hamburger Menusu 200 TL");
                        break;
                    case"pizza":
                        System.out.println("Pizza Menusu 500 TL");
                        break;
                    case "tavuk ":
                        System.out.println("Tavuk Menusu 700 TL ");
                        break;
                    default:
                        System.out.println("Oyle bir secenegimiz yok");
                }


             /*
             Bir arac kiralama sitesinde secilen araba markasina gore degisen kiralam ucretine gore
             Toplam odenecek fiyati gostern kodu yaziniz
             SUV ==>500.0
             SEDAN ==> 400.0
             HATCBACK ==> 350.0
             geriye kalanlar ==>300.0 TL


              */




        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Lütfen araç markasını seçin:");
        System.out.println("1 - Mercedes");
        System.out.println("2 - BMW");
        System.out.println("3 - Audi");

        int choice1 = scanner2.nextInt();
        double rentalPrice = 0.0;

        switch (choice1) {
            case 1:
                rentalPrice = 200.0;
                break;
            case 2:
                rentalPrice = 180.0;
                break;
            case 3:
                rentalPrice = 150.0;
                break;
            default:
                System.out.println("Geçersiz seçim yaptınız.");
                System.exit(0);
        }

        System.out.println("Lütfen kaç gün kiralayacağınızı girin:");
        int days = scanner2.nextInt();

        double totalPrice = rentalPrice * days;
        System.out.println("Toplam ödenecek tutar: " + totalPrice + " TL");



       /*
        Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
        Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
        gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
        istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
        onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
        kontrol eden bir program yaziniz
        */



























    }
}

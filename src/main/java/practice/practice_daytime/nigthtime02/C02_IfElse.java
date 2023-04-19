package practice.practice_daytime.nigthtime02;

import java.util.Locale;
import java.util.Scanner;

public class C02_IfElse {

    public static void main(String[] args) {

        /*
        Kullanicidan bir gun alin
        Eger gun cuma ise "Muslumanlar Icin Kutsal Gun" ;
        Eger gun cumartesi ise "Yahudiler icin Kutsal Gun"
        Eger gun pazar ise "Hristyanlar icin Kutsal Gun"
         yazdiran kodu olusturunuz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz..");
        String str = input.next().toLowerCase();
        if (str.equals("cuma")){
            System.out.println("Muslumanlar icin Kutsal Gun..");
        }else if(str.equals("cumartesi")){
            System.out.println("Yahudiler icin Kutsal Gun");
        }else if(str.equals("pazar")){
            System.out.println("Hristyanlar icin Kutsal Gun");
        }







             /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola "
        3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */

        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen 3 karakterden daha uzun kelime giriniz..");
        String str1 = input1.next();
        if(str1.length()<=3){
            System.out.println("3 Karakterden Daha Uzun Bir Kelime Girmelisiniz");
        }else {
            String x = str1.substring(0,3);
            System.out.println(""+x+str1+x);
        }

        /*
        Kullanıcıdan iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise,
         ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise, konsola
        "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */

        Scanner input2 = new Scanner(System.in);
        System.out.println("Lutfen iki kelime giriniz..");
        String y = input2.nextLine();
        String ilkKelime = y.split(" ")[0];
        String ilkKelimeninYarisi1 = ilkKelime.substring(0,ilkKelime.length()/2);
        String ilkKelimeninYarisi2 = ilkKelime.substring(ilkKelime.length()/2);
        String ikinciKelime = y.split(" ")[1];
        if (y.split(" ")[0].length()%2==0){
            System.out.println(ilkKelimeninYarisi1+ikinciKelime+ilkKelimeninYarisi2);
        }else if(y.split(" ")[0].length()%2!=0){
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }

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
      String yemek = "pizza";
      switch (yemek){
          case"hamburger":
              System.out.println("hamburger == 200TL");
              break;
          case"pizza":
              System.out.println("pizza == 500TL");
              break;
          case"tavuk":
              System.out.println("tavuk == 700 TL");
              break;
          default:
              System.out.println("Oyle bir secenegimiz yok");

      }


       /*
             Bir arac kiralama sitesinde secilen araba markasina gore degisen
             kiralama ucreti ve kiralanacak gun sayisina gore
             Toplam odenecek fiyati gosteren kodu yaziniz
             SUV ==>500.0
             SEDAN ==> 400.0
             HATCBACK ==> 350.0
             geriye kalanlar ==>300.0 TL
             double toplamUcret = kiralamaUcreti * kiralanacakGunSayisi;

         */

        String aracTuru="SUV";
        int kiralanacakGunSayisi=2;
        double ucret = 0;
        switch (aracTuru){
            case "SUV":
                ucret = 500.0;
                break;
            case "SEDAN":
                ucret = 400.0;
                break;
            case "HATCHBACK":
                ucret =350.0;
                break;
            case "digerleri":
                ucret = 300.0;
                break;
            default:
                System.out.println("Boyle bir arabamiz yok");

        }
        System.out.println("Toplam fiyat == "+ (kiralanacakGunSayisi*ucret));


        /*
        Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
        Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
        gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
        istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
        onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
        kontrol eden bir program yaziniz  (elephant,  lion ,giraffe  )
        default  ==> belirtilen hayvan bulunamadi
         */

        














    }//main
}//class
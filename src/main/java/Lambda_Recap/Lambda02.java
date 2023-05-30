package Lambda_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {

        List<String> meyve = new ArrayList<>(Arrays.asList("elma", "portakal", "uzum", "cilek",
                "greyfurt", "nar", "mandalina", "armut", "elma", "keciboynuzu","elma"));

        ilkHarfeVeyac(meyve);//elma cilek elma elma
        System.out.println();
        basaVeSonaYildizEkle(meyve);//*elma* *portakal* *uzum* *cilek* *greyfurt* *nar* *mandalina* *armut* *elma* *keciboynuzu* *elma*
        System.out.println();
        System.out.println(karakterSayGoreBuyKucSirKarSayEnBuyIlk3(meyve));//[keciboynuzu, mandalina, portakal]
        System.out.println();



    }
    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari yazdıralım
    public static void ilkHarfeVeyac(List<String> meyve) {
        meyve.stream().filter(t -> t.startsWith("e") || t.startsWith("c")).forEach(Utils::yazdir);
    }

    /// SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim

    public static void basaVeSonaYildizEkle (List<String> meyve){
        meyve.stream().map(t->"*" + t + "*").forEach(Utils::yazdir);
    }

    // SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
    // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız

    public static List<String> karakterSayGoreBuyKucSirKarSayEnBuyIlk3(List<String> meyve){
       /* List<String> sonuc = meyve.
                stream().
                sorted(Comparator.comparing(t->t.toString().length()).reversed()).
                limit(3).
                collect(Collectors.toList());
        return sonuc;

        */
        List<String> sonuc = meyve.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(3).
                collect(Collectors.toList());
        return sonuc;


    }







}

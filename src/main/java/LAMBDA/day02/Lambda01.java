package LAMBDA.day02;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {


        List<String> iller = new ArrayList<>(Arrays.asList("Van", "GumusHANE", "MUS", "Kutahya", "Ankara", "MUS", "Ordu", "Gaziantep", "Hatay", "Edirne"));

        bykHrfLenghtArtanSiradaTkrsz(iller);//VAN MUS ORDU HATAY ANKARA EDIRNE KUTAHYA GUMUSHANE GAZIANTEP
        System.out.println();
        bykHrfSonHarfGoreArtanSiradaTkrsz(iller);//KUTAHYA ANKARA GUMUSHANE EDIRNE VAN GAZIANTEP MUS ORDU HATAY
        System.out.println();
        bykHrfUzunluklarinaGoreArtanSiradaTkrszAyniAlfabetikSira(iller);
        System.out.println();

    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfLenghtArtanSiradaTkrsz(List<String> iller) {

        System.out.println("1) ");
        iller.stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t +" "));

}


    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfSonHarfGoreArtanSiradaTkrsz(List<String> iller) {

        System.out.println("2) ");
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).//son harfine gore aldik
                forEach(t -> System.out.print(t + " "));

    }


    /*
     forEach(t -> System.out.print(t + " ")); lambda bu yapiyi sevmez Bunun yerine Method Referance yontemini bulmus.
     */
    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void bykHrfUzunluklarinaGoreArtanSiradaTkrszAyniAlfabetikSira(List<String> iller) {
        System.out.println("3) ");
        iller.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);

    }

    /*
    map(t->t.toUpperCase()) "Lambda Expression" bu sevilmez bunun yerine String::toUpperCase "Method Referance" kullanilir.
     */

   /*
    Stream:

    Datalari akisa sunar. Cok sayıda işlevsel metodun çağrılmasını sağlar

    ForEach:
    Stream içindeki veriyi tek tek tüketmek için oluşturulmuş bir yapıdır.
            **Terminal işlemi olduğundan dolayı stream artık tüketilmiş olarak kabul edilir ve
    artık kullanılamayacağı anlamına gelir.


    Filter:
    Dizimiz veya Collection'ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
    filtreleme işlemi yapmamıza yarayan bir yapıdır.
    Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
    Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır


    Collect:
    Collect metodu Stream türündeki nesneleri başka biçimdeki nesneye,
    veri yapısına dönüştürmek için kullanılır.


            Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
    ve başka elemanlara dönüştürmemize imkan sağlayan


    Distinct:
    Stream içerisinde bulunan ve tekrar eden elemanlar varsa
    bunları distinct metodu ile çıkartabilir ve
    elimizde tekrar etmeyen birbirinden farklı
    elemanlar barından bir veri setimiz kalır


    Sorted:
    Bazı durumlarda elimizde ki veri setini belirli bir parametreye göre sıralamak isteyebiliriz.
            2 türü bulunmaktadır. Birinci hali parametre almaz küçükten büyüğe şekilde sıralar.
    İkinci formatı ise Comparator arayüzünden türediği için
    bizim belirlemiş olduğumuz parametreye göre sıralama işlemi yapar.



    reduce : indirgeme demektir.
    kullanımı; elemanları teker teker işler. Bir önceki adımda elde edilen sonuç,
    bir sonraki elemanla işlemle tutulur


    Match operasyonu bir akışın belirli kriterleri sağlayıp sağlamadığını ölçmek için kullanılır.
    Map den farkı her iterasyonu tek tek değerlendirip sonucu yansıtmaz bunun yerine tüm koleksiyonu
    değerlendirerek sonucu yansıtmasıdır. Match operasyonunun 3 çeşit kullanımı bulunmaktadır;

    AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
    herhangi bir elemanla eşleşme durumunda true dönecektir.


            AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
    bu şarta uyması durumunda true dönecektir.


            NoneMatch: Şarta göre Stream içindeki hiç bir
    elemanın şartı sağlamaması durumunda true dönecektir.



            Comparator => bir Class'tır. Compar karşılaştırmak demektir.
    Bazı nesneler koleksiyonuna toplam sıralama uygulayan bir karşılaştırma işlevi.
            Karşılaştırıcılar, sıralama düzeni üzerinde hassas kontrol sağlamak için bir
    sıralama yöntemine (Collections.sort veya Arrays.sort gibi) aktarılabilir.
    Karşılaştırıcılar, belirli veri yapılarının (sıralı kümeler veya sıralı haritalar gibi)
    sırasını kontrol etmek veya doğal sıralaması olmayan
    nesnelerin koleksiyonları için bir sıralama sağlamak için de kullanılabilir.

            reverseOrder() => Comparator Class'ının bir methodudur.tersten siralama yapar.
    Doğal sıralamanın tersini (büyükten küçüğe) uygulayan bir Comparator (karşılaştırıcı) döndürür.
            comparing() => karşılaştırma demektir.
    reversed() => Bu karşılaştırıcının (comparator) ters sıralanmasını
    uygulayan bir karşılaştırıcı (comparator) döndürür.

    */





}

package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {


//    HashSet: "Elemanlari eklemek, aramak ve depolamak da asiri hizliyimdir. Tutmayin beni!"
//    LinkedSet: "Bana verilen elemanlari verildigi gibi dizerim. Kafama estigi gibi siralamam. Siradaki?"
//    TreeSet: "Verilen elemanlari buyukten kucuge, a'dan z'ye dizerim. Kusura bakma z kardes, son koltuk sana tahsisli"


    /*
    1)Setler tekrarsiz elemanlar(unique) depolamak icin kullanilir.
    2)3 TANE Set Class vardir;
       i)HashSet Class,
        "Hash" benzersiz id olusturma teknigidir. Bu teknige "Hashing Teachnique" denir.
        "HashSet" elemanlari rastgele siralar,
        "HashSet" elemanlari siralamadigindan cok hizli calisir.
        "HasSet" ler "null" i eleman olarak kabul eder.
        "HasSet" ler tekrarsiz eleman depolamak icindir.




       ii)LinkedHashSet Class,
         "LinkedHashSet"ler elemanlari sizin verdiginiz siraya gore dizdiklerinden(insertion order)
         "HashSet" lere gore yvastirlar.
         "LinkedHasSet"ler tekrarsiz eleman depolamak icindir.



       iii)TreeSet Class.
         "TreeSet" ler elemanlari natural order a gore dizerler.
         "Tree Setler " elemanlari natural order a gore dizdiklerinden cooook yavastirlar.
         en yavas set Treeset tir.

     */
    public static void main(String[] args) {

        HashSet<String>hs = new HashSet<>();
        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt");//tekrarli oldugundan yazmadi, hata vermez.
        hs.add(null);//[null, Zeki, Ajda, Cuneyt, Esra, Ezel]
        hs.add(null);//yazdirmadi

        System.out.println(hs);

        System.out.println(hs.hashCode());//2038751948 Java boyle bir ID uretti


        LinkedHashSet<Integer>lhs = new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        System.out.println(lhs);//[234, 87, -32, 124]

        LinkedHashSet<Integer>ls = new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        System.out.println(ls);//[451, 87, 231, 124]

        lhs.retainAll(ls);
        System.out.println(lhs);//[87, 124] ==>Ilk LinkedHashSet teki farkli elemanlar silindi.
        System.out.println(ls);//[451, 87, 231, 124]==> Ikinci LinkedHasSet tekine dokunmadi oldugu gibi korudu.

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');//eklemedi
       // ts.add(null); ==>TreeSet lere null eklenemez, hata verir.
        System.out.println(ts);//[A, G, R, U, Z]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z

        System.out.println(ts.lower('R'));//G ==>Verilen elemandan onceki elemani verir.
        System.out.println(ts.lower('D'));//A
        System.out.println(ts.lower('A'));//null

        System.out.println(ts.higher('K'));//R==Verilen elemanin sonraki elamani verir.

        System.out.println(ts.headSet('R'));//[A, G]==>Parantez icindeki dahil degildir, R ye kadar olan elemanlari yazdirir.

        System.out.println(ts.tailSet('G'));//[G, R, U, Z] ==>Parantez icindeki G dahil sonrasini yazdirir.
        System.out.println(ts.headSet('R', true));//[A, G, R] ==>Istedigimiz de bu methodla dahil edebiliyoruz.
        System.out.println(ts.tailSet('G', false));//[R, U, Z] ==> istedigimizde bu methodla verilen elemani dahil etmeyebiliriz.

        System.out.println(ts.ceiling('R'));//R==>Eleman set in icinde varsa elemanin kendisi return eder
        System.out.println(ts.ceiling('K'));//R==>Eleman set in icinde yoksa bir sonraki eleman return eder.

        System.out.println(ts.floor('G'));//G ==>Eleman set in icinde varsa elemanin kendisi return eder
        System.out.println(ts.floor('J'));//G ==>Eleman set in icinde yoksa bir onceki elemani return eder

        System.out.println(ts.subSet('G', 'Z'));//[G, R, U]==>Ilk parametre dahil ikinci parametre haric.
        System.out.println(ts.subSet('G',false,'Z',true));//[R, U, Z]




    }









}

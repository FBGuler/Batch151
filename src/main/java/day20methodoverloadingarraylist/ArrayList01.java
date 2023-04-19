package day20methodoverloadingarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList01 {
    public static void main(String[] args) {

  // Array list nasil olsturulur
      ArrayList<Integer> ages = new ArrayList<Integer>();

   //ArrayList console a nasil yazdirilir?
        System.out.println(ages);//[]

   //ArrayListlere  eleman nasil eklenir?
        //ArrayListe eleman eklemek isin add() methodunu kullaniriz
        //add() methodu elemanlari sizin verdiginiz sirada liste ekler(==>insertion order)

        ages.add(9);
        ages.add(12);
        ages.add(10);
        System.out.println(ages);//[9,12,10]

        ages.add(1,656);
        System.out.println(ages);//[9, 656, 12, 10]
        ages.add(3,777);
        System.out.println(ages);//[9, 656, 12, 777, 10]
        ages.add(888);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888]

        //List'e coklu eleman nasil eklenir? veya Liste baska bir list nasil eklenir?
        ArrayList<Integer>newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //Arraylist te eleman sayisi nasil bulunur?
        //size() methodu bir list teki eleman sayisini bize verir
        int numOfElement = ages.size();
        System.out.println(numOfElement);//12

        //ArrayList te specific bir eleman nasil alinir
        //get() methodu index kullanarak istedigimiz elemani almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);//656

        ages.set(4,353);
        System.out.println(ages);//10 yerine 353 kondu

        //Bir listedeki tum elemanlari nasil silebiliriz?
        ages.clear();
        System.out.println(ages);//sildi []

        //ArrayList specific bir elemanin var olup olmadigini nasil anlariz?
        boolean r = ages.contains(656);
        System.out.println(r);//yukarda listeyi bosalttigimiz icin false verdi

        //Bir arraylistin bos olup olmadigini nasil kontrol ederiz?
        boolean r2= ages.isEmpty();
        System.out.println(r2);//true

        //Example 1 : Bir listin bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String>names = new ArrayList<>();
        names.add("usame");
        names.add("fatih");
        names.add("ali");
        names.add("ufuk");

        //1. yol
        if (names.size() ==0){
          System.out.println("List is empty..");
        }else{
          System.out.println("List has at list 1 element..");//List has at list 1 element..
        }

        names.clear();
        if (names.isEmpty()){
          System.out.println("List is empty..");
        }else{
          System.out.println("List has at list 1 element..");//List is empty..
        }

        //Bir listin baska bir list ile ayni olup olm.nasil kontrol ederiz?
      ArrayList<String>names1 = new ArrayList<>();
      names1.add("usame");
      names1.add("fatih");
      names1.add("ali");
      names1.add("ufuk");

      ArrayList<String>names2 = new ArrayList<>();
      names2.add("usame");
      names2.add("fatih");
      names2.add("ali");
      names2.add("ufuk");


      boolean s = names1.equals(names2);//Ayni eleman ve ayni indexte ise esit olur yoksa false
      System.out.println(s);//true

      //Verilen iki integer listte tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz

      ArrayList<Integer> nums1 = new ArrayList<Integer>();
      nums1.add(8);
      nums1.add(10);
      nums1.add(9);

      ArrayList<Integer> nums2 = new ArrayList<Integer>();
      nums2.add(8);
      nums2.add(9);
      nums2.add(10);

      Collections.sort(nums1);
      Collections.sort(nums2);
      System.out.println(nums1.equals(nums2));//true


    }
}

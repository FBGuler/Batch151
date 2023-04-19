package day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Ajda", 77);
        stdAges.put("Ezel", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Angelina", 58);
        stdAges.put("Tom", 83);//"key"i tekrarli kullandigimizda hata vermez sadece en son verilen enty nin degerini kabul eder.
                               //Bu yontem value guncellemede kullanilabilir. Buna "overwrite" denir. Maplerde key ve valuler {} icine konulur.

        //Entry'lerin belirli bir sirada kullanilmasi gerekmiyorsa "HashMap" kullanmak en iyi yoldur. Hizli calisir.
        //Map ler entry leri siralarken "key" lere bakarak siralama yapar.
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}


        //replace() methodu value lari key leri kullanarak update etmeye yarar.
        stdAges.replace("Ezel",39);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        stdAges.replace("Angelina", 58,61);//58 Angelina varsa 61 Angelina yap. Yoksa ayni birakir degistirmez.
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        stdAges.putIfAbsent("Brad", 60);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39} Eger o key zaten varsa hicbir degisiklik olmayacak,Brar var degismez.
        stdAges.putIfAbsent("Ali", 60);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}

        System.out.println(stdAges.get("Tom"));//82

        //getOrDefault("Ayse", 0); methodu Mapte varolan "key" ler icin "get() methodu" ile ayni ciktiyi verir.
        System.out.println(stdAges.getOrDefault("Tom", 0));//83

        //getOrDefault("Ayse", 0); methodu Mapte olmayan "key" ler icin ikinci parametreye ciktiyi verir.
        System.out.println(stdAges.get("Ayse"));//null
        System.out.println(stdAges.getOrDefault("Ayse", 0));//0

        System.out.println(stdAges.containsValue(77));//true //containsValue(77); methodu value'larin icerisinde 77 olup olmadigini kontrol eder.
        System.out.println(stdAges.containsValue(99));//false

        System.out.println(stdAges.containsKey("Ali"));//true

        stdAges.remove("Ali"); //remove("Ali") methodu "key" kullanarak "entry" i silmeye yarar
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        stdAges.remove("Tom",81);//remoce("Tom", 81); methodu Map de key si "Tom", value su 81 olan bir entry varsa onu siler, yoksa silmez.
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        HashMap<String, Integer> kidsAges = new HashMap<>();
        kidsAges.put("John", 12);
        kidsAges.put("Jim", 22);
        kidsAges.put("Jack", 32);



        //putAll(kidsAge); method"u stdAges Map'ine kidsAge Map'ini ekler. Dolayisiyla stdAges Map'i degismis olur.
        //Ama kidsAge Map'i degismez
        stdAges.putAll(kidsAges);
        System.out.println(stdAges);//{Tom=83, Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}










    }
}

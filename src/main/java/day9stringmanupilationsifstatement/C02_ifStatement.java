package day9stringmanupilationsifstatement;

public class C02_ifStatement {
    public static void main(String[] args) {

        // INTERVIEW QUESTIONS USA QA
        // String str = "abbccdc"; tekrarsiz karakterleri ekrana yazdiriniz
        /*
        If Statement() yapisi bazen kodlarin calismasi belirli kosullara baglidir
        Mesela cok calisirsam, Java ogrenecegim. Java ogrenme cok calisma eylemine baglanmistir.
        Birinci eylem gerceklesmeden ikinci eylem gerceklesmez.
        if(){}
        () parantez icini sart yazilir, eger true dondururse {} arasindaki kod calisir.
        Aksi halde if body disina cikar class'ta sonraki kodlari okumaya devam eder.
        */

        String str = "aac";
        char ch = str.charAt(0);
        if(str.indexOf(ch) == str.lastIndexOf(ch)){
            System.out.println(ch);
        }


       char ch1 = str.charAt(1);
        if(str.indexOf(ch1) ==str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = str.charAt(2);
        if(str.indexOf(ch2) ==str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }


        // ex: sayi pozitif ise ekrana "Pozotif sayi" yazdiran kodu yaziniz

        int num =20;
        if(num>0){
            System.out.println("Pozitif Sayi");
        }

        // ex: Sayi -1 ile 10 arasnda ise ekrana "Rakam" yazdiriniz.



        int number = 8;
        if(number>-1 && number<10){
            System.out.println("Rakam");
        }

        // Ex: Sayi uc basamakli ise ekrana "Sayi uc basamaklidir" yazdiriniz

        int n = -234;
        n = Math.abs(n); // sayi negatifse sayimizi pozitif yapar. mutlak deger |-234| gibi. absolute value.
        if (n>99 && n<1000){
            System.out.println("Sayi uc basamaklidir");
        }

        /*
        Math Class onemli bir Class, tir. Icerisinde bir cok method barindirir.
        abs() methoduda icerisine arguman olarak verilen sayinin mutlak degerini
        yani pozitif halini verir
         */

        System.out.println("Sayi 3 Basamakli degildir.");






    }
}

package day12switchloops;

public class Loops01 {
    public static void main(String[] args) {

        // Ex 1: Ekrana 5 kere "Hi" yazdiriniz.
        // 1. yol tavsiye edilmez cunku dinamik degil.
        /*
        Code Standarts
        1) tekrarlar (repetitation)olmamali
        2) Dynamic olmalidir. baska durumlar icinde gecerli olmali
        3) Tamir (fix) ve update kolay yapilabilmelidir
         */
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2. yol
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" lar kullanilir.
        // 4 tane loop var; for
        // for-loop, while-loop, do-while loop, for-each loop;

        //1) for loop
        /*
        for (Baslangic Degeri  ; Loop Calisma sarti  ; Artirma/Eksiltme){
           calisilacak kodlar
        }
         */

        for (  int i = 1  ;  i<6   ; i++) {
            System.out.println("Hi");
        }



        // Baslangic Degeri  ; Loop Calisma sarti  ; Artirma/Eksiltme
        for (      int i =1  ;  i<6                ;  i++                ){
            System.out.println("Hi..");
        }

      // ex 2 : 11 den 14 e kadar tum sayilari ekrana yazdiriniz.
        for (int i = 11; i < 15; i++) {
            System.out.println(i);
        }


      // ex 3 : 40 dan 23 e kadar tum cift sayilari yazdiriniz
        for (int i = 40; i > 22; i--) {
            if (i%2==0){
                System.out.println(i);
            }
        }


        // ex : 18 den 56 ya kadar tum tek sayilari yazdiriniz
        for (int i = 18; i < 57; i++) {
            if (i % 2 != 0) {
                System.out.print(i +" ");
            }
        }

        System.out.println();
      //4 den 24 e kadar tum tamsayilari ayni satirda aralarina bosluk birakarak concole a yazdiriniz
        for (int i = 4; i < 25; i++) {
                System.out.print(i + " ");
            }

        System.out.println();
        //33 den 11 e kadar tum cift tam sayilri ayni satirda aralarina bosluk birakarak yazdiriniz

        for( int i = 33 ; i>10 ; i--){
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }

        System.out.println();

        for( int i = 32 ; i>10 ; i=i-2){
            System.out.print(i+" ");
            }                    // bu yontemde matematik bilgisi gerekiyor.


        System.out.println();
        // ex: 20 den 74 e kadar tum tek tam sayilri ayni satirda yazdir

        for (int i = 20; i < 75; i++) {
            if (i % 2!= 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
      // ex : Massachusetts kelimesindeki tum sesli harfleri console a yazdiriniz
        String s = "Massachusetts";
       for (int i = 0; i<s.length() ; i++){
           char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O'){
               System.out.print(c+" ");
            }
        }











    }
}

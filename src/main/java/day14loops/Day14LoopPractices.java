package day14loops;

import java.util.Scanner;

public class Day14LoopPractices {
    public static void main(String[] args) {
        //Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.

         //1.yol
        String s ="runner";
        String r ="";
        for(int i = s.length()-1; i>-1; i--){
           String c = s.substring(i,i+1);
                r=r+c;
            }
        if (s.equals(r)){
            System.out.println(s+" == polindromdur");

        }else{
            System.out.println(s+" == Polindrom degildir");
        }


        String str = "123321";
        String bos = "";

        for (int i = str.length()-1; i>-1 ; i--){
            String c = str.substring(i,i+1);
                 bos = bos +c;
        }
        if (str.equals(bos)){
            System.out.println(str + "== It is a polindrom");
        }else{
            System.out.println(str+ "== It is not a polidrom");
        }


        //2. yol

        String s1 = "runner";
        String r1 ="";

        int i1 =s1.length()-1;

        while(i1>-1){
            String c1 = s1.substring(i1,i1+1);
            r1 = r1+c1;
            i1--;
        }
        if(s1.equals(r1)){
            System.out.println(s1+" == Polindromdur");
        }else{
            System.out.println(s1+" == Polindrom degildir");
        }


        //3. yol
        String s2 = "runner";
        String r2 ="";
        int i2 =s1.length()-1;

        do{
            String c2= s2.substring(i2,i2+1);
            r2 = r2 +c2;
            i2--;
        }while (i2>-1);
        if (s2.equals(r2)){
            System.out.println(s2 + " palindromdur");
        }else{
            System.out.println(s2 + " palindrom degildir");
        }





   //Example : kullanicidan 100 den kucuk ve tam sayi isteyin.
   // 1 den baslayarak girilen sayiya kadar 3 un kati olan sayilari yazdirin.

       Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 1 ile 100 arasinda bir tamsayi giriniz..");
        int sayi  = input.nextInt();

        for ( int t = 1; t<sayi+1; t++){
            if (t%3==0 && t%5==0) {
                System.out.print(t+",");
            }else if(sayi>100){
                System.out.println("Lutfen 1 ile 100 arasinda bir tamsayi giriniz..");
            }
        }

      /*            1.Example:Type code to get the output like
        Week: 1
        Day: 1
        Day: 2
        Day: 3
                          .....
        Week: 2
        Day: 1
        Day: 2
        Day: 3
                          ....
        Week: 3
        Day: 1
        Day: 2
        Day: 3
                          ....
      */

         for (int l = 1; l<4; l++){
             System.out.println("Week :" +l);
             for (int k = 1; k<4; k++){
                 System.out.println("Day :" +k);
             }
         }






















    }
}

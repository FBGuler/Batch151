package day14loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {

      // 3 ten 6 e kadar tum tamsayilari console yazdiriniz

      //1.way :
      for( int i = 3; i<7; i++){
          System.out.print(i + " ");
      }
        System.out.println();
       //2.Way :
        int i= 3;
      while (i<7){
          System.out.print(i+ " ");
          i++;
      }
        System.out.println();
        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
        // 1. way:
        for(int k=21; k<181; k++){
            if(k%4==0 && k%6==0){
                System.out.print(k + " ");
            }
        }
        System.out.println();
        //2.way :

        int k =21;
        while(k<181) {
            if (k % 4 == 0 && k % 6 == 0) {
                System.out.print(k + " ");
            }
                k++;
            }
        System.out.println();

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
       //miami ==> MiAmI

        String s = "miami";
        int m = 0;
        while (m<s.length()){
            String ch =s.substring(m,m+1);
            if (m%2==0){
                System.out.print(ch.toUpperCase());
            }else{
                System.out.print(ch);
            }
            m++; //Bu kismi unutmayin yoksa "infinite loop" olusur yani "sonsuz loop" ulasir.
        }
        System.out.println();
          //Size verilen tamsayinin rakamlari toplamini console a yazdiran kodu yaziniz
        int r = -578;
        r= Math.abs(r);

        int sum = 0;
        while (r>0){
            sum = sum +r%10;




            r=r/10;
        }

        System.out.println(sum);

        System.out.println();

        //Kullanicidan aldiginiz sayi icin carpim tablosu olusturan kodu yaziniz
        //3*1=3, 3*2=6, ... 3*10=30
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = input.nextInt();

        int u = 1;
        while (u<11){

            System.out.println(n + "*" + u +"=" + (n*u));


            u++;
        }
        System.out.println();

        //Kullanicidan aldiginiz Stringteki sessiz harfleri console'a yazdiran kodu yaziniz.
        //Alabama ==> lbm
        String x = "Alabama";

        System.out.println("Lutfen bir kelime giriniz");
        String y = input.next();

        int z = 0;
        while (z<y.length()){

            char ch =y.charAt(z);
            boolean b = ch=='a' || ch =='e' || ch =='i' || ch=='o' || ch=='u' ||ch=='A' || ch =='E' || ch =='I' || ch=='O' || ch=='U';

            if (b) {
                z++;
                continue;
            }else{
                System.out.print(ch);
            }
            z++;
        }


      //boyle de yazilabilir
        /*
          int z = 0;
        while (z<y.length()){

            char ch =y.charAt(z);
            boolean b = ch=='a' || ch =='e' || ch =='i' || ch=='o' || ch=='u' ||ch=='A' || ch =='E' || ch =='I' || ch=='O' || ch=='U';

            if (b) {

            }else{
                System.out.print(ch);
            }
            z++;
            */
           /*  //boyle de yazilabilir

          int z = 0;
        while (z<y.length()){

            char ch =y.charAt(z);
            boolean b = ch=='a' || ch =='e' || ch =='i' || ch=='o' || ch=='u' ||ch=='A' || ch =='E' || ch =='I' || ch=='O' || ch=='U';

            if (!b) {
          System.out.print(ch);
            }
            z++;
        */















    }
}

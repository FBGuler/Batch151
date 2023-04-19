package day_06_practice;

import java.util.Scanner;

public class C05_For {
    public static void main(String[] args) {

          /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

          */

        Scanner scan = new Scanner(System.in);

        int toplam = 0;

        for (int i = 0; i<5 ; i++){

            System.out.println("Bir sayi giriniz");
            int sayi = scan.nextInt();

            if(sayi>=5 && sayi<=10){
                System.out.println("Girdiginiz sayi 5 ile 10 arasinda oldugundan isleme alinmayacaktir");
            }else{
                toplam = toplam + sayi;
            }

        }



            /*
              amstrong sayıları bulan bir program yazalim
              153 = (1*1*1)+(5*5*5)+(3*3*3)
              153= 1+125+27
              153=153

          153bir Amstrong sayidir
          370bir Amstrong sayidir
          371bir Amstrong sayidir
          407bir Amstrong sayidir
                       */
      /*Basamaklara ayirma
            123%10=3 ==> birler
            123/10=12
            12%10=2 ==>onlar
            12/10=1
            1%10=1 ==> yuzler

             */

                for( int i=100; i<=999; i++){
                    int template=i;
                    int birler;
                    int onlar;
                    int yuzler ;

                    //basamaklara ayırma
                    birler = template%10;
                    template = template/10;
                    onlar = template%10;
                    template/=10;
                    yuzler = template%10;

                    // toplam =Math.pow(birler,3)+Math.pow(onlar,3)+Math.pow(yuzler,3);
                    int sum = (birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler);

                    if (sum ==i){
                        System.out.println(i+ " Bir Amstrong sayidir");
                    }


                }






    }
}

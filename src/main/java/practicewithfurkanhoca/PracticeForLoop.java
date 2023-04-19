package practicewithfurkanhoca;

import java.util.Scanner;

public class PracticeForLoop {
    public static void main(String[] args) {

         /*
        Soru 1) Ekrana 10 kez "Java guzeldir.." yazdirin
        */

        for (int i = 0; i < 11; i++) {
            System.out.println("Java guzeldir..");
        }

        /*
     Soru 2) 10 ile 30 arasindaki (10 ve30 dahil) sayilari aralarinda
     virgul olarak ayni satirda yazdirin
        */

        for (int i = 10; i < 31; i++) {
            System.out.print(i + ", ");
        }

        System.out.println();
        /*
        soru 3) 100'e(dahil) kadar olan tek ve cift sayıları iki ayrı dongu ile yazdırın.
        */

        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < 101; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
         /*
        Soru 4) 100'den baslayarak 50'ye (dahil) kadar olan sayilari
        aralarinda virgul olarak ayni satirda yazdirin
        */

        for (int i = 100; i > 51; i--) {
            System.out.print(i + ", ");

        }

        System.out.println();

        /*
        Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar
        (istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk pozitif bir sayi giriniz.");

        int sayi = input.nextInt();
        if (sayi < 100 && sayi > 0) {
            for (int i = 1; i <= sayi; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else System.out.print("Lutfen gecerli bir sayi giriniz.");

        System.out.println();

        /*
           Soru 6) Kullanicidan 100'den kucuk bir tamsayi isteyin.
           1'den baslayarak girilen sayiya kadar 3'un veya 5"in kati olan sayilari yazdirin.
        */

        Scanner str = new Scanner(System.in);
        System.out.println("100'den kucuk bir tamsayi giriniz");
        int syn = str.nextInt();
        if (syn > 0 && syn < 100) {
            for (int i = 1; i <= syn; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else System.out.println("Lutfen gecerli bir sayi giriniz");

        System.out.println();

        /*Soru 7) Interview Question Kullanicidan 100'den kucuk bir tamsayi isteyin.
             1'den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
           - Sayi 3'un kati ise sayi yerine "Java" yazdirin.
           - Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
           - Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir"yazdirin.
           */

        Scanner scan1 = new Scanner(System.in);
        System.out.println("100 den kucuk pozitif bir tam sayi giriniz.");
        int sayi1 = scan1.nextInt();

        if (sayi1<=100 && sayi1>0){
        for (int i = 1; i <= sayi1; i++) {
            if (i% 3 == 0 && i % 5 == 0) {
                System.out.print("Java guzeldir ");
            } else if (i% 5 == 0) {
                System.out.print("Guzeldir ");
            } else if (i % 3 == 0) {
                System.out.print("Java ");
            } else System.out.print(i + " ");
        }
    }else System.out.println("Lutfen gecerli bir sayi giriniz");

        System.out.println();


        /*
        soru 8) input olarak girilen bir stringi forLoop kullanarak ters cevirin.
         */

        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = input1.next();
        String bos = "";
        for (int i=kelime.length()-1; i>=0; i--) {
            bos = bos +kelime.charAt(i);
        }
        System.out.println(bos.toUpperCase());













    }
}


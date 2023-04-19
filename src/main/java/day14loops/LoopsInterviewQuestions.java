package day14loops;

import java.util.Scanner;

public class LoopsInterviewQuestions {
    public static void main(String[] args) {
     //Example 1:
        // Kullanicidan 100 den kucuk bir tamsayi isteyin.
        // 1den baslayarak girilensayiya kadar tum sayilari yazdiriniz.ancak;
        // -Sayi 3 un kati ise sayi yerine "Java" yazdirin
        // -Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin
        // - Sayi hem 3 un hem 5 in kati ise sayi yerine "Yava Guzeldir" yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir tamsayi giriniz..");
        int sayi =input.nextInt();
        for(int i =1; i<sayi+1; i++){
            System.out.print(i +" ");
            if (i%3==0){
                System.out.print("Java");
            }
        }























    }
}

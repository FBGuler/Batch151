package day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {

        //while loop
        int i = 1;
        while (i<1){ // while loop da loop body nin hic calismamasi mumkundur. (Zero execution is possible)
            System.out.println("while loop");
            i++;
        }

         //do-while-loop (onemli sinavda cikabilir)
        int k = 1;
        do{ //do-while loop ta loop body si en az bir kere calisir.
            System.out.println("do-while loop");
           k++;
        }while(k<1);

         //Kullanicidan bir sayi girmesini isteyin, sayi 100 den kucuk ise kullanici "Kazandiniz" mesaji alsin
        // diger durumlarda "Kaybettiniz" mesaji alsin

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter integer");
            int n = input.nextInt();

            if (n<100){
                System.out.println("You Won!");
            }else{
                System.out.println("You Lost!");
                break;
            }
        }while(true);

        System.out.println();
        //Kullanicidan alinan bir cumlenin buyuk
        // harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz.
        do{
            System.out.println("Please enter a word");
            String s = input.next();

            if(s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct grammatically.");

            }else{
                System.out.println("Your sentence is not correct grammatically.");
                break;
            }
        }while(true);

























    }
}

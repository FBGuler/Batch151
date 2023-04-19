package practicewithfurkanhoca;

import java.util.Scanner;

public class PracticeJavaQuestionsLoops {
    public static void main(String[] args) {

        //Ask the user to enter an integer to check if it is a prime number or not. Example: if user
        //enters 43 output will be “43 is a prime number”, if user enters 120 output will be “120 is not a
        //prime number”, if user enters negative integers output will be “Enter a positive integer”


        Scanner scan = new Scanner(System.in);
        System.out.println("Ener a pozitive integer to check if it is prime or  not.");
        int number = scan.nextInt();

        int count = 0;
        if(number>0){
            if (number==1){
                System.out.println(number + " is prime number");
            }else{
                for (int i = 2; i < number ; i++) {
                    if(number%i==0){
                        count++;
                    }
                }
                if (count==0){
                    System.out.println(number + " is prime number");
                }else{
                    System.out.println(number + " is not prime number");
                }
            }

        }else{
            System.out.println("Enter a positive integer ");
        }



        //Ask the user how many fibonacci numbers he wants to see. Then write the code that prints
        //these fibonacci numbers. Example: if user enters 6 output will be 1 1 2 3 5 8

        Scanner src = new Scanner(System.in);
        System.out.println("How many fibonacci numbers he wants to see.");
        int sayi = src.nextInt();

        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;
        System.out.print(fibo1+" ");
        System.out.print(fibo2 +" ");

        for (int i = 1; i < number-1 ; i++) {
            fibonacci = fibo1 +fibo2;
            fibo1= fibo2;
            fibo2=fibonacci;
            System.out.print(fibonacci+" ");
        }

        //A number is called an Armstrong number if it equals the sum of the cube of its every digit.
        //For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which equals the
        //cube of every digit. Type a code to check if the given number is the Armstrong number or
        //not.

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is Armstrong number or not");
        int n = scn.nextInt();

        int sumOfCube = 0;
        int temp =n;
        int digit =0;

        while(n>0){
            digit = n%10;
            kup(digit);
            sumOfCube=sumOfCube+ digit ;
            n=n/10;
        }


        if (temp==sumOfCube){
            System.out.println(temp + " is Armstrong number");
        }else{
            System.out.println(temp + " is not Armstrong number");
        }










    }

    public static void kup (int a){
        int kup =a*a*a;
    }
}

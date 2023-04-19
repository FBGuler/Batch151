package doWhileLoop;

public class C01_doLoop {
    public static void main(String[] args) {
        //Soru 1) 5 ile 10 arasindaki (5 ve 10 dahil )sayilari ayni satirda yazdir.

        for (int i = 5; i <11 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n******");
        int a=5;
        while (a<11){
            System.out.print(a+" ");
            a++;
        }
        System.out.println("\n*******");
        do{
            System.out.print(a+" ");
            a++;
        }while(a<11);

























    }
}

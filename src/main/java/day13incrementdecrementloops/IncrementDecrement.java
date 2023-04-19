package day13incrementdecrementloops;

public class IncrementDecrement {
    public static void main(String[] args) {

        //Increment
        int a = 5;
        System.out.println("a = " + a); //5

        a = a+2;
        System.out.println("a = " + a); //7

        a+=2;

        //Ex 1: Bur tane integer variable olusturun ve onu iki sekilde yazdiriniz

        int b = 12;
        b = b+2;
        b += 2;
        System.out.println("b = " + b); //16

        // Decrement

        int c = 8;
        c = c-3;
        c -=3;

        //Increment 2

        int d = 6;
        System.out.println("d = " + d);//6
        d=d*2;
        System.out.println("d = " + d);//12
        d*=2;
        System.out.println("d = " + d); //24

        //Decrement 2;

        int e = 24;
        System.out.println("e = " + e);//24
        e=e/2;
        System.out.println("e = " + e);//12
        e/=2;
        System.out.println("e = " + e);//6
        
        // "1" ile increment
        
        int f =12;
        //f=f+1;
        //f+=1;
        f++;
        System.out.println("f = " + f);
        
        // "1" ile decrement
        
        int h = 10;
        //h=h-1;
        //h-=1;
        h--;
        System.out.println("h = " + h); 
        
        //post-increment ve pre-increment
        
        int i = 10;
        int k = i++;                    //post-increment cunku variable isminden sonra increment islemi yapildi
        System.out.println("k = " + k); // post-increment okunmaz o yuzden yine 10 dir.
        System.out.println("i = " + i); // i  nin degeri 1 artti 11

        int m = 15;
        int n = ++m;                    //pre-increment cunku variable isminden once islem yapildi
        System.out.println("n = " + n); // pre-increment okunur 16.Java soldan saga okur
        System.out.println("m = " + m);

        int p = 17;
        int r = p--; // r=17, p =16
        System.out.println("r = " + r); //17
        System.out.println("p = " + p); //16
        
        int s = 20;
        int t = --s;
        System.out.println("t = " + t);//19
        System.out.println("s = " + s);//19

        /*
        1) Increment artirmak demektir Decrement azaltmak demek
        2) Increment toplama ve carpma ile Decrement cikarma ya da bolme ile yapilabilir
        3) Increment ve Decrement 3 yolla yapilabilir
             a) int i = 12; ==> i=i+5;
             b) int i = 12; ==> i += 5;
             c) int i = 12; ==> i ++;
                Note : 3. yol sadece 1 artirmak icin kullanilabilir.

             a) int i = 12; ==> i=i-5;
             b) int i = 12; ==> i -= 5;
             c) int i = 12; ==> i --;
                Note : 3. yol sadece 1 artirmak icin kullanilabilir.
         */

        



















    }
}

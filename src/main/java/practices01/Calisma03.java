package practices01;

public class Calisma03 {
    public static void main(String[] args) {


        int x = 2;
        int y= 4;

        toplam(2,4,7);


        cikar(9.2,5);

        System.out.println(karesi(4));


    }

    public static void toplam (int a, int b){
        System.out.println(a+b);
    }
    public static void toplam (int a, int b,int c){
        System.out.println(a+b+c);
    }

    public static double cikar (double m, int n){
        return m-n;
    }


    public  static int karesi (int c){
        return c*c;
    }

}

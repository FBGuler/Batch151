package day12switchloops;

public class Day14LoopPractices2 {
    public static void main(String[] args) {

        //Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //Örnek; 223878 ´ 37

        //1. yol for loop
        int num = 223878;
        String s = String.valueOf(num);
        String d= "";

        for (int i = 0; i<s.length(); i++){
            String c =s.substring(i,i+1);
            if (s.indexOf(c)==s.lastIndexOf(c)){
                d=d+c;
            }
        }
        System.out.print(d);//37

        System.out.println();

        //2.yol while loop
        int i1= 0;
        while (i1<s.length()){
            String c1 =s.substring(i1,i1+1);
            if(s.indexOf(c1)==s.lastIndexOf(c1)){
                d=d+c1;
            }
            i1++;
        }
        System.out.print(d);

        System.out.println();

        //3.yol do while loop
        int i2 =0;
        do {
            String c1 = s.substring(i2, i2 + 1);
            if (s.indexOf(c1) == s.lastIndexOf(c1)) {
                d = d + c1;
            }
            i2++;
        }while (i2<s.length());
        System.out.print(d);

        System.out.println();
        //Exp; Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //     A A A A A
        //     A A A A A
        //     A A A A A

        //1. yol
        int rows = 3;
        int columns = 5;
        for (int j=1 ; j<=rows; j++){
            String z = "";
            for(int k=1; k<=columns;k++ ){
                z=z+"A ";
            }
            System.out.println(z);
        }


       //exp;Loop6. soru(page 279) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //     A
        //     A A
        //     A A A
        //     A A A A
        System.out.println();
        int row =4;
        for (int l=1; l<=row; l++){
            String n = "";
            for (int k=1; k<=l; k++){
                n=n+"A ";
            }
            System.out.println(n);
        }




















    }
}

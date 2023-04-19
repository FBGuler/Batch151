package day13incrementdecrementloops;

public class ForLoop01 {
    public static void main(String[] args) {

        //Ex 1 : 21 den 180 e kadar hem 4 hemde 6 ile bolunebilen tamsayilari ekrana yazdiriniz.

        for( int x=21  ; x<181  ; x++  ){
            if( x%4 == 0 && x%6 == 0 ){
                System.out.print(x + " ");
            }

        }

        System.out.println();

        //Ex 2 : Size verilen kucuk harfle yazilmis String in index'i cift sayi olan karakterlerini buyuk harfe donusturunuz.
        //    ankara ==>AKR

        String s = "ankara";

        for (int i = 0 ; i <s.length(); i++){
            String ch = s.substring(i,i+1);
            if(i%2==0){
                System.out.print(ch.toUpperCase());
            }
        }


        // Note : Bir String de son index her zaman length()-1
        //Note : Yazdiginiz kod belli senaryolar icin calisiyor ancak tum senaryolar icin kullanilmiyorsa bu tarz kodlara
        //" Hard-Code " denir ve mutlaka duzeltilmelidir



















    }
}

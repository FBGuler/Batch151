package day13loops;

public class Loops02 {
    public static void main(String[] args) {

        //Verilen bir stringte kucuk harfleri consola yazmayiniz, sadece buyuk harfleri ve digerlerini yazdiriniz
        String src="Pwd12?Ab";
        for (int i = 0; i<src.length(); i++){
            char ch = src.charAt(i);
            if (ch>='a' && ch<='z'){
                continue;
            }else{
                System.out.print(ch);
            }
        }

        //break ile loop un farki break loop u kirar continue sizi tekrar koda atar
// break switch statement da ya da loop da kullaniriz
//switchde break bellidurumlarda kodu durdurmak icin kullaniriz
//case 1 biit is yapmak istemezsek break yazariz
//looplar da break loop u kirmak icin kullanriiz
//continue ise loop yaparken bazi elemanlar isleme sokmama da kullaniliri. mesele yukari ornekte kucuk harf kullanmak istemiyoruz
// kucuk harfleri isleme sokmamak icin continue



        //"break" ile "continue" arasindaki fark nedir?
//"break" switch'in disina cikmak icin ve loop'u kirmak icin kullanilir.
//"continue" ise Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.

        System.out.println();
        //1.yol
        //Bir Stringi ters ceviren kodu yaziniz. Interview sorusu
        String t = "Java";
        String ters = "";

        for(int i =t.length()-1; i>=0; i--){
            ters = ters+ t.substring(i,i+1);
        }
        System.out.print(ters); //Eger en son gorumunu istiyorsan boyle sona yaziliyor. Hr asamayi yazdirmak istiyorsaniz icine.


        System.out.println();
        //2. yol

        String u = "Java";
        String ters2 = "";

        for(int i =u.length()-1; i>=0;i--){
            ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters2);

        System.out.println();
        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578==> 5+7+8 =20

        int sum = 0;
        int n = -578;
        n= Math.abs(n);

        for( int i = n  ; i>0  ; i /=10 ){

            sum += i%10;
        }
        System.out.println(sum);






















    }
}

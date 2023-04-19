package practices01;

public class LoopsPracticeSoruBankasi03 {
    public static void main(String[] args) {

        //Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //Örnek; 223878 ´ 37

        //1.yol
        int sayi=223878;
        String str = String.valueOf(sayi);
        String x = "";

        for (int i =0; i<str.length(); i++){
            char c = str.charAt(i);

             if (str.indexOf(c)==str.lastIndexOf(c)) {
                 x=x+c;
             }
        }
        System.out.println(x);































    }
}

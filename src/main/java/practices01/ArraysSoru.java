package practices01;


import java.util.*;

public class ArraysSoru {
    public static void main(String[] args) {





//        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
//                Input :
//        John White
//        1234234534561478
//        Output :
//        Name : J*** W****
//        CCN  : **** **** **** 1478
//                * Ilk Harfler Buyuk harf ile baslamalidir.


        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        Scanner scan = new Scanner(System.in);
        String src = scan.nextLine();

        Scanner imput = new Scanner(System.in);
        System.out.println("Lutfen kredi karti nonuzu giriniz..");
        String str1 = imput.nextLine();

        System.out.print("Name: ");
        String [] nameSurname = src.toUpperCase().split("");
        int x = src.indexOf(" ");

        for ( String w : nameSurname){
            if (w==nameSurname[0] || w==nameSurname[x+1]) {
                System.out.print(w);
            }else if(w==nameSurname[x]){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
        }
        System.out.println();


        String [] krediKartNo = str1.split("");
        String st = "";

        for (int i = 0; i < krediKartNo.length; i++) {
            if (i>0 && i%4==0){
                st+=" ";
            }
            if (i<krediKartNo.length-4){
                st+="*";
            }else {
                st+= krediKartNo[i];
            }

        }
        System.out.print("CCN  : " + st);












    }

}










































package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        //Example 1: Type code to print the number of occurrences of words in a sentence
        //Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=2, you=2

        //like ile like! i ayni yapabilmek icin tum noktalama isaretlerini sileriz

        String s = "I like you, you like like!";
        System.out.println(s);//I like you, like like!

        s= s.replaceAll("\\p{Punct}", "");
        System.out.println(s);//I like you like like

        //Ben kelimelerle calismaliyim bu yuzden split(" ") kullanacagim

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        HashMap<String , Integer> occ = new HashMap<>();

        //words arrayin deki kelimeler birer birer mapte var mi yok mu diye kontrol edilir.
        //words arr in deki keloimeler mapte yoksa map e 1 degeri ile atanacak. Varsa degeri bir artirilacak.

        for (String w : words){
            Integer numOfOccurence = occ.get(w);
            if(numOfOccurence == null){
                occ.put(w,1);
            }else {
                occ.replace(w, numOfOccurence+1);
            }
        }
        System.out.println(occ);//{like=3, I=1, you=2}























    }
}

package practices01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSoru4 {
    public static void main(String[] args) {

//        Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
//                Örnek: (Yellow, Blue, Red, Green) ==> Çıktı: Azalan sırada değil
//                (Yellow, Red, Green, Blue) ==> Çıktı: Azalan sıradadır


        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");
        List<String> f = new ArrayList<>();
        f.addAll(e);
        Collections.sort(f);
        System.out.println(e);
        System.out.println(f);
        int size = e.size();
        int flag = 0;
        for(int i=0; i<size; i++){
            if(f.get(i).equals(e.get(size-1-i))){
                flag++;
            }
        }
        if(flag == size){
            System.out.println("Azalan siradadir");
        }else{
            System.out.println("Azalan sirada degil");
        }













    }
}

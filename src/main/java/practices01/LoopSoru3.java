package practices01;

import java.util.ArrayList;
import java.util.List;

public class LoopSoru3 {
    public static void main(String[] args) {

////        Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
//
////        List<Integer> tamsayi = new ArrayList<>();
////        tamsayi.add(4);
////        tamsayi.add(5);
////        tamsayi.add(6);
////        tamsayi.add(8);
////
////        int carpim = 1;
////        for (Integer w: tamsayi) {
////            if (w%2==0){
////                carpim= carpim*w;
////            }
////        }
////        System.out.println(carpim);
//
//
//
//
////        Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
////        olup olmadığını kontrol ediniz.
//
//
//        List<Integer> sayi = new ArrayList<>();  // [2, 6, 2, 7, 9, 9]
//        sayi.add(2);
//        sayi.add(6);
//        sayi.add(3);
//        sayi.add(7);
//        sayi.add(4);
//        sayi.add(9);
//
////        boolean unique = true;
////        int con = 0;
////        int x = 0;
////        con = sayi.get(x);
////        sayi.remove(con);
////
////
////        for (int i = 0; i < sayi.size() ; i++){
////
////            if (sayi.get(i)== con){
////                unique = false;
////                return unique;
////            }
////
////            x++;
////        }
////
////        System.out.println(unique);
//
//        for (int i = 0; i < sayi.size(); i++) {
//            for (int j = i + 1; j < sayi.size(); j++) {
//                if (sayi.get(i) == sayi.get(i)) {
//                    return false; // Eğer iki öğe birbirine eşitse, dizi benzersiz değildir.
//                }
//            }
//        }
//        return true;


        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(31);
        myList.add(7);
        myList.add(15);
        myList.add(23);
        Integer counter = 0;
        for(Integer w : myList){
            for(Integer k : myList){
                if(w==k){
                    counter++;
                }
            }
        }
        if(counter==myList.size()){
            System.out.println("Tekrarlanan oge yoktur");
        }else{
            System.out.println("En az 1 oge tekrarlanmistir");
        }


    }
}

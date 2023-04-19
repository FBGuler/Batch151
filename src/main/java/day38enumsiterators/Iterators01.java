package day38enumsiterators;

import java.util.*;

public class Iterators01 {
    public static void main(String[] args) {

        /*
        1)Iterator lar loop larla ayni isi yapar.Looplarda sonsuz loop tehlikesi var.
        Iterator lerde sonsuz loop olusma ihtimali yoktur.
        2)Iterator ler ile loop lar arasinfda performans farki yoktur.
        3)Iteratorler bir connection dan eleman silme ve bir collection daki elemani degistirme
        konusunda daha basarilidir.
        4)Iki tip Iterator vardir.
        i)Iterator: Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkundegildir.
        ii)ListIterator: Bu eleman silebilir, ekleyebilir ve degistirebilir.
        Note : "Iterator" sadece soldan saga(ilk elemandan son elemana) calisir.
               "ListIterator" ise iki yonlu calisabilir.

         */

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]

        //"Iterator" kullanalim
        Iterator<String> myItr = myList.iterator();

        while (myItr.hasNext()){ //hasNext() pointer a "Senden sonra eleman var mi ? diye sorar.
                                 //Eleman varsa "true" yoksa "false" dondurur.

            myItr.next();//next() pointer i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.

            myItr.remove();// next() methodunun return ettigi elemani siler.
        }
        System.out.println(myList);//[]


        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");

        System.out.println(yourList);

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){

            String el = yourListItr.next();

            yourListItr.set(el + "!");//set() methodu listi update etmeye yarar.

        }
        System.out.println(yourList); //[Tom!, Jim!, Clara!]

        //hasPreviour() ve previous() nasil kullanilir?

        while (yourListItr.hasPrevious()){
            String el = yourListItr.previous();
                System.out.println();
                yourListItr.set("?" + el);
        }
        System.out.println(yourList);//[?Tom!, ?Jim!, ?Clara!]
        

        /*
        hasPrevious() senden once eleman var mi? true ya da false dondurur.
        Mutlaka imlec listenin sonunda olmalidir.
         */


       List<Integer> list = new ArrayList<>();
       list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(17);
        list.add(3);
        System.out.println(list);//[5, 9, 2, 1, 17, 3]
        Iterator itr = list.iterator();
        //[(itr)5, 9, 2, 1, 17, 3] itr objesi collection in en basinda beklemeye baslar.

        System.out.println(itr.hasNext());//true
        System.out.println(itr.next());//5 kimin ustunden atladiysa onu verir. [5, (itr)9, 2, 1, 17, 3]
        System.out.println(itr.next());//9
        itr.remove();
        System.out.println(list);//[5, 2, 1, 17, 3] en son kimin ustunden zipladiysa onu siler.
        // itr.remove();
        // System.out.println(list); //hata verdi cunku ustunden gectigi bir yer yok. IllegalStateException
        // Bu nedenle iki kez ustuste remove methodu calistirilmaz.



        //********************descendingIterator()*****************
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Van");
        ourList.add("Mus");
        ourList.add("Kayseri");
        ourList.add("Izmir");
        ourList.add("Samsun");

        System.out.println("ourList = " + ourList);//ourList = [Van, Mus, Kayseri, Izmir, Samsun]

        Iterator<String> ourItr = ourList.descendingIterator();
        while(ourItr.hasNext()){
            String eleman = ourItr.next();
            System.out.print(eleman + " ");//Samsun Izmir Kayseri Mus Van
        }

        System.out.println();
        
        




    }
}

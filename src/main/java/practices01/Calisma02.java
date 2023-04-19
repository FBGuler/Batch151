package practices01;

public class Calisma02 {
    public static void main(String[] args) {

        /*


        10 sorumuz var
        ogrencilerin cevapları:

         */

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};





        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        /*Her ogrencinin dogru cevap sayısını method olusturarak yazdıranız

        output:
        1nolu ogrencinin dogru cevap sayısı: 7
        2nolu ogrencinin dogru cevap sayısı: 6
        3nolu ogrencinin dogru cevap sayısı: 5
        4nolu ogrencinin dogru cevap sayısı: 4
        5nolu ogrencinin dogru cevap sayısı: 8
        6nolu ogrencinin dogru cevap sayısı: 7
        7nolu ogrencinin dogru cevap sayısı: 7
        8nolu ogrencinin dogru cevap sayısı: 7

                */

        dogruCevapSayisi (answers,keys);







            }

            public static void dogruCevapSayisi (char[][] x , char[] y ){
                for (int i = 0; i < x.length; i++) {
                    int counter = 0;
                    for (int j = 0; j < x[i].length; j++) {


                        if (x[i][j]==y[j]){
                            counter++;

                        }

                    }
                    System.out.println(i+1 + "  nolu ogrencinin dogru cevap sayisi : "+counter);
                }






    }


    }









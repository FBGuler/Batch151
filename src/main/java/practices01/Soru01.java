package practices01;



import java.util.*;

public class Soru01 {

    public static void main(String[] args) {


//        Kullanicidan tam ismini alin, Ismin harflerini bir liste'e ekleyin.
//Harfleri alfabetik sirada buyuk harfler olarak yazin.
//tekrarli karakterleri bir kere ekrana yazdiralim.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen tam isminizi girin: ");
        String name = scanner.nextLine();

        // isimdeki tüm harfleri büyük harflere dönüştürürüz
        name = name.toUpperCase();

        // harfleri alfabetik olarak sıralayalım
        ArrayList<Character> letters = new ArrayList<Character>();
        for (int i = 0; i < name.length(); i++) {
            letters.add(name.charAt(i));
        }
        Collections.sort(letters);

        // tekrarlayan harfleri bulalım
        ArrayList<Character> repeatedLetters = new ArrayList<Character>();
        for (int i = 0; i < letters.size() - 1; i++) {
            char currentLetter = letters.get(i);
            char nextLetter = letters.get(i+1);
            if (currentLetter == nextLetter && !repeatedLetters.contains(currentLetter)) {
                repeatedLetters.add(currentLetter);
            }
        }

        // tekrar eden harfleri ekrana yazdıralım
        System.out.print("Tekrar eden harfler: ");
        for (int i = 0; i < repeatedLetters.size(); i++) {
            System.out.print(repeatedLetters.get(i) + " ");
        }

    }
}






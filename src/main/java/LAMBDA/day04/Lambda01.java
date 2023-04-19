package LAMBDA.day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {


        public static void main(String[] args) throws IOException {

            //EX 1) Bir metin dosyasındaki tüm satırları okuyun ve ekrana yazdırın. text.file üstünü sağ tıkla sonra "copy/path referenca" tıkla.
            // daha sonra "path from content root" tıkla copyalamış olursun.

            System.out.println("Ex 1) ");
            Files.
                    lines(Paths.get("src/main/java/LAMBDA/day04/Txt.File")).
                    forEach(System.out::println);


            // Ex 2) Bir metin dosyasındaki tüm satırları büyük harflerle okuyun ve ekrana yazdırın.
            System.out.println("Ex 2) ");
            Files.
                    lines(Paths.get("src/main/java/LAMBDA/day04/Txt.File")).
                    map(String::toUpperCase).
                    forEach(System.out::println);



            // Ex 3) Bir metin dosyasındaki herhangi bir satırda "Java" kelimesi var mı yok mu kontrol edin.
            System.out.println("Ex 3) ");
            boolean varMi = Files.
                    lines(Paths.get("src/main/java/LAMBDA/day04/Txt.File")).
                    anyMatch(line->line.contains("Java"));
            System.out.println(varMi);



            // Ex 4) Bir metin dosyasındaki tüm farklı kelimeleri bir liste içinde döndürün.
            System.out.println("Ex 4) ");
            List<String> uniqueWords = Files.
                    lines(Paths.get("src/main/java/LAMBDA/day04/Txt.File")).
                    flatMap(line->Arrays.stream(line.split(" "))).
                    map(word-> word.replaceAll("\\p{Punct}","")).
                    distinct().
                    collect(Collectors.toList());
            System.out.println(uniqueWords);



            // Ex 5) Bir metin dosyasındaki tüm harflerin sayısını hesaplayın.
            System.out.println("Ex 5) ");
            Long totalLetters = Files.
                    lines(Paths.get("src/main/java/LAMBDA/day04/Txt.File")).
                    //map(line-> line.replaceAll("[^A-Za-z]","")).
                    flatMap(line->Arrays.stream(line.split(""))).
                    count(); //sayac gibi sayar.
            System.out.println(totalLetters);




            // Ex 6) Bir metin dosyasındaki tüm harfleri alfabetik olarak ters sırayla bir listeye ekleyin.
            System.out.println("Ex 6) ");
            List<String> allLettersAlphabeticalReverse = Files.
                    lines(Paths.get("src/main/java/LAMBDA/day04/Txt.File")).
                    map(line-> line.replaceAll("[^A-Za-z]","")).
                    flatMap(line->Arrays.stream(line.split(""))).
                    sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            System.out.println(allLettersAlphabeticalReverse);


        }
    }







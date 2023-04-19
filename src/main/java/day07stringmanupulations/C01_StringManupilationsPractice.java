package day07stringmanupulations;

public class C01_StringManupilationsPractice {
    public static void main(String[] args) {

        String t = "Yucel 25 ya$indadir sandik ama 30' mis." ;
        // Ex: t Stringindeki tum harfleri ve tum rakamlari ! ceviriniz

        System.out.println(t.replaceAll("[a-zA-Z0-9]", "!"));




        // Ex: t Stringindeki tum space ler disindaki karakterleri "+" ya donusturunuz

        System.out.println(t.replaceAll("[^ ]", "+"));




        // Ex: t String teki tum kucuk harfler disindaki karakterleri "?" e donustur

        System.out.println(t.replaceAll("[^a-z]", "?"));

        //Ex: t Stringindeki tum sesli harfler disindaki karakterleri "&" donusturunuz

        System.out.println(t.replaceAll("[^aeiouAEIOU]", "&"));































    }
}

package day03methodcreationscanner;

public class C01_KullanicidanDataAlma {

    public static void main(String[] args) {

        //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz");

        char ch = input.next().charAt(0);//Ali
        System.out.println("  "+ch+"  "); //5 karakter
        System.out.println(" "+ch+" "+ch+" "); //5 karakter
        System.out.println(ch+" "+ch+" "+ch); //5 karakter

        // Aralarinda bir tap bosluk birakarak tek sout ile ayni sekli olustiralim

        System.out.println("\t\t"+ch+"\t\t\n\t"+ch+"\t"+"\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);


























    }




}

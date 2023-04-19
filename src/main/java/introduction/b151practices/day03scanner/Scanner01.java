package introduction.b151practices.day03scanner;

//java'nin unit kutuphanesinden scanner class import edildi demektir.
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1. adim : Scanner class tan bir obje olustur.

        Scanner input = new Scanner(System.in) ;

        //Obje ismini input yaptik cunku bu obje kullanicidan alinan datayi benim kodlarimin icine koyacak.

        //2. adim : Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz...");

        //3. adim : Uygun method'u kullanarak kullanicinin verdigi datayi memoriye yerlestiriniz.
        byte age = input.nextByte();
        System.out.println(age);
    }
}

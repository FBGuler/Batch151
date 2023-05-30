package mini_projects.loginproject;

import java.util.Scanner;

public class LoginMain {
    /*
    Project: Bir siteye ye olma ve giris yapma sayfas1 tasarlayiniz.
    menü: kullanaciya islem segimi için menü gösterilir.

    üye olma(register): kullanacidan ad-soyad, kullanic adi, email ve sifre bilgileri aliniz.
                        kullanici adi, email ve sifre birer listede tutulur.
                        ayni kullanici adi veya email kabul edilmez.
    giris(login): kullanaci adi/email ve sifre girilir.
                  kullanici adi veya email bulunamazsa kayatli degil, Üye olun vyarisa verilir.
                  kullanac1 adi/email ile ayna indekste kayatli sifre dogrulanirsa siteye giris yapilir.

email validation: bosluk içermemeli
                : @ içermeli
                :gmail.com, hotmail.com veya yahoo.com ile bitmeli.
                : mailin kullanica ada kismanda(@ den önce) sadece büyük-kügük harf, rakam yada -._ sembolleri olabilir

password validation: bogluk içermemeli
en az 6 karakter olmali
en az bir tane küçük harf içermeli
en az bir tane büyûk harf icermeli
en az bir tane rakam içermeli
en az bir tane sembol icermeli

     */

    public static void main(String[] args) {
        start();


    }
    public static void start(){
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        int select;

        do{
           userService.showMenu();
           select = scanner.nextInt();
           switch (select){
               case 1:
                userService.register();
                   break;
               case 2:
               userService.login();
                   break;
               case 3:
                   System.out.println("Iyi Gunler Dileriz..");
                   break;
               default:
                   System.out.println("Hatali Giris Yaptiniz. Yeniden deneyiniz..");
           }
        }while(select!=3);
    }



}

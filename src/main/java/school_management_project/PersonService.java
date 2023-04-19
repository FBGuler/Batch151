package school_management_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public abstract class PersonService {
    Scanner scan;
    List<Person> personList;

    public PersonService() {
        this.scan = new Scanner(System.in);
        this.personList = new ArrayList();
    }

    public abstract void addPerson();

    public abstract void searchPerson();

    public abstract void viewPerson();

    public abstract void deletePerson();

    public void showMenu() {
        System.out.println();
        System.out.println("=======================>>  ISLEMLER  <<=======================");

        char select;
        do {
            System.out.println("1- EKLEME ");
            System.out.println("2- ARAMA ");
            System.out.println("3- LISTELEME ");
            System.out.println("4- SILME ");
            System.out.println("5- ANA MENU ");
            System.out.println("Q- CIKIS ");
            System.out.println("Seciminiz : ");
            select = this.scan.next().toUpperCase().charAt(0);
            switch (select) {
                case '1':
                    this.scan.nextLine();
                    this.addPerson();
                    break;
                case '2':
                    this.searchPerson();
                    break;
                case '3':
                    this.viewPerson();
                    break;
                case '4':
                    this.deletePerson();
                    break;
                case '5':
                    System.out.println("Ana menuye yonlendiriliyorsunuz....");
                    Runner.start();
                    break;
                case 'Q':
                    System.out.println("Iyi gunler dileriz...");
                    break;
                default:
                    System.out.println("Hatali giris! ");
            }
        } while(select != 'Q');

    }

    public static PersonService createInstance(char select) {
        return (PersonService)(select == '1' ? new StudentService() : new TeacherService());
    }

    public String tcSorgu() {
        boolean isValid = true;

        String tcNo;
        do {
            System.out.print("Kimlik No : ");
            tcNo = this.scan.next();
            boolean result1 = tcNo.replaceAll("[0-9]", "").length() == 0;
            boolean result2 = tcNo.length() == 11;
            if (!result1) {
                System.out.println("TC sadece rakamlardan olusmalidir.");
                isValid = false;
            }

            if (!result2) {
                System.out.println("TC kimlik numarasi 11 haneli olmalidir.");
                isValid = false;
            }

            if (result1 && result2) {
                isValid = true;
            }
        } while(!isValid);

        return tcNo;
    }

    public char repeatSorgu() {
        char select;
        do {
            System.out.println("Tekrar sorgulamak icin 1 , CIKIS icin Q ' ya basiniz: ");
            select = this.scan.next().toUpperCase().charAt(0);
            if (select == '1') {
                return select;
            }

            if (select == 'Q') {
                System.out.println("Iyi gunler dileriz..");
            } else {
                System.out.println("Hatali giris!");
            }
        } while(select != 'Q');

        return select;
    }

    public int matchPersonNum(String tc) {
        int count = 0;
        Iterator var3 = this.personList.iterator();

        while(var3.hasNext()) {
            Person w = (Person)var3.next();
            if (w.getTcNum().equals(tc)) {
                ++count;
            }
        }

        return count;
    }

    public String nameValidate() {
        boolean isValid = true;

        String name;
        do {
            System.out.println("Isim - Soyisim: ");
            name = this.scan.nextLine();
            boolean justLetter = name.replaceAll("[a-zA-Z ]", "").length() == 0;
            String[] arr = name.trim().split(" ");
            int arrLength = arr.length;
            if (name.isBlank()) {
                System.out.println("Isim ve soyisim bilgisi bos olamaz! Tekrar deneyiniz...");
                isValid = false;
            } else if (!justLetter) {
                System.out.println("Isim soyisim harf disinda karakter iceremez!");
                isValid = false;
            } else if (arrLength == 1) {
                System.out.println("Isim veya soyismi eksik girdiniz! Tekrar deneyiniz..");
                isValid = false;
            } else {
                int count = 0;
                String[] var7 = arr;
                int var8 = arr.length;

                for(int var9 = 0; var9 < var8; ++var9) {
                    String w = var7[var9];
                    if (w.isBlank()) {
                        System.out.println("Isim ve soyisim arasinda 1'den fazla bosluk olamaz!");
                        ++count;
                        isValid = false;
                        break;
                    }
                }

                if (count == 0) {
                    isValid = true;
                }
            }
        } while(!isValid);

        return name;
    }
}



    













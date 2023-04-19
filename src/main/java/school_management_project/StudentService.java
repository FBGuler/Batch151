//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package school_management_project;

import java.util.Iterator;

public class StudentService extends PersonService {
    public StudentService() {
        Student student1 = new Student("Feride Yabaci", "11111111111", 15, 500, "10");
        Student student2 = new Student("Sevinc Aksoy", "22222222222", 16, 600, "11");
        this.personList.add(student1);
        this.personList.add(student2);
    }

    public void addPerson() {
        boolean isValid;
        do {
            String name = this.nameValidate();
            String idNo = this.tcSorgu();
            int count = this.matchPersonNum(idNo);
            if (count > 0) {
                System.out.println("Bu TC'ye sahip sistemde ogrenci vardir! Tekrar deneyiniz..");
                isValid = false;
            } else {
                System.out.print("Yas : ");
                int age = this.scan.nextInt();
                int scNo = this.schoolNumberSorgu();
                System.out.print("Sinifi : ");
                this.scan.nextLine();
                String sinifSeviye = this.scan.nextLine();
                this.personList.add(new Student(name, idNo, age, scNo, sinifSeviye));
                System.out.println("------> Eklenen Ogrenci Bilgileri : ");
                System.out.printf("%-20s %-15s %-6s %-7s %-6s \n", "Adi - Soyadi ", "TC No ", "Yas ", "Numara ", "Sinifi ");
                System.out.printf("%-20s %-15s %-6s %-7s %-6s \n", name, idNo, age, scNo, sinifSeviye);
                isValid = true;
            }
        } while(!isValid);

    }

    public void searchPerson() {
        char select = 1;

        do {
            String tc = this.tcSorgu();
            int count = this.matchPersonNum(tc);
            if (count == 1) {
                this.matchStudentList(tc);
                select = this.repeatSorgu();
            } else if (count == 0) {
                System.out.println("Aradiginiz ogrencinin kaydi bulunmamaktadir.");
                select = this.repeatSorgu();
            }
        } while(select != 'Q');

    }

    public void viewPerson() {
        System.out.println("------------------> OKULA KAYITLI OGRENCILER <------------------");
        System.out.printf("%-20s %-15s %-6s %-7s %-6s \n", "Adi - Soyadi ", "TC No ", "Yas ", "Numara ", "Sinifi ");
        Iterator var1 = this.personList.iterator();

        while(var1.hasNext()) {
            Person w = (Person)var1.next();
            Student student = (Student)w;
            System.out.printf("%-20s %-15s %-6s %-7s %-6s \n", student.getNameSurname(), student.getTcNum(), student.getAge(), student.getSchoolNum(), student.getClasses());
        }

    }

    public void deletePerson() {
        int count = 0;
        char select = 1;

        do {
            System.out.print("Lutfen silmek istediginiz ogrencinin TC'sini giriniz : ");
            String dtTC = this.scan.next();
            Iterator var4 = this.personList.iterator();

            while(var4.hasNext()) {
                Person w = (Person)var4.next();
                Student student = (Student)w;
                if (w.getTcNum().equals(dtTC)) {
                    System.out.println("Silinen Ogrenci : ");
                    System.out.printf("%-20s %-15s %-6s %-7s %-6s \n", "Adi - Soyadi ", "TC No ", "Yas ", "Numara ", "Sinifi ");
                    System.out.printf("%-20s %-15s %-6s %-7s %-6s \n\n", student.getNameSurname(), student.getTcNum(), student.getAge(), student.getSchoolNum(), student.getClasses());
                    this.personList.remove(w);
                    System.out.println("... Ogrenci silinmistir.\n");
                    ++count;
                    select = 'Q';
                    break;
                }
            }

            if (count == 0) {
                System.out.println("Silmek istediginiz ogrencinin kaydi bulunmamaktadir.");
                select = this.repeatSorgu();
            }
        } while(select != 'Q');

    }

    public void matchStudentList(String tc) {
        System.out.println("Aramanizla Eslesen Kisi Bilgileri : ");
        System.out.printf("%-20s %-15s %-6s %-7s %-6s \n", "Adi - Soyadi ", "TC No ", "Yas ", "Numara ", "Sinifi ");
        Iterator var2 = this.personList.iterator();

        while(var2.hasNext()) {
            Person w = (Person)var2.next();
            Student student = (Student)w;
            if (w.getTcNum().equals(tc)) {
                System.out.printf("%-20s %-15s %-6s %-7s %-6s \n", student.getNameSurname(), student.getTcNum(), student.getAge(), student.getSchoolNum(), student.getClasses());
            }
        }

    }

    public int schoolNumberSorgu() {
        int count = 0;

        int num;
        do {
            System.out.print("Numara : ");
            num = this.scan.nextInt();
            Iterator var3 = this.personList.iterator();

            while(var3.hasNext()) {
                Person w = (Person)var3.next();
                Student student = (Student)w;
                if (student.getSchoolNum() == num) {
                    System.out.println("Bu numara baska bir ogrenciye aittir. Tekrar deneyiniz..");
                    ++count;
                } else {
                    count = 0;
                }
            }
        } while(count != 0);

        return num;
    }
}

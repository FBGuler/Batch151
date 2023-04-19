package school_management_project;

import java.util.Iterator;

public class TeacherService extends PersonService {
    public TeacherService() {
        Teacher teacher1 = new Teacher("Aynur Ahtivar", "33333333333", 30, "Software", "1111111");
        Teacher teacher2 = new Teacher("Defne Ahtivar", "22222222222", 32, "Software", "2222222");
        this.personList.add(teacher1);
        this.personList.add(teacher2);
    }

    public void addPerson() {
        boolean isValid;
        do {
            String name = this.nameValidate();
            String idNo = this.tcSorgu();
            int count = this.matchPersonNum(idNo);
            if (count > 0) {
                System.out.println("Bu TC'ye sahip sistemde ogretmen vardir! Tekrar deneyiniz..");
                isValid = false;
            } else {
                System.out.print("Yas : ");
                int age = this.scan.nextInt();
                System.out.print("Bolumu : ");
                this.scan.nextLine();
                String branch = this.scan.nextLine();
                String sicilNo = this.sicilNoSorgu();
                this.personList.add(new Teacher(name, idNo, age, branch, sicilNo));
                System.out.println("------> Eklenen Ogretmen Bilgileri : ");
                System.out.printf("%-20s %-15s %-7s %-10s %-10s \n", "Adi - Soyadi ", "TC No ", "Yas ", "Bolumu ", "Sicil No ");
                System.out.printf("%-20s %-15s %-7s %-10s %-10s \n", name, idNo, age, branch, sicilNo);
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
                this.matchTeacherList(tc);
                select = this.repeatSorgu();
            } else if (count == 0) {
                System.out.println("Aradiginiz ogretmenin kaydi bulunmamaktadir.");
                select = this.repeatSorgu();
            }
        } while(select != 'Q');

    }

    public void viewPerson() {
        System.out.println("-------------------> OKULUMUZ OGRETMENLERI <-------------------");
        System.out.printf("%-20s %-15s %-7s %-10s %-10s \n", "Adi - Soyadi ", "TC No ", "Yas ", "Bolumu ", "Sicil No ");
        Iterator var1 = this.personList.iterator();

        while(var1.hasNext()) {
            Person w = (Person)var1.next();
            Teacher teacher = (Teacher)w;
            System.out.printf("%-20s %-15s %-7s %-10s %-10s \n", teacher.getNameSurname(), teacher.getTcNum(), teacher.getAge(), teacher.getBranch(), teacher.getSicilNo());
        }

    }

    public void deletePerson() {
        int count = 0;
        char select = 1;

        do {
            System.out.print("Lutfen silmek istediginiz ogretmenin TC'sini giriniz : ");
            String dtTC = this.scan.next();
            Iterator var4 = this.personList.iterator();

            while(var4.hasNext()) {
                Person w = (Person)var4.next();
                Teacher teacher = (Teacher)w;
                if (w.getTcNum().equals(dtTC)) {
                    System.out.println("------> Silinen Ogretmen : ");
                    System.out.printf("%-20s %-15s %-7s %-10s %-10s \n", "Adi - Soyadi ", "TC No ", "Yas ", "Bolumu ", "Sicil No ");
                    System.out.printf("%-20s %-15s %-7s %-10s %-10s \n\n", teacher.getNameSurname(), teacher.getTcNum(), teacher.getAge(), teacher.getBranch(), teacher.getSicilNo());
                    this.personList.remove(w);
                    System.out.println("... Ogretmen silinmistir.\n");
                    ++count;
                    select = 'Q';
                    break;
                }
            }

            if (count == 0) {
                System.out.println("Silmek istediginiz ogretmenin kaydi bulunmamaktadir.");
                select = this.repeatSorgu();
            }
        } while(select != 'Q');

    }

    public String sicilNoSorgu() {
        int count = 0;
        boolean isValid = true;

        String sicil;
        do {
            System.out.print("Sicil No : ");
            sicil = this.scan.next();
            boolean justDigit = sicil.replaceAll("[0-9]", "").length() == 0;
            if (!justDigit) {
                System.out.println("Sicil No sadece rakamlardan olusmalidir!");
                isValid = false;
            } else if (sicil.length() != 7) {
                System.out.println("Sicil No 7 haneli olmalidir! ");
                isValid = false;
            } else {
                for(Iterator var5 = this.personList.iterator(); var5.hasNext(); isValid = true) {
                    Person w = (Person)var5.next();
                    Teacher teacher = (Teacher)w;
                    if (teacher.getSicilNo().equals(sicil)) {
                        System.out.println("Bu Sicil Numarasi baska bir ogretmene aittir. Tekrar deneyiniz..");
                        ++count;
                        isValid = false;
                        break;
                    }
                }
            }
        } while(!isValid);

        return sicil;
    }

    public void matchTeacherList(String tc) {
        System.out.println("Aramanizla Eslesen Kisi Bilgileri : ");
        System.out.printf("%-20s %-15s %-7s %-10s %-10s \n", "Adi - Soyadi ", "TC No ", "Yas ", "Bolumu ", "Sicil No ");
        Iterator var2 = this.personList.iterator();

        while(var2.hasNext()) {
            Person w = (Person)var2.next();
            Teacher teacher = (Teacher)w;
            if (w.getTcNum().equals(tc)) {
                System.out.printf("%-20s %-15s %-7s %-10s %-10s \n", teacher.getNameSurname(), teacher.getTcNum(), teacher.getAge(), teacher.getBranch(), teacher.getSicilNo());
            }
        }

    }
}

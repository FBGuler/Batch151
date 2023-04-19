//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package school_management_project;

public class Student extends Person {
    private int schoolNum;
    private String classes;

    public Student(String nameSurname, String tcNum, int age, int schoolNum, String classes) {
        super(nameSurname, tcNum, age);
        this.schoolNum = schoolNum;
        this.classes = classes;
    }

    public int getSchoolNum() {
        return this.schoolNum;
    }

    public void setSchoolNum(int schoolNum) {
        this.schoolNum = schoolNum;
    }

    public String getClasses() {
        return this.classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}

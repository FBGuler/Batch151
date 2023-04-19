//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package school_management_project;

public class Teacher extends Person {
    private String branch;
    private String sicilNo;

    public Teacher(String nameSurname, String tcNum, int age, String branch, String sicilNo) {
        super(nameSurname, tcNum, age);
        this.branch = branch;
        this.sicilNo = sicilNo;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSicilNo() {
        return this.sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }
}

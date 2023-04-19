package school_management_project;

public class Person {
    private String nameSurname;
    private String tcNum;
    private int age;

    public Person(String nameSurname, String tcNum, int age) {
        this.nameSurname = nameSurname;
        this.tcNum = tcNum;
        this.age = age;
    }

    public String getNameSurname() {
        return this.nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getTcNum() {
        return this.tcNum;
    }

    public void setTcNum(String tcNum) {
        this.tcNum = tcNum;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        Course turkishDay = new Course("Turkish Daytime QA", 213, "Spring", 97);
        Course turkishNight = new Course("Turkish Nighttime QA", 245, "Winter", 98);
        Course englishDayTime = new Course("English Daytime Java Dev", 121, "Spring", 91);
        Course englishNightTime = new Course("English Nighttime Java Dev", 137, "Winter", 95);


        List<Course> courseList = new ArrayList<>();
        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDayTime);
        courseList.add(englishNightTime);

        System.out.println(isAvarageScoreGraterThanANumber(courseList, 90));//true
        System.out.println(isAnyCoursenNameContainsQa(courseList, "QA")); //true
        System.out.println(getCourseNamesWhoseAvgMax(courseList));//Turkish Nighttime QA
        System.out.println(getCourseBetterThanLatTwo(courseList));//[Course{courseName='Turkish Daytime QA', numOfStudents=213, season='Spring', averageScore=97.0}, Course{courseName='Turkish Nighttime QA', numOfStudents=245, season='Winter', averageScore=98.0}]
        System.out.println(getHighestThird(courseList));//Course{courseName='English Nighttime Java Dev', numOfStudents=137, season='Winter', averageScore=95.0}
        System.out.println(getCourseWhoseRegisteredStdLessThanANumber(courseList, 150));//[Course{courseName='English Daytime Java Dev', numOfStudents=121, season='Spring', averageScore=91.0}, Course{courseName='English Nighttime Java Dev', numOfStudents=137, season='Winter', averageScore=95.0}]
    }

    //Example 1: Tum avarage score larin 90 dan buyuk olup olmadigini kontrol eden methodu yaz.

    public static boolean isAvarageScoreGraterThanANumber(List<Course> courseList, int avg){
       return courseList.stream().allMatch(t->t.getAverageScore()>avg);
    }


    //Example 2: En az bir course isminin QA icerip icermedigini kontrol eden bir method olusturunuz.
    public static boolean isAnyCoursenNameContainsQa(List<Course> courseList , String word){
       return courseList.stream().anyMatch(t->t.getCourseName().contains(word));
    }

    //Example 3: En yuksek avarage score a sahip kurs ismini veren kodu yaziniz.
    public static String getCourseNamesWhoseAvgMax (List<Course> courseList ){
        Course course = courseList.stream().sorted(Comparator.comparing(Course :: getAverageScore).reversed()).findFirst().get();
        return course.getCourseName();
    }

    //Example 4: Avarage score u en dusuk olan ilk iki kurs disindaki tum kurslari return eden methodu olusturunuz.
    public static List<Course> getCourseBetterThanLatTwo (List<Course> courseList){
       return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
    }

    //Example 5: Avarage score u ustten ucuncu olan kursu veren methodu yaziniz.
    public static Course getHighestThird (List<Course> courseList){
        return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).skip(2).limit(1).collect(Collectors.toList()).get(0);
    }

    //Example 5: Ogrenci sayisi 150 den az olan kurslari return eden method u olusturunuz.
    public static List<Course> getCourseWhoseRegisteredStdLessThanANumber (List<Course> courseList, int numOfStrd){
        return courseList.stream().filter(t->t.getNumOfStudents()<numOfStrd).collect(Collectors.toList());
    }











}

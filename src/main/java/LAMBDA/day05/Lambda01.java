package LAMBDA.day05;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        elemanlariYazdir(nums);
        System.out.println();
        elemanlariYazdir2(nums);
        System.out.println();
        ciftElemanlar(nums);
        System.out.println();
        ciftElemanlar2(nums);
        System.out.println();
        tekKareYazdir(nums);
        System.out.println();
        tekKupTekrarsizYazdir(nums);
        System.out.println();
        System.out.println(benzersizCiftKareToplamiYazdir(nums));
        System.out.println(benzersizCiftKareCarpimiYazdir(nums));
        System.out.println(max(nums));
        max1(nums);
        max2(nums);
        System.out.println(min(nums));
        min1(nums);
        min2(nums);



    }

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void elemanlariYazdir(List<Integer> nums){
        for (Integer w: nums ) {
            System.out.print(w + " ");
        }
    }




    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void elemanlariYazdir2 (List<Integer> nums){
        nums.
                stream().
                forEach(t-> System.out.print(t +" "));
    }


    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void ciftElemanlar (List<Integer> nums){
        for (Integer w: nums ) {
            if (w%2==0){
                System.out.print(w+ " ");
            }
        }
    }



    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void ciftElemanlar2 (List<Integer> nums){
        nums.
                stream().filter(t->t%2==0).
                forEach(t-> System.out.print(t+" "));
    }



    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void tekKareYazdir (List<Integer> nums){
        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t+" "));
    }






    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekKupTekrarsizYazdir (List<Integer> nums){
        nums.
                stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+" "));
    }



    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static int benzersizCiftKareToplamiYazdir (List<Integer> nums){
        return nums.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(Math::addExact).
                get();
    }


    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz

    public static int benzersizCiftKareCarpimiYazdir (List<Integer> nums){
        return nums.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(Math::multiplyExact).
                get();
    }

    //9)Liste ogelerinden max degeri veren bir method olusturunuz

    public static int max (List<Integer> nums){
        return nums.
                stream().
                distinct().
                reduce(Math::max).
                get();
    }

    //1.way
    public static void max1 (List<Integer> nums){
        Integer max1 = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t : u);
        System.out.println(max1);
    }

    //2.way

    public static void max2 (List<Integer> nums){
        Integer max2 = nums.
                stream().
                distinct().
                reduce(nums.get(0) ,(t,u)-> t>u ? t : u );
        System.out.println(max2);
    }






    //10)Liste ogelerinden minumum degeri veren method olusturunuz

    public static int min (List<Integer> nums){
        return nums.
                stream().
                distinct().
                reduce(Math::min).
                get();
    }

    //1. WAY
    public static void min1 (List<Integer> nums){
        Integer min1 = nums.
                stream().
                distinct().
                reduce(nums.get(0), (t,u)-> t<u ? t : u);
        System.out.println(min1);
    }

    //2. WAY
    public static void min2 (List<Integer> nums){
        Integer min1 = nums.
                stream().
                distinct().
                reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t : u);
        System.out.println(min1);
    }







}
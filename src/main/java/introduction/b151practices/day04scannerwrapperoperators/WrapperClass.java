package introduction.b151practices.day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive : char 'A', boolean true-false, byte, short, ing, long, float, double
        //Wrapper Class : Character, Boolean, Byte, Short, Integer, Long, Float, Double

        //Wrapper Class'lar non-primitive'dir. O yuzden cok memory kaplarlar.
        //o yuzden sart degilsde wrapper kullanmayi tercih etmeyiz.
        //boyle bir imkanin varligindan da haberdar olmaliyiz.

        //"n" yazip "." koyarsaniz hic method goremezsini, cunku primitive ler method icermez
        int n =12;
        //"m" yazip "." koyarsaniz bircok method gorebilirsini, cunku wrapper class lar method icerir.
        Integer m =12;

        byte p= 13;
        Byte r= 13;




        //Ornek 1 : short data type'inin minimum ve maximum degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        //Java da degismez degerler buyuk harfle yazilir

        //Ornek 2 : int data typinin minimum degeri ile byte data type nin max degerinin toplami

        int minValue = Integer.MIN_VALUE ;
        byte maxValue = Byte.MAX_VALUE ;
        System.out.println(minValue+maxValue); //-2147483521

        //Ornek 3 : i) Primitive int' i wrapper intiger a ceviriniz. Autoboxing ***
        int num = 13;
        Integer wrapperNum = num;



        //primitive yani method bulunmayan bir kutudaki degeri alarak

                  //ii)Wrapper Byte i primitive byte a ceviriniz. Unboxing ***
        Byte k = 33 ;
        byte primitiveByte = k;

        //wrapper bir kutu icinde bazi methodlarla birlikte bulunan degeri alarak
        //primitive yani method bulunmayan bir kutuya atama yaparsak bu isleme UNBOXING denir.

        //Ornek 4: i) Primitive char'i Wrapper Character'e ceviriniz. (Autoboxing)

        char initial = 'T';
        Character initialWrapper = initial;

                 //ii) Wrapper Boolean'i primitive boolean'a ceviriniz. (Unboxing)
        Boolean isOld = true ;
        boolean isOldpr = isOld;

        













    }
}

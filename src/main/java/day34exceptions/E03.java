package day34exceptions;

public class E03 {
    public static void main(String[] args) {


        System.out.println(getNumOfChars("Java"));
        System.out.println(getNumOfChars("Money"));
        System.out.println(getNumOfChars(""));
        System.out.println(getNumOfChars(null));//exceptions


    }
    //Bir String teki karakter sayisini veren method olusturunuz.


    public static int getNumOfChars(String s){

        int result = 0;
        try{
            result = s.length();
        }catch (NullPointerException e){
            System.out.println("Some String methods do not work with null...");
            System.out.println(e.getMessage());//Java nin exception icin urettigi teknik mesaji varsa verir. Burda yok. Sadece null yazdirdi.
        }
        return  result;
    }





}

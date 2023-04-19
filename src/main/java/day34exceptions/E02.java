package day34exceptions;

public class E02 {
    public static void main(String[] args) {


        String a[] = {"A", "V", "A", "J"};


        System.out.println(getElement(a,3));//A
        System.out.println(getElement(a,1));//A
        System.out.println(getElement(a, 4));//J
        System.out.println(getElement(a, 2));//V

        System.out.println(getElement(a, 6));//exceptions


    }

    //Bir String Array den istenilen bir elemani eleman sirasi ile alan method olusturunuz.

    public static String getElement (String[] a , int numOfElement){

        String result = "";
        try{
            result = a[numOfElement-1];
        }catch(ArrayIndexOutOfBoundsException e){

            if(numOfElement-1<0){
                result = a[0];
            }else{
                result = a[a.length-1];

            }
        }
        return  result;

    }


}

package day13incrementdecrementloops;

public class ForLoop02 {
    public static void main(String[] args) {
        
        //Ex 1: Verilen bir String de ilk 'a' harfinden onceki tum karakterleri konsola yazdiriniz.
        // String s = "I love Java";==> "I love J"
        String s = "I love Java";
        for(int i = 0 ; i<s.length() ; i++){
            System.out.print(s.charAt(i));
            if (s.charAt(i)=='a'){
                break;
            }
        
        }

        System.out.println();

        //Ex 2: Verilen bir Stringle son 'a' dan sonraki tum karakterleri tersten yazdiriniz
        String t = "Germany";
        for(int i = t.length()-1 ; i>=0 ; i--){
            char ch = t.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(t.charAt(ch));
        }


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

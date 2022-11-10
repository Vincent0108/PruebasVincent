

import java.io.*;
import java.util.*;

public class Palindromo {

    public static int palindromeIndex(String s) {
        String reverso="";

        String sub1Par = s.substring(0, (s.length()/2));
        String sub1ImPar = s.substring(0, (s.length()/2+1));

        String sub2 = s.substring(s.length()/2,s.length());
    
        for (int i = sub2.length()-1; i >= 0; i--) {

            reverso += sub2.charAt(i)+"";
        }
           
        if(sub1Par.equals(reverso)){
            System.out.println("ES PALINDROMO Par");
        }
        if(sub1ImPar.equals(reverso)){
            System.out.println("ES PALINDROMO Impar");
        }
        return 0;

        

    }

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        String s = keyboard.nextLine();

        palindromeIndex(s);
        


        
    }
}

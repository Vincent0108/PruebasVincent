

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Sos {

    public static int marsExploration(String s) {

        final String sos = "SOS";

        List<String> stringSplited = new ArrayList<String>();

        int posIni = 0;
        int posFin = 0;

        for (int i = 0; i < s.length(); i++) {
            
            if ((s.length()-(i+1))%3 == 0) {
                posFin = i;
                stringSplited.add(s.substring(posIni, posFin+1));
                posIni = posFin + 1;
            }
        }

        int errors = 0;
        
        for (int i = 0; i < stringSplited.size(); i++) {

            if(!stringSplited.get(i).equals(sos)){
                for (int j = 0; j < stringSplited.get(i).length(); j++) {
                    if(stringSplited.get(i).charAt(j) != sos.charAt(j)){
                        errors++;
                       
                    }
                }
            }
        }
     
        return errors;
    }
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        String s = keyboard.nextLine();

        int result = Sos.marsExploration(s);


        
    }
}

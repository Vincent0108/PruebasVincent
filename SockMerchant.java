import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class SockMerchant {

    public static int sockMerchant(int n, List<Integer> ar) {
        int contadorPares = 0, contadorAux = 0;
        Set<Integer> set = new LinkedHashSet<>(ar);

        List<Integer> auxArr = new ArrayList<Integer>(set);
        
        for (int i = 0; i < set.size(); i++) {
            for (int j = 0; j < ar.size(); j++) {
                if (auxArr.get(i)== ar.get(j)) {
                    contadorAux++;
                    if (contadorAux == 2) {
                        contadorPares++;
                        contadorAux = 0;   
                        System.out.println("[i] = "+i);
                        System.out.println("[j] = "+j);
                        System.out.println("ar.get(i) = "+ar.get(i));
                        System.out.println("ar.get(j) = "+ar.get(j)); 
                    }
                }  
            }
            contadorAux=0;
        }
        System.out.println(contadorPares);
        return contadorPares;
    }

    public static void main(String[] args) throws IOException {
        Scanner key = new Scanner(System.in);
        int n = Integer.parseInt(key.nextLine().trim());

        List<Integer> ar = Stream.of(key.nextLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = SockMerchant.sockMerchant(n, ar);
    }
}

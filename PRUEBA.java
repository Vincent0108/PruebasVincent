//Prueba 1 variables, tipos de datos y recibimiento de datos
import java.util.Scanner;
public class PRUEBA{

   public static void main(String[]args){

    //Variables 
    Scanner in = new Scanner(System.in);
    String variable1="";
    int variableNum1;
    Double variableDob1;
    
    //De String a Int parse
    System.out.println("Escribe un numero we");
    variable1=in.nextLine();
    System.out.println("Ahora lo pasamos a Integer y sumamos con 3");
    
    variableNum1=Integer.parseInt(variable1);
    System.out.println(variableNum1+3);

    //De Int a String parse
    System.out.println("Escribe un numero we");
    variableNum1=in.nextInt();
    variable1=Integer.toString(variableNum1);
    System.out.println("Ahora lo pasamos a String y lo ponemos en una cadena");
    System.out.println("El número es"+variable1);


    //De String a Double parse
    System.out.println("Escribe un número");
    variable1 = in.nextLine();
    System.out.println("Ahora lo pasamos a Integer y sumamos con 2");
    variableDob1 = Double.parseDouble(variable1);
    System.out.println(variableNum1+3);

    //De Double a String
    System.out.println("Escribe un numero we");
    variableDob1=in.nextDouble();
    variable1=Double.toString(variableDob1);
    System.out.println("Ahora lo pasamos a String y lo ponemos en una cadena");
    System.out.println("El número es"+variable1);
    
    

    //De String a Char 
    System.out.println("Escribe una palabra");
    variable1 = in.nextLine();
    char [] caracter1=variable1.toCharArray();

        System.out.print("La palabra tiene "+caracter1.length+" caracteres\n");

        for(int i = 0; i<caracter1.length; i++){
            System.out.print(caracter1[i]);
            in.close();
        } 

     //De Char a String 
        char ch[]={'T','U','M','A'};
        String st1 = String.valueOf(ch);
        System.out.println(st1);
    }
    
}
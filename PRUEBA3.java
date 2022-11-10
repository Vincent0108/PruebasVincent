//Prueba 3 manejo de cadenas y arreglos

import java.util.Scanner;
public class PRUEBA3 {
    
    public static void main(String[] args){
  
  //Manejo de cadenas  
  /* 
  String cadena_original = "", cadena_substraccion = "";
  int num_caracteres = 0, desde = 0, hasta = 0;
  Scanner in = new Scanner(System.in);

  System.out.print("Introduce una cadena de caracteres: ");
  cadena_original = in.nextLine();

  num_caracteres = cadena_original.length();

  System.out.println("La cadena de caracteres " + cadena_original + " pose " + 
                      num_caracteres + " caracteres.");

  System.out.print("¿Desde que caracter desdeas obtener la nueva cadena?: ");
  desde = in.nextInt();
  System.out.print("¿Hasta que caracter desdeas obtener la nueva cadena?: ");
  hasta = in.nextInt();

  cadena_substraccion = cadena_original.substring(desde, hasta);
  System.out.println("La nueva cadena es: " + cadena_substraccion);
*/
  //Manejo de arreglos

      //Vector estatico
      String letras[]= new String[5];
       letras[0]="A";
       letras[1]="B";
       letras[2]="C";
       letras[3]="D";
       letras[4]="E";

       //Vector dinamico
      int numeros[]= new int[5];

      for(int i=0;i<numeros.length;i++) {
        numeros[i]=i;

        System.out.println(numeros[i]);
      }
     
      System.out.println(numeros[4]);

      //Matriz estatica
      int numeros2[][]=new int[2][2];
      numeros2[0][0]=1;
      numeros2[1][0]=2;
      numeros2[0][1]=3;
      numeros2[1][1]=4;

      //Matriz dinamica

      System.out.println(numeros2[0][0]);

 }
}


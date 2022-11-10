//Prueba 2 Condicionales y ciclos
public class PRUEBA2 {
    
public static void main(String[]args){

    String tu="Hombre";
    
    //If, else if y else
    if(tu.equals("Hombre")){

        System.out.println("eres "+tu);

    }else if(tu.equals("Mujer")){

        System.out.println("eres "+tu);

    }else{

        System.out.println("no eres humanos eres hupierna");
    }

    //switch 

    switch(tu){

        case "Hombre":
        System.out.println("eres "+tu);
        break;

        case "Mujer":
        System.out.println("eres "+tu);
        break;

        default:System.out.println("no eres humanos eres hupierna");
    }

    //Ciclos while, for y do while
    
    int x=0;

    while(x<10){
        System.out.println(x);
        x++;

    }

    for(int i=0; i<=20; i+=2){
        System.out.println(i);
        
    }

    int y=0;
    do{
        System.out.println(y);
        y++;

    }while(y<=11);



}


}

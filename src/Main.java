// se crea un programa donde se ingresan datos , cuando se finaliza , se suman todos 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int  num = 0 , suma=0;
        Scanner n = new Scanner(System.in);
        do{
            System.out.println("introduce el numero \n\t( si quieres salir introduce solamente el numero 0)");
            num= n.nextInt();
            suma= suma+num;
        }while(num!=0);
        System.out.println("la suma de todos los  numeros es ... "+suma);

    }
}
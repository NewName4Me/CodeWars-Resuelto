package CodeWars_8Kyu;
import java.util.ArrayList;
import java.util.Scanner;

public class CuadradoORaiz_List {
    public static void main(String[]args){
        /*
        Un programa en el cual tenemos un array de numeros 
        identifica los numeros, y uno a uno diferencia, si tiene una 
        raiz cuadrada entere imprime esa raiz, si no elevalo al cuadrado
        
        Ej:
        [4,3,9,7,2,1] -> [2,9,3,49,4,1]

        */
        ArrayList<Integer> numbers=new ArrayList();
        Scanner scanner=new Scanner(System.in);
        
        //variables
        double num;
        double raiz;
        int cambiador1;//convierte raiz a entero
        int cambiador2;//convierte cuadrado a entero
        double cuadrado;
        
        //programa
        System.out.println("En este programa usted puede meter todos los numeros ENTEROS, ");
        System.out.println("que quiera dentro de la matriz, los que tengan una raiz exacta se alamcenar su raiz, ");
        System.out.println("los que no se los eleva al cuadrado y se almacenan");
        System.out.println();
        
        while(true){//pide numero y termina al meter un decimal
            
            System.out.println("Introduce un número entero para sumarlo a la matriz y cualquier decimal para salir");
            num=scanner.nextDouble();
            
            if (num!=(int)num){//si metemos un decimal termina
                break;
            }
                      
            raiz=Math.sqrt(num);//calculamos la raiz
            cambiador1=(int)raiz;//le quitamos los decimales convirtiendolo en int para que se vea bonito y porque no afecta en este caso
            cuadrado=num*num;
            cambiador2=(int)cuadrado;
            
            if (raiz%2==0 || raiz%2==1){//cuando la raiz es entera la imprime
                numbers.add(cambiador1);;
            }
            else{
                numbers.add(cambiador2);
            }
        }
        
        //salida
        System.out.print("Tu matriz resultante es: [");
        for(int i=0;i<numbers.size();i++){//imprime toda la matriz
            System.out.print(numbers.get(i)+",");
        }
        System.out.print("]");

    }
}

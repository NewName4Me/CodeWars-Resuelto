package CodeWars_8Kyu;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenarNumeros {
    public static void main(String[]args){
        /*
        progrma que me ordene numero pero en cualquier rango de numeros
        ya sean 6 cifras o mas, da igual, de mayor a menor
        */
        //assertEquals(987654321, DescendingOrder.sortDesc(123456789));
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> numeros= new ArrayList();
        
        //variables
        double num;
        int numInt;//combierte el num en entero
      
        //programa
        System.out.println("Inserte los números a ordenar, cuando insete un número decimal le muestro lista en orden descendiente sin incluir este número");
        
        
        while(true){
            System.out.print("Inserte un número: ");
            num=scanner.nextDouble();
            if(num!=(int)num){//en caso de que meta un número decimal termina 
                break;
            }
            numInt=(int)num;//cambia el tipo de num para que sea aceptado en el Array
            numeros.add(numInt);
        }
        System.out.println("Tu matriz es la siguiente"+numeros);
        
        Collections.sort(numeros,Collections.reverseOrder());//los ordena de mayor a menor
        System.out.println("Así es ordenada de mayor a menor"+numeros);
        
        Collections.sort(numeros);//los ordena de menor a mayor
        System.out.print("Así es ordenada de menor a mayor"+numeros);
        
    }
}

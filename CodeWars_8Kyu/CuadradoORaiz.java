package CodeWars_8Kyu;
import java.util.ArrayList;

public class CuadradoORaiz {
    public static void main(String[]args){
        /*
        Un programa en el cual tenemos un array de numeros 
        identifica los numeros, y uno a uno diferencia, si tiene una 
        raiz cuadrada entere imprime esa raiz, si no elevalo al cuadrado
        
        Ej:
        [4,3,9,7,2,1] -> [2,9,3,49,4,1]
        */
        
        /* Otra forma de hacer la matriz pero me parecía mejor de la otra forma al final
        ArrayList<Integer>numbers=new ArrayList();//Integer porque los ArrayList solo funcionan con wrappers
        numbers.add(4);
        */
        
        int []numbers={4,3,9,7,2,1};
        double raiz;
        int cuadrado;
        int value;
        
        for(int i =0;i<numbers.length;i++){//revisamos cada elemento de la matriz numbers
            raiz=Math.sqrt(numbers[i]);
            value=(int)raiz;
            /*
            convierte el double "raiz" en int asi como los numeros que quiero sacar de raiz son 
            con coma 0 no me lo imprime y queda más bonito
            */
            cuadrado=numbers[i]*numbers[i];
            
            if (raiz%2==0 || raiz%2==1){//cuando la raiz es entera la imprime
                System.out.println(value);
            }
            else{
                System.out.println(cuadrado);
            }
        }

    }
}

package CodeWars_7Kyu;

import java.util.Arrays;


public class CalculateAndConcatenate {
    public static void main(String[]args){
        /*
        You will be given an array which will include both integers and characters.

        Return an array of length 2 with a[0] representing the mean of the ten integers 
        as a floating point number. There will always be 10 integers and 10 characters. 
        Create a single string with the characters and return it as a[1] while maintaining the original order.
        
        lst = ['u', '6', 'd', '1', 'i', 'w', '6', 's', 't', '4', 'a', '6', 'g', '1', '2', 'w', '8', 'o', '2', '0']
        OUTPUT=[3.6, "udiwstagwo"];
        
        https://www.codewars.com/kata/56f7493f5d7c12d1690000b6/train/java
        */
        
        char[] list={'u', '6', 'd', '1', 'i', 'w', '6', 's', 't', '4', 'a', '6', 'g', '1', '2', 'w', '8', 'o', '2', '0'};
        
        System.out.println(Arrays.toString(mean(list)));
    }
    
    public static Object[] mean(char[] lst){
        //VARIABLES
        Object[] result =new Object[2];
        double sum=0;
        double cont=0;
        String characters="";
        
        //PROGRAMA
        for(int i=0;i<lst.length;i++){//recorremos todos los elementos de nuestra lista de caracteres
            if(Character.isDigit(lst[i])){ //cada vez que detectamos un número entramos
                sum+=Character.getNumericValue(lst[i]);//sumamos todo cogiendo su valor numerico
                cont++;
            }
            else{
                characters+=lst[i];
            }
        }
        //asignar las salidas
        result[0]=sum/cont;
        result[1]=characters;

        //SALIDA
        return new Object[]{result[0],result[1]};
    }
}

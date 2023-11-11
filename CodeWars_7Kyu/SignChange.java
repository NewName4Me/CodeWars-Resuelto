package CodeWars_7Kyu;

public class SignChange {
    public static void main(String[]args){
        /*
        Dado un array con diferentes números indicar cuantas veces cambia de signo uno tras otrs 
        Ej: [1,-1,-2,2,-5]
        Cambio=3
        
        https://www.codewars.com/kata/5bbb8887484fcd36fb0020ca/train/java
        */
        
        //variables
        int[] numeros={1,-1,-2,2,-5};
        int signo=0;//contador de cambios de signo
        
        
        //programa
        for(int i=0;i<numeros.length;i++){
            int num1=numeros[0];//asigna num1 al primer valor de la matriz
            if ((num1>=0 && numeros[i]<0) || (num1<0 && numeros[i]>=0)){ //cada vez que tengamos un cambio de signo se ejecuta
                num1=numeros[i];//actualizamos el valor del num1 para que compare todo el rato el valor anterior con el nuevo
                signo++;
            }
            
        }
        //salida
        System.out.println("En tu matriz se cambia de signo "+signo+" veces");
    }
}

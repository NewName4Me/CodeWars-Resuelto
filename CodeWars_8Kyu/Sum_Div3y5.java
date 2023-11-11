package CodeWars_8Kyu;

import java.util.Scanner;

public class Sum_Div3y5 {
     public static void main(String[] args) {
         /*
         Programa donde tu metes un numero y te calcula la suma de todos los 
         divisibles entre tres y cinco desde ese numero sin incluirlo hasta 0
         
         Se que el codigo es extraño, pero intente adaptarme a como funciona code wars y 
         salio esto, pero en si el codigo 
         funcionaria perfectamente sin tanta floritura xD
         */
        Scanner pregunta = new Scanner(System.in);
        
        System.out.print("Dame un numero entero mayor o igual que cero");
        int num = pregunta.nextInt();
        
        while (num<0){//para asegurarnos que mete algo mayor que cero, tambien podriamos hacerlo absoluto y listo
            System.out.print("Mayor o igual que cero ");
            num = pregunta.nextInt();
        }
        
        new Sum_Div3y5().solution(num); 
    }
    public int solution(int num) {
        int suma=0;
        while (num != 0) {//cuenta atras y solo suma si esdivisible entre 3 o 4
            num = num - 1;
            if (num % 3 == 0 || num % 5 == 0) {
                suma=suma+num;
            }  
        }
        System.out.println("La suma de todos tus numeros divisibles entre 3 y 5 desde cero hasta tu numero son"+suma);
        return num;
    } 
}

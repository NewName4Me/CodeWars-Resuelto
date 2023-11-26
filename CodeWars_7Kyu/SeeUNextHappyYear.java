package CodeWars_7Kyu;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SeeUNextHappyYear {
    public static void main(String[]args){
        /*
        programa donde insertemos un año y nos indique cual sera el proximo
        año feliz(año donde no se repite ningun numero)
        2019 =feliz
        2023= no feliz
        Para este problema debemos usar year como int no como string(aclaracion de codewars)
        
        String Stringnumber=String.valueOf(number); //asi conviertes un String en int
        
        ESTO ME IMPRIME CADA NUMERO INDIVIDUALMENTE:
                int number = 456;

                while (number > 0) {
                    int digit = number % 10;
                    System.out.println(digit);
                    number = number / 10;
                }
        
        
        Planteamiento:cojo todos los numeors de mi año, los inserto en una lista para poder ordenarlos de forma más rapida
        una vez ordenados con cods variables compruebo si existen dos numeors iguales, en caso de que no, salimos del bucle
        e imprimimos nuestro año feliz, en caso contrario, limpiamos nuestra lista, le sumamos uno a nuestro año y comprobamos
        si este es feliz ,asi sucesivamente hasta tener el año feliz
        */
        Scanner scanner=new Scanner(System.in);
        
        ArrayList<Integer> listaNum=new ArrayList<>();
        
        //variables
        int year;
        int digit;
        boolean feliz=false;//para determinar el mensaje de salida
        int check1;
        int check2;
        int tempYear;//para guardar mi año y poder hacer operaciones con el correctamente sin que afecte a mi codigo
        
        //programa
        System.out.println("Dime un año y te diré si es feliz o no, si no lo es te dire cuando es el proximo año feliz");
        year=scanner.nextInt();
        
        do{//bucle que se repite hasta que tengamos un año feliz
            tempYear=year;
            
            while(tempYear>0){//para dividir el año en todos sus numeros y añadirlos a una lista
                digit=tempYear%10;
                listaNum.add(digit);
                tempYear=tempYear/10;
            }

            Collections.sort(listaNum);//me ordena mi lista de números

            for(int i=0;i<listaNum.size()-1;i++){//para mirar cada elemento de nuestro arraylist
                check1=listaNum.get(i);
                check2=listaNum.get(i+1);//valor que chequea siempre un paso por delante

                if(check1==check2){//si algun numero coincide con otro no es feliz y dejamos de chequar valores
                    feliz=false;
                    break;
                }
                else{
                    feliz=true;
                }
            }
            
            listaNum.clear();//limpiamos la lista para mirar el siguiente año
            if(feliz==false){//cuando aun no tengamos un año feliz ,le sumamos uno al actual y repetimos
                year++;
            }

        }while(feliz==false);//salida de do while, cuadno tengamos un año feliz lo decimos
        
        
        //salida
        if(feliz==true){//en caso de que sea feliz se lo decimos
            System.out.println("Tu año feliz es: "+year);
        }
    }   
}


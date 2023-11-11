package CodeWars_8Kyu;
import java.util.Scanner;

public class BinarioToDecimal {
    public static void main(String[]args){
        /*
        un proama donde el usuario inserta un numero binario y se lo 
        convertimos a decimal
        
        0110--->6
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables
        String binario;//lo introducimos como String para poder usar length
        int decimal=0;
        int longitud;//calculamos la longitud de nuestra entrada para contar hacia atras de forma correcta
        char numero;//comprueba si es 0 o 1
        int cuadrado;//eleva al cuadrado mis numeros
        
        //programa
        System.out.println("Introduce un número binario y te lo paso a decimal");
        binario=scanner.nextLine();
        longitud=binario.length();
        
        for(int i=longitud-1;i>=0;i--){//mira uno a uno de atras adelante todos los numeros
            numero=binario.charAt(i);
            if (numero=='1'){//si es 1 hacemos calculos
                cuadrado=(int)Math.pow(2, (longitud - 1 - i));
                decimal=decimal+cuadrado;
            }
        }
        System.out.println("Tu número en decimal es: "+decimal);
        
        

    }
}

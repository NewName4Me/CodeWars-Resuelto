package CodeWars_7Kyu;
import java.util.*;

public class AlternativeHappyYear {
    public static void main(String[] args) {
        
        /*
        que SeeUNextHappyYear.java
        exactamente el mismo planteamiento que el anterior, pero en lugar de ordenarlos, tengo un bucle
        que mira un numero, y otro dentro que mira todos los demas en relacion al anterior, y asi compruebo
        si alguna vez se repite algun numero

        https://www.codewars.com/kata/5ae7e3f068e6445bc8000046/train/java
        */
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaNum = new ArrayList<>();
        
        //variables
        int year=scanner.nextInt();
        boolean feliz;
        int yearSave;
        int check1;
        int check2;

        //programa
        do {
            feliz = true;  

            yearSave=year;
            listaNum.clear();//limpiamos nuestro año

            while (yearSave>0) {//dividimos nuestro año en todos sus numeros
                int digit=yearSave%10;
                listaNum.add(digit);
                yearSave=yearSave/10;
            }

            for (int i=0;i<listaNum.size()-1;i++) {//miramos todos los caracteres de nuestra lista
                
                check1=listaNum.get(i);
                
                for (int j=i+1;j<listaNum.size();j++) {//de nuevo miramos todos salvo donde se encuentras check1
                    check2 =listaNum.get(j);
                    
                    if (check1==check2) {//si son iguales algun numero no es faliz, salimos y el año aumenta
                        feliz=false;
                        year++;
                        break;
                    }
                }
                if (!feliz) {//si es año es feliz salimos
                    break;
                }
            }
        } while (!feliz);

        
        //salida
        System.out.println(year);
    }
}

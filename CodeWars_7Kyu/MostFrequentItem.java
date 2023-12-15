package CodeWars_7Kyu;

public class MostFrequentItem {
    public static void main(String[]args){
        /*
        Dado un array de números indicar cual se repita más veces 
        para ello lo primero que voy a hacer es ordenarlos de mayor a menos
        luego como los repetidos estarán juntos compruebo cuando cambio de número
        mientras no cambia le sumo números a un contador
        
        https://www.codewars.com/kata/56582133c932d8239900002e/solutions/java
        */
        
        //variables
        int[]collection={};//insertar aqui el array a analizar
        int[]result=most_frequent(collection);
        
        //programa
        
        
        //salida
        if(collection.length!=0){
            System.out.println("El elemento que más se repite es "+result[0]+" que se repite "+result[1]+ " veces");

        }
        else{
            System.out.println(result[0]);
        }
    }
    public static int[] most_frequent(int [] collection){
        
        //excepciones    
        if(collection.length==0){//si el array esta vacio devolvemos 0
            return new int[]{0};
        }
        
        //variables
        int cont=0;//cuenta el numero de veces que se repite un elemento
        int contSave=cont;
        int mostFrequent=collection[0];//le asignamos el primer numero de nuestra lista como mas grande por ahora
   
        //programa
        for(int i=0;i<collection.length;i++){ //recorremos todo nuestro array uno a uno
            for(int j=0;j<collection.length;j++){//lo recorremos de nuevo para que compare todos los numeros con el anterior
                if(collection[i]==collection[j]){
                    cont++;
                }
            }
            
            if(contSave<cont){//comparamos si el nuevo elemento se repite mas veces que el anterior
                mostFrequent=collection[i];//si es asi le asignamos el mas grande a nuestra variable resultante
                contSave=cont;
            }
            
            cont=0;//ponemos nuestro contador de repeticiones a 0
        }
        
        //salida
        int[]result={mostFrequent,contSave};
        return result;
    }
}

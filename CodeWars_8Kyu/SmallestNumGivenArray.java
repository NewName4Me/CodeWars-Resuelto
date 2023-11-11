package CodeWars_8Kyu;

public class SmallestNumGivenArray {
    public static void main(String[]args){
        /*
        encontrar el numero más pequeño de forma interesante
        
        es mucho más rapido usando collections
        lo ordenas de menor a mayor y haces un:
        System.out.println(num[0]);
        */
        
        //variables
        int[] num={5,3,9,8,7};
        
        //programa
        int smallestNum=findSmallestNum(num);
        
        System.out.println("The smallest is "+smallestNum);

    }
    public static int findSmallestNum(int[]args){
        
        
        if (args.length==0){//en caso de que nuesta matriz no tenga numeros pues nos da cero
            return 0;
        }   
        
        int smallest=args[0];//inicializamos la variable en 0, el mas pequeño posible 
        
        for (int i=1;i<args.length;i++){//comprueba siempre que el mas pequeño sea el que tengamos actualmetne
            if (args[i]<smallest){
                smallest=args[i];
            }
        }
        return smallest;
    }
}

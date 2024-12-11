import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[]vector=new int[10];
        int n;
        Random aleatorio=new Random();
        System.out.print("El array es: ");
        for (int i=0;i<vector.length;i++){
            vector[i]= aleatorio.nextInt(0,10);
            System.out.print(vector[i]+" ");
        }
        n=vector[0];
        vector[0]=vector[vector.length-1];
        vector[vector.length-1]=n;
        
        System.out.print("\nEl array modificado es: ");
        for (int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
    }
}

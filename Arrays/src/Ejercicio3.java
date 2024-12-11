import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Random random = new Random();

        System.out.println("El array numeros es:");
        for (int i=0;i< numeros.length;i++){
            numeros[i]= random.nextInt(10);
            System.out.print(numeros[i]+" ");
        }

        System.out.println("\nEl array numeros al reves es:");
        for (int i=14;i>=0;i--){
            System.out.print(numeros[i]+" ");
        }
    }
}
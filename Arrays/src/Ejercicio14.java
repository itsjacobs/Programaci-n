import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[] numeros= new int[10];
        int[] analizar= new int[10];
        int n=0;
        Random aleatorio = new Random();

        for (int i=0; i< numeros.length;i++) {
            numeros[i] = aleatorio.nextInt(1, 10);
        }

        System.out.print("Este es el array: ");
        for (int i=0; i< numeros.length;i++){
            System.out.print(numeros[i]+" ");
            boolean flag =true;
            for (int j=0;j< analizar.length;j++) {
                if (analizar[j] == numeros[i]) {
                    flag = false;
                }
            }
            if (flag) {
                analizar[n] = numeros[i];
                n++;
            }
        }

        for (int i=0;i<analizar.length;i++){
            int contador =0;
            for (int j=0;j<numeros.length;j++){
                if (analizar[i] == numeros[j]) {
                    contador++;
                }
            }
            if (analizar[i]!=0){
                System.out.print("\nEl numero "+analizar[i]+" aparece "+contador+" veces");
            }
        }
    }
}

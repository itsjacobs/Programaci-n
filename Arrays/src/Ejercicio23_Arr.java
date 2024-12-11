import java.util.Random;

class Ejercicio23_Arr {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        int menor =0;
        int aux=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(30);

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        menor = arr[0];
        for (int i = 0; i < arr.length; i++) {
            menor = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < menor) {
                    menor = arr[j];
                    aux=arr[j];
                    arr[j] = arr[i];
                    arr[i] = aux;

                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

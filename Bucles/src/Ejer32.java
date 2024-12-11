//Hacer un programa que pida números hasta que la suma de los divisibles por 6 y 3 supere 30.

import java.util.Scanner;

public class Ejer32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        while (suma < 30){
            System.out.println("Introduce un número");
            int num = sc.nextInt();
            if (num % 6 == 0 && num % 3 == 0){
                suma += num;
            }
        }
        System.out.println("La suma de los números divisibles entre 6 y 3 es: " + suma);
    }
}

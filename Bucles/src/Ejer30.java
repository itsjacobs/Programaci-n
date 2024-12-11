//Hacer un programa que pida números hasta que la suma de estos supere 50.

import java.util.Scanner;

public class Ejer30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        while (suma < 50) {
            System.out.println("Introduce numeros y te los sumo hasta que superen los 50");
            int num = sc.nextInt();
            suma += num;
        }
        System.out.println("La suma de los numeros es: " + suma);
    }
}

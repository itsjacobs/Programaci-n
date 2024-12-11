import java.util.Scanner;

public class Ejer2 {
	/*
	 * 2. Hacer un programa en el que dado el siguiente array de nombre origen:
	 * 
	 * 1. Lo recorre metiendo en un segundo array de nombre destino todos aquellos
	 * elementos que sean pares y mayores de 25 2. Muestre en pantalla el contenido
	 * de los dos arrays unidimensionales
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int origen[] = { 10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32 };
		int contador = 0;
		for (int i = 0; i < origen.length; i++) {
			if (origen[i] > 25 && origen[i] % 2 == 0) {
				contador++;
			}
		}
		int destino[] = new int[contador];
		for (int i = 0, j = 0; i < origen.length; i++) {
			if (origen[i] > 25 && origen[i] % 2 == 0) {
				destino[j] = origen[i];
				j++;
			}
		}
		for (int i = 0; i<destino.length; i++) {
			System.out.println("valor" + destino[i]);
		}
		sc.close();
	}
}

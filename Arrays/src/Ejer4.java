
public class Ejer4 {
	/*
	 * 4. Hacer un programa que: 1. Cree un array bidimensional de 10x10 2.
	 * Inicialice la matriz de forma que las filas pares se rellenen a uno y las
	 * impares a cero 3. Una vez inicializada la matriz, muestre su contenido en
	 * pantalla
	 */
	public static void main(String[] args) {
		int diez[][] = new int[10][10];
		for (int filas = 0; filas < diez.length; filas++) {
			for (int columna = 0; columna < diez.length; columna++) {
				if (filas % 2 == 0) {
					diez[filas][columna] = 1;
				}
			}
		}
			for (int filas = 0; filas < diez.length; filas++) {
				for (int columna = 0; columna < diez.length; columna++) {
					System.out.print(diez[filas][columna] + " ");
				}
				System.out.println();
		}
	}
	}


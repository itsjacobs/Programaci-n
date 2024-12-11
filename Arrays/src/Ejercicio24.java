import java.util.Random;

public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 24. Diseñar y codificar el algoritmo de ordenación de la burbuja
		// empezando a recorrer el array desde la derecha.

		// Declaro los arrays, las variables y objetos que necesito
		// IMPORTANTE: No declaro una variable auxiliar, veremos como 
		// se intercambian los valores
		int a[] = new int[30];
		int b[] = new int[30];
		int a_original[] = new int[a.length];
		int j;
		Boolean cambios, ordenado;
		Random rnd;

		// Instancio un objeto Random() y genero los valores aleatoriamente
		// En principio los dos arrays tendrán los mismos valores, así podré
		// mostrar después el array generado y el ordenado después del proceso
		rnd = new Random();
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = rnd.nextInt(1, 500);
			b[i] = a[i];
			a_original[i] = a[i];
		}

		// ************************************************************
		// ORDENACION DE DERECHA A IZQUIERDA (Lo que pide el ejercicio)
		// ************************************************************

		// Comienzo a ordenar desde la derecha (límite superior)
		ordenado = false;
		cambios = false;
		j = a.length - 1;

		// Repito mientras no se produzca una ronda completa sin cambios, en
		// cuyo caso significa que todos los números estan ordenados
		// Alternativamente se podría hacer con un do-while y dentro un for
		// y nos ahorraríamos un boolean
		do {
			// Compruebo que no me salgo de rango en la comparación del array
			if (j > 0) {
				// Comparo valores
				if (a[j - 1] > a[j]) {

					// Intercambio los valores
					// Se usa para intercambiar las variables las
					// propiedades de XOR aplicado bit a bit
					// https://zhenstudio.fortunecity.ws/prg/optm002.htm
					//
					// La alternativa para hacerlo con una variable
					// intermedia sería la siguinte:
					// aux = a[j];
					// a[j] = a[j - 1];
					// a[j - 1] = aux;
					a[j] ^= a[j - 1];
					a[j - 1] ^= a[j];
					a[j] ^= a[j - 1];

					// Indico que ha habido cambios, habrá que hacer otra ronda
					cambios = true;
				}
			} else {
				// Si no ha habido cambios en la ronda está ordenado
				// sino, habrá que empezar otra vez
				if (!cambios)
					ordenado = true;
				else
					cambios = false;

				// Vuelvo a empezar otra ronda desde el límite superior (derecha)
				// En este caso inicializo a .lenght porque inmediatamente después hago un j--
				// si inicializase a .lenght-1, empezaría en .lenght-2
				j = a.length;
			}

			j--;
		} while (!ordenado);

		// *********************************
		// ORDENACION DE IZQUIERDA A DERECHA
		// *********************************

		// Comienzo a ordenar desde la izquerda (límite inferior)
		ordenado = false;
		cambios = false;
		j = 0;

		// Repito mientras no se produzca una ronda completa sin cambios, en
		// cuyo caso significa que todos los números estan ordenados
		// Alternativamente se podría hacer con un do-while y dentro un for
		// y nos ahorraríamos un boolean
		do {
			// Compruebo que no me salgo de rango en la comparación del array
			if (j < b.length - 1) {
				// Comparo valores
				if (b[j] > b[j + 1]) {

					// Intercambio los valores
					b[j] ^= b[j + 1];
					b[j + 1] ^= b[j];
					b[j] ^= b[j + 1];

					// Indico que ha habido cambios, habrá que hacer otra ronda
					cambios = true;
				}
			} else {
				// Si no ha habido cambios en la ronda está ordenado
				// sino, habrá que empezar otra vez
				if (!cambios)
					ordenado = true;
				else
					cambios = false;

				// Vuelvo a empezar otra ronda desde el límite inferior (izquierda)
				// En este caso inicializo a -1 porque inmediatamente después hago un j++
				// si inicializase a 0, empezaría en 1 y los arrays son base 0, tienen el
				// primer elemento en la posición 0
				j = -1;
			}

			j++;
		} while (!ordenado);

		// Muestro el array original
		System.out.println("Array original: ");
		for (int i = 0; i <= a_original.length - 1; i++)
			System.out.print(a_original[i] + "  ");

		// Muestro los arrays ordenados
		System.out.println("\n");
		System.out.println("Array ordenado DERECHA-IZQUIERDA: ");
		for (int i = 0; i <= a.length - 1; i++)
			System.out.print(a[i] + "  ");

		System.out.println("\n");
		System.out.println("Array ordenado IZQUIERDA-DERECHA: ");
		for (int i = 0; i <= b.length - 1; i++)
			System.out.print(b[i] + "  ");
	}
}

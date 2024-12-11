import java.util.Random;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  7. Hacer un programa que:
    			1. Cree un array unidimensional de 30 elementos de tipo numérico entero y nombre ”números”
    			2. Inicializar el array con valores +, - y nulos
    			3. Contabilizar el número de valores +,- y nulos
    			4. Mostrar en pantalla los resultados obtenidos
		 */
		int positivos = 0;
		int negativos = 0;
		int nulos = 0;
		int numeros[] = new int [30];
		Random random = new Random();
		for (int f = 0; f < numeros.length; f++) {
			numeros[f] = random.nextInt(-100, 100);
		}
		for (int p = 0; p < numeros.length; p++) {
			if(numeros[p] > 0) {
				positivos++;
			} else if (numeros[p] < 0) {
				negativos++;
			} else {
				nulos++;
			}
		}
		System.out.println("Los elementos del array: ");
		for (int p = 0; p < numeros.length; p++) {
			System.out.print(numeros[p] + " ");
		}
		System.out.print("\n");
		System.out.println("Numeros positivos: " + positivos + "\n" + "Numeros negativos: " + negativos + "\n" + "Numeros nulos: " + nulos);
	}

}

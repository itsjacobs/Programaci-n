
public class Ejer6 {
	/*
	 * 6. Hacer un programa que: 1. Cree un array bidimensional de 10x5 y nombre
	 * “datos” 2. Inicialice la matriz de forma que cada elemento guarde el número
	 * de fila a la que pertenece 3. Muestre el contenido del array en pantalla
	 */
	public static void main(String[] args) {
		int datos[][] = new int[10][5];
		for (int filas = 0; filas < datos.length; filas++) {
			for (int columna = 0; columna < datos[filas].length; columna++) {
				datos[filas][columna] = filas;
			}
		}
		for (int filas = 0; filas < datos.length; filas++) {
			for (int columna = 0; columna < datos[filas].length; columna++) {
				System.out.print(datos[filas][columna] + " ");
			}
			System.out.println();
		}
	}
}

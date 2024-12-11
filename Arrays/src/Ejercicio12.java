

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//12.	Hacer un programa que:
		//1.	Cree un array bidimiensional de 5x15 elementos de tipo entero y nombre “marco”
		//2.	Cargar el array con valores 0 y 1 de la siguiente forma
		//		      11111111111111111
		//		      1               1	  
		//		      1               1
		//		      1               1
		//		      1               1
		//		      11111111111111111
		
		// Declaro el array bidimensional que me piden
		int marco[][] = new int[5][15];

		// Para recorrerlo entero necesito dos bucles anidados
		// uno por cada dimensión
		for (int i = 0; i <= marco.length - 1; i++)
			for (int j = 0; j <= marco[i].length - 1; j++) 
				//Si estoy en la primera columna, la última o
				//en al primera fila o en la última,
				//relleno con un 1, sino, con un cero
				if ((j == 0) || (j == marco[i].length-1) || (i == 0) || (i == marco.length-1) )
					marco[i][j] = 1;
				
		// Muestro el resultado
		for (int i = 0; i <= marco.length - 1; i++) {
			for (int j = 0; j <= marco[i].length - 1; j++)
				System.out.print(marco[i][j] + " ");
			System.out.println();
		}
		
		System.out.println("-.---------------------------------------");
		char marco1[][] = new char[5][15];

		// Para recorrerlo entero necesito dos bucles anidados
		// uno por cada dimensión
		for (int i = 0; i <= marco1.length - 1; i++)
			for (int j = 0; j <= marco1[i].length - 1; j++) 
				//Si estoy en la primera columna, la última o
				//en al primera fila o en la última,
				//relleno con un 1, sino, con un cero
				if ((j == 0) || (j == marco1[i].length-1) || (i == 0) || (i == marco1.length-1) )
					marco1[i][j] = '1';
				
		// Muestro el resultado
		for (int i = 0; i <= marco1.length - 1; i++) {
			for (int j = 0; j <= marco1[i].length - 1; j++)
				System.out.print(marco1[i][j] + " ");
			System.out.println();
		}
	}
}

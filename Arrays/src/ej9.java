import java.util.Random;

public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hacer un programa que sume los números que hay 
		 * en las posiciones pares de una lista de diez elementos.
		 */
		int numeros [] = new int [10]; 
		Random random = new Random (); 
		int suma, suma2;
		suma = 0;
		suma2= 0;
		//asignacion 
		for (int i = 0; i < numeros.length; i++) {
			numeros [i] = random.nextInt(0,80);
			if ((i+1)%2 == 0) {
				suma = suma + numeros[i];
			}
			else {
				suma2 = suma2 + numeros[i];
			}
		}
		//impresion 
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+ " ");
		}
		System.out.println();
		System.out.println("La suma de los numeros que ocupan una posicion par es: " +suma +" y de los impares: " +suma2);
	}

}

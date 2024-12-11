import java.util.Random;

public class Ej08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8. Hacer un programa que:
			// 1. Lea una secuencia de 20 valores numéricos reales y los almacene en un
			// array de nombre “números”
			// 2. Muestra en pantalla cuál es el valor máximo, así como la posición que
			// ocupa en el array. En el caso de aparecer repetido mostrará sólo el de menor índice

		double numeros[] = new double[20];
		Random random = new Random();
		double max = 0, pos = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextDouble(101);
			
			System.out.print(numeros[i] +" ");
			
			if (numeros[i]  > max) {
				max = numeros[i] ;
				pos = i;
			}
		}

		System.out.println("\nValor máximo: "+max);
		System.out.println("Posición: "+pos);
	}

}

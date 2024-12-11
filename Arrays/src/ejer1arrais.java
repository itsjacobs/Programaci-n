import java.util.Random;
import java.util.Scanner;

public class ejer1arrais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int vector[] = new int[15];


		Random random = new Random();
		int aleato = random.nextInt();
		for (int i = 0; i < vector.length; i++) {
			vector[i]= random.nextInt(0,100);
		}


		for(int elem=0; elem < vector.length; elem++) {
			System.out.println("Elemento "+ (elem+1)+ ": "+vector[elem]);
		}

		System.out.print("Introduce el número de elementos que quieres sumar: ");
		/*int n;
		do {
			n = leer.nextInt();
			if (n <= 0 || n > vector.length) {
				System.out.println("Numero invalido. Debe estar entre 1 y 15");
			} 
		}while((n <= 0 || n > vector.length));*/
		int n = leer.nextInt();
		while((n <= 0 || n > vector.length)) {
			System.out.println("Numero invalido. Debe estar entre 1 y 15");
			n = leer.nextInt();
		}
		
		
		int suma = 0;
		for (int i = 0; i < n; i++) {
			suma += vector[i];
		}
		System.out.println("La suma de los primeros " +n+ " elementos es: " + suma);
	}
}


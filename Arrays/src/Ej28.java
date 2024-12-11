import java.util.Random;
import java.util.Scanner;

public class Ej28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tabla = new int[20][15];
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		int suma=0;
		for (int gallinas = 0; gallinas < tabla.length; gallinas++) {
			for (int dias = 0; dias < tabla[0].length; dias++) {
			tabla[gallinas][dias] = random.nextInt(0,100);
			}
		}
		for (int gallinas = 0; gallinas < tabla.length; gallinas++) {
			for (int dias = 0; dias < tabla[0].length; dias++) {
			 System.out.print(tabla[gallinas][dias]+" ");
			}
			System.out.println();
		}
		
		
		for (int gallinas = 0; gallinas < tabla.length; gallinas++) {
			suma=0;
			for (int dias = 0; dias < tabla[gallinas].length; dias++) {
				suma+=tabla[gallinas][dias];
				
			}
			System.out.println("La media de huevo al dia es: " + suma / tabla.length);
		}
		System.out.println("La media huevos por gallina: "+ suma/15);
		System.out.println("La media huevos por dia: "+suma/20+"\n");
		
	for (int gallinas = 0; gallinas < tabla.length; gallinas++) {
		for (int dias = 0; dias < tabla[dias].length; dias++) {
			if (tabla[gallinas][dias]<3) {
				 int a=gallinas+1;
				 int b=dias+1;
				 
				System.out.println("la gallina el la posicion "+a+" del dia "+b);
		}
	}	

				
				
			
		}
	}}


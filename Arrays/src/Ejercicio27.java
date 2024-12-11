import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio27 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 27. El inventario de un almacén de 30 artículos deportivos se desea guardar
		// los siguientes datos: código del artículo y precio del mismo.
		// Programa que realice lo siguiente en forma de menú:
		//     A. Imprimir todos los códigos de los artículos con su precio correspondiente:
		//     B. Buscar un artículo por código y decir su precio.
		//     C. Listar todos los códigos de las prendas más caras.
		//     D. Listar todos los códigos de las prendas más baratas.
		//     E. Ordenar las listas por código
		//     F. Borrar algún elemento por su código. Hay que hacer distinción entre si
		//        está ordenado por código o no lo está.
		//     G. Calcula las ganancias obtenidas sabiendo que se han vendido tantos
		//        productos como la posición que ocupan por el código del elemento de la
		//        posición contigua.

		// Se implementará con 2 arrays, uno de códigos y otro de precios
	
		// Declaro los arrays, las variables y objetos que necesito
		int articulos_codigos[] = new int[30];
		double articulos_precios[] = new double[30];
		char opcion;
		int id, index;
		double corte;
		double ganancias;
		Random rnd;
		Scanner lector;

		// Instancio un objeto Scanner que usaré para múltiples cosas
		lector = new Scanner(System.in);

		// Instancio un objeto random que usaré para generar códigos de
		// artículo y precios aleatoriamente
		rnd = new Random();

		// --------------------------------------------
		// GENERO LOS CODIGOS ALEATORIOS (NO REPETIDOS)
		// --------------------------------------------
		
		// Monto un array de tamaño 5 veces superior al número de productos
		// a los que quiero asignar código. Así evito colisiones en la generación
		// de números aleatorios y evito gastar mucha CPU y tiempo en la generación
		// de números aleatorios no repetidos.
		// Lo inicializo para asegurarme de que todos los valores son 0
		// a pesar de que Java se supone que lo inicializa a ese valor
		int valores[] = new int[articulos_codigos.length * 5];
		for (int i = 0; i <= valores.length - 1; i++)
			valores[i] = 0;

		// Ahora sí, relleno el array de códigos con valores aleatorios
		// el número generado será la posición dentro de ese array
		// que marcaré para controlar que no esté repetido
		int valor_generado;
		for (int i = 0; i <= articulos_codigos.length - 1; i++) {
			valor_generado = rnd.nextInt(0, (articulos_codigos.length * 5) - 1);
			// Compruebo que no esté repetido y si es así
			// marco la posición del array
			if (valores[valor_generado] == 0)
				valores[valor_generado] = 1;
			else
				// Si estaba repetido el valor, actúo sobre el índice para
				// garantizar que genero la cantidad de valores deseada
				i--;
		}

		// Asigno los valores generados a los códigos de producto
		// recorriendo el array de códigos generados
		// Para que no quede ordenado por código ascendentemente
		// comienzo a seleccionar códigos a partir de una posición
		// aleatoria del array
		int inicio = rnd.nextInt(0, valores.length - 1);
		for (int i = inicio, j = 0; i <= valores.length + inicio - 1; i++) {
			if (valores[i % valores.length] == 1) {
				articulos_codigos[j] = (i % valores.length) + 1;
				j++;
			}
		}

/*		// Este código cogería los códigos desde el principio y 
        // el array quedaría ordenado por código, no tendría sentido
		// la opción E
		for (int i = 0, j = 0; i <= valores.length - 1; i++) {
			if (valores[i] == 1) {
				articulos_codigos[j] = i + 1;
				j++;
			}
		}
*/
		
		// ------------------ 
		// GENERO LOS PRECIOS
		// ------------------
		for (int i = 0; i <= articulos_precios.length - 1; i++)
			articulos_precios[i] = rnd.nextDouble(5, 250);

		
		// ---------------------------------------------
		// COMIENZO CON EL MENU Y LA GESTION DE OPCIONES
		// ---------------------------------------------

		// Repito mientras no se pulse la opción s ó S
		// Se admitirán mayúsculas y minúsculas
		do {
			System.out.println("INVENTARIO DE ALMACEN");
			System.out.println();
			System.out.println("A. Imprimir todos los códigos de los artículos con su precio correspondiente.");
			System.out.println("B. Buscar un artículo por código y decir su precio.");
			System.out.println("C. Listar todos los códigos de las prendas más caras.");
			System.out.println("D. Listar todos los códigos de las prendas más baratas.");
			System.out.println("E. Ordenar las listas por código.");
			System.out.println("F. Borrar algún elemento por su código. Hay que hacer distinción entre si está ordenado por código o no lo está.");
			System.out.println("G. Calcula las ganancias obtenidas sabiendo que se han vendido tantos productos como la posición que ocupan por el código del elemento de la posición contigua.");
			System.out.println();
			System.out.println("S. Salir");
			System.out.println();
			System.out.print("Seleccione una opción y pulse ENTER: ");

			// Leo la opción por teclado
			opcion = (char) System.in.read();

			// --------------------
			// SELECTOR DE OPCIONES
			// --------------------
			switch (opcion) {
				case 'A':
				case 'a':
					// Muestro todos los elementos con su precio
					// Los que tienen 0 en el código es que han sido eliminados
					// y no los proceso
					for (int i = 0; i <= articulos_codigos.length - 1; i++)
						if (articulos_codigos[i] > 0)
							System.out.printf("Artículo con código %02d -> %.2f €\n",
									          articulos_codigos[i], articulos_precios[i]);
					break;
	
				case 'B':
				case 'b':
					// Solicito el códido del artículo con el que quiero trabajar
					System.out.print("Introduzca el código del artículo y pulse ENTER: ");
					id = lector.nextInt();
	
					// Busco el código de artículo y localizo su posición en el array
					index = 0;
					for (int i = 0; (i <= articulos_codigos.length - 1) && (index == 0); i++)
						if (articulos_codigos[i] == id)
							index = i;
	
					// Muestro la información que proceda según el resultado de la búsqueda,
					// si encontré o no el elemento
					if (index > 0)
						System.out.printf("El artículo con código %d tiene un precio de %.2f €",
								          articulos_codigos[index], articulos_precios[index]);
					else
						System.out.println("El código del artículo no existe");
					break;
	
				case 'C':
				case 'c':
					// Solicito el corte de precio
					System.out.print("Introduzca el importe de corte y pulse ENTER: ");
					corte = lector.nextDouble();
	
					// Proceso el array y muestro la información
					for (int i = 0; i <= articulos_precios.length - 1; i++)
						// Solo proceso los artículos no borrados
						if (articulos_codigos[i] > 0)
							// Solo proceso los artículos que están por encima del corte
							if (articulos_precios[i] >= corte)
								System.out.printf("El código %02d cumple el criterio de corte. Su precio es de %.2f €\n",
										           articulos_codigos[i], articulos_precios[i]);
					break;
	
				case 'D':
				case 'd':
					// Solicito el corte de precio
					System.out.print("Introduzca el importe de corte y pulse ENTER: ");
					corte = lector.nextDouble();
					
					// Proceso el array y muestro la información
					for (int i = 0; i <= articulos_precios.length - 1; i++)
						// Solo proceso los artículos no borrados
						if (articulos_codigos[i] > 0)
							// Solo proceso los artículos que están por debajo del corte
							if (articulos_precios[i] <= corte)
								System.out.printf("El código %02d cumple el criterio de corte. Su precio es de %.2f €\n",
										          articulos_codigos[i], articulos_precios[i]);
					break;
	
				case 'E':
				case 'e':
					// Realizo la ordenación con el algoritmo de la burbuja
					// No hago comentarios en el código sobre este algoritno
					// porque en el ejercicio 24 está explicado todo con detalle.
					// Ordeno todos, incluidos los eliminados que quedarán en un
					// lado del array
					boolean ordenado = false;
					boolean cambios = false;
					int j = 0;
					double auxd;
	
					do {
						if (j < articulos_codigos.length - 1) {
							if (articulos_codigos[j] > articulos_codigos[j + 1]) {
	
								// Intercambio el código con XOR sin variable
								// anterior
								articulos_codigos[j] ^= articulos_codigos[j + 1];
								articulos_codigos[j + 1] ^= articulos_codigos[j];
								articulos_codigos[j] ^= articulos_codigos[j + 1];
	
								// Intercambio el precio con variable auxiliar
								auxd = articulos_precios[j];
								articulos_precios[j] = articulos_precios[j + 1];
								articulos_precios[j + 1] = auxd;
								cambios = true;
							}
						} else {
							if (!cambios)
								ordenado = true;
							else
								cambios = false;
							j = -1;
						}
	
						j++;
					} while (!ordenado);
	
					System.out.print("Array ordenado por código.");
					break;
	
				case 'F':
				case 'f':
					// Solicito el código a borrar
					System.out.print("Introduzca el código a borrar y pulse ENTER: ");
					id = lector.nextInt();
	
					// Uso una variable para almacenar el índice del elemento.
					// No lo necesito porque no haré anda con el índice después,
					// pero así reutilizo la varibale como flag y no tengo que 
					// declarar una nuevpara saber luego si se ha encontrado el elemento
					index = -1;
	
					// Proceso el array y muestro la información
					for (int i = 0; (i <= articulos_codigos.length - 1) && (index == -1); i++)
						// Solo proceso los artículos no borrados
						if (articulos_codigos[i] > 0)
							// Si coincide el código, lo marco como eliminado y
							// guardo el índice
							if (articulos_codigos[i] == id) {
								articulos_codigos[i] = 0;
								index = i;
							};
	
					// Informo del resultado si encontré o no el elemento
					if (index != -1)
						System.out.println("Se encontró el elemento y se eliminó");
					else
						System.out.println("No se encontró el elemento indicado");
					break;
	
				case 'G':
				case 'g':
					// Por defecto la ganancia es 0
					ganancias = 0;
	
					// Recorro el array y voy realizando los cálculos que se piden
					for (int i = 0; i <= articulos_codigos.length - 1; i++)
						// Solo proceso los artículos no borrados
						if (articulos_codigos[i] > 0)
							// Utilizo aritmética modular para obtener el factor
							// posición i+1 del array, así la posición
							// correspondiente a articulos_precios.length + 1 será 0
							// y no necesito comprobar los límites en cada vuelta del bucle
							ganancias = ganancias + articulos_precios[i] * (i % (articulos_codigos.length));
	
					// Informo del datos de ganancias
					System.out.printf("Las ganancias son %.2f €\n", ganancias);
	
				case 'S':
				case 's':
					// Si se pulsa la S no hago nada, ya que la condición del bucle me sacará del
					// programa pero tengo que contemplarlo para que no se vaya por el "default"
					break;
	
				default:
					System.out.print("Opción incorrecta");
			}

			// Sólo muestro este mensaje si no salgo
			if (!(opcion == 'S' || opcion == 's')) {
				// Limpio el buffer y espero a la pulsación de tecla.
				// Si no limpio antes, no funciona
				lector.nextLine();
				System.out.println();
				System.out.println("Pulse ENTER para continuar...");
				lector.nextLine();
			}

		} while (!(opcion == 'S' || opcion == 's'));

		System.out.println("Gracias por usar este programa");
	}
}

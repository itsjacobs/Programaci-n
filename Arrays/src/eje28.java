import java.util.Random;
import java.util.Scanner;

public class eje28 {
    public static void main(String[] args) {
        /*
            28. Queremos almacenar el número de huevos que han puesto 20 gallinas a lo largo de 15 días. Queremos saber:
        A. Media de huevos al día.
        B. Media de huevos por gallina.
        C. Si existe alguna gallina que no nos interesa tener, no es rentable mantener una gallina que no
        ponga más de tres huevos al día.
        D. Qué gallina ha puesto más huevos el día que introduzcamos por teclado.
         */
        int gallinas[][] = new int[20][15];
        Random random = new Random();
        int suma = 0;
        int media = 0;
        int total = 0;
        int a = 0;
        int b = 0;
        System.out.print("Introduce un día para saber que gallina puso más huevos: ");
        Scanner lectorScanner = new Scanner((System.in));
        int dia = lectorScanner.nextInt();

        // Asignacion
        for (int i = 0; i < gallinas.length; i++) {
            for (int j = 0; j < gallinas[i].length; j++) {
                gallinas [i][j] = random.nextInt(0,7);
                System.out.print(gallinas[i][j] + " ");
            }
            System.out.println();
        }

        // operaciones

        for (int i = 0; i < gallinas.length; i++) {
            suma=0;
            for (int j = 0; j < gallinas[i].length; j++) {
                // medias
                suma = suma + gallinas[i][j];
                //condicion huevos
                if (gallinas[i][j] < 3) {
                    a = i+1;
                    b = j+1;
                    System.out.println(gallinas[i][j] + " "+"La gallina que se encuentra en la fila " +a + " y la columna " + b +" no son rentables por producir menos de 3 huevos al día");
                }


            }

        // la que mas huevos ha puesto
            int mayor=-1;
            int pos=0;
            for (i = 0; i < gallinas.length; i++) { // se hace una bidimensional que en vez de i j con i dia
                if (gallinas[i][dia-1]> mayor) { // se toma el valor de dia -1 para hacer el recorrido, pero no se necesita el valor de J ya que pregunta
                        mayor = gallinas [i+1][dia-1]; // por una fila en concreto que es el dia. Si pidiera que gallina es la mas ponedora se usaria la j en vez de la i
                        pos = i;

                    }

                }
                System.out.println("La gallina que más huevos pone ocupa la posicion "+pos+"\n");

            }


        // impresion
            System.out.println();
            System.out.println("La media de huevos al dia es " +suma/15);
            System.out.println();
            System.out.println("La media de huevos por gallina es " +suma/20);
        }
    }


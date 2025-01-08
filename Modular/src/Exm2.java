import java.util.Scanner;

public class Exm2 {
    public static void main(String[] args) {

        System.out.println("Pirámide a medida");

        int N;
        Scanner lector = new Scanner(System.in);

        System.out.println("Indique tamaño de la pirámide");
        N = lector.nextInt();

        for (int fila=1;fila<=N;fila++){
            int contador=1;

            for (int columna=0; columna<fila;columna++,contador++){
                if (contador==1){
                    System.out.print("*");
                } else if (contador==2) {
                    System.out.print("+");
                    }
                        else if (contador==3){
                        System.out.print("-");
                        }
                if (contador==3){
                    contador=0;
                }
            }

            System.out.println();
        }
    }
}

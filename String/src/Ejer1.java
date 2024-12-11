import java.util.Scanner;

public class Ejer1 {
    /*Hacer un menú que permita al usuario conocer el uso de 10 métodos de la clase String.
    El programa debe dar la opción 11 para poder salir del mismo.*/
    public static void main(String[] args) {
        boolean  j = false;
        String todo = "hola nombre";
        String todo2 = "holapp";
        Scanner sc = new Scanner(System.in);
        while (j == false) {
            System.out.println("Opcion 1: cadena.charAt\n" +
                    "\n" +
                    "        Opcion 2: cadena.length()\n" +
                    "\n" +
                    "       Opcion 3: cadena.concat\n" +
                    "\n" +
                    "       Opcion 4: cadena.indexOf\n" +
                    "\n" +
                    "        Opcion 5: cadena.substring\n" +
                    "\n" +
                    "        Opcion 6: .compareTo\n" +
                    "\n" +
                    "        Opcion 7: toUpperCase\n" +
                    "\n" +
                    "        Opcion 8: .split\n" +
                    "\n" +
                    "       Opcion 9: salir");
                    int num = sc.nextInt();
                    switch (num) {
                        case 1:
                            System.out.println(todo.charAt(0));
                            System.out.println("Imprime el caracter que le pidas de la palabra del string en este caso la posicion 0 de Hola");
                            break;
                        case 2:
                            System.out.println(todo.length());
                            System.out.println("Te dice la longitud de la palabra");
                            break;
                        case 3:
                            System.out.println(todo = todo.concat(", que tal?"));
                            System.out.println("Une un string con otro texto que pongas");
                            break;
                        case 4:
                            System.out.println(todo.indexOf(1));
                            break;
                        case 5:
                            System.out.println(todo.substring(3));
                            break;
                        case 6:
                            System.out.println(todo.compareTo(todo2));
                            System.out.println("Compara 2 strings");
                            break;
                        case 7:
                            System.out.println(todo.toUpperCase());
                            System.out.println("Te imprime el string en mayusculas");
                            break;
                        case 8:
                            String [] trozos = todo.split(" ");
                            System.out.println(trozos.length);
                            System.out.println("divide una variable y la metemos en una array");
                            break;
                        case 9:
                            j = true;
                            System.out.println("Saliendo");
                            break;
                    }
        }
    }
}

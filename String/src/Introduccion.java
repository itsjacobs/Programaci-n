import java.util.Scanner;

public class Introduccion {
    public static void main(String[] args) {
        String cadena = "hola";
        String cadena2 = new String();
        Scanner sc = new Scanner(System.in);

        System.out.println(cadena);

        // cadena.charAt  ----> que caracter hay la posición de entrada

        // cadena.length() ----> para la longitud del String

        // cadena.concat  ----> unir Strings

        // cadena.indexOf  ----> te busca un caracter desde un punto a otro

        // cadena.substring ----> coge parte de un String

        // nextLine ----> pasamos de linea y preguntamos

        // .equals ----> para comprobar si son iguales o distintos los Strings

        // .compareTo ----> 0 si son iguales, distacia ASCII de los caracteres distintos, la diferencia del length si son diferentes.

        // toUpperCase ----> para poner en mayus

        // toLowerCase ----> para poner en minus

        // .split ----> para dividir un String

        //

        System.out.println("Introduzca el usuario");
        String usuario = sc.nextLine();
        System.out.println("Introduzca la contraseña");
        String contrasena = sc.nextLine();
        String usuario2 = "caserio";
        System.out.println(usuario2.toUpperCase());
        System.out.println(usuario2.replace('a','e'));
        if (usuario.equals(contrasena)) { // equalsIgnoreCase para obviar las mayus y minus
            System.out.println("El usuario es correcto");
            System.out.println(usuario.compareTo(usuario2));
        }
        cadena = cadena.concat(",que tal?"); // esto es == cadena += ", que tal??"
        System.out.println(cadena);
        System.out.println("introduce la frase");
        String frase = sc.nextLine();
        String [] trozos = frase.split(" ");
        System.out.println(trozos.length);
    }
}

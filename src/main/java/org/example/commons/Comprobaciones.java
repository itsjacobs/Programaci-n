package org.example.commons;

public class Comprobaciones {
    public static void comprobarPalabra(String palabra) throws ExcepcionCaracterEspecial {
        palabra = palabra.toUpperCase();
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i)<65 || palabra.charAt(i)>90) {
                throw new ExcepcionCaracterEspecial("La palabra " + palabra + " contiene caracteres no validos, como por ejemplo: " + palabra.charAt(i));
            }
        }
    }
}

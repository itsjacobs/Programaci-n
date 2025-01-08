package POO1;

import java.util.Scanner;

public class Practica5a {
    public static void main(String[] args) {
        Punto p1 = new Punto(5,7);
        Punto p2 = new Punto(3,5);


        System.out.println("La distancia entre los 2 puntos es " + p1.calcularDistanciaDesde(p2));
        System.out.println("----------");

        Circulo c1 = new Circulo(2,5,10);
        System.out.println("El area del circulo es: " + c1.calcularArea());
        System.out.println("El perimetro del circulo es: " + c1.calcularPerimetro());
        System.out.println("La distancia entre el p1 y c1 es: " + c1.calcularDistanciaDesde(p1));
        System.out.println("-----------");

        Triangulo t1 = new Triangulo(2,4,8,12,16,20);
        Punto p3 = new Punto(5,7);
        System.out.println("El area del triangulo es: " + t1.calcularArea());
        System.out.println("El perimetro del triangulo es: " + t1.calcularPerimetro());
        System.out.println("La distancia entre el t1 y p3 es: " + t1.calcularDistanciaDesde(p3));
    }
}

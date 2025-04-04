package org.example.ui;

import org.example.commons.Constantes;
import org.example.service.GestionElementos;
import org.example.service.GestionElementosImplementacion;

import java.util.Scanner;

//Excepcion no hay palabras de esta categoría y que pare si exc HayCaracterEspecial
//empezar con juego (linea 14)
//entrada salida

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EntradaSalida es = new EntradaSalida();
        System.out.println(Constantes.BIENVENIDA);
        GestionElementos ge = new GestionElementosImplementacion();
        es.mostrarListaElementos(ge);
        es.listaVacia();
        ge.insertarElemento(es.insertarElemento());
        es.mostrarListaElementos(ge);
        es.listar();
        es.palabraAdivinar();
        ge.eliminarElemento(sc.nextLine());
        ge.escribirFichero();
        es.mostrarListaElementos(ge);

    }
}
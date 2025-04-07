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

        System.out.println(Constantes.BIENVENIDA);
        GestionElementos ge = new GestionElementosImplementacion();
        EntradaSalida es = new EntradaSalida(ge);
        int opc = sc.nextInt();
        switch (opc){
            case 1:
                es.listaVacia();
                break;
            case 2:
                es.mostrarListaElementos(ge);
                break;
            case 3:
                es.listar();
                break;
            case 4:
                es.getListaElementosPalabra();
                break;
            case 5:
                es.getListaElementosId();
                break;
            case 6:
                ge.insertarElemento(es.insertarElemento());
                break;
            case 7:

                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                es.eliminarElemento();
                break;
        }
        System.out.println(ge.getListaElementos());
        System.out.println(es.palabraAdivinar());
        es.mostrarListaElementos(ge);
        es.eliminarElemento();
        es.mostrarListaElementos(ge);
        es.listaVacia();
        System.out.println();
        ge.insertarElemento(es.insertarElemento());
        es.mostrarListaElementos(ge);
        es.listar();
        es.palabraAdivinar();
        ge.escribirFichero();
        es.mostrarListaElementos(ge);

    }
}
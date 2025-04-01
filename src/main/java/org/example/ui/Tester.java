package org.example.ui;

import org.example.commons.Constantes;
import org.example.service.GestionElementos;
import org.example.service.GestionElementosImplementacion;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Constantes.BIENVENIDA);
        GestionElementos ge = new GestionElementosImplementacion();
        EntradaSalida.mostrarListaElementos(ge);
        System.out.println(ge.isEmptyElementosList());
       // ge.insertarElemento(EntradaSalida.insertarElemento());
        EntradaSalida.mostrarListaElementos(ge);
        System.out.println("asdddddddddddddddddddddddddddddddddddd");
        ge.listar("Zodiaco");
        System.out.println(ge.getListaElementosCategoria("Zodiaco"));
        System.out.println(ge.getPalabraAdivinar("Zodiaco"));
        System.out.println(ge.eliminarElemento(sc.nextLine()));
    }
}


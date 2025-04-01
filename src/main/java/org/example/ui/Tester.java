package org.example.ui;

import org.example.commons.Constantes;
import org.example.service.GestionElementos;
import org.example.service.GestionElementosImplementacion;

import java.util.Scanner;

//Excepcion no hay palabras de esta categoría y que pare si exc HayCaracterEspecial
//añadir elementos en todas las categorias
//eliminar elemento
//empezar con juego

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Constantes.BIENVENIDA);
        GestionElementos ge = new GestionElementosImplementacion();
        EntradaSalida.mostrarListaElementos(ge);
        System.out.println(ge.isEmptyElementosList());
        ge.insertarElemento(EntradaSalida.insertarElemento());
        EntradaSalida.mostrarListaElementos(ge);
        ge.listar("Zodiaco");
        System.out.println(ge.getListaElementosCategoria("Zodiaco"));
        System.out.println(ge.getPalabraAdivinar("Zodiaco"));
        ge.eliminarElemento(sc.nextLine());
    }
}
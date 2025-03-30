package org.example.ui;

import org.example.commons.Constantes;
import org.example.service.GestionElementos;
import org.example.service.GestionElementosImplementacion;

public class Tester {
    public static void main(String[] args) {
        System.out.println(Constantes.BIENVENIDA);
        GestionElementos ge = new GestionElementosImplementacion();
        EntradaSalida.mostrarListaElementos(ge);
        ge.insertarElemento(EntradaSalida.insertarElemento());
    }
}


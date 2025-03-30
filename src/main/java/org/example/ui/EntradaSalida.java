package org.example.ui;

import org.example.commons.Comprobaciones;
import org.example.commons.Constantes;
import org.example.commons.ExcepcionCaracterEspecial;
import org.example.domain.Elemento;
import org.example.service.GestionElementos;
import org.example.service.GestionElementosImplementacion;

import java.util.List;
import java.util.Scanner;

public class EntradaSalida {
    private GestionElementos servicio;

    public EntradaSalida(GestionElementos ge) {
        this.servicio = ge;
    }
    public EntradaSalida(){
        servicio = new GestionElementosImplementacion();
    }
    public void mostrarElementos() {
        mostrarListaElementos(servicio);
    }
    public static void mostrarListaElementos(GestionElementos ge) {
        List<Elemento> lista = ge.getListaElementos();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento: " + i + ": "+ lista.get(i));
        }
    }
    public static Elemento insertarElemento(){
        Scanner sc = new Scanner(System.in);
        System.out.println(Constantes.INSERTAR);
        String id = sc.nextLine();
        String palabra = sc.nextLine();
        try{
            Comprobaciones.comprobarPalabra(palabra);
        }
        catch(ExcepcionCaracterEspecial e){
            System.out.println(e.getMessage());
        }
        String categoria = sc.nextLine();
        return new Elemento(id,palabra,categoria);
    }
}

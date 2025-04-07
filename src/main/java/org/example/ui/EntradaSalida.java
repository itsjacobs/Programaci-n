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
    public void mostrarListaElementos(GestionElementos ge) {
        List<Elemento> lista = ge.getListaElementos();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public Elemento insertarElemento(){
        boolean a = true;
        boolean b = true;
        Scanner sc = new Scanner(System.in);
        System.out.println(Constantes.INSERTAR1);
        String id = sc.nextLine();
        System.out.println(Constantes.INSERTAR2);
        String palabra = sc.nextLine();
        do {
            b = false;
            try {

                Comprobaciones.comprobarPalabra(palabra);
            } catch (ExcepcionCaracterEspecial e) {

                System.out.println(e.getMessage());
                b = true;
            }
            if (b) {
                palabra = sc.nextLine();
            }
        } while (b);
        System.out.println(Constantes.INSERTAR3);
        String categoria = sc.nextLine();
        while(a){
            if(!categoria.equalsIgnoreCase("pokemon") &&
                    !categoria.equalsIgnoreCase("futbol") &&
                    !categoria.equalsIgnoreCase("zodiaco") &&
                    !categoria.equalsIgnoreCase("LOL")){
                System.out.println("Categoria inexistente. Introduce otra");
                categoria = sc.nextLine();

            }
            else{
                a = false;
            }
        }
        Elemento elemento = new Elemento(id,palabra,categoria);
        return elemento;
    }

    public void listaVacia() {
        if (servicio.getListaElementos().isEmpty() ){
            System.out.println("La lista esta vacia");
        }
        else{
            System.out.println("La lista no esta vacia");
        }
    }
    public void listar(){
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        System.out.println("Dime la categoria que quieres listar");
        String categoria = sc.nextLine();
        while(a){
            if(!categoria.equalsIgnoreCase("pokemon") &&
                    !categoria.equalsIgnoreCase("futbol") &&
                    !categoria.equalsIgnoreCase("zodiaco") &&
                    !categoria.equalsIgnoreCase("LOL")){
                System.out.println("Categoria inexistente. Introduce otra");
                categoria = sc.nextLine();

            }
            else{
                a = false;
            }
        }
        System.out.println(servicio.listar(categoria));
    }
    public String palabraAdivinar(){
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        System.out.println("Dime la categoria de la que quieres la palabra");
        String categoria = sc.nextLine();
        String palabra = "";
        while(a){
            if(!categoria.equalsIgnoreCase("pokemon") &&
                    !categoria.equalsIgnoreCase("futbol") &&
                    !categoria.equalsIgnoreCase("zodiaco") &&
                    !categoria.equalsIgnoreCase("LOL")){
                System.out.println("Categoria inexistente. Introduce otra");
                categoria = sc.nextLine();

            }
            else{
                a = false;
            }
        }
        return servicio.getPalabraAdivinar(categoria);
    }
    public void eliminarElemento() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Dime el id del elemento que quieres eliminar");
        String id = sc.nextLine();
        boolean resultado = servicio.eliminarElemento(id);
        if (resultado) {
            System.out.println("Elemento eliminado exitosamente.");
        } else {
            System.out.println("No se encontró ningún elemento con ese id.");
        }
    }
    public List<Elemento> getListaElementosPalabra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que palabra tiene el elemento que quieres");
        String palabra = sc.nextLine();
        return servicio.getListaElementosPalabra(palabra);
    }

    public List<Elemento> getListaElementosId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que id tiene el elemento que quieres");
        String id = sc.nextLine();
        return servicio.getListaElementosId(id);
    }

}
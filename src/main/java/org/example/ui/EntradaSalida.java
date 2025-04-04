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
        Scanner sc = new Scanner(System.in);
        System.out.println(Constantes.INSERTAR);
        String id = sc.nextLine();
        String palabra = sc.nextLine();
        //bucle AOJSDFJGBASDHGASHDVBHASVDJHASVBDh
        try{
            Comprobaciones.comprobarPalabra(palabra);
        }
        catch(ExcepcionCaracterEspecial e){
            System.out.println(e.getMessage());
        }
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

}

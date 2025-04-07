package org.example.ui;

import net.datafaker.idnumbers.SouthAfricanIdNumber;
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
        GestionElementos ge = new GestionElementosImplementacion();
        EntradaSalida es = new EntradaSalida(ge);
        int opc =0;
        //ge.escribirFicheroBinario();
        //ge.cargarFicheroBinario(Constantes.AHORCADO_FILE2);
        do {
            System.out.println(Constantes.MENU_ADMIN);
            opc = sc.nextInt();
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
                    System.out.println(es.getListaElementosPalabra());
                    break;
                case 5:
                    es.getListaElementosId();
                    break;
                case 6:
                    ge.insertarElemento(es.insertarElemento());
                    break;
                case 7:
                    es.mostrarListaElementos(ge);
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    es.eliminarElemento();
                    break;
            }
        }while(opc!=0);



    }
}
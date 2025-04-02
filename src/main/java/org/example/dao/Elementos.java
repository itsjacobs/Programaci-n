package org.example.dao;

import net.datafaker.Faker;
import org.example.commons.Constantes;
import org.example.domain.Elemento;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Elementos {
    private final List<Elemento> listaElementos;

    public Elementos(List<Elemento> listaElementos) {
        this.listaElementos = listaElementos;
    }

    public Elementos() {
        Random rnd = new Random();
        File fichero = new File(Constantes.AHORCADO_FILE);
        if (fichero.exists()) {
            listaElementos = Ficheros.leerFichero(Constantes.AHORCADO_FILE);
        } else {
            listaElementos = new ArrayList<>();
            String categoria = null;
            for (int i = 0; i < 30; i++) {
                categoria = "Futbol";
                String id = String.valueOf(rnd.nextInt(0, 100));
                String palabra = new Faker().football().teams();

                Elemento nuevoElemento = new Elemento(id, palabra, categoria);

                boolean duplicado = false;
                for (int j = 0; j < i; j++) {
                    if (listaElementos.get(j).getPalabra().equalsIgnoreCase(palabra)) {
                        duplicado = true;
                        break;
                    }
                }

                if(!duplicado) {
                    listaElementos.add(nuevoElemento);
                } else {
                    i--;
                }
            }

            /*for(int i = 5;i<=9;i++){
                categoria = "Pokemon";
                listaElementos.add(new Elemento(String.valueOf(rnd.nextInt(0,100)), new Faker().pokemon().name(), categoria));
            }
            for(int i = 10;i<=14;i++){
                categoria = "Zodiaco";
                listaElementos.add(new Elemento(String.valueOf(rnd.nextInt(0,100)), new Faker().zodiac().sign(), categoria));
            }
            for(int i = 15;i<=19;i++){
                categoria = "LOL";
                listaElementos.add(new Elemento(String.valueOf(rnd.nextInt(0,100)), new Faker().leagueOfLegends().champion(),categoria));
            }*/
        }
    }

    public List<Elemento> getListaElementos() {
        return listaElementos;
    }

    public void vaciarListaElementos() {
        listaElementos.clear();
    }

    public void modificarLista(List<Elemento> listaElementos) {
        vaciarListaElementos();
        this.listaElementos.addAll(listaElementos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(listaElementos);
        return sb.toString();
    }
}

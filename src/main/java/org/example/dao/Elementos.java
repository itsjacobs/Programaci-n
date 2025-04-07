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
            String[] CATEGORIAS2 = {"Futbol", "Pokemon", "LOL", "Zodiaco"};
            for (int i = 0; i < CATEGORIAS2.length; i++) {
                String categoria = CATEGORIAS2[i];
                for (int x = i * 5; x <= ((i + 1) * 5 - 1); x++) {
                    String id = String.valueOf(rnd.nextInt(1, 100));
                    String palabra = null;
                    if (i == 0) {
                        palabra = new Faker().football().teams();
                    } else if (i == 1) {
                        palabra = new Faker().pokemon().name();
                    } else if (i == 2) {
                        palabra = new Faker().leagueOfLegends().champion();
                    } else {
                        palabra = new Faker().zodiac().sign();
                    }
                    Elemento nuevoElemento = new Elemento(id, palabra, categoria);
                    boolean duplicado;
                    do {
                        duplicado = false;
                        for (int j = 0; j < x; j++) {
                            if (listaElementos.get(j).getPalabra().equalsIgnoreCase(palabra) || listaElementos.get(j).getId().equalsIgnoreCase(id) && duplicado) {
                                duplicado = true;

                            }
                        }
                        if (duplicado) {
                            id = String.valueOf(rnd.nextInt(0, 100));
                            if (i == 0) {
                                palabra = new Faker().football().teams();
                            } else if (i == 1) {
                                palabra = new Faker().pokemon().name();
                            } else if (i == 2) {
                                palabra = new Faker().leagueOfLegends().champion();
                            } else {
                                palabra = new Faker().zodiac().sign();
                            }
                            nuevoElemento = new Elemento(id, palabra, categoria);
                        }
                    } while (duplicado);

                    listaElementos.add(nuevoElemento);

                }
            }
        }

    }


    public List<Elemento> getListaElementos() {
        return listaElementos;
    }

    public void vaciarListaElementos() {
        listaElementos.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(listaElementos);
        return sb.toString();
    }
}

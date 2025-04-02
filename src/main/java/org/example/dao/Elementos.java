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
            String categoria = "Futbol";
            for (int i = 0; i <= 4; i++) {
                String id = String.valueOf(rnd.nextInt(1, 100));
                String palabra = new Faker().football().teams();

                Elemento nuevoElemento = new Elemento(id, palabra, categoria);

                boolean duplicado;
                do {
                    duplicado = false;
                    for (int j = 0; j < i; j++) {
                        if (listaElementos.get(j).getPalabra().equalsIgnoreCase(palabra) || listaElementos.get(j).getId().equalsIgnoreCase(id)) {
                            duplicado = true;
                            break;
                        }
                    }
                    if (duplicado) {
                        id = String.valueOf(rnd.nextInt(0, 100));
                        palabra = new Faker().football().teams();
                        nuevoElemento = new Elemento(id, palabra, categoria);
                    }
                } while (duplicado);

                listaElementos.add(nuevoElemento);
            }
            categoria = "Pokemon";
            for (int i = 5; i <= 9; i++) {
                String id = String.valueOf(rnd.nextInt(1, 100));
                String palabra = new Faker().pokemon().name();

                Elemento nuevoElemento = new Elemento(id, palabra, categoria);

                boolean duplicado;
                do {
                    duplicado = false;
                    for (int j = 0; j < i; j++) {
                        if (listaElementos.get(j).getPalabra().equalsIgnoreCase(palabra) || listaElementos.get(j).getId().equalsIgnoreCase(id)) {
                            duplicado = true;
                            break;
                        }
                    }
                    if (duplicado) {
                        id = String.valueOf(rnd.nextInt(0, 100));
                        palabra = new Faker().pokemon().name();
                        nuevoElemento = new Elemento(id, palabra, categoria);
                    }
                } while (duplicado);

                listaElementos.add(nuevoElemento);
            }
            categoria = "LOL";
            for (int i = 10; i <= 14; i++) {
                String id = String.valueOf(rnd.nextInt(1, 100));
                String palabra = new Faker().leagueOfLegends().champion();

                Elemento nuevoElemento = new Elemento(id, palabra, categoria);

                boolean duplicado;
                do {
                    duplicado = false;
                    for (int j = 0; j < i; j++) {
                        if (listaElementos.get(j).getPalabra().equalsIgnoreCase(palabra) || listaElementos.get(j).getId().equalsIgnoreCase(id)) {
                            duplicado = true;
                            break;
                        }
                    }
                    if (duplicado) {
                        id = String.valueOf(rnd.nextInt(0, 100));
                        palabra = new Faker().leagueOfLegends().champion();
                        nuevoElemento = new Elemento(id, palabra, categoria);
                    }
                } while (duplicado);

                listaElementos.add(nuevoElemento);
            }
            categoria = "Zodiaco";
            for (int i = 15; i <= 19; i++) {
                String id = String.valueOf(rnd.nextInt(1, 100));
                String palabra = new Faker().zodiac().sign();

                Elemento nuevoElemento = new Elemento(id, palabra, categoria);

                boolean duplicado;
                do {
                    duplicado = false;
                    for (int j = 0; j < i; j++) {
                        if (listaElementos.get(j).getPalabra().equalsIgnoreCase(palabra) || listaElementos.get(j).getId().equalsIgnoreCase(id)) {
                            duplicado = true;
                            break;
                        }
                    }
                    if (duplicado) {
                        id = String.valueOf(rnd.nextInt(0, 100));
                        palabra = new Faker().zodiac().sign();
                        nuevoElemento = new Elemento(id, palabra, categoria);
                    }
                } while (duplicado);

                listaElementos.add(nuevoElemento);
            }
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

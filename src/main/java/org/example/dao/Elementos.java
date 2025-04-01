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
        File fichero = new File(Constantes.AHORCADO_FILE);
        if (fichero.exists()) {
            listaElementos = Ficheros.leerFichero(Constantes.AHORCADO_FILE);
        } else {
            listaElementos = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                listaElementos.add(new Elemento());
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

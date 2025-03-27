package org.example.service;

import org.example.commons.Constantes;
import org.example.dao.DaoElementos;
import org.example.dao.DaoElementsImplementacion;
import org.example.dao.Elementos;
import org.example.dao.Ficheros;
import org.example.domain.Elemento;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class GestionElementosImplementacion implements GestionElementos {

    private DaoElementos daoElementos;

    public GestionElementosImplementacion(DaoElementos daoElementos) {
        this.daoElementos = daoElementos;
    }
    public GestionElementosImplementacion() {
        this.daoElementos = new DaoElementsImplementacion();
    }

    @Override
    public boolean isEmptyElementosList() {
        return daoElementos.isEmptyListaElementos();
    }

    @Override
    public List<Elemento> getListaElementos() {
        return daoElementos.getElementos();
    }

    @Override
    public boolean insertarElemento(Elemento Elemento) {
        return daoElementos.getElementos().add(Elemento);
    }

    @Override
    public List<Elemento> listar(String categoria) {
        List<Elemento> elementosCategoria = null;
        for (Elemento elemento : daoElementos.getElementos()) {
            if (elemento.getCategoria().equalsIgnoreCase(categoria)) {
                elementosCategoria.add(elemento);
            }
        }
        return elementosCategoria;
    }

    @Override
    public List<Elemento> listarElementos(boolean ascendente) {

        return List.of();
    }

    @Override
    public List<Elemento> getListaElementosCategoria() {
        return daoElementos.getElementos();
    }

    @Override
    public String getPalabraAdivinar(String categoria) {
        Random rnd = new Random();
        return daoElementos.getListaCategoria(categoria).get(rnd.nextInt(getListaElementosCategoria().size())).getPalabra();
    }

    @Override
    public void eliminarElemento(Elemento Elemento) {
        daoElementos.getElementos().remove(Elemento);
    }

    @Override
    public void crearFicheros() throws IOException {

    }

    @Override
    public boolean leerFichero(String fichero) throws IOException {
        List<Elemento> lista= Ficheros.leerFichero(fichero);
        daoElementos.modificarLista(lista);
        return !lista.isEmpty();
    }

    @Override
    public boolean escribirFichero() {
        boolean a = false;
        //if (Ficheros.escribirFichero(Constantes.AHORCADO_FILE,)){
            a = true;
        //}
        return a;
    }

    @Override
    public boolean escribirFicheroBinario() {
        return false;
    }

    @Override
    public boolean cargarFicheroBinario() {
        return false;
    }

    @Override
    public boolean eliminarElemento(String id) {
        boolean a = false;
        for (Elemento elemento : daoElementos.getElementos()) {
            if (elemento.getId().equals(id)) {
                daoElementos.getElementos().remove(elemento);
                a = true;
            }
        }
        return a;
    }

    @Override
    public boolean modificarElemento(String id, String palabra) {
        boolean a = false;
        for (Elemento elemento : daoElementos.getElementos()) {
            if (elemento.getId().equalsIgnoreCase(id)) {
                elemento.setPalabra(palabra);
                a = true;
            }
        }
        return a;
    }
}

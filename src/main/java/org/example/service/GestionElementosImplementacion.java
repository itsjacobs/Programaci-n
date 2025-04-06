package org.example.service;

import org.example.commons.Constantes;
import org.example.dao.DaoElementos;
import org.example.dao.DaoElementsImplementacion;
import org.example.dao.Ficheros;
import org.example.domain.Elemento;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
        return getListaElementos().add(Elemento);
    }

    @Override
    public List<Elemento> listar(String categoria) {

        List<Elemento> elementosCategoria = new ArrayList();
        for (Elemento elemento : daoElementos.getElementos()) {
            if (elemento.getCategoria().equalsIgnoreCase(categoria)) {
                elementosCategoria.add(elemento);
            }
        }
        System.out.println(elementosCategoria.size());
        return elementosCategoria;
    }

    @Override
    public List<Elemento> listarElementos(boolean ascendente) {
        List<Elemento> elementosCategoria = getListaElementos();
        if(ascendente){
            Collections.sort(elementosCategoria);
        }
        return null;
    }

    @Override
    public List<Elemento> getListaElementosCategoria(String categoria) {
        return daoElementos.getListaCategoria(categoria);
    }

    @Override
    public String getPalabraAdivinar(String categoria) {
        Random rnd = new Random();
        List<Elemento> elementosCategoria = new ArrayList();
        for (Elemento elemento : daoElementos.getElementos()) {
            if (elemento.getCategoria().equalsIgnoreCase(categoria)) {
                elementosCategoria.add(elemento);
            }
        }
        
        return elementosCategoria.get(rnd.nextInt(elementosCategoria.size())).getPalabra();
    }

    @Override
    public boolean escribirFichero() {
        boolean a = false;
        if (Ficheros.escribirFichero(Constantes.AHORCADO_FILE,daoElementos.getElementos())){
            a = true;
        }
        return a;
    }

    @Override
    public void crearFicheros() throws IOException {
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

    @Override
    public boolean eliminarElemento(String id) {
        boolean a = false;
        for (int i = 0; i < getListaElementos().size(); i++) {
            if(getListaElementos().get(i).getId().equalsIgnoreCase(id)){
                getListaElementos().remove(i);
                a = true;
                i--;
            }
        }
        return a;
    }


    @Override
    public void eliminarElemento(Elemento Elemento) {
        daoElementos.getListaElementos().remove(Elemento);
    }
}

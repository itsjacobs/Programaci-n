package org.example.dao;

import org.example.domain.Elemento;

import java.util.ArrayList;
import java.util.List;

public class DaoElementsImplementacion implements DaoElementos {
    private Elementos lista;

    public DaoElementsImplementacion(Elementos lista) {
        this.lista = lista;
    }
    public DaoElementsImplementacion(){
        lista = new Elementos();
    }

    public Elementos getLista() {
        return lista;
    }
    public void setLista(Elementos lista) {
        this.lista = lista;
    }

    @Override
    public boolean isEmptyListaElementos() {
        boolean a = false;
        if (lista.getListaElementos().isEmpty()) {
            a = true;
        }
        return a;
    }

    @Override
    public boolean insertaElemento(Elemento elemento){
        return lista.getListaElementos().add(elemento);
    }

    @Override
    public boolean insertarElemento(String id, String palabra, String categoria) {
        return lista.getListaElementos().add(new Elemento(id, palabra, categoria));
    }

    @Override
    public List<Elemento> getListaElementos() {
        return lista.getListaElementos();
    }


    @Override
    public List<Elemento> getElementos() {
        return lista.getListaElementos();
    }

    @Override
    public List<Elemento> getListaCategoria(String categoria) {
        List<Elemento> elementosCategoria = new ArrayList<>();
        for (Elemento elemento : lista.getListaElementos()) {
            if (elemento.getCategoria().equals(categoria)) {
                elementosCategoria.add(elemento);
            }
        }
        return elementosCategoria;
    }
    @Override
    public List<Elemento> getListaPalabra(String palabra) {
        List<Elemento> lista = new ArrayList<>();

        for (Elemento elemento : lista) {
            if (elemento.getPalabra().equalsIgnoreCase(palabra)) {
                lista.add(elemento);
            }
        }
        return lista;
    }

    @Override
    public List<Elemento> getListaId(String id) {
        List<Elemento> elementosId = null;
        for (Elemento elemento : lista.getListaElementos()){
            if (elemento.getId().equals(id)){
                elementosId.add(elemento);
            }
        }
        return elementosId;
    }

    @Override
    public boolean modificarCategoria(String id, String categoria) {
        boolean a = false;
        for (Elemento elemento: lista.getListaElementos()){
            if (elemento.getId().equals(id)){
                elemento.setCategoria(categoria);
                a = true;
            }
        }
        return a;
    }

    @Override
    public boolean modificarPalabra(String id, String palabra) {
        boolean a = false;
        for (Elemento elemento: lista.getListaElementos()){
            if (elemento.getId().equals(id)){
                elemento.setPalabra(palabra);
                a = true;
            }
        }
        return a;
    }
    @Override
    public void eliminarElemento(Elemento elemento){
        lista.getListaElementos().remove(elemento);
    }

    @Override
    public boolean eliminarElemento(String id) {
        boolean a = false;
        for (Elemento elemento: lista.getListaElementos()){
            if (elemento.getId().equals(id)){
                lista.getListaElementos().remove(elemento);
                a = true;
            }
        }
        return a;
    }


}
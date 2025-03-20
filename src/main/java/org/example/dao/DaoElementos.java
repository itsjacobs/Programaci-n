package org.example.dao;

import org.example.domain.Elemento;

import java.util.List;

public interface DaoElementos {
    public boolean isEmptyListaElementos();
    public boolean insertaElemento(Elemento elemento);
    public boolean insertarElemento(String id, String palabra,String categoria);
    public List<Elemento> getListaCategoria(String categoria);
    public List<Elemento> getListaPalabra(String palabra);
    public List<Elemento> getListaId(String id);
    public boolean modificarCategoria(String id, String categoria);
    public boolean modificarPalabra(String id, String palabra);
    public boolean eliminarElemento(String id);
    public void eliminarElemento(Elemento elemento);
}

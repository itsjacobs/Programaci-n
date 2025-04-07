package org.example.service;

import org.example.domain.Elemento;

import java.io.IOException;
import java.util.List;

public interface GestionElementos {
    public boolean isEmptyElementosList();
    public List<Elemento> getListaElementos();
    public boolean insertarElemento(Elemento Elemento);
    public List<Elemento> listar(String categoria);
    public List<Elemento> listarElementos(boolean ascendente);
    public List<Elemento> getListaElementosCategoria(String categoria);
    public String getPalabraAdivinar(String categoria);
    public void eliminarElemento(Elemento Elemento);
    public void crearFicheros()throws IOException;
    public boolean escribirFichero();
    public boolean escribirFicheroBinario();
    public boolean cargarFicheroBinario();
    public boolean eliminarElemento(String id);
    //public boolean modificarCategoria(String id, String categoria) throws CategoriaException;
    public boolean modificarElemento(String id, String palabra);
    public List<Elemento> getListaElementosPalabra(String palabra);
    public List<Elemento> getListaElementosId(String Id);
}
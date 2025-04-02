package org.example.domain;

import org.example.commons.ExcepcionCaracterEspecial;
import org.example.dao.DaoElementos;

import java.util.Random;

public class Juego {
    private DaoElementos palabraAdivinar;
    private int vidas;

    public Juego (String categoria) {
        Random rnd = new Random();
        //this.palabraAdivinar =  palabraAdivinar.getListaCategoria(categoria).get(rnd.nextInt(0,palabraAdivinar.getListaCategoria(categoria).size())).getPalabra();
        vidas = 5;
    }
    public int getVidas() {
        return vidas;
    }
    public void setVidas(int vidas){
        this.vidas = vidas;
    }
    /*public String palabraAdivinar(){

    }*/
    //public String validarLetras(String palabra){

}

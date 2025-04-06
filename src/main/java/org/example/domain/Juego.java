package org.example.domain;

import org.example.commons.ExcepcionCaracterEspecial;
import org.example.dao.DaoElementos;

import java.util.Random;

public class Juego {
    private DaoElementos palabraAdivinar;
    private int vidas;

    public Juego(String palabra) {
        Random rnd = new Random();
        vidas = 5;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    public void convertirPalabraAdivinar() {
        String palabra;

    }
}


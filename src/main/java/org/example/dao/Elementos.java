package org.example.dao;

import net.datafaker.Faker;
import org.example.domain.Elemento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Elementos{
        private final List<Elemento> listaElementos;

        public Elementos(List<Elemento> listaElementos) {
            this.listaElementos = listaElementos;
        }
        public Elementos(){
            Random rnd = new Random();
            this.listaElementos = new ArrayList<Elemento>();
            for (int i = 0; i < 20; i++) {
                listaElementos.add(new Elemento());
            }
        }
        public List<Elemento> getListaElementos() {
            return listaElementos;
        }

        public void vaciarListaElementos(){
            listaElementos.clear();
        }
        public void modificarLista(List<Elemento> listaElementos) {
            vaciarListaElementos();
            this.listaElementos.addAll(listaElementos);
        }

        @Override
        public String toString() {
                StringBuilder sb = new StringBuilder();
                return sb.toString();
        }
    }

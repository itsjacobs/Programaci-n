package org.example.dao;

import net.datafaker.Faker;
import org.example.domain.Elemento;

import java.util.ArrayList;
import java.util.List;

public class Elementos{
        private final List<Elemento> listaElementos;


        public Elementos(){
            this.listaElementos = new ArrayList<Elemento>();
        }

        public Elementos(List<Elemento> listaElementos) {
            this.listaElementos = listaElementos;
        }
        public List<Elemento> getListaElementos() {
            return listaElementos;
        }
        public void vaciarListaElementos(){
            listaElementos.clear();
        }

    @Override
    public String toString() {
            StringBuilder sb = new StringBuilder();
            return sb.toString();
    }
}

package org.example.domain;

import net.datafaker.Faker;
import org.example.commons.Constantes;

import java.util.Random;

public class Elemento implements Comparable<Elemento>{
    private String id;
    private String palabra;
    private String categoria;

    public Elemento (String id, String palabra, String categoria) {
        this.id = id;
        this.palabra = palabra;
        this.categoria = categoria;
    }
    public Elemento (String Linea){
        String[] token = Linea.split(";");
        id = token[0];
        palabra = token[1];
        categoria = token[2];
    }
    public Elemento(){
        Random rnd = new Random();
        this.id = String.valueOf(rnd.nextInt(0,100));
        this.categoria = Constantes.CATEGORIAS[rnd.nextInt(0,Constantes.CATEGORIAS.length)];
        this.palabra = palabra;
        if (categoria.equalsIgnoreCase("Futbol")){
            this.palabra = new Faker().football().teams();
        }
        else if (categoria.equalsIgnoreCase("Pokemon")){
            this.palabra = new Faker().pokemon().name();
        }
        else if(categoria.equalsIgnoreCase("Zodiaco")){
            this.palabra = new Faker().zodiac().sign();
        }
        else{
            this.palabra = new Faker().leagueOfLegends().champion();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        StringBuilder SB = new StringBuilder();
        SB.append("--------------------------------------------\n");
        SB.append("ID: " + id+"\n");
        SB.append("Palabra: " + palabra+"\n");
        SB.append("Categoria: " + categoria+"\n");
        SB.append("\n");
        return SB.toString();
    }


    public String toStringFichero(){
        StringBuilder SB = new StringBuilder();
        SB.append(id).append(";").append(palabra).append(";").append(categoria);
        return SB.toString();
    }
    public int compareTo(Elemento e){
        return this.id.compareTo(e.id);
    }
}

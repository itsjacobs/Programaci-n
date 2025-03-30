package org.example.dao;

import org.example.domain.Elemento;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ficheros {
    public static boolean escribirFichero(String fichero, List<Elemento> lista){
        PrintWriter escribir = null;
        boolean a = false;
        try{
            escribir = new PrintWriter(fichero);
        }
        catch(FileNotFoundException e){
            System.out.println("No se pudo escribir el fichero, no se ha encontrado");
        }
        for (int i = 0; i < lista.size(); i++) {
            escribir.println(lista.get(i).toStringFichero());
            a = true;
        }
        escribir.close();
        return a;
    }
    public static List<Elemento> leerFichero(String fichero){
        List<Elemento> lista = new ArrayList<Elemento>();
        String Linea = null;
        try{
            Scanner sc = new Scanner(new File(fichero));
            while(sc.hasNextLine()){
                Linea = sc.nextLine();
            }
        }
        catch (FileNotFoundException e){
            System.out.println("No se puede leer el fichero, no se ha encontrado");
        }
        lista.add(new Elemento(Linea));

        return lista;
    }
}

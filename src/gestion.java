import java.util.Random;
import java.util.Scanner;

public class gestion {
    //Atributo
    private playa[] lista;

    //getters && setters
    public playa[] getLista() {
        return lista;
    }

    //constructores
    public gestion(){
        this(10);
    }
    public gestion(int tamanyo){
        Random rnd = new Random();
        lista = new playa[tamanyo];
        for (int i = 0; i < tamanyo; i++){
            if ((i+1)%2 == 0){
                lista[i] = new playasGrandes();
            }
            else if((i+1)%2 != 0){
                lista[i] = new cala();
            }
        }
        for (int i = 0; i < lista.length; i++){
            lista[i].setId(i);
        }
    }
    public void mostrarArrayDePlayas(){
        for (int i = 0; i < lista.length; i++){
            if (lista[i] != null){
                System.out.println(lista[i].toString());
            }
            else {
                System.out.println("----------------------------------------------");
                System.out.println("El elemento de la posicion " + (i+1) + " es nulo");
                System.out.println("----------------------------------------------");
            }
        }
    }
    public void darBajaPlaya(int id){
        for (int i = 0; i < lista.length; i++){
            if (lista[i].getId() == id){
                lista[i]= null;
                System.out.println("playa dada de baja");
            }
        }
    }
    public void darAltaPlaya(){
            Scanner sc = new Scanner(System.in);
            boolean minus = false;
            System.out.println("quieres una playa grande o una cala");
            String eleccion = sc.nextLine().toLowerCase();

            System.out.println("Ingrese el id del playa ");
            int id = sc.nextInt();

            System.out.println("Ingrese el nombre del playa ");
            sc.nextLine();
            String nombre= sc.nextLine();

            System.out.println("Introduce la calle de la playa");
            String calle = sc.nextLine();

            System.out.println("Introduce el codigo postal de la playa");
            String postal = sc.nextLine();

            System.out.println("Introduce la comunidad autonoma de la playa");
            String comunidad = sc.nextLine();
            direccion direccion = new direccion(calle,postal,comunidad);

            System.out.println("Ingrese la longitud de la playa");
            double longitud = sc.nextDouble();

            System.out.println("ingrese la valoracion de la playa");
            int valoracion = sc.nextInt();

            if (valoracion < 1 || valoracion > 5){
                System.out.println("la valoracion no es valida");
                valoracion = 1;
            }

            if (eleccion.equals("cala")){
                System.out.println("responde si, si la cala no es apta para minusvalidos" +
                        "responde no, si la cala no es apta para minusvalidos");
                sc.nextLine();
                String respuesta = sc.nextLine();
                if (respuesta.equals("si")){
                    minus = true;
                }
            }
            if (eleccion.equals("cala")){
                for (int i = 0; i < lista.length; i++){
                    if (lista[i] == null){
                        lista[i] = new cala(id,nombre,direccion,longitud,valoracion,minus);
                        System.out.println(lista[i].toString());
                    }
                }
                if (lista != null){
                    System.out.println("Todas las playas estan ocupadas");
                }
            } else if (eleccion.equals("playa grande")){
                System.out.println("de que color es la bandera");
                if (sc.nextLine().toLowerCase().equals("verde") || sc.nextLine().toLowerCase().equals("amarillo") || sc.nextLine().toLowerCase().equals("rojo")){
                    String color = sc.nextLine();
                    for (int i = 0; i < lista.length; i++){
                        if (lista[i] == null){
                            lista[i] = new playasGrandes(id,nombre,direccion,longitud,valoracion,color);
                            System.out.println(lista[i].toString());
                        }
                    }
                }
                else{
                    System.out.println("color no valido");
                }

            }
    }
    public void listadoPlayas(double longitud){
        int contador = 0;
        for (int i = 0; i < lista.length; i++){
            if (longitud > lista[i].getLongitud()){
                contador++;
            }
        }
        playa[] listaAux = new playa[contador];
        int index = 0;
        for (int i = 0; i < lista.length; i++){
            if (lista[i].getLongitud() > longitud){
                if (index < listaAux.length){
                    listaAux[index] = lista[i];
                    index++;
                }
            }
        }
        for (int i = 0; i < listaAux.length; i++){
            System.out.println(listaAux[i].toString());
        }
    }

    public void informacionPlayas(String Comunidad){
        for (int i = 0; i < lista.length; i++){
            if (lista[i].getDireccion().getCA().equals(Comunidad) && lista[i] != null){
                System.out.println(lista[i].toString());
            }
        }
    }
    public void modificarLongitud(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del playa");
        String aux = sc.nextLine();

        System.out.println("Indique la nueva longitud de la playa");
        double longitud = sc.nextDouble();

        for (int i = 0; i < lista.length; i++){
            if (lista[i].getNombre().equals(aux)){
                lista[i].setLongitud(longitud);
                System.out.println(lista[i].toString());
            }
        }
    }

}

import java.util.Random;

public class cala extends playa{
    //Atributos
    private boolean minusvalidos;
    public static final String[] Nombres = {"cala Pi de la Posada","cala de moraig","cala de san calobra","cala pregonda"};


    //Constructores
    public cala(int id, String nombre,direccion direccion,double longitud,int valoracion,boolean minusvalidos){
        super(id,nombre,direccion,longitud,valoracion);
        this.minusvalidos = minusvalidos;
    }
    public cala(){
        Random rnd = new Random();
        switch(rnd.nextInt(1,2)){
            case 1:
                minusvalidos = true;
                break;
            case 2:
                minusvalidos = false;
                break;
        }
        this.setNombre(Nombres[rnd.nextInt(0,Nombres.length)]);
    }

    //Getters && setters
    public boolean getMinusvalidos(){
        return minusvalidos;
    }
    public void setMinusvalidos(boolean minusvalidos){
        this.minusvalidos = minusvalidos;
    }

    //Métodos
    public int getPuntuacion(){
        int media = this.valoracionMedia();
        if (minusvalidos == true){
            media = media + 1;
        }
        return media;
    }
    public String toString(){
        return super.toString() +
                "\nminusvalidos: " + minusvalidos;
    }
}

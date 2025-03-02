import java.util.Random;

public abstract class playa {
    //Atributos
    private int id;
    private String nombre;
    private direccion direccion;
    private double longitud;
    private int valoracion;

    //Constructores
    public playa(int id, String nombre, direccion direccion, double longitud, int valoracion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.longitud = longitud;
        this.valoracion = valoracion;
    }
    public playa(){
        Random rnd = new Random();
        this.id = rnd.nextInt(0,15);
        this.longitud = rnd.nextDouble(0,300);
        this.valoracion = rnd.nextInt(0,5);
        this.direccion = new direccion();
    }
    //Getters & setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(direccion direccion) {
        this.direccion = direccion;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public int getValoracion() {
        return valoracion;
    }
    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    
    //métodos

    public int valoracionMedia(){
        int media = 0;
        int valoraciones =0;
        if (media <= 100){
            valoraciones += valoracion;
            media++;
        }
        return media = valoraciones/media;
    }
    public abstract int getPuntuacion();

    @Override
    public String toString() {
        return  "------------------------------"+
                "\nid: " + id +
                "\nnombre: " + nombre +
                "\ndireccion: " + direccion+
                "\nlongitud: " + longitud +
                "\nvaloracion: " + valoracion;
    }
}

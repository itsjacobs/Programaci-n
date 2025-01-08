package POO3;

public class Titular {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;

    //Constructor

    public Titular(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Titular() {
        this.nombre = "Itziar";
        this.apellido = "Ruiz";
        this.edad = 20;
    }
}

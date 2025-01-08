package POO1;

public class Circulo {

    //Atributos
    private Punto centro;
    private double radio;

    //Constructor
    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Circulo(){
        this.centro = new Punto();
        this.radio = 0.0;
    }
    public Circulo(double x, double y, double radio){
        this.centro = new Punto(x, y);
        this.radio = radio;
    }

    //Getter
    public Punto getCentro() {
        return centro;
    }
    public double getRadio() {
        return radio;
    }


    //Metodos
    public double calcularDistanciaDesde(Punto otroPunto){
        return centro.calcularDistanciaDesde(otroPunto);
    }
    public double calcularArea(){
        return Math.PI * (Math.pow(radio, 2));
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}

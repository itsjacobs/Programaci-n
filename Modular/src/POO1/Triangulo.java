package POO1;

public class Triangulo {
    //Atributos
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    //Constructores
    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }
    public Triangulo() {
        this.vertice1 = new Punto();
        this.vertice2 = new Punto();
        this.vertice3 = new Punto();
    }
    public Triangulo(double vertice1, double vertice2, double vertice3,double vertice4,double vertice5,double vertice6) {
        this.vertice1 = new Punto(vertice1, vertice4);
        this.vertice2 = new Punto(vertice2, vertice5);
        this.vertice3 = new Punto(vertice3, vertice6);
    }


    //Getters
    public Punto getvertice1() {
        return vertice1;
    }
    public Punto getVertice2() {
        return vertice2;
    }
    public Punto getVertice3() {
        return vertice3;
    }

    //Metodos
    public double calcularDistanciaDesde(Punto otro) {
        return vertice1.calcularDistanciaDesde(otro);
    }
    public double calcularPerimetro(){
        double l12 = vertice1.calcularDistanciaDesde(vertice2);
        double l13 = vertice1.calcularDistanciaDesde(vertice3);
        double l23 = vertice2.calcularDistanciaDesde(vertice3);
        return l12 + l13 + l23;
    }
    public double calcularArea(){
        double l12 = vertice1.calcularDistanciaDesde(vertice2);
        double l13 = vertice1.calcularDistanciaDesde(vertice3);
        double l23 = vertice2.calcularDistanciaDesde(vertice3);
        double s = calcularPerimetro()/2;
        return Math.sqrt(s*(s-l12)*(s-l13)*(s-l23));
    }
}

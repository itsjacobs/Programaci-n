package POO1;

public class    Punto {
    //Atributos
        private double x;
        private double y;

    //constructores
    public Punto(double x, double y) {
        this.x= x;
        this.y= y;
    }
    public Punto(){
        this.x= 0.0;
        this.y= 0.0;
    }
    //getters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    //metodo
    public double calcularDistanciaDesde(Punto otroPunto) {
        double dx = otroPunto.getX() - this.x;
        double dy = otroPunto.getY() - this.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    }


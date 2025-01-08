package POO3;

public class CuentaCorriente {
    //Atributos
    private Titular titular;
    private String numeroCuenta;
    private double saldo;

    //Constructores
    public CuentaCorriente(Titular titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    public CuentaCorriente(Titular titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 15.30;
    }

    public CuentaCorriente(){
        this.titular = new Titular();
        this.numeroCuenta = numeroCuenta;
        this.saldo = 15.30;
    }
    //getters
    public Titular getTitular() {return titular;}
    public String getNumeroCuenta() {return numeroCuenta;}
    public double getSaldo() {return saldo;}

    //setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodos
    public void Ingresar(double cantidad){
        saldo = saldo + cantidad;
    }
    public void Retirar(double cantidad){
        saldo = saldo - cantidad;
    }
    public void Imprimir(){
        System.out.println(numeroCuenta);
        System.out.println(saldo);
    }

    public void Comparar(){
        numeroCuenta.compareTo(numeroCuenta);
    }

}

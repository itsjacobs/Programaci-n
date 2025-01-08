package POO3;

public class CuentaAhorro extends CuentaCorriente{
    //Atributos
    private double interes;

    //Constructores
    public CuentaAhorro(Titular titular, String numeroCuenta, double saldo, double interes) {
        super(titular,numeroCuenta,saldo);
        this.interes = interes;
    }

    public CuentaAhorro(Titular titular, String numCuenta, double interes) {
        super(titular,numCuenta);
        this.interes = interes;
    }
    public CuentaAhorro(Titular titular, String numCuenta) {
        super(titular,numCuenta);
        interes=2.5;
    }
    //getter
    public double getInteres() {
        return interes;
    }


    //metodos

    public void calcularInteres(){
        setSaldo(getSaldo()*(1+interes));
    }
}

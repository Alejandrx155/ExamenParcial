package examenmaldonado;

/**
 *
 * @author Alejandrx Maldonado
 */
public class CuentaAhorro extends ExamenMaldonado {

    public double tasaInteres;
    public int meses;
    public double montoAdicional;
    public double InteresTotal;
    public double SaldoTotal;

    public CuentaAhorro(String numeroCuenta, String Titular, double saldo) {
        super(numeroCuenta, Titular, saldo);
        this.tasaInteres = 0;
        this.meses = 0;
        this.montoAdicional = 0;
        this.InteresTotal = 0;
        this.SaldoTotal = 0;
    }

    public void setTasaInteres(double d) {
        this.tasaInteres = d;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void aplicarInteres() {
        this.saldo += this.saldo * this.tasaInteres;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double CalcularInteres() {
        InteresTotal = (saldo + (montoAdicional * meses)) * (tasaInteres / 100) * meses;
        return InteresTotal;
    }

    public double SaldoTotal() {
        SaldoTotal = saldo + (montoAdicional * meses) + InteresTotal;
        return InteresTotal;
    }
}

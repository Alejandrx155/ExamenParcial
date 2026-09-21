package examenmaldonado;

/**
 *
 * @author Alejandrx Maldonado
 */
public class CuentaCorriente extends ExamenMaldonado {

    public double limiteCredito;
    public double montoUsado;
    public double cargoMantenimiento;
    public double deuda;
    public double SaldoFinal;

    public CuentaCorriente(String numeroCuenta, String Titular, double saldo) {
        super(numeroCuenta, Titular, saldo);
        this.limiteCredito = 0;
        this.montoUsado = 0;
        this.cargoMantenimiento = 0;
        this.deuda = 0;
        this.SaldoFinal = 0;
    }

    public double CalcularDeuda() {
        deuda = montoUsado + (montoUsado * 0.02);
        return deuda;
    }
    public double CalcularSaldoFinal() { 
        SaldoFinal = saldo - cargoMantenimiento - deuda;
        return SaldoFinal;
    }
    void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    boolean retirar(double monto) {
        if (saldo + limiteCredito >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }
    double getSaldo() {
        return this.saldo;
    }
}
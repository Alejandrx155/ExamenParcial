package examenmaldonado;

  

    public class ExamenMaldonado {

        public String numeroCuenta;
        public String Titular;
        public double saldo;

        public ExamenMaldonado(String numeroCuenta, String Titular, double saldo) {
            this.numeroCuenta = numeroCuenta;
            this.Titular = Titular;
            this.saldo = saldo;
        }

        public String mostrarCliente() {
            return "Numero Cuenta: " + numeroCuenta + "\n"
                    + "Titular: " + Titular + "\n"
                    + "Saldo: " + saldo + "\n";
        }
        }
    

   
   
        
    


package examenmaldonado;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandrx
 */
public class ExaMaldonado extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ExaMaldonado.class.getName());

    /**
     * Maldoando Farez Christian Alejandro Creates new form ExaMaldonado
     */
    public ExaMaldonado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnComenzar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNumeroCuenta = new javax.swing.JTextField();
        txtTitular = new javax.swing.JTextField();
        txtSaloActual = new javax.swing.JTextField();
        txtMontoAdicional = new javax.swing.JTextField();
        txtMeses = new javax.swing.JTextField();
        txtInteres = new javax.swing.JTextField();
        txtCargoMantenimiento = new javax.swing.JTextField();
        txtMontoUsado = new javax.swing.JTextField();
        txtLimiteCredito = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResumen = new javax.swing.JTextArea();
        cboTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Examen Primer Parcial ");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Maldonado Farez Christian Alejandro");
        getContentPane().add(jLabel2, java.awt.BorderLayout.PAGE_END);

        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(this::btnComenzarActionPerformed);

        jLabel3.setText("Saldo Actual");

        jLabel4.setText("Nombre Titular:");

        jLabel5.setText("Numero de Cuenta");

        jLabel6.setText("Interes");

        jLabel7.setText("meses");

        jLabel8.setText("MontoAdicional");

        jLabel9.setText("LimiteCredito");

        jLabel10.setText("CargoMantenimiento");

        jLabel11.setText("MontoUsado");

        txtResumen.setColumns(20);
        txtResumen.setRows(5);
        jScrollPane1.setViewportView(txtResumen);

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CuentaCorriente", "CuentaAhorro" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(222, 222, 222)
                                .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMontoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSaloActual, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(128, 128, 128)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel10))))
                                    .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMontoUsado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCargoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(btnComenzar)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSaloActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMontoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtLimiteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMontoUsado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCargoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnComenzar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        //Maldonado Farez Christian Alejandro
        try {
            String nombre = txtTitular.getText().trim();
            if (nombre.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ingrese el nombre del titular.");
                return;
            }

            String numeroCuentaStr = txtNumeroCuenta.getText().trim();
            if (!numeroCuentaStr.matches("\\d+")) {
                javax.swing.JOptionPane.showMessageDialog(this, "Número de Cuenta solo permite números enteros.");
                return;
            }
            int NumeroCuenta = Integer.parseInt(numeroCuentaStr);

            double SaldoActual = Double.parseDouble(txtSaloActual.getText());
            if (SaldoActual <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Saldo Actual debe ser mayor a 0");
                return;
            }

            String tipo = cboTipo.getSelectedItem().toString();
            String resumen = "";

            if (tipo.equals("CuentaAhorro")) {
                double Interes = Double.parseDouble(txtInteres.getText());
                if (Interes <= 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "ser mayor a 0");
                    return;
                }

                double meses = Double.parseDouble(txtMeses.getText());
                if (meses <= 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, " mayor a 0");
                    return;
                }

                double montoAdicional = Double.parseDouble(txtMontoAdicional.getText());
                if (montoAdicional <= 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "ser mayor a 0");
                    return;
                }

                CuentaAhorro cuenta = new CuentaAhorro(
                        numeroCuentaStr,
                        nombre,
                        SaldoActual
                );
                cuenta.setTasaInteres(Interes / 100);

                for (int i = 0; i < (int) meses; i++) {
                    cuenta.depositar(montoAdicional);
                    cuenta.aplicarInteres();
                }
                double saldoFinal = cuenta.getSaldo();
                double interesTotal = saldoFinal - SaldoActual - (montoAdicional * meses);

                boolean tieneDescuento = saldoFinal > 1000;

                if (tieneDescuento) {
                    javax.swing.JOptionPane.showMessageDialog(this,
                            "" + nombre + "!\n"
                            + "Su saldo supera $1000.\n"
                            + "Tiene un DESCUENTO  en Tecno PC");
                }
                resumen = "Resultado Cuenta Ahorro \n"
                        + "Nombre :" + nombre + "\n"
                        + "Saldo Inicial" + String.format("%.2f", SaldoActual) + "\n"
                        + "Tipo : Cuenta Ahorro\n"
                        + "Saldo Final " + String.format("%.2f", saldoFinal) + "\n"
                        + "Descuento" + (tieneDescuento ? " Sí  Descuento Tecno PC" : " No aplica");
        //MALDONADO FAREZ CHRITIAN ALEJANDRO
            } else if (tipo.equals("CuentaCorriente")) {

                double LimiteCredito = Double.parseDouble(txtLimiteCredito.getText());
                if (LimiteCredito <= 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "ser mayor a 0");
                    return;
                }
                double MontoUsado = Double.parseDouble(txtMontoUsado.getText());
                if (MontoUsado <= 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "ser mayor a 0");
                    return;
                }
                double cargoMantenimiento = Double.parseDouble(txtCargoMantenimiento.getText());
                if (cargoMantenimiento <= 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "ser mayor a 0");
                    return;
                }

                CuentaCorriente cuenta = new CuentaCorriente(
                        String.valueOf(NumeroCuenta),
                        nombre,
                        SaldoActual
                );
                cuenta.setLimiteCredito(LimiteCredito);


                double saldoFinal = cuenta.getSaldo();

                resumen = "Resultado Cuenta Corriente\n"
                        + "Nombre" + nombre + "\n"
                        + "Saldo Inicial" + String.format("%.2f", SaldoActual) + "\n"
                        + "TipoCuenta Corriente\n"
                        + "Cargo Mensual" + String.format("%.2f", cargoMantenimiento) + "\n"
                        + "Saldo Final" + String.format("%.2f", saldoFinal) + "\n";
            }
            txtResumen.setText(resumen);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor ingrese valores");
        }
    }//GEN-LAST:event_btnComenzarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ExaMaldonado().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzar;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCargoMantenimiento;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtLimiteCredito;
    private javax.swing.JTextField txtMeses;
    private javax.swing.JTextField txtMontoAdicional;
    private javax.swing.JTextField txtMontoUsado;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextArea txtResumen;
    private javax.swing.JTextField txtSaloActual;
    private javax.swing.JTextField txtTitular;
    // End of variables declaration//GEN-END:variables
}

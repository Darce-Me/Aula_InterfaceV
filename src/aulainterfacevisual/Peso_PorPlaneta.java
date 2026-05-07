package aulainterfacevisual;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Peso_PorPlaneta extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Peso_PorPlaneta.class.getName());

    public Peso_PorPlaneta() {
        initComponents();
    }

    public void verificarPlaneta() {
        //Verifica se o número é válido e realiza os calculos

        //Formatação do resultado
        DecimalFormat df1 = new DecimalFormat("00.00");

        int planetas = cb_Planetas.getSelectedIndex();
        double pesoD = Double.parseDouble(txf_Peso.getText());

        if (pesoD < 0) {
            JOptionPane.showMessageDialog(null, "Número inválido");
        } else {

            try {
                double resultado;
                switch (planetas) {
                    case 0:
                        //mercúrio

                        resultado = (pesoD / 10) * 3.6;
                        JOptionPane.showMessageDialog(null, "O seu peso em Mercúrio é: " + df1.format(resultado));

                        break;
                    case 1:
                        //vênus

                        resultado = (pesoD / 10) * 8.7;
                        JOptionPane.showMessageDialog(null, "O seu peso em Vênus é: " + df1.format(resultado));

                        break;
                    case 2:
                        //terra

                        resultado = (pesoD / 10) * 9.8;
                        JOptionPane.showMessageDialog(null, "O seu peso na Terra é: " + df1.format(resultado));

                        break;
                    case 3:
                        //marte

                        resultado = (pesoD / 10) * 3.7;
                        JOptionPane.showMessageDialog(null, "O seu peso em Marte é: " + df1.format(resultado));

                        break;
                    case 4:
                        //jupiter

                        resultado = (pesoD / 10) * 24.79;
                        JOptionPane.showMessageDialog(null, "O seu peso em Júpiter é: " + df1.format(resultado));

                        break;
                    case 5:
                        //saturno

                        resultado = (pesoD / 10) * 10.44;
                        JOptionPane.showMessageDialog(null, "O seu peso em Saturno é: " + df1.format(resultado));

                        break;
                    case 6:
                        //urano

                        resultado = (pesoD / 10) * 8.69;
                        JOptionPane.showMessageDialog(null, "O seu peso em Urano é: " + df1.format(resultado));

                        break;
                    case 7:
                        //netuno

                        resultado = (pesoD / 10) * 11.15;
                        JOptionPane.showMessageDialog(null, "O seu peso em Netuno é: " + df1.format(resultado));

                        break;
                    case 8:
                        //lua

                        resultado = (pesoD / 10) * 1.6;
                        JOptionPane.showMessageDialog(null, "O seu peso na Lua é: " + df1.format(resultado));

                        break;
                    default:
                        throw new AssertionError();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Caixa vazia!");
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jl_pesoPlaneta = new javax.swing.JLabel();
        txf_Peso = new javax.swing.JTextField();
        cb_Planetas = new javax.swing.JComboBox<>();
        jb_Calcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jl_pesoPlaneta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_pesoPlaneta.setText("Peso no planeta Mercúrio(Kg):");

        txf_Peso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txf_Peso.addActionListener(this::txf_PesoActionPerformed);

        cb_Planetas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_Planetas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mercurio", "Vênus", "Terra", "Marte", "Júpiter ", "Saturno", "Urano ", "Netuno", "Lua" }));
        cb_Planetas.addActionListener(this::cb_PlanetasActionPerformed);

        jb_Calcular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jb_Calcular.setText("Calcular Peso");
        jb_Calcular.addActionListener(this::jb_CalcularActionPerformed);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Calculo de Peso por Planeta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_pesoPlaneta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txf_Peso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(cb_Planetas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jb_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_pesoPlaneta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txf_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cb_Planetas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jb_Calcular)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txf_PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_PesoActionPerformed

    }//GEN-LAST:event_txf_PesoActionPerformed

    private void cb_PlanetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_PlanetasActionPerformed
        //Altera o jLabel de peso

        String planetas = cb_Planetas.getSelectedItem().toString();
        jl_pesoPlaneta.setText("Peso no planeta " + planetas + "(Kg): ");
    }//GEN-LAST:event_cb_PlanetasActionPerformed

    private void jb_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CalcularActionPerformed
        //botão que realiza a operação

        verificarPlaneta();
    }//GEN-LAST:event_jb_CalcularActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Peso_PorPlaneta().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_Planetas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_Calcular;
    private javax.swing.JLabel jl_pesoPlaneta;
    private javax.swing.JTextField txf_Peso;
    // End of variables declaration//GEN-END:variables
}

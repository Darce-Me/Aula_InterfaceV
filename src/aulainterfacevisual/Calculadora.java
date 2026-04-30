package aulainterfacevisual;

public class Calculadora extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Calculadora.class.getName());

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txf_num1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txf_num2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txf_result = new javax.swing.JTextField();
        jb_calSum = new javax.swing.JButton();
        jb_calSub = new javax.swing.JButton();
        jb_calMult = new javax.swing.JButton();
        jb_calDiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Super Calculadora");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Super Calculadora Poderosa");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Número 1:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txf_num1.addActionListener(this::txf_num1ActionPerformed);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Número 2:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txf_num2.addActionListener(this::txf_num2ActionPerformed);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Resultado:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txf_result.setEditable(false);
        txf_result.addActionListener(this::txf_resultActionPerformed);

        jb_calSum.setText("Somar");
        jb_calSum.addActionListener(this::jb_calSumActionPerformed);

        jb_calSub.setText("Subtrair");
        jb_calSub.addActionListener(this::jb_calSubActionPerformed);

        jb_calMult.setText("Multiplicar");
        jb_calMult.addActionListener(this::jb_calMultActionPerformed);

        jb_calDiv.setText("Dividir");
        jb_calDiv.addActionListener(this::jb_calDivActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txf_result, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txf_num1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txf_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jb_calSum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_calSub)
                        .addGap(12, 12, 12)
                        .addComponent(jb_calMult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_calDiv)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txf_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txf_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_calSum)
                    .addComponent(jb_calSub)
                    .addComponent(jb_calMult)
                    .addComponent(jb_calDiv))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txf_result, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
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


    private void jb_calSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calSumActionPerformed

        double n1 = Double.parseDouble(txf_num1.getText());
        double n2 = Double.parseDouble(txf_num2.getText());

        double resultD = n1 + n2;

        txf_result.setText(String.valueOf(resultD));
    }//GEN-LAST:event_jb_calSumActionPerformed

    private void txf_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_resultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_resultActionPerformed

    private void txf_num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_num2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_num2ActionPerformed

    private void txf_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_num1ActionPerformed

    private void jb_calSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calSubActionPerformed
        double n1 = Double.parseDouble(txf_num1.getText());
        double n2 = Double.parseDouble(txf_num2.getText());

        double resultD = n1 - n2;

        txf_result.setText(String.valueOf(resultD));
    }//GEN-LAST:event_jb_calSubActionPerformed

    private void jb_calMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calMultActionPerformed
        double n1 = Double.parseDouble(txf_num1.getText());
        double n2 = Double.parseDouble(txf_num2.getText());

        double resultD = n1 * n2;

        txf_result.setText(String.valueOf(resultD));
    }//GEN-LAST:event_jb_calMultActionPerformed

    private void jb_calDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calDivActionPerformed
        double n1 = Double.parseDouble(txf_num1.getText());
        double n2 = Double.parseDouble(txf_num2.getText());

        double resultD = n1 / n2;

        txf_result.setText(String.valueOf(resultD));
    }//GEN-LAST:event_jb_calDivActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Calculadora().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_calDiv;
    private javax.swing.JButton jb_calMult;
    private javax.swing.JButton jb_calSub;
    private javax.swing.JButton jb_calSum;
    private javax.swing.JTextField txf_num1;
    private javax.swing.JTextField txf_num2;
    private javax.swing.JTextField txf_result;
    // End of variables declaration//GEN-END:variables
}

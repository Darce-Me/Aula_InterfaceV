package aulainterfacevisual;

import javax.swing.JOptionPane;

public class Calculadora_Funcional extends javax.swing.JFrame {

    private String texto = "";
    private String operacao = "";
    private double valor, valorAntigo;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Calculadora_Funcional.class.getName());

    public Calculadora_Funcional() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txf_Resultado = new javax.swing.JTextField();
        jb_apagarTudo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jb_tres = new javax.swing.JButton();
        jb_quatro = new javax.swing.JButton();
        jb_zero = new javax.swing.JButton();
        jb_um = new javax.swing.JButton();
        jb_soma = new javax.swing.JButton();
        jb_divisao = new javax.swing.JButton();
        jb_oito = new javax.swing.JButton();
        jb_dois = new javax.swing.JButton();
        jb_nove = new javax.swing.JButton();
        jb_cinco = new javax.swing.JButton();
        jb_sete = new javax.swing.JButton();
        jb_seis = new javax.swing.JButton();
        jb_igual = new javax.swing.JButton();
        jb_ponto = new javax.swing.JButton();
        jb_multiplicacao = new javax.swing.JButton();
        jb_menos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txf_Resultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txf_Resultado.setText("0");

        jb_apagarTudo.setText("CE");
        jb_apagarTudo.addActionListener(this::jb_apagarTudoActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txf_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_apagarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txf_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jb_apagarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jb_tres.setText("3");
        jb_tres.addActionListener(this::jb_tresActionPerformed);

        jb_quatro.setText("4");
        jb_quatro.addActionListener(this::jb_quatroActionPerformed);

        jb_zero.setText("0");
        jb_zero.addActionListener(this::jb_zeroActionPerformed);

        jb_um.setText("1");
        jb_um.addActionListener(this::jb_umActionPerformed);

        jb_soma.setText("+");
        jb_soma.addActionListener(this::jb_somaActionPerformed);

        jb_divisao.setText("/");
        jb_divisao.addActionListener(this::jb_divisaoActionPerformed);

        jb_oito.setText("8");
        jb_oito.addActionListener(this::jb_oitoActionPerformed);

        jb_dois.setText("2");
        jb_dois.addActionListener(this::jb_doisActionPerformed);

        jb_nove.setText("9");
        jb_nove.addActionListener(this::jb_noveActionPerformed);

        jb_cinco.setText("5");
        jb_cinco.addActionListener(this::jb_cincoActionPerformed);

        jb_sete.setText("7");
        jb_sete.addActionListener(this::jb_seteActionPerformed);

        jb_seis.setText("6");
        jb_seis.addActionListener(this::jb_seisActionPerformed);

        jb_igual.setText("=");
        jb_igual.addActionListener(this::jb_igualActionPerformed);

        jb_ponto.setText(",");
        jb_ponto.addActionListener(this::jb_pontoActionPerformed);

        jb_multiplicacao.setText("*");
        jb_multiplicacao.addActionListener(this::jb_multiplicacaoActionPerformed);

        jb_menos.setText("-");
        jb_menos.addActionListener(this::jb_menosActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb_sete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_oito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_nove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jb_um, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_dois, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jb_quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_sete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_oito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_nove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_um, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_dois, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_somaActionPerformed
        valorAntigo = conversaoDouble();
        operacao = "+";
        clean();

    }//GEN-LAST:event_jb_somaActionPerformed

    private void jb_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_zeroActionPerformed
        texto = texto + jb_zero.getText();
        txf_Resultado.setText(texto);
    }//GEN-LAST:event_jb_zeroActionPerformed

    private void jb_seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_seteActionPerformed
        texto = texto + jb_sete.getText();
        txf_Resultado.setText(texto);
    }//GEN-LAST:event_jb_seteActionPerformed

    private void jb_oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_oitoActionPerformed
        texto = texto + jb_oito.getText();
        txf_Resultado.setText(texto);
    }//GEN-LAST:event_jb_oitoActionPerformed

    private void jb_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_noveActionPerformed
        texto = texto + jb_nove.getText();
        txf_Resultado.setText(texto);
    }//GEN-LAST:event_jb_noveActionPerformed

    private void jb_quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_quatroActionPerformed
        texto = texto + jb_quatro.getText();
        txf_Resultado.setText(texto);
    }//GEN-LAST:event_jb_quatroActionPerformed

    private void jb_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cincoActionPerformed
        texto = texto + jb_cinco.getText();
        txf_Resultado.setText(texto);
    }//GEN-LAST:event_jb_cincoActionPerformed

    private void jb_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_seisActionPerformed
        texto = texto + jb_seis.getText();
        txf_Resultado.setText(texto);
    }//GEN-LAST:event_jb_seisActionPerformed

    private void jb_umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_umActionPerformed
        texto = texto + jb_um.getText();
        txf_Resultado.setText(texto);
    }//GEN-LAST:event_jb_umActionPerformed

    private void jb_doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_doisActionPerformed
        texto = texto + jb_dois.getText();
        txf_Resultado.setText(texto);
    }//GEN-LAST:event_jb_doisActionPerformed

    private void jb_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_tresActionPerformed
        texto = texto + jb_tres.getText();
        txf_Resultado.setText(texto);
    }//GEN-LAST:event_jb_tresActionPerformed

    private void jb_pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pontoActionPerformed
        texto = texto + ".";
        txf_Resultado.setText(texto);
    }//GEN-LAST:event_jb_pontoActionPerformed

    private void jb_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_igualActionPerformed
        valor = conversaoDouble();

        double resultado = 0;

        switch (getOperacao()) {
            case "+":
                resultado = valorAntigo + valor;
                break;
            case "-":
                resultado = valorAntigo - valor;
                break;
            case "*":
                resultado = valorAntigo * valor;
                break;
            case "/":
                resultado = valorAntigo / valor;
                break;
        }
        txf_Resultado.setText(String.valueOf(resultado));
        texto = String.valueOf(resultado);
    }//GEN-LAST:event_jb_igualActionPerformed

    private void jb_multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_multiplicacaoActionPerformed
        valorAntigo = conversaoDouble();
        operacao = "*";
        clean();
    }//GEN-LAST:event_jb_multiplicacaoActionPerformed

    private void jb_divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_divisaoActionPerformed
        valorAntigo = conversaoDouble();
        operacao = "/";
        clean();
    }//GEN-LAST:event_jb_divisaoActionPerformed

    private void jb_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_menosActionPerformed
        valorAntigo = conversaoDouble();
        operacao = "-";
        clean();
    }//GEN-LAST:event_jb_menosActionPerformed

    private void jb_apagarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_apagarTudoActionPerformed
        texto = "";
        txf_Resultado.setText("0");
    }//GEN-LAST:event_jb_apagarTudoActionPerformed

    public double conversaoDouble() {
        double valor = Double.parseDouble(txf_Resultado.getText());
        return valor;
    }

    public void clean() {
        txf_Resultado.setText("");
        texto = "";
    }

    public static void main(String args[]) {

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
        java.awt.EventQueue.invokeLater(() -> new Calculadora_Funcional().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_apagarTudo;
    private javax.swing.JButton jb_cinco;
    private javax.swing.JButton jb_divisao;
    private javax.swing.JButton jb_dois;
    private javax.swing.JButton jb_igual;
    private javax.swing.JButton jb_menos;
    private javax.swing.JButton jb_multiplicacao;
    private javax.swing.JButton jb_nove;
    private javax.swing.JButton jb_oito;
    private javax.swing.JButton jb_ponto;
    private javax.swing.JButton jb_quatro;
    private javax.swing.JButton jb_seis;
    private javax.swing.JButton jb_sete;
    private javax.swing.JButton jb_soma;
    private javax.swing.JButton jb_tres;
    private javax.swing.JButton jb_um;
    private javax.swing.JButton jb_zero;
    private javax.swing.JTextField txf_Resultado;
    // End of variables declaration//GEN-END:variables

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorAntigo() {
        return valorAntigo;
    }

    public void setValorAntigo(double valorAntigo) {
        this.valorAntigo = valorAntigo;
    }

}


package aulainterfacevisual;

import javax.swing.JOptionPane;

public class Config_Jogo extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Config_Jogo.class.getName());

    public Config_Jogo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_Dificuldade = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ckb_AtivarMusica = new javax.swing.JCheckBox();
        ckb_AtivarLegenda = new javax.swing.JCheckBox();
        ckb_AtivarTelaCheia = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        rb_Facil = new javax.swing.JRadioButton();
        rb_Medio = new javax.swing.JRadioButton();
        rb_Dificil = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        js_Volume = new javax.swing.JSlider();
        b_Salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções de Jogo"));
        jPanel1.setPreferredSize(new java.awt.Dimension(132, 200));

        ckb_AtivarMusica.setText("Ativar música");

        ckb_AtivarLegenda.setText("Ativar legendas");

        ckb_AtivarTelaCheia.setText("Modo tela cheia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckb_AtivarMusica)
                    .addComponent(ckb_AtivarLegenda)
                    .addComponent(ckb_AtivarTelaCheia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ckb_AtivarMusica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckb_AtivarLegenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckb_AtivarTelaCheia)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dificuldade"));
        jPanel2.setPreferredSize(new java.awt.Dimension(122, 200));

        bg_Dificuldade.add(rb_Facil);
        rb_Facil.setText("Fácil");

        bg_Dificuldade.add(rb_Medio);
        rb_Medio.setText("Médio");
        rb_Medio.addActionListener(this::rb_MedioActionPerformed);

        bg_Dificuldade.add(rb_Dificil);
        rb_Dificil.setText("Difícil");
        rb_Dificil.addActionListener(this::rb_DificilActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_Facil)
                    .addComponent(rb_Medio)
                    .addComponent(rb_Dificil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(rb_Facil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_Medio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_Dificil)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Volume"));

        js_Volume.setMajorTickSpacing(1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(js_Volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(js_Volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        b_Salvar.setText("Salvar");
        b_Salvar.addActionListener(this::b_SalvarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_Salvar)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_Salvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb_MedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_MedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_MedioActionPerformed

    private void rb_DificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_DificilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_DificilActionPerformed

    private void b_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_SalvarActionPerformed
        String dificuldade = "";
        if(rb_Facil.isSelected()){
            dificuldade = "Fácil";
        }else if(rb_Medio.isSelected()){
            dificuldade = "Médio";
        }else if(rb_Dificil.isSelected()){
            dificuldade = "Difícil";
        }
        
        //Formação de Mensagem
        String mensagem = "";
        
        mensagem += "Música "+ckb_AtivarMusica.isSelected()+".\n";
        mensagem += "Legenda "+ckb_AtivarLegenda.isSelected()+".\n";
        mensagem += "Tela cheia "+ckb_AtivarTelaCheia.isSelected()+".\n";
        
        mensagem += "Dificuldade: "+dificuldade+".\n";
        mensagem += "Volume: "+js_Volume.getValue()+".\n";
        
        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_b_SalvarActionPerformed


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
        java.awt.EventQueue.invokeLater(() -> new Config_Jogo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Salvar;
    private javax.swing.ButtonGroup bg_Dificuldade;
    private javax.swing.JCheckBox ckb_AtivarLegenda;
    private javax.swing.JCheckBox ckb_AtivarMusica;
    private javax.swing.JCheckBox ckb_AtivarTelaCheia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSlider js_Volume;
    private javax.swing.JRadioButton rb_Dificil;
    private javax.swing.JRadioButton rb_Facil;
    private javax.swing.JRadioButton rb_Medio;
    // End of variables declaration//GEN-END:variables
}

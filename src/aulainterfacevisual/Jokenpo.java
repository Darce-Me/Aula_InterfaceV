package aulainterfacevisual;

import java.util.Random;

public class Jokenpo extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Jokenpo.class.getName());
    
    public Jokenpo() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_Itens = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rb_Pedra = new javax.swing.JRadioButton();
        rb_Papel = new javax.swing.JRadioButton();
        rb_Tesoura = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jb_confirmacao = new javax.swing.JButton();
        jl_resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Pedra, Papel e Tesoura");

        bg_Itens.add(rb_Pedra);
        rb_Pedra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb_Pedra.setText("Pedra");
        rb_Pedra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rb_Pedra.addActionListener(this::rb_PedraActionPerformed);

        bg_Itens.add(rb_Papel);
        rb_Papel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb_Papel.setText("Papel");

        bg_Itens.add(rb_Tesoura);
        rb_Tesoura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rb_Tesoura.setText("Tesoura");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-rock-48.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-paper-48.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-scissors-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_Pedra)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_Papel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_Tesoura)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_Pedra, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_Tesoura, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addComponent(jLabel3))
                    .addComponent(jLabel4)
                    .addComponent(rb_Papel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jb_confirmacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_confirmacao.setText("Pronto");
        jb_confirmacao.addActionListener(this::jb_confirmacaoActionPerformed);

        jl_resultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_resultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jl_resultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jb_confirmacao))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jl_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_confirmacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jl_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_confirmacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_confirmacaoActionPerformed
        resultado(jogador(), maquina());
    }//GEN-LAST:event_jb_confirmacaoActionPerformed

    private void rb_PedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_PedraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_PedraActionPerformed
    
    public int jogador() {
        int escolhaJ;
        
        if (rb_Pedra.isSelected()) {
            escolhaJ = 1;
        } else if (rb_Papel.isSelected()) {
            escolhaJ = 2;
        } else {
            escolhaJ = 3;
        }        
        
        return escolhaJ;
    }
    
    public int maquina() {
        Random random = new Random();
        
        int escolhaM = random.nextInt(1, 4);
        System.out.println(escolhaM);
        return escolhaM;
    }
    
    public void resultado(int escolhaJ, int escolhaM) {
        
            //mensagem se perder
            if (escolhaJ == 1 && escolhaM == 2) {
                jl_resultado.setText("Pedra perde para Papel!");
            } else if (escolhaJ == 2 && escolhaM == 3) {
                jl_resultado.setText("Papel perde para Tesoura!");
            } else if (escolhaJ == 3 && escolhaM == 1) {
                jl_resultado.setText("Tesoura perde para Pedra! ");
            }
            //mensagem se ganhar
            else if (escolhaJ == 2 && escolhaM == 1) {
                jl_resultado.setText("Papel ganha de Pedra!");
            } else if (escolhaJ == 3 && escolhaM == 2) {
                jl_resultado.setText("Tesoura ganha de Papel!");
            } else if (escolhaJ == 1 && escolhaM == 3) {
                jl_resultado.setText("Pedra ganha de Tesoura!");
            }else{
                jl_resultado.setText("Empate!");
            }

        
    }
    
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
        java.awt.EventQueue.invokeLater(() -> new Jokenpo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_Itens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_confirmacao;
    private javax.swing.JLabel jl_resultado;
    private javax.swing.JRadioButton rb_Papel;
    private javax.swing.JRadioButton rb_Pedra;
    private javax.swing.JRadioButton rb_Tesoura;
    // End of variables declaration//GEN-END:variables
}

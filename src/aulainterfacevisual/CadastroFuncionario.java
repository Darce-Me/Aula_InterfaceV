package aulainterfacevisual;

import javax.swing.JOptionPane;

public class CadastroFuncionario extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName());

    public CadastroFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txf_NomeFunc = new javax.swing.JTextField();
        cb_Setor = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ckb_ValeAlimentacao = new javax.swing.JCheckBox();
        ckb_PlanoDeSaude = new javax.swing.JCheckBox();
        ckb_ValeTransporte = new javax.swing.JCheckBox();
        ckb_HomeOffice = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        rb_Manha = new javax.swing.JRadioButton();
        rb_Tarde = new javax.swing.JRadioButton();
        rb_Noite = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        js_Experiencia = new javax.swing.JSlider();
        jl_Experiencia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jb_Salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome do Funcionário:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Setor");

        cb_Setor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TI", "RH", "Financeiro", "Administrativo", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txf_NomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(199, 199, 199)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cb_Setor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_NomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Setor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Benefícios Desejados");

        ckb_ValeAlimentacao.setText("Vale Alimentação");

        ckb_PlanoDeSaude.setText("Plano de Saúde");

        ckb_ValeTransporte.setText("Vale Transporte");

        ckb_HomeOffice.setText("Home Office");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckb_ValeAlimentacao)
                    .addComponent(ckb_PlanoDeSaude)
                    .addComponent(ckb_ValeTransporte)
                    .addComponent(ckb_HomeOffice)
                    .addComponent(jLabel4))
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(ckb_ValeAlimentacao)
                .addGap(18, 18, 18)
                .addComponent(ckb_PlanoDeSaude)
                .addGap(18, 18, 18)
                .addComponent(ckb_ValeTransporte)
                .addGap(18, 18, 18)
                .addComponent(ckb_HomeOffice)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Turno de Trabalho");

        buttonGroup1.add(rb_Manha);
        rb_Manha.setText("Manhã");

        buttonGroup1.add(rb_Tarde);
        rb_Tarde.setText("Tarde");
        rb_Tarde.addActionListener(this::rb_TardeActionPerformed);

        buttonGroup1.add(rb_Noite);
        rb_Noite.setText("Noite");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_Manha)
                    .addComponent(jLabel5)
                    .addComponent(rb_Tarde)
                    .addComponent(rb_Noite))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(rb_Manha)
                .addGap(29, 29, 29)
                .addComponent(rb_Tarde)
                .addGap(32, 32, 32)
                .addComponent(rb_Noite)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Nível de Experiência");

        js_Experiencia.setMajorTickSpacing(1);
        js_Experiencia.setMaximum(10);
        js_Experiencia.setPaintLabels(true);
        js_Experiencia.setPaintTicks(true);
        js_Experiencia.setSnapToTicks(true);
        js_Experiencia.setValue(5);
        js_Experiencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                js_ExperienciaMouseReleased(evt);
            }
        });

        jl_Experiencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_Experiencia.setText("Experiência: 5");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(js_Experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jl_Experiencia)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_Experiencia)
                .addGap(18, 18, 18)
                .addComponent(js_Experiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Funcionário");

        jb_Salvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_Salvar.setText("Salvar Cadastro");
        jb_Salvar.addActionListener(this::jb_SalvarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jb_Salvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jb_Salvar)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb_TardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_TardeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_TardeActionPerformed
    //Botão de Cadastro
    private void jb_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SalvarActionPerformed

        //Chama a mensagem do JOptionPane
        String mensagem = msg_Cadastro();
        JOptionPane.showMessageDialog(null, mensagem);


    }//GEN-LAST:event_jb_SalvarActionPerformed

    private void js_ExperienciaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_js_ExperienciaMouseReleased
        jl_Experiencia.setText("Experiência: "+js_Experiencia.getValue());
    }//GEN-LAST:event_js_ExperienciaMouseReleased
    //Verificação e Mensagem
    public String msg_Beneficios() {

        String beneficios = "";
        if (ckb_HomeOffice.isSelected()) {
            beneficios += "- Home Office" + "\n";
        }
        if (ckb_PlanoDeSaude.isSelected()) {
            beneficios += "- Plano de Saúde" + "\n";
        }
        if (ckb_ValeAlimentacao.isSelected()) {
            beneficios += "- Vale Alimentação" + "\n";
        }
        if (ckb_ValeTransporte.isSelected()) {
            beneficios += "- Vale Transporte" + "\n";
        }

        return beneficios;

    }

    public String msg_Turno() {
        String turno = "";

        if (rb_Manha.isSelected()) {
            turno = "Manhã";
        } else if (rb_Tarde.isSelected()) {
            turno = "Tarde";
        } else if (rb_Noite.isSelected()) {
            turno = "Noite";
        }

        return turno;
    }

    public String msg_Cadastro() {
        
        validacao();

        String beneficios = msg_Beneficios();
        String turno = msg_Turno();
        String mensagem = "";

        mensagem += "Funcionário: " + txf_NomeFunc.getText() + ".\n"
                + "Setor: " + cb_Setor.getSelectedItem() + ".\n"
                + "Turno: " + turno + ".\n"
                + "Benefícios: \n" + beneficios
                + "Experiência: " + js_Experiencia.getValue();
        return mensagem;
    }
    //Fim das Mensgens

    //Validação de campos vazios
    public void validacao() {
        if (!nomeVazio()) {
            return;
        } else if (!turnoVazio()) {
            return;
        }

    }

    public boolean nomeVazio() {
        if (txf_NomeFunc.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Insira seu nome!", "Erro de cadastro", JOptionPane.ERROR_MESSAGE);

            return false;
        }
        return true;
    }

    public boolean turnoVazio() {
        if (!rb_Manha.isSelected() && !rb_Noite.isSelected() && !rb_Tarde.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione o turno", "Erro de Cadastro", JOptionPane.ERROR_MESSAGE);

            return false;
        }
        return true;
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
        java.awt.EventQueue.invokeLater(() -> new CadastroFuncionario().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_Setor;
    private javax.swing.JCheckBox ckb_HomeOffice;
    private javax.swing.JCheckBox ckb_PlanoDeSaude;
    private javax.swing.JCheckBox ckb_ValeAlimentacao;
    private javax.swing.JCheckBox ckb_ValeTransporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jb_Salvar;
    private javax.swing.JLabel jl_Experiencia;
    private javax.swing.JSlider js_Experiencia;
    private javax.swing.JRadioButton rb_Manha;
    private javax.swing.JRadioButton rb_Noite;
    private javax.swing.JRadioButton rb_Tarde;
    private javax.swing.JTextField txf_NomeFunc;
    // End of variables declaration//GEN-END:variables
}

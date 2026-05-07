package aulainterfacevisual;

import javax.swing.JOptionPane;

public class Exemplo_ComboBox extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Exemplo_ComboBox.class.getName());

    public Exemplo_ComboBox() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb_Produtos = new javax.swing.JComboBox<>();
        txf_ProdutoSelecionado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txf_NovoProduto = new javax.swing.JTextField();
        jb_Salvar = new javax.swing.JButton();
        jb_Excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Trabalhando com ComboBox");

        cb_Produtos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_Produtos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monitor", "Mouse", "Teclado", "MousePad", "Headset", "Microfone" }));
        cb_Produtos.addActionListener(this::cb_ProdutosActionPerformed);

        txf_ProdutoSelecionado.setEditable(false);
        txf_ProdutoSelecionado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txf_ProdutoSelecionado.addActionListener(this::txf_ProdutoSelecionadoActionPerformed);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Produto selecionado:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Novo produto:");

        txf_NovoProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txf_NovoProduto.addActionListener(this::txf_NovoProdutoActionPerformed);

        jb_Salvar.setText("Salvar");
        jb_Salvar.addActionListener(this::jb_SalvarActionPerformed);

        jb_Excluir.setText("Excluir");
        jb_Excluir.addActionListener(this::jb_ExcluirActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txf_ProdutoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txf_NovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_Produtos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_Salvar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_Excluir)
                        .addGap(106, 106, 106))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txf_NovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Salvar)
                    .addComponent(jb_Excluir))
                .addGap(18, 18, 18)
                .addComponent(cb_Produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_ProdutoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16))
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

    private void cb_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ProdutosActionPerformed

        String produtoSelecionado = cb_Produtos.getSelectedItem().toString();
        txf_ProdutoSelecionado.setText(produtoSelecionado);
    }//GEN-LAST:event_cb_ProdutosActionPerformed

    private void txf_ProdutoSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_ProdutoSelecionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_ProdutoSelecionadoActionPerformed

    private void txf_NovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_NovoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_NovoProdutoActionPerformed

    private void jb_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SalvarActionPerformed
        try {
            cb_Produtos.addItem(txf_NovoProduto.getText());
            JOptionPane.showMessageDialog(null, "Produto cadastrado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!");
        }

    }//GEN-LAST:event_jb_SalvarActionPerformed

    private void jb_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ExcluirActionPerformed
        try {
            String produtoSelecionado = cb_Produtos.getSelectedItem().toString();

            cb_Produtos.removeItem(produtoSelecionado);
            JOptionPane.showMessageDialog(null, "Produto removido!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }//GEN-LAST:event_jb_ExcluirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Exemplo_ComboBox().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_Produtos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_Excluir;
    private javax.swing.JButton jb_Salvar;
    private javax.swing.JTextField txf_NovoProduto;
    private javax.swing.JTextField txf_ProdutoSelecionado;
    // End of variables declaration//GEN-END:variables
}

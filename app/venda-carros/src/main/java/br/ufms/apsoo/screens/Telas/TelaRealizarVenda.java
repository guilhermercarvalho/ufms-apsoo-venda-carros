/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.apsoo.screens.Telas;

import javax.swing.JOptionPane;

/**
 *
 * @author alexlinux
 */
public class TelaRealizarVenda extends javax.swing.JFrame {

    /**
     * Creates new form TelaRealizarVenda
     */
    public TelaRealizarVenda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        caixaTextoCPF = new javax.swing.JTextField();
        caixaTextoNome = new javax.swing.JTextField();
        marcaBox = new javax.swing.JComboBox<>();
        modeloBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        campoTextoValorEntrada = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        vezesBox = new javax.swing.JComboBox<>();
        botaoConfirmar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        caixaTextoValorDoCarro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        caixaTextoValorTotal = new javax.swing.JTextField();
        formaPagamentoBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        caixaTextoCodigoGerente = new javax.swing.JTextField();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Realizar Venda");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Marca:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Modelo:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Forma De Pagamento:");

        caixaTextoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoCPFActionPerformed(evt);
            }
        });

        caixaTextoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaTextoNomeActionPerformed(evt);
            }
        });

        marcaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        marcaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaBoxActionPerformed(evt);
            }
        });

        modeloBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        modeloBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("Valor de Entrada:");

        campoTextoValorEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoValorEntradaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Parcelas:");

        vezesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0x", "12x", "24x", "36x", "68x", "72x" }));

        botaoConfirmar.setText("Confirmar");
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setText("Valor do Carro:");

        caixaTextoValorDoCarro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setText("Total:");

        formaPagamentoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Parcelado", "Dinheiro", "Cartão De Crédito", "Cartão De Débito", "Cheque" }));
        formaPagamentoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formaPagamentoBoxActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setText("Código do Gerente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(129, 129, 129))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoTextoValorEntrada)
                                    .addComponent(vezesBox, 0, 250, Short.MAX_VALUE)
                                    .addComponent(caixaTextoValorTotal)
                                    .addComponent(caixaTextoCodigoGerente)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(modeloBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(caixaTextoCPF)
                                            .addComponent(caixaTextoNome)
                                            .addComponent(marcaBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(formaPagamentoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(caixaTextoValorDoCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(botaoConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225)
                        .addComponent(botaoCancelar)))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaTextoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caixaTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modeloBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaTextoValorDoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addComponent(formaPagamentoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoValorEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vezesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(caixaTextoCodigoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(caixaTextoValorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirmar)
                    .addComponent(botaoCancelar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caixaTextoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoCPFActionPerformed

    private void caixaTextoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaTextoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaTextoNomeActionPerformed

    private void marcaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaBoxActionPerformed

    private void modeloBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloBoxActionPerformed

    private void campoTextoValorEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoValorEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoValorEntradaActionPerformed

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        if(caixaTextoCPF.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"CPF não preeenchido!",null, WIDTH);
        }
        if(marcaBox.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null,"Escolha alguma marca!",null, WIDTH);
        }
        if(modeloBox.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null,"Escolha algum modelo!",null, WIDTH);
        }
        if(campoTextoValorEntrada.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Digite um valor de entrada!",null, WIDTH);
        }
        if(formaPagamentoBox.getSelectedItem().equals("Cheque") && caixaTextoCodigoGerente.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Digite o código do gerente",null, WIDTH);
        }


    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void formaPagamentoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formaPagamentoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formaPagamentoBoxActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRealizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRealizarVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JTextField caixaTextoCPF;
    private javax.swing.JTextField caixaTextoCodigoGerente;
    private javax.swing.JTextField caixaTextoNome;
    private javax.swing.JTextField caixaTextoValorDoCarro;
    private javax.swing.JTextField caixaTextoValorTotal;
    private javax.swing.JTextField campoTextoValorEntrada;
    private javax.swing.JComboBox<String> formaPagamentoBox;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JComboBox<String> marcaBox;
    private javax.swing.JComboBox<String> modeloBox;
    private javax.swing.JComboBox<String> vezesBox;
    // End of variables declaration//GEN-END:variables
}
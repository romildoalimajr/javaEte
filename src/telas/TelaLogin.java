/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import static java.awt.Color.red;
import javax.swing.JOptionPane;

/**
 *
 * @author ALPHA OMEGA
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        getContentPane().setBackground(red);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        passSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 51));
        setForeground(new java.awt.Color(153, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 0, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quebraTudo2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 499, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 374, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Senha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 453, -1, -1));

        txtLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 414, 315, -1));

        passSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(passSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 488, 315, -1));

        btnEntrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeEntrar.png"))); // NOI18N
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 534, 139, -1));

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeSai.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 534, 132, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // Código do botão entrar
        
        if (txtLogin.getText().equals("") && passSenha.getPassword().equals("")){
           JOptionPane.showMessageDialog(null,"Digite o Login e a Senha!");
        }
        if (txtLogin.getText().equals("admin")&& passSenha.getPassword().equals("admin")){
            TelaInicial inicial = new TelaInicial();
            inicial.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Login e/ou Senha Inválido!");
            txtLogin.setText("");
            passSenha.setText("");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        // TODO add your handling code here:
        if (txtLogin.getText().equals("") && passSenha.getPassword().equals("")){
           JOptionPane.showMessageDialog(null,"Digite o Login e a Senha!");
        }
        if (txtLogin.getText().equals("admin")&& passSenha.getPassword().equals("admin")){
            TelaInicial inicial = new TelaInicial();
            inicial.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Login e/ou Senha Inválido!");
            txtLogin.setText("");
            passSenha.setText("");
        }
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed
        // TODO add your handling code here:
        if (txtLogin.getText().equals("") && passSenha.getPassword().equals("")){
           JOptionPane.showMessageDialog(null,"Digite o Login e a Senha!");
        }
        if (txtLogin.getText().equals("admin")&& passSenha.getPassword().equals("admin")){
            TelaInicial inicial = new TelaInicial();
            inicial.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Login e/ou Senha Inválido!");
            txtLogin.setText("");
            passSenha.setText("");
        }
    }//GEN-LAST:event_btnEntrarKeyPressed

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
                if ("Liquid".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passSenha;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
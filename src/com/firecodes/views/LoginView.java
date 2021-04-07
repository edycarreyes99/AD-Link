/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firecodes.views;

import com.firecodes.services.GlobalService;
import java.awt.event.KeyEvent;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.swing.JOptionPane;

/**
 *
 * @author Edycar Reyes
 */
public class LoginView extends javax.swing.JFrame {

    // Component's variables
    GlobalService service;

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("AD Link - Login");
        this.service = new GlobalService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appNameLabel = new javax.swing.JLabel();
        domainLabel = new javax.swing.JLabel();
        domainTxtField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameTxtField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appNameLabel.setFont(new java.awt.Font("Fira Sans", 0, 36)); // NOI18N
        appNameLabel.setText("AD Link");

        domainLabel.setLabelFor(domainTxtField);
        domainLabel.setText("Dominio:");

        domainTxtField.setText("192.168.134.4");
        domainTxtField.setToolTipText("");
        domainTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                domainTxtFieldKeyReleased(evt);
            }
        });

        usernameLabel.setText("Nombre de usuario:");

        usernameTxtField.setText("ereyes");
        usernameTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameTxtFieldKeyReleased(evt);
            }
        });

        passwordLabel.setText("Contraseña:");

        passwordTxtField.setText("Dios1Padre");
        passwordTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordTxtFieldKeyReleased(evt);
            }
        });

        loginBtn.setText("Iniciar Sesión");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(appNameLabel)
                        .addContainerGap(139, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(domainLabel)
                            .addComponent(passwordLabel)
                            .addComponent(usernameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameTxtField)
                            .addComponent(domainTxtField)
                            .addComponent(passwordTxtField))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(domainLabel)
                    .addComponent(domainTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(loginBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Method that is triggered when the user clicks in the "Login" button
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        this.login();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void domainTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_domainTxtFieldKeyReleased
        // Verify if the key-released is the Enter key
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.login();
        }
    }//GEN-LAST:event_domainTxtFieldKeyReleased

    private void usernameTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTxtFieldKeyReleased
        // Verify if the key-released is the Enter key
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.login();
        }
    }//GEN-LAST:event_usernameTxtFieldKeyReleased

    private void passwordTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTxtFieldKeyReleased
        // Verify if the key-released is the Enter key
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.login();
        }
    }//GEN-LAST:event_passwordTxtFieldKeyReleased

    // Method to do login
    private void login() {
        if (this.verifyInputs()) {
            String[] splittedDomain = this.domainTxtField.getText().split("\\.");
            String baseDomain = "";
            for (int i = 0; i < splittedDomain.length; i++) {
                if (i + 1 != splittedDomain.length) {
                    baseDomain += "DC=" + splittedDomain[i] + ",";
                } else {
                    baseDomain += "DC=" + splittedDomain[i];
                }
            }
            try {
                System.out.println("Splitted domain is:" + baseDomain);
                Properties env = new Properties();
                env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
                env.put(Context.PROVIDER_URL, "ldap://" + this.domainTxtField.getText());
                env.put(Context.SECURITY_AUTHENTICATION, "simple");
                env.put(Context.SECURITY_PRINCIPAL, this.usernameTxtField.getText()+"@nsel-clnsa.com.ni");
                env.put(Context.SECURITY_CREDENTIALS, this.passwordTxtField.getText());
                DirContext con = new InitialDirContext(env);
                con.close();
                System.out.println("Inicio de sesión Correcto.");
                this.service.showMessage(this, "Inicio de sesión correcto", "Inicio de sesion correcto", "info");
            } catch (Exception e) {
                System.out.println("Inicio de sesión erróneo: " + e.toString());
                this.service.showMessage(this, "Inicio de sesión erróneo: ", e.toString(), "error");
            }

            this.service.showMessage(this, "Inicio de sesión completo", "Inicio de sesión completo", "plain");
        }
    }

    // Method to verify login inputs
    private boolean verifyInputs() {
        // Determinate if the required textfields are not empty
        if (this.domainTxtField.getText().isEmpty()) {
            this.service.showMessage(this, "El campo de \"Dominio\" no debe de esar vacío.", "Campos requeridos sin rellenar", "warning");
            return false;
        } else if (this.usernameTxtField.getText().isEmpty()) {
            this.service.showMessage(this, "El campo de \"Nombre de usuario\" no debe de esar vacío.", "Campos requeridos sin rellenar", "warning");
            return false;
        } else if (this.passwordTxtField.getText().isEmpty()) {
            this.service.showMessage(this, "El campo de \"contraseña\" no debe de esar vacío.", "Campos requeridos sin rellenar", "warning");
            return false;
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appNameLabel;
    private javax.swing.JLabel domainLabel;
    private javax.swing.JTextField domainTxtField;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}

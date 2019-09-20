/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.vistas;

import edu.cecar.componentes.singletons.SingletonAccesoAPI;
import edu.cecar.controladores.ControladorUsuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Vincenzo Angelone
 */
public final class VistaLogPanel extends javax.swing.JFrame {

    /**
     * Creates new form VistaLogPanel
     */
    public VistaLogPanel() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.getContentPane().setBackground(Color.getHSBColor(33, 82, 44));
        panel_registro.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panel_entrar = new javax.swing.JPanel();
        bt_Entrar = new javax.swing.JButton();
        pass_Contraseña = new javax.swing.JPasswordField();
        text_Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_registrarse = new javax.swing.JButton();
        panel_registro = new javax.swing.JPanel();
        bt_registro = new javax.swing.JButton();
        pass_ContraseñaRegistro = new javax.swing.JPasswordField();
        text_UsuarioRegistro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bt_Logearse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GoRest");
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(615, 450));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setForeground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 30);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 30, 610, 60);

        panel_entrar.setBackground(new java.awt.Color(255, 204, 102));

        bt_Entrar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        bt_Entrar.setText("Entrar");
        bt_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EntrarActionPerformed(evt);
            }
        });

        pass_Contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pass_ContraseñaKeyPressed(evt);
            }
        });

        text_Usuario.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        text_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_UsuarioKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel3.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel2.setText("Contraseña: ");

        bt_registrarse.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        bt_registrarse.setText("Registro");
        bt_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_entrarLayout = new javax.swing.GroupLayout(panel_entrar);
        panel_entrar.setLayout(panel_entrarLayout);
        panel_entrarLayout.setHorizontalGroup(
            panel_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_entrarLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(panel_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_entrarLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_entrarLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_entrarLayout.createSequentialGroup()
                        .addComponent(bt_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        panel_entrarLayout.setVerticalGroup(
            panel_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_entrarLayout.createSequentialGroup()
                .addGroup(panel_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_entrarLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_entrarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(text_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_Contraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        getContentPane().add(panel_entrar);
        panel_entrar.setBounds(0, 90, 610, 360);

        panel_registro.setBackground(new java.awt.Color(255, 204, 102));

        bt_registro.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        bt_registro.setText("Registrarse");
        bt_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registroActionPerformed(evt);
            }
        });

        pass_ContraseñaRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pass_ContraseñaRegistroKeyPressed(evt);
            }
        });

        text_UsuarioRegistro.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        text_UsuarioRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_UsuarioRegistroKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel5.setText("Contraseña: ");

        bt_Logearse.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        bt_Logearse.setText("Log");
        bt_Logearse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LogearseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_registroLayout = new javax.swing.GroupLayout(panel_registro);
        panel_registro.setLayout(panel_registroLayout);
        panel_registroLayout.setHorizontalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_UsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addComponent(bt_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Logearse, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass_ContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        panel_registroLayout.setVerticalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_UsuarioRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_ContraseñaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_Logearse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        getContentPane().add(panel_registro);
        panel_registro.setBounds(0, 90, 610, 360);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EntrarActionPerformed
        try {
            ControladorUsuario controladorUsuario = new ControladorUsuario();
            if (controladorUsuario.consultarUsuario(text_Usuario.getText(), pass_Contraseña.getText())) {
                SingletonAccesoAPI.getinstanceUser();
                SingletonAccesoAPI.getinstanceAlbum();
                SingletonAccesoAPI.getinstanceComment();
                SingletonAccesoAPI.getinstancePhoto();
                SingletonAccesoAPI.getinstancePost();
                dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new VistaPrincipal().setVisible(true);
                    }
                });
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos, intente nuevamente.");
        }

    }//GEN-LAST:event_bt_EntrarActionPerformed

    private void pass_ContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass_ContraseñaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                ControladorUsuario controladorUsuario = new ControladorUsuario();
                if (controladorUsuario.consultarUsuario(text_Usuario.getText(), pass_Contraseña.getText())) {
                    SingletonAccesoAPI.getinstanceUser();
                    SingletonAccesoAPI.getinstanceAlbum();
                    SingletonAccesoAPI.getinstanceComment();
                    SingletonAccesoAPI.getinstancePhoto();
                    SingletonAccesoAPI.getinstancePost();
                    dispose();
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new VistaPrincipal().setVisible(true);
                        }
                    });
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos, intente nuevamente.");
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            evt.consume();
        }

    }//GEN-LAST:event_pass_ContraseñaKeyPressed

    private void bt_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registroActionPerformed
        // TODO add your handling code here:
        try {
            ControladorUsuario controladorUsuario = new ControladorUsuario();
            if ((controladorUsuario.registrarUsuario(text_UsuarioRegistro.getText(), pass_ContraseñaRegistro.getText()) == true)) {
                JOptionPane.showMessageDialog(null, "Registro completado.");
                panel_registro.setVisible(false);
                panel_entrar.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ya hay alguien registrado con ese Username.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos, intente nuevamente.");
        }
    }//GEN-LAST:event_bt_registroActionPerformed

    private void pass_ContraseñaRegistroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass_ContraseñaRegistroKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                ControladorUsuario controladorUsuario = new ControladorUsuario();
                if (controladorUsuario.registrarUsuario(text_UsuarioRegistro.getText(), pass_ContraseñaRegistro.getText()) == true) {
                    JOptionPane.showMessageDialog(null, "Registro completado.");
                    panel_registro.setVisible(false);
                    panel_entrar.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Ya hay alguien registrado con ese Username.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos, intente nuevamente.");
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_pass_ContraseñaRegistroKeyPressed

    private void bt_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarseActionPerformed
        // TODO add your handling code here:
        text_Usuario.setText("");
        text_UsuarioRegistro.setText("");
        pass_Contraseña.setText("");
        pass_ContraseñaRegistro.setText("");
        panel_entrar.setVisible(false);
        panel_registro.setVisible(true);
    }//GEN-LAST:event_bt_registrarseActionPerformed

    private void bt_LogearseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LogearseActionPerformed
        // TODO add your handling code here:
        text_Usuario.setText("");
        text_UsuarioRegistro.setText("");
        pass_Contraseña.setText("");
        pass_ContraseñaRegistro.setText("");
        panel_entrar.setVisible(true);
        panel_registro.setVisible(false);
    }//GEN-LAST:event_bt_LogearseActionPerformed

    private void text_UsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_UsuarioKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_text_UsuarioKeyPressed

    private void text_UsuarioRegistroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_UsuarioRegistroKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_text_UsuarioRegistroKeyPressed

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
            java.util.logging.Logger.getLogger(VistaLogPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Entrar;
    private javax.swing.JButton bt_Logearse;
    private javax.swing.JButton bt_registrarse;
    private javax.swing.JButton bt_registro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel_entrar;
    private javax.swing.JPanel panel_registro;
    private javax.swing.JPasswordField pass_Contraseña;
    private javax.swing.JPasswordField pass_ContraseñaRegistro;
    private javax.swing.JTextField text_Usuario;
    private javax.swing.JTextField text_UsuarioRegistro;
    // End of variables declaration//GEN-END:variables
}

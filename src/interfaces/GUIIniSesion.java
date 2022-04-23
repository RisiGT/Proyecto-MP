/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import practicamp.BaseDatos;

/**
 *
 * @author PcCom
 */
public class GUIIniSesion extends javax.swing.JFrame {
    private String nombre;
    private String password;
    private BaseDatos base;

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }
    /**
     * Creates new form GUIIniSesion
     */
    public GUIIniSesion() {
        initComponents();
        this.base=new BaseDatos();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        InicSesion = new javax.swing.JButton();
        tfContraseña = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        Title.setText("PUSH OR NOT PUSH, BUT NOT PULL");
        Title.setToolTipText("");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 910, 120));

        lblUser.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        lblUser.setText("Usuario");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 120, 30));

        lblContraseña.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        lblContraseña.setText("Contraseña");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 130, 30));

        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });
        getContentPane().add(tfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 190, 30));

        InicSesion.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        InicSesion.setText("Entrar");
        InicSesion.setToolTipText("");
        InicSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicSesionMouseClicked(evt);
            }
        });
        InicSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicSesionActionPerformed(evt);
            }
        });
        getContentPane().add(InicSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 120, 40));

        tfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(tfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, 190, 30));

        Salir.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        Salir.setText("Salir");
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 100, -1));

        jPasswordField1.setText("bnm");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 240, 150, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo Espada.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-400, -190, 1670, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserActionPerformed

    private void InicSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicSesionMouseClicked
        // TODO add your handling code here:
        //this.Password= new String(Arrays.toString(Password.getPassword()));
        this.nombre = new String(tfUser.getText());
        this.password = new String(tfContraseña.getText());
        BaseDatos b=this.base;
        try {
            b.Deserialize();
        } catch (IOException ex) {
            Logger.getLogger(GUIIniSesion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIIniSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(b.pertenece(nombre)){
            if(b.okIni(nombre, password)){
                System.out.print("Abrir menu");
                //aqui iniciamos el nuevo menu
            }
        }
        dispose();
    }//GEN-LAST:event_InicSesionMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void tfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseñaActionPerformed

    private void InicSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InicSesionActionPerformed

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
            java.util.logging.Logger.getLogger(GUIIniSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIIniSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIIniSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIIniSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIIniSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InicSesion;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField tfContraseña;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import personajes.Personaje;
import practicamp.BaseDatos;
import practicamp.Desafio;
import practicamp.Usuario;

/**
 *
 * @author pcris
 */
public class GUIDesafiado extends javax.swing.JFrame {

    private Desafio desafio;
    private Usuario usuario;
    private BaseDatos base;

    /**
     * Creates new form GUIDesafiado
     */
    public GUIDesafiado(Usuario usuario, Desafio desafio) {
        this.usuario = usuario;
        this.desafio = desafio;
        initComponents();
        this.base = new BaseDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MensajeIni = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        MensajeOro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaPersonajes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaArmas = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaArmaduras = new javax.swing.JList<>();
        MostrarArmas = new javax.swing.JButton();
        MostrarArmaduras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        MensajeIni.setText("has sido desafiado por:");

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        MensajeOro.setText("Si cancelas perderas: ");

        jLabel2.setText("Seleccione su personaje");

        jScrollPane1.setViewportView(ListaPersonajes);

        jScrollPane2.setViewportView(ListaArmas);

        jScrollPane3.setViewportView(ListaArmaduras);

        MostrarArmas.setText("Armas disponibles");
        MostrarArmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarArmasActionPerformed(evt);
            }
        });

        MostrarArmaduras.setText("Armaduras disponibles");
        MostrarArmaduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarArmadurasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(MensajeIni, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(Aceptar)
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cancelar)
                            .addComponent(MensajeOro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MostrarArmas)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(MostrarArmaduras, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(MensajeIni, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(MostrarArmas)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Aceptar)
                            .addComponent(Cancelar))
                        .addGap(41, 41, 41)
                        .addComponent(MensajeOro)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(MostrarArmaduras)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarArmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarArmasActionPerformed
        DefaultListModel dlm1 = new DefaultListModel();
        BaseDatos b = new BaseDatos();
        try {
            b.DeserializePro("Arma");
        } catch (IOException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i = b.getListaArmas().size();
        for (int j = 0; j < i; j++) {
            dlm1.addElement(b.getListaArmas().get(j).getName());
        }
        ListaArmas.setModel(dlm1);
    }//GEN-LAST:event_MostrarArmasActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if (!(ListaPersonajes.getSelectedValue() == (null))) {
            if (!(ListaArmas.getSelectedValue() == (null))) {
                if (!(ListaArmaduras.getSelectedValue() == (null))) {
                    BaseDatos b = this.base;
                    Personaje personaje = usuario.getPersonaje(ListaPersonajes.getSelectedValue());
                    personaje.setArmasActivas(personaje.getArma(ListaArmas.getSelectedValue()));
                    personaje.setArmaduraActiva(personaje.getArmadura(ListaArmaduras.getSelectedValue()));
                    try {
                        b.DeserializePro("Desafio");
                    } catch (IOException ex) {
                        Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    for (Desafio desafio : b.getListadesafios()) {
                        if (desafio.getDesafiado().getNombre().equals(usuario.getNombre())) {
                            desafio.setPersonajeDesafiado(personaje);
                            desafio.setEstado(1);
                        }
                    }
                    try {
                        b.SerializePro("Desafio");
                    } catch (IOException ex) {
                        Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    GUIMenuUsuario i = new GUIMenuUsuario(usuario);
                    i.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione la armadura");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un arma");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un personaje");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void MostrarArmadurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarArmadurasActionPerformed
        DefaultListModel dlm1 = new DefaultListModel();
        BaseDatos b = new BaseDatos();
        try {
            b.DeserializePro("Armadura");
        } catch (IOException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i = b.getListaArmaduras().size();
        for (int j = 0; j < i; j++) {
            dlm1.addElement(b.getListaArmaduras().get(j).getName());
        }
        ListaArmaduras.setModel(dlm1);
    }//GEN-LAST:event_MostrarArmadurasActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        BaseDatos b = this.base;
        try {
            b.DeserializePro("Usuario");
        } catch (IOException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Usuario usuario : b.getListausuarios()) {
            if (usuario.getNombre().equals(this.usuario.getNombre())) {
                usuario.RestarOro(desafio.oroPorRechazar());
            }
        }
        try {
            b.SerializePro("Usuario");
        } catch (IOException ex) {
            Logger.getLogger(GUIDesafiado.class.getName()).log(Level.SEVERE, null, ex);
        }
        GUIMenuUsuario i = new GUIMenuUsuario(usuario);
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        MensajeIni.setText("Has sido desafiado por " + desafio.getDesafiante().getNombre());
        MensajeOro.setText("Si cancelas perderas " + Integer.toString(desafio.oroPorRechazar()) + " de oro");
        DefaultListModel dlm1 = new DefaultListModel();
        int i = usuario.getPersonajes().size();
        for (int j = 0; j < i; j++) {
            dlm1.addElement(usuario.getPersonajes().get(j).getNombre());
        }
        ListaPersonajes.setModel(dlm1);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GUIDesafiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIDesafiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIDesafiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIDesafiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIDesafiado(usuario, desafio).setVisible(true);
                MensajeIni.setText("Has sido desafiado por " + desafio.getDesafiante());
                MensajeOro.setText("Si cancelas perderas " + desafio.oroPorRechazar() + " de oro");
                DefaultListModel dlm1 = new DefaultListModel();
                int i = usuario.getPersonajes().size();
                for (int j = 0; j < i; j++) {
                    dlm1.addElement(usuario.getPersonajes().get(j).getNombre());
                }
                ListaPersonajes.setModel(dlm1);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JList<String> ListaArmaduras;
    private javax.swing.JList<String> ListaArmas;
    private javax.swing.JList<String> ListaPersonajes;
    private javax.swing.JLabel MensajeIni;
    private javax.swing.JLabel MensajeOro;
    private javax.swing.JButton MostrarArmaduras;
    private javax.swing.JButton MostrarArmas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}

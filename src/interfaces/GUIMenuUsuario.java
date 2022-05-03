/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import interfacesPersonalizacion.GUIEliminarPersonaje;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import practicamp.BaseDatos;
import practicamp.Desafio;
import practicamp.Usuario;

/**
 *
 * @author pcris
 */
public class GUIMenuUsuario extends javax.swing.JFrame {

    private Usuario usuario;
    private BaseDatos base;

    /**
     * Creates new form GUIMenuUsuario
     */
    public GUIMenuUsuario(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        this.setLocationRelativeTo(null);
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

        CrearPersonaje = new javax.swing.JButton();
        BorrarPersonaje = new javax.swing.JButton();
        ElegirEquipamiento = new javax.swing.JButton();
        Desafiar = new javax.swing.JButton();
        ConsultarOro = new javax.swing.JButton();
        Ranking = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        CrearPersonaje.setText("Crear personaje");
        CrearPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearPersonajeActionPerformed(evt);
            }
        });

        BorrarPersonaje.setText("Borrar personaje");
        BorrarPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarPersonajeActionPerformed(evt);
            }
        });

        ElegirEquipamiento.setText("Seleccionar equipamiento");
        ElegirEquipamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElegirEquipamientoActionPerformed(evt);
            }
        });

        Desafiar.setText("Desafiar");
        Desafiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesafiarActionPerformed(evt);
            }
        });

        ConsultarOro.setText("Consultar oro");
        ConsultarOro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarOroActionPerformed(evt);
            }
        });

        Ranking.setText("Ranking");
        Ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankingActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CrearPersonaje)
                            .addComponent(BorrarPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Desafiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Ranking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ConsultarOro, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ElegirEquipamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(CrearPersonaje)
                .addGap(18, 18, 18)
                .addComponent(BorrarPersonaje)
                .addGap(29, 29, 29)
                .addComponent(ElegirEquipamiento)
                .addGap(18, 18, 18)
                .addComponent(Desafiar)
                .addGap(34, 34, 34)
                .addComponent(ConsultarOro)
                .addGap(18, 18, 18)
                .addComponent(Ranking)
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearPersonajeActionPerformed
        GUISelectPersonaje g = new GUISelectPersonaje(usuario);
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CrearPersonajeActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
         GUIMenuIni g3 = new GUIMenuIni();
          g3.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_SalirActionPerformed

    private void DesafiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesafiarActionPerformed
        GUIDesafiar i = new GUIDesafiar(usuario);
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DesafiarActionPerformed

    private void RankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankingActionPerformed
        GUIRanking g = new GUIRanking(usuario);
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RankingActionPerformed

    private void ElegirEquipamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElegirEquipamientoActionPerformed
     GUISelectEquipamiento g = null;
        try {
            g = new GUISelectEquipamiento(usuario);
        } catch (IOException ex) {
            Logger.getLogger(GUIMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
      g.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_ElegirEquipamientoActionPerformed

    private void BorrarPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarPersonajeActionPerformed
        GUIEliminarPersonaje i = new GUIEliminarPersonaje(usuario);
        i.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_BorrarPersonajeActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        BaseDatos b = new BaseDatos();
        try {
            b.DeserializePro("Desafio");
        } catch (IOException ex) {
            Logger.getLogger(GUIMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Desafio desafio : b.getListadesafios()) {
            if ((desafio.getDesafiado().getNombre().equals(usuario.getNombre())) && (desafio.getEstado() == 0)) {
                GUIDesafiado i = new GUIDesafiado(usuario, desafio);
                i.setVisible(true);
                this.setVisible(false);
            }
        }          // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void ConsultarOroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarOroActionPerformed
GUIOroBatallas i = new GUIOroBatallas(usuario);
i.setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_ConsultarOroActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() { //NO SE SI VA A FUNCIONAR
            public void run() {
                BaseDatos b = new BaseDatos();
                try {
                    b.DeserializePro("Desafio");
                } catch (IOException ex) {
                    Logger.getLogger(GUIMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUIMenuUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (Desafio desafio : b.getListadesafios()) {
                    if ((desafio.getDesafiado().equals(usuario.getNombre())) && (desafio.getEstado() == 0)) {
                        GUIDesafiado i = new GUIDesafiado(usuario, desafio);
                        i.setVisible(true);
                        new GUIMenuUsuario(usuario).setVisible(false);
                    }
                }
                new GUIMenuUsuario(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarPersonaje;
    private javax.swing.JButton ConsultarOro;
    private javax.swing.JButton CrearPersonaje;
    private javax.swing.JButton Desafiar;
    private javax.swing.JButton ElegirEquipamiento;
    private javax.swing.JButton Ranking;
    private javax.swing.JButton Salir;
    // End of variables declaration//GEN-END:variables
}

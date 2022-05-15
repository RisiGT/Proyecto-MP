/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import practicamp.Usuario;

/**
 *
 * @author Rubén
 */
public class GUIOroBatallas extends javax.swing.JFrame {
 Usuario usuario;
    /**
     * Creates new form GUIOroBatallas
     */
    public GUIOroBatallas(Usuario usuario) {
        initComponents();
        this.usuario=usuario;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaCombates = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jScrollPane1.setViewportView(ListaCombates);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel1.setText("Oro / Batalla");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GUIMenuUsuario g = new GUIMenuUsuario (usuario);
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        DefaultListModel dlm = new DefaultListModel();
        int i = usuario.getResultadosCombates().size();
        for (int j = 0; j < i; j++) {
             if ((usuario.getResultadosCombates().get(j).getCombate().getGanador().equals(usuario.getNombre())) && (usuario.getResultadosCombates().get(j).getCombate().getDesafiado().equals(usuario.getNombre()))){
                dlm.addElement((j + 1)+ "Oro ganado : "+usuario.getResultadosCombates().get(j).getCombate().getOroApostado() +" vs " + usuario.getResultadosCombates().get(j).getCombate().getDesafiante()) ;
             } else  if ((usuario.getResultadosCombates().get(j).getCombate().getGanador().equals(usuario.getNombre())) && (usuario.getResultadosCombates().get(j).getCombate().getDesafiante().equals(usuario.getNombre()))){
                dlm.addElement((j + 1)+ "Oro ganado : "+usuario.getResultadosCombates().get(j).getCombate().getOroApostado() +" vs " + usuario.getResultadosCombates().get(j).getCombate().getDesafiado()) ;
             } else  if (!(usuario.getResultadosCombates().get(j).getCombate().getGanador().equals(usuario.getNombre())) && (usuario.getResultadosCombates().get(j).getCombate().getDesafiante().equals(usuario.getNombre()))){
                dlm.addElement((j + 1)+ "Oro perdido : "+usuario.getResultadosCombates().get(j).getCombate().getOroApostado() +" vs " + usuario.getResultadosCombates().get(j).getCombate().getDesafiado()) ;
             }else  if (!(usuario.getResultadosCombates().get(j).getCombate().getGanador().equals(usuario.getNombre())) && (usuario.getResultadosCombates().get(j).getCombate().getDesafiado().equals(usuario.getNombre()))){
                  if ((usuario.getResultadosCombates().get(j).getCombate().getOroDesafiado())>= (usuario.getResultadosCombates().get(j).getCombate().getOroApostado())){
                dlm.addElement((j + 1)+ "Oro perdido : "+usuario.getResultadosCombates().get(j).getCombate().getOroApostado() +" vs " + usuario.getResultadosCombates().get(j).getCombate().getDesafiante()) ;}
                  else {
                dlm.addElement((j + 1)+ "Oro perdido : "+usuario.getResultadosCombates().get(j).getCombate().getOroDesafiado() +" vs " + usuario.getResultadosCombates().get(j).getCombate().getDesafiante()) ;}
            
               
             }
           
        }
        ListaCombates.setModel(dlm);
                               
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public  void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GUIOroBatallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIOroBatallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIOroBatallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIOroBatallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIOroBatallas(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaCombates;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

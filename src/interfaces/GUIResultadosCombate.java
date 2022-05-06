/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import javax.swing.DefaultListModel;
import practicamp.ResultadosCombate;
import practicamp.Ronda;
import practicamp.Usuario;

/**
 *
 * @author PcCom
 */
public class GUIResultadosCombate extends javax.swing.JFrame {
ResultadosCombate resultados;
Usuario usuario;
    /**
     * Creates new form GUIResultadosCombate
     */
    public GUIResultadosCombate(ResultadosCombate resultados, Usuario user) {
        initComponents();
        this.resultados=resultados;
        this.usuario=user;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrarResumen = new javax.swing.JButton();
        tfresultado = new javax.swing.JTextField();
        tfesbirrosPerdidosP1 = new javax.swing.JTextField();
        tfesbirrosPerdidosP2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEsbirrosP1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEsbirrosP2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaRondas = new javax.swing.JList<>();
        mostrarInfoRonda = new javax.swing.JButton();
        esbirrosMuertosP1 = new javax.swing.JTextField();
        esbirrosMuertosP2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mostrarResumen.setText("Mostrar Resumen");
        mostrarResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarResumenActionPerformed(evt);
            }
        });

        tfresultado.setText(" ");
        tfresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfresultadoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaEsbirrosP1);

        jScrollPane2.setViewportView(listaEsbirrosP2);

        jLabel1.setText("Rondas ");

        jScrollPane3.setViewportView(listaRondas);

        mostrarInfoRonda.setText("Mostrar Informacion de la ronda");
        mostrarInfoRonda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarInfoRondaActionPerformed(evt);
            }
        });

        esbirrosMuertosP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esbirrosMuertosP1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(mostrarResumen))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(tfesbirrosPerdidosP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(tfresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mostrarInfoRonda)
                                    .addComponent(tfesbirrosPerdidosP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(esbirrosMuertosP1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(esbirrosMuertosP2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrarResumen)
                    .addComponent(tfresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfesbirrosPerdidosP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfesbirrosPerdidosP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(esbirrosMuertosP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mostrarInfoRonda))
                                .addGap(36, 36, 36)
                                .addComponent(esbirrosMuertosP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(103, 103, 103))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfresultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfresultadoActionPerformed

    private void mostrarResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarResumenActionPerformed
       if (resultados.getGanador().equals(usuario.getNombre())){
           tfresultado.setText("Has ganado");
       }
       else{
           tfresultado.setText("Has perdido");
       }
       tfesbirrosPerdidosP1.setText("Esbirros vivos de "+resultados.getCombate().getDesafiado());
       tfesbirrosPerdidosP2.setText("Esbirros vivos de "+resultados.getCombate().getDesafiante());
       DefaultListModel dlm1 = new DefaultListModel();
       for (int i=0;i<resultados.getCombate().getListaEsbirrosPers1().size();i++){
           dlm1.addElement(resultados.getCombate().getListaEsbirrosPers1().get(i).getName());  
       }
       DefaultListModel dlm2 = new DefaultListModel();
       for (int i=0;i<resultados.getCombate().getListaEsbirrosPers2().size();i++){
           dlm2.addElement(resultados.getCombate().getListaEsbirrosPers2().get(i).getName()); 
       }
       listaEsbirrosP2.setModel(dlm1);
       listaEsbirrosP1.setModel(dlm2);
      DefaultListModel dlm3 = new DefaultListModel();
       for (int i=0;i<resultados.getCombate().getListaRondas().size();i++){
           dlm3.addElement("Ronda "+Integer.toString(i)); 
       }
       listaRondas.setModel(dlm3);
    }//GEN-LAST:event_mostrarResumenActionPerformed

    private void mostrarInfoRondaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarInfoRondaActionPerformed
        int i = listaRondas.getSelectedIndex();
        Ronda r =resultados.getCombate().getListaRondas().get(i);
        esbirrosMuertosP1.setText(resultados.getCombate().getDesafiante()+" ha perdido este esbirro: "+r.getEsbirro().getName());
        esbirrosMuertosP2.setText(resultados.getCombate().getDesafiado()+" ha perdido este esbirro: "+r.getEsbirro2().getName());
        
    }//GEN-LAST:event_mostrarInfoRondaActionPerformed

    private void esbirrosMuertosP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esbirrosMuertosP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esbirrosMuertosP1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIResultadosCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIResultadosCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIResultadosCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIResultadosCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIResultadosCombate(resultados,usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField esbirrosMuertosP1;
    private javax.swing.JTextField esbirrosMuertosP2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaEsbirrosP1;
    private javax.swing.JList<String> listaEsbirrosP2;
    private javax.swing.JList<String> listaRondas;
    private javax.swing.JButton mostrarInfoRonda;
    private javax.swing.JButton mostrarResumen;
    private javax.swing.JTextField tfesbirrosPerdidosP1;
    private javax.swing.JTextField tfesbirrosPerdidosP2;
    private javax.swing.JTextField tfresultado;
    // End of variables declaration//GEN-END:variables
}

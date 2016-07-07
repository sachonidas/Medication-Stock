/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DB.CargaTablaMedicamentos;
import DB.Conexion;

/**
 *
 * @author Usuario
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    Conexion conexion;
    CargaTablaMedicamentos carga = new CargaTablaMedicamentos();
    
    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        setTitle("MedicationStock");
        carga.cargaTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuEditar = new javax.swing.JMenu();
        mnuAltaMedicación = new javax.swing.JMenuItem();
        mnuBajaMedicación = new javax.swing.JMenuItem();
        tablaMedicación = new javax.swing.JMenuItem();
        mnuModificar = new javax.swing.JMenu();
        mnuModificarMedcamento = new javax.swing.JMenuItem();
        mnuModificarMaximos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContenedor.setBackground(java.awt.SystemColor.activeCaption);

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\l.arancibia\\Documents\\NetBeansProjects\\MedicationStock\\pildora.jpg")); // NOI18N
        jButton1.setText("Introducir Medicación");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton3.setText("Sacar Medicación");

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(95, 95, 95)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(180, 180, 180))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(196, 196, 196))
        );

        mnuArchivo.setText("Archivo");

        jMenuItem1.setText("jMenuItem1");
        mnuArchivo.add(jMenuItem1);

        jMenuBar1.add(mnuArchivo);

        mnuEditar.setText("Medicamentos");

        mnuAltaMedicación.setText("Alta Medicamento");
        mnuAltaMedicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaMedicaciónActionPerformed(evt);
            }
        });
        mnuEditar.add(mnuAltaMedicación);

        mnuBajaMedicación.setText("Borrar Medicamento");
        mnuBajaMedicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBajaMedicaciónActionPerformed(evt);
            }
        });
        mnuEditar.add(mnuBajaMedicación);

        tablaMedicación.setText("tabla Medicamento");
        tablaMedicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaMedicaciónActionPerformed(evt);
            }
        });
        mnuEditar.add(tablaMedicación);

        jMenuBar1.add(mnuEditar);

        mnuModificar.setText("Modificar");

        mnuModificarMedcamento.setText("Modificar Medicamento");
        mnuModificarMedcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModificarMedcamentoActionPerformed(evt);
            }
        });
        mnuModificar.add(mnuModificarMedcamento);

        mnuModificarMaximos.setText("Maximos");
        mnuModificarMaximos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModificarMaximosActionPerformed(evt);
            }
        });
        mnuModificar.add(mnuModificarMaximos);

        jMenuBar1.add(mnuModificar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMedicaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaMedicaciónActionPerformed
        // TODO add your handling code here:
        tablaMedicamentos tabla = new tablaMedicamentos();
        tabla.setVisible(rootPaneCheckingEnabled);
        hide();
    }//GEN-LAST:event_tablaMedicaciónActionPerformed

    private void mnuAltaMedicaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaMedicaciónActionPerformed
        // TODO add your handling code here:
        AltaMedicamento alta = new AltaMedicamento();
        alta.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuAltaMedicaciónActionPerformed

    private void mnuModificarMedcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModificarMedcamentoActionPerformed
        // TODO add your handling code here:
        EditarMedicamento editar = new EditarMedicamento();
        editar.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuModificarMedcamentoActionPerformed

    private void mnuModificarMaximosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModificarMaximosActionPerformed
        // TODO add your handling code here:
        EditarMaximos maximos = new EditarMaximos();
        maximos.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuModificarMaximosActionPerformed

    private void mnuBajaMedicaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBajaMedicaciónActionPerformed
        // TODO add your handling code here:
        BorrarMedicamento borrar = new BorrarMedicamento();
        borrar.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuBajaMedicaciónActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuAltaMedicación;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuItem mnuBajaMedicación;
    private javax.swing.JMenu mnuEditar;
    private javax.swing.JMenu mnuModificar;
    private javax.swing.JMenuItem mnuModificarMaximos;
    private javax.swing.JMenuItem mnuModificarMedcamento;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JMenuItem tablaMedicación;
    // End of variables declaration//GEN-END:variables
}

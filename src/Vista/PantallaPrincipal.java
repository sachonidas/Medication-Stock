/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DB.CargaTablaMedicamentos;
import DB.Conexion;
import DB.TablaEntradas;
import DB.TablaSalidas;

/**
 *
 * @author Usuario
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    Conexion conexion;
    CargaTablaMedicamentos carga = new CargaTablaMedicamentos();
    TablaEntradas entradas = new TablaEntradas();
    TablaSalidas salidas = new TablaSalidas();
    
    
    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        setTitle("MedicationStock");
        carga.cargaTabla();
        entradas.cargaTabla();
        salidas.cargaTabla();
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
        btnEntradas = new javax.swing.JButton();
        btnSalidas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuEntradas = new javax.swing.JMenuItem();
        mnuSalidas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();
        mnuEditar = new javax.swing.JMenu();
        mnuAltaMedicación = new javax.swing.JMenuItem();
        mnuBajaMedicación = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuModificar = new javax.swing.JMenu();
        mnuModificarMedcamento = new javax.swing.JMenuItem();
        mnuModificarMaximos = new javax.swing.JMenuItem();
        mnuInformes = new javax.swing.JMenu();
        mnuTablaMedicación = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuTablaEntradas = new javax.swing.JMenuItem();
        mnuTablaSalidas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContenedor.setBackground(java.awt.SystemColor.activeCaption);

        btnEntradas.setBackground(java.awt.Color.white);
        btnEntradas.setIcon(new javax.swing.ImageIcon("C:\\Users\\l.arancibia\\Documents\\NetBeansProjects\\MedicationStock\\entrada1.png")); // NOI18N
        btnEntradas.setText("Entradas");
        btnEntradas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntradas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntradas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradasActionPerformed(evt);
            }
        });

        btnSalidas.setBackground(java.awt.Color.white);
        btnSalidas.setIcon(new javax.swing.ImageIcon("C:\\Users\\l.arancibia\\Documents\\NetBeansProjects\\MedicationStock\\salida.jpg")); // NOI18N
        btnSalidas.setText("Salidas");
        btnSalidas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalidas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(95, 95, 95)
                .addComponent(btnSalidas, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(181, 181, 181))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        mnuArchivo.setText("Archivo");

        mnuEntradas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnuEntradas.setText("Entradas");
        mnuEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEntradasActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuEntradas);

        mnuSalidas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuSalidas.setText("Salidas");
        mnuSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalidasActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuSalidas);
        mnuArchivo.add(jSeparator1);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuSalir);

        jMenuBar1.add(mnuArchivo);

        mnuEditar.setText("Medicamentos");

        mnuAltaMedicación.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuAltaMedicación.setText("Alta Medicamento");
        mnuAltaMedicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaMedicaciónActionPerformed(evt);
            }
        });
        mnuEditar.add(mnuAltaMedicación);

        mnuBajaMedicación.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mnuBajaMedicación.setText("Borrar Medicamento");
        mnuBajaMedicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBajaMedicaciónActionPerformed(evt);
            }
        });
        mnuEditar.add(mnuBajaMedicación);
        mnuEditar.add(jSeparator2);

        jMenuBar1.add(mnuEditar);

        mnuModificar.setText("Modificar");

        mnuModificarMedcamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mnuModificarMedcamento.setText("Modificar Medicamento");
        mnuModificarMedcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModificarMedcamentoActionPerformed(evt);
            }
        });
        mnuModificar.add(mnuModificarMedcamento);

        mnuModificarMaximos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_UP, java.awt.event.InputEvent.CTRL_MASK));
        mnuModificarMaximos.setText("Maximos");
        mnuModificarMaximos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModificarMaximosActionPerformed(evt);
            }
        });
        mnuModificar.add(mnuModificarMaximos);

        jMenuBar1.add(mnuModificar);

        mnuInformes.setText("Informes");

        mnuTablaMedicación.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK));
        mnuTablaMedicación.setText("Stock Medicamento");
        mnuTablaMedicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTablaMedicaciónActionPerformed(evt);
            }
        });
        mnuInformes.add(mnuTablaMedicación);
        mnuInformes.add(jSeparator3);

        mnuTablaEntradas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        mnuTablaEntradas.setText("Entradas");
        mnuInformes.add(mnuTablaEntradas);

        mnuTablaSalidas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        mnuTablaSalidas.setText("Salidas");
        mnuInformes.add(mnuTablaSalidas);

        jMenuBar1.add(mnuInformes);

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

    private void mnuTablaMedicaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTablaMedicaciónActionPerformed
        // TODO add your handling code here:
        tablaMedicamentos tabla = new tablaMedicamentos();
        tabla.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuTablaMedicaciónActionPerformed

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

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        // TODO add your handling code here:
        EntradaMedicamentos entrada = new EntradaMedicamentos();
        entrada.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void mnuEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEntradasActionPerformed
        // TODO add your handling code here:
        EntradaMedicamentos entrada = new EntradaMedicamentos();
        entrada.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuEntradasActionPerformed

    private void mnuSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalidasActionPerformed
        // TODO add your handling code here:
        SalidaMedicamentos salida = new SalidaMedicamentos();
        salida.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnuSalidasActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_mnuSalirActionPerformed

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
    private javax.swing.JButton btnEntradas;
    private javax.swing.JButton btnSalidas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem mnuAltaMedicación;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuItem mnuBajaMedicación;
    private javax.swing.JMenu mnuEditar;
    private javax.swing.JMenuItem mnuEntradas;
    private javax.swing.JMenu mnuInformes;
    private javax.swing.JMenu mnuModificar;
    private javax.swing.JMenuItem mnuModificarMaximos;
    private javax.swing.JMenuItem mnuModificarMedcamento;
    private javax.swing.JMenuItem mnuSalidas;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuTablaEntradas;
    private javax.swing.JMenuItem mnuTablaMedicación;
    private javax.swing.JMenuItem mnuTablaSalidas;
    private javax.swing.JPanel pnlContenedor;
    // End of variables declaration//GEN-END:variables
}

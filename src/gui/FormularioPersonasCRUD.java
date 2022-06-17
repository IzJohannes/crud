/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import implementacion.ImplPersona;

/**
 *
 * @author MSI
 */
public class FormularioPersonasCRUD extends javax.swing.JFrame{

    /**
     * Creates new form FormularioPersonasCRUD
     */
    public FormularioPersonasCRUD() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1_file = new javax.swing.JMenu();
        jMenuItem1_salir = new javax.swing.JMenuItem();
        jMenu2_CRUD = new javax.swing.JMenu();
        jMenuItem_agregar = new javax.swing.JMenuItem();
        jMenuItem_reportar = new javax.swing.JMenuItem();
        jMenuItem_modificar = new javax.swing.JMenuItem();
        jMenuItem_eliminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1954, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );

        jMenu1_file.setText("File");

        jMenuItem1_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1_salir.setText("Salir");
        jMenuItem1_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_salirActionPerformed(evt);
            }
        });
        jMenu1_file.add(jMenuItem1_salir);

        jMenuBar1.add(jMenu1_file);

        jMenu2_CRUD.setText("CRUD");

        jMenuItem_agregar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_agregar.setText("Agregar");
        jMenuItem_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_agregarActionPerformed(evt);
            }
        });
        jMenu2_CRUD.add(jMenuItem_agregar);

        jMenuItem_reportar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_reportar.setText("Reportar");
        jMenuItem_reportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportarActionPerformed(evt);
            }
        });
        jMenu2_CRUD.add(jMenuItem_reportar);

        jMenuItem_modificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_modificar.setText("Modificar");
        jMenuItem_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_modificarActionPerformed(evt);
            }
        });
        jMenu2_CRUD.add(jMenuItem_modificar);

        jMenuItem_eliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_eliminar.setText("Eliminar");
        jMenuItem_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_eliminarActionPerformed(evt);
            }
        });
        jMenu2_CRUD.add(jMenuItem_eliminar);

        jMenuBar1.add(jMenu2_CRUD);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1_salirActionPerformed

    private void jMenuItem_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_agregarActionPerformed
        Agregar agr = new Agregar();
        jDesktopPane1.add(agr);
        agr.show();
        
    }//GEN-LAST:event_jMenuItem_agregarActionPerformed

    private void jMenuItem_reportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportarActionPerformed
   
        Reportar re = new Reportar();
        jDesktopPane1.add(re);
        re.show();
    }//GEN-LAST:event_jMenuItem_reportarActionPerformed

    private void jMenuItem_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_modificarActionPerformed
        
        Modificar mo = new Modificar();
        jDesktopPane1.add(mo);
        mo.show();
    }//GEN-LAST:event_jMenuItem_modificarActionPerformed

    private void jMenuItem_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_eliminarActionPerformed
        
        Eliminar eli = new Eliminar();
        jDesktopPane1.add(eli);
        eli.show();
    }//GEN-LAST:event_jMenuItem_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioPersonasCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPersonasCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPersonasCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPersonasCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPersonasCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1_file;
    private javax.swing.JMenu jMenu2_CRUD;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1_salir;
    private javax.swing.JMenuItem jMenuItem_agregar;
    private javax.swing.JMenuItem jMenuItem_eliminar;
    private javax.swing.JMenuItem jMenuItem_modificar;
    private javax.swing.JMenuItem jMenuItem_reportar;
    // End of variables declaration//GEN-END:variables
}
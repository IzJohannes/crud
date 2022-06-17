/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import Utils.Utils;
import entidades.Persona;
import implementacion.ImplPersona;

/**
 *
 * @author MSI
 */
public class Agregar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Agregar
     */
    public Agregar() {
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

        jLabel1_titulo = new javax.swing.JLabel();
        jLabel1_nombres = new javax.swing.JLabel();
        jTextField1_nombres = new javax.swing.JTextField();
        jLabel1_apellpater = new javax.swing.JLabel();
        jTextField_apellpater = new javax.swing.JTextField();
        jLabel_apellmater = new javax.swing.JLabel();
        jTextField_apellmater = new javax.swing.JTextField();
        jLabel_direccion = new javax.swing.JLabel();
        jTextField_direccion = new javax.swing.JTextField();
        jLabel_correo = new javax.swing.JLabel();
        jTextField_correo = new javax.swing.JTextField();
        jLabel_numero_celular = new javax.swing.JLabel();
        jTextField_numero_celular = new javax.swing.JTextField();
        jLabel_anios_edad = new javax.swing.JLabel();
        jTextField_anios_edad = new javax.swing.JTextField();
        jLabel_numero_dni = new javax.swing.JLabel();
        jTextField_numero_dni = new javax.swing.JTextField();
        jLabel_usuario = new javax.swing.JLabel();
        jTextField_usuario = new javax.swing.JTextField();
        jLabel_contrasenia = new javax.swing.JLabel();
        jPasswordField_contrasenia = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_nivel_educacion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_estado_civil = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_genero = new javax.swing.JComboBox<>();
        jButton_grabar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Agregar personas");

        jLabel1_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1_titulo.setText("Agregar Personas");

        jLabel1_nombres.setText("Nombres:");

        jLabel1_apellpater.setText("Apellido Paterno:");

        jLabel_apellmater.setText("Apellido Materno:");

        jLabel_direccion.setText("Direccion:");

        jLabel_correo.setText("Correo:");

        jLabel_numero_celular.setText("Numero de celular:");

        jLabel_anios_edad.setText("Edad:");

        jLabel_numero_dni.setText("DNI:");

        jLabel_usuario.setText("Usuario:");

        jLabel_contrasenia.setText("Contraseña:");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel1.setText("Nivel de educación:");

        jComboBox_nivel_educacion.setFont(new java.awt.Font("Yu Gothic Medium", 3, 12)); // NOI18N
        jComboBox_nivel_educacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inicial", "Primario", "Secundario", "Superior" }));
        jComboBox_nivel_educacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_nivel_educacionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel2.setText("Estado civil:");

        jComboBox_estado_civil.setEditable(true);
        jComboBox_estado_civil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jComboBox_estado_civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Viudo", "Divorciado" }));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel3.setText("Género:");

        jComboBox_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Prefiero no decirlo" }));

        jButton_grabar.setText("Grabar");
        jButton_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_grabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1_nombres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1_apellpater)
                                    .addComponent(jLabel_apellmater)
                                    .addComponent(jLabel_direccion)
                                    .addComponent(jLabel_correo)
                                    .addComponent(jLabel_numero_celular)
                                    .addComponent(jLabel_anios_edad)
                                    .addComponent(jLabel_numero_dni)
                                    .addComponent(jLabel_usuario)
                                    .addComponent(jLabel_contrasenia))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_numero_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_apellmater, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_apellpater, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_anios_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_numero_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_estado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_nivel_educacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jButton_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1_titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_nombres)
                    .addComponent(jTextField1_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox_nivel_educacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_apellpater)
                    .addComponent(jTextField_apellpater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_apellmater)
                    .addComponent(jTextField_apellmater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_direccion)
                    .addComponent(jTextField_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_correo)
                    .addComponent(jTextField_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_estado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_numero_celular)
                    .addComponent(jTextField_numero_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_anios_edad)
                    .addComponent(jTextField_anios_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_numero_dni)
                    .addComponent(jTextField_numero_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_usuario)
                    .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_contrasenia)
                    .addComponent(jPasswordField_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton_grabar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_grabarActionPerformed

        ImplPersona ip= new ImplPersona();
        Persona p = new Persona();
        Utils ge = new Utils();


        p.setId(ge.generaIds());
        p.setNombres(jTextField1_nombres.getText());
        p.setApellido_pater(jTextField_apellpater.getText());
        p.setApellido_mater(jTextField_apellmater.getText());
        p.setDireccion(jTextField_direccion.getText());
        p.setCorreo(jTextField_correo.getText());
        p.setNum_celular(jTextField_numero_celular.getText());
        p.setAnios_edad(jTextField_anios_edad.getText());
        p.setDni(jTextField_numero_dni.getText());
        p.setNivel_educacion(jComboBox_nivel_educacion.getSelectedItem());
        p.setEstado_civil(jComboBox_estado_civil.getSelectedItem());
        p.setGenero(jComboBox_genero.getSelectedItem());
        p.setUsuario(jTextField_usuario.getText());
        p.setContrasenia(jPasswordField_contrasenia.getText());

        if(!jTextField1_nombres.getText().equals("")&!jTextField_apellpater.getText().equals("")){

            ip.registrarPersona(p);
        }

        ip.reportePersonas();
        

    }//GEN-LAST:event_jButton_grabarActionPerformed

    private void jComboBox_nivel_educacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_nivel_educacionActionPerformed

    }//GEN-LAST:event_jComboBox_nivel_educacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_grabar;
    private javax.swing.JComboBox<String> jComboBox_estado_civil;
    private javax.swing.JComboBox<String> jComboBox_genero;
    private javax.swing.JComboBox<String> jComboBox_nivel_educacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_apellpater;
    private javax.swing.JLabel jLabel1_nombres;
    private javax.swing.JLabel jLabel1_titulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_anios_edad;
    private javax.swing.JLabel jLabel_apellmater;
    private javax.swing.JLabel jLabel_contrasenia;
    private javax.swing.JLabel jLabel_correo;
    private javax.swing.JLabel jLabel_direccion;
    private javax.swing.JLabel jLabel_numero_celular;
    private javax.swing.JLabel jLabel_numero_dni;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPasswordField jPasswordField_contrasenia;
    private javax.swing.JTextField jTextField1_nombres;
    private javax.swing.JTextField jTextField_anios_edad;
    private javax.swing.JTextField jTextField_apellmater;
    private javax.swing.JTextField jTextField_apellpater;
    private javax.swing.JTextField jTextField_correo;
    private javax.swing.JTextField jTextField_direccion;
    private javax.swing.JTextField jTextField_numero_celular;
    private javax.swing.JTextField jTextField_numero_dni;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import java.awt.Dimension;

/**
 *
 * @author Gonzalo01
 */
public class Tablas_Registros extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public Tablas_Registros() {
        initComponents();
        setPreferredSize(new Dimension(400, 400));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPprofesores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnmostrar_profe = new javax.swing.JButton();
        btneliminar_profe = new javax.swing.JButton();
        JPestudiantes = new javax.swing.JPanel();
        btnmostrar_estu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btneliminar_estu = new javax.swing.JButton();
        JPper_aseo = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btneliminar_aseo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registros");

        JPprofesores.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros de Profesores"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnmostrar_profe.setText("Mostrar");
        btnmostrar_profe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btneliminar_profe.setText("Eliminar");
        btneliminar_profe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPprofesoresLayout = new javax.swing.GroupLayout(JPprofesores);
        JPprofesores.setLayout(JPprofesoresLayout);
        JPprofesoresLayout.setHorizontalGroup(
            JPprofesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPprofesoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPprofesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmostrar_profe)
                    .addComponent(btneliminar_profe))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        JPprofesoresLayout.setVerticalGroup(
            JPprofesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPprofesoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JPprofesoresLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnmostrar_profe)
                .addGap(69, 69, 69)
                .addComponent(btneliminar_profe))
        );

        JPestudiantes.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros de Estudiantes"));

        btnmostrar_estu.setText("Mostrar");
        btnmostrar_estu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btneliminar_estu.setText("Eliminar");
        btneliminar_estu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPestudiantesLayout = new javax.swing.GroupLayout(JPestudiantes);
        JPestudiantes.setLayout(JPestudiantesLayout);
        JPestudiantesLayout.setHorizontalGroup(
            JPestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPestudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmostrar_estu)
                    .addComponent(btneliminar_estu))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        JPestudiantesLayout.setVerticalGroup(
            JPestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPestudiantesLayout.createSequentialGroup()
                .addGroup(JPestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPestudiantesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPestudiantesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnmostrar_estu)
                        .addGap(72, 72, 72)
                        .addComponent(btneliminar_estu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPper_aseo.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros del Personal de Aseo"));

        jButton3.setText("Mostrar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        btneliminar_aseo.setText("Eliminar");
        btneliminar_aseo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JPper_aseoLayout = new javax.swing.GroupLayout(JPper_aseo);
        JPper_aseo.setLayout(JPper_aseoLayout);
        JPper_aseoLayout.setHorizontalGroup(
            JPper_aseoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPper_aseoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPper_aseoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(btneliminar_aseo))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        JPper_aseoLayout.setVerticalGroup(
            JPper_aseoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPper_aseoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton3)
                .addGap(66, 66, 66)
                .addComponent(btneliminar_aseo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPper_aseoLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPper_aseo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPprofesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(JPestudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPestudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPprofesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(JPper_aseo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel JPestudiantes;
    public javax.swing.JPanel JPper_aseo;
    public javax.swing.JPanel JPprofesores;
    private javax.swing.JButton btneliminar_aseo;
    public javax.swing.JButton btneliminar_estu;
    public javax.swing.JButton btneliminar_profe;
    public javax.swing.JButton btnmostrar_estu;
    public javax.swing.JButton btnmostrar_profe;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}

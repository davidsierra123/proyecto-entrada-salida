/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author SENA
 */
public class Validar extends javax.swing.JFrame {

    /**
     * Creates new form Validar
     */
    public Validar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Verificar = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Id_Title = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtRol = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        B_Validar = new javax.swing.JButton();
        B_Salida = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        Nom_Title5 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        Apellido1 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Verificar.setBackground(new java.awt.Color(204, 255, 255));
        Panel_Verificar.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Verificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Titulo.setText("Registro De Entrada Y Salida");
        Panel_Verificar.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        Id_Title.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        Id_Title.setText("Identificacion");
        Panel_Verificar.add(Id_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        Apellido.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        Apellido.setText("Rol");
        Panel_Verificar.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        txtID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Verificar.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 210, 25));

        txtRol.setEditable(false);
        txtRol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Verificar.add(txtRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 210, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel1.setText("INSTITUCION EDUCATIVA LA AGUADA SEDE PRINCIPAL");
        Panel_Verificar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 410, -1));

        B_Validar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        B_Validar.setBorderPainted(false);
        B_Validar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ValidarActionPerformed(evt);
            }
        });
        Panel_Verificar.add(B_Validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 80, 40));

        B_Salida.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        B_Salida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SalidaActionPerformed(evt);
            }
        });
        Panel_Verificar.add(B_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 80, 40));

        Regresar.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Verificar.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 80, 30));

        date.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        date.setText("YY/MM/DD");
        Panel_Verificar.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 80, -1));

        hour.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        hour.setText("00:00:00");
        Panel_Verificar.add(hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 98, -1));

        Nom_Title5.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        Nom_Title5.setText("Nombres");
        Panel_Verificar.add(Nom_Title5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtNombres.setEditable(false);
        txtNombres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Verificar.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 210, 25));

        Apellido1.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        Apellido1.setText("Apellidos");
        Panel_Verificar.add(Apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        txtApellidos.setEditable(false);
        txtApellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Verificar.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 210, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Verificar, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Verificar, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_ValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ValidarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_ValidarActionPerformed

    private void B_SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_SalidaActionPerformed

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
            java.util.logging.Logger.getLogger(Validar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Validar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Validar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Validar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Validar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Apellido;
    public javax.swing.JLabel Apellido1;
    public javax.swing.JButton B_Salida;
    public javax.swing.JButton B_Validar;
    public javax.swing.JLabel Id_Title;
    public javax.swing.JLabel Nom_Title5;
    public javax.swing.JPanel Panel_Verificar;
    public javax.swing.JButton Regresar;
    public javax.swing.JLabel Titulo;
    public javax.swing.JLabel date;
    public javax.swing.JLabel hour;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNombres;
    public javax.swing.JTextField txtRol;
    // End of variables declaration//GEN-END:variables
}

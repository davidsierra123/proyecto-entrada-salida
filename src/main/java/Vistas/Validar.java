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
        Nom_Title2 = new javax.swing.JLabel();
        Identificacion = new javax.swing.JTextField();
        Nombres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        B_Validar = new javax.swing.JButton();
        B_Salida = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_asistencoias = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        hour = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Verificar.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Verificar.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Verificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Titulo.setText("Registrar Entrada Y Salida");
        Panel_Verificar.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        Id_Title.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        Id_Title.setText("Identificacion");
        Panel_Verificar.add(Id_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        Nom_Title2.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        Nom_Title2.setText("Nombres");
        Panel_Verificar.add(Nom_Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        Identificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Verificar.add(Identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 210, 25));

        Nombres.setEditable(false);
        Nombres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Verificar.add(Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 210, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel1.setText("INSTITUCION EDUCATIVA LA AGUADA SEDE PRINCIPAL");
        Panel_Verificar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 410, -1));

        B_Validar.setBackground(new java.awt.Color(0, 255, 255));
        B_Validar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        B_Validar.setText("Entrada");
        B_Validar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B_Validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ValidarActionPerformed(evt);
            }
        });
        Panel_Verificar.add(B_Validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 100, 35));

        B_Salida.setBackground(new java.awt.Color(0, 255, 255));
        B_Salida.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        B_Salida.setText("Salida");
        B_Salida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B_Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SalidaActionPerformed(evt);
            }
        });
        Panel_Verificar.add(B_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 100, 35));

        Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)), "VERIFIQUE QUE SUS DATOS SEAN CORRECTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        tabla_asistencoias.setBackground(new java.awt.Color(255, 204, 204));
        tabla_asistencoias.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tabla_asistencoias.setForeground(new java.awt.Color(102, 0, 0));
        tabla_asistencoias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Cargo", "Fecha", "Hora"
            }
        ));
        tabla_asistencoias.setEnabled(false);
        tabla_asistencoias.setSelectionBackground(new java.awt.Color(255, 204, 153));
        jScrollPane1.setViewportView(tabla_asistencoias);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Panel_Verificar.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hora Y Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 51))); // NOI18N

        hour.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        hour.setForeground(new java.awt.Color(255, 255, 255));
        hour.setText("00:00:00");

        date.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("YY/MM/DD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(hour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Panel_Verificar.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 120, 100));

        Regresar.setBackground(new java.awt.Color(255, 0, 0));
        Regresar.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Return");
        Panel_Verificar.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Verificar, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
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
    public javax.swing.JButton B_Salida;
    public javax.swing.JButton B_Validar;
    public javax.swing.JLabel Id_Title;
    public javax.swing.JTextField Identificacion;
    public javax.swing.JLabel Nom_Title2;
    public javax.swing.JTextField Nombres;
    public javax.swing.JPanel Panel;
    public javax.swing.JPanel Panel_Verificar;
    public javax.swing.JButton Regresar;
    public javax.swing.JLabel Titulo;
    public javax.swing.JLabel date;
    public javax.swing.JLabel hour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabla_asistencoias;
    // End of variables declaration//GEN-END:variables
}

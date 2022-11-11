/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import javax.swing.ImageIcon;

/**
 *
 * @author SENA
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
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

        Panel = new javax.swing.JDesktopPane();
        menus = new javax.swing.JMenuBar();
        Menu_A = new javax.swing.JMenu();
        Reg_asistencia = new javax.swing.JMenuItem();
        Menu_Alum = new javax.swing.JMenu();
        Reg_Alumnos = new javax.swing.JMenuItem();
        Menu_Pro = new javax.swing.JMenu();
        Reg_Profesores = new javax.swing.JMenuItem();
        Menu_aseo = new javax.swing.JMenu();
        Reg_Personal_Aseo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 894, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        Menu_A.setText("Asistencias");
        Menu_A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Reg_asistencia.setText("Reg.Asistencia");
        Reg_asistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu_A.add(Reg_asistencia);

        menus.add(Menu_A);

        Menu_Alum.setText("Alumnos");
        Menu_Alum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Reg_Alumnos.setText("Reg.Alumnos");
        Reg_Alumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu_Alum.add(Reg_Alumnos);

        menus.add(Menu_Alum);

        Menu_Pro.setText("Profesores");
        Menu_Pro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Reg_Profesores.setText("Reg.Profesores");
        Reg_Profesores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reg_Profesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reg_ProfesoresActionPerformed(evt);
            }
        });
        Menu_Pro.add(Reg_Profesores);

        menus.add(Menu_Pro);

        Menu_aseo.setText("Per.Aseo");
        Menu_aseo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Reg_Personal_Aseo.setText("Reg.Per.Aseo");
        Reg_Personal_Aseo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reg_Personal_Aseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reg_Personal_AseoActionPerformed(evt);
            }
        });
        Menu_aseo.add(Reg_Personal_Aseo);

        menus.add(Menu_aseo);

        setJMenuBar(menus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Reg_ProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reg_ProfesoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Reg_ProfesoresActionPerformed

    private void Reg_Personal_AseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reg_Personal_AseoActionPerformed
    }//GEN-LAST:event_Reg_Personal_AseoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu Menu_A;
    public javax.swing.JMenu Menu_Alum;
    public javax.swing.JMenu Menu_Pro;
    public javax.swing.JMenu Menu_aseo;
    public javax.swing.JDesktopPane Panel;
    public javax.swing.JMenuItem Reg_Alumnos;
    public javax.swing.JMenuItem Reg_Personal_Aseo;
    public javax.swing.JMenuItem Reg_Profesores;
    public javax.swing.JMenuItem Reg_asistencia;
    public javax.swing.JMenuBar menus;
    // End of variables declaration//GEN-END:variables

}

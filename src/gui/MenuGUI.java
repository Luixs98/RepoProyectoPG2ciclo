/**
 * @author Luis Encarnación, Carlos Vargas.
 */
package gui;

import javax.swing.JOptionPane;

public class MenuGUI extends javax.swing.JFrame {
    int permitir=0;
    public MenuGUI() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        manUsuario = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        manSalir = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\Sin título.png")); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(1010, 0, 360, 160);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Desktop\\gh.png")); // NOI18N
        jLabel3.setToolTipText("");
        desktopPane.add(jLabel3);
        jLabel3.setBounds(10, 540, 310, 170);

        manUsuario.setMnemonic('f');
        manUsuario.setText("Mantenimiento");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Usuario");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        manUsuario.add(openMenuItem);

        manSalir.setMnemonic('x');
        manSalir.setText("Salir");
        manSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manSalirActionPerformed(evt);
            }
        });
        manUsuario.add(manSalir);

        menuBar.add(manUsuario);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ayuda");
        helpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuActionPerformed(evt);
            }
        });

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_manSalirActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        if(permitir==1){
            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                + "Ya Has Accedido Al Sistema", "Acceso denegado",
                JOptionPane.ERROR_MESSAGE);
        } else {
        desktopPane.add(new Datos() );
        permitir=1;
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void helpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuActionPerformed
            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                + "Opcion aun no habilitada", "Acceso denegado",
                JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_helpMenuActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                + "Opcion aun no habilitada", "Acceso denegado",
                JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                + "Opcion aun no habilitada", "Acceso denegado",
                JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MenuGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem manSalir;
    private javax.swing.JMenu manUsuario;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    // End of variables declaration//GEN-END:variables

}
 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Essn
 */
public class DNAScreen extends javax.swing.JFrame {

    /**
     * Creates new form rsa_screen
     */
    public DNAScreen() {
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

        jLabel1 = new javax.swing.JLabel();
        btnRSA = new javax.swing.JButton();
        btnAES = new javax.swing.JButton();
        btnHash = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage( Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel1.setText("DNA CRYPTOOL");

        btnRSA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRSA.setText("Asymmetric");
        btnRSA.setPreferredSize(new java.awt.Dimension(140, 30));
        btnRSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRSAActionPerformed(evt);
            }
        });

        btnAES.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAES.setText("Symmetric");
        btnAES.setPreferredSize(new java.awt.Dimension(140, 30));
        btnAES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAESActionPerformed(evt);
            }
        });

        btnHash.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHash.setText("Hash");
        btnHash.setPreferredSize(new java.awt.Dimension(140, 30));
        btnHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHashActionPerformed(evt);
            }
        });

        btnHelp.setText("Help");
        btnHelp.setPreferredSize(new java.awt.Dimension(100, 30));
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        btnAbout.setText("About us");
        btnAbout.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220)
                        .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(btnRSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnAES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnHash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRSAActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AsymmetricForm enc_scr = new AsymmetricForm();
        enc_scr.setVisible(true);
    }//GEN-LAST:event_btnRSAActionPerformed

    private void btnAESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAESActionPerformed
        // TODO add your handling code here:
        this.dispose();
        SymmetricForm symmetricForm = new SymmetricForm();
        symmetricForm.setVisible(true);
    }//GEN-LAST:event_btnAESActionPerformed

    private void btnHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHashActionPerformed
        this.dispose();
        HashForm hashForm = new HashForm();
        hashForm.setVisible(true);
    }//GEN-LAST:event_btnHashActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        try {
            File file = new File("document\\help.txt");
            byte[] data;
            try (FileInputStream fis = new FileInputStream(file)) {
                data = new byte[(int) file.length()];
                fis.read(data);
            }
            String content = new String(data, "UTF-8");
            JOptionPane.showMessageDialog(null, content,
                    "Help", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        try {
            File file = new File("document\\about-us.txt");
            byte[] data;
            try (FileInputStream fis = new FileInputStream(file)) {
                data = new byte[(int) file.length()];
                fis.read(data);
            }
            String content = new String(data, "UTF-8");
            JOptionPane.showMessageDialog(null, content,
                    "About DNA Cryptool", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAboutActionPerformed

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
            java.util.logging.Logger.getLogger(DNAScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DNAScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DNAScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DNAScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DNAScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAES;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnHash;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnRSA;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
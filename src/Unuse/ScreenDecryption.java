/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unuse;

import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JFileChooser;
//import screen.ScreenEncryption.MyCustomFilter;
import screen.ScreenEncryption;

/**
 *
 * @author Essn
 */
public class ScreenDecryption extends javax.swing.JFrame {

    /**
     * Creates new form ScreenEncrypt
     */
    public ScreenDecryption() {
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

        fileChooser = new javax.swing.JFileChooser();
        linkfile1 = new java.awt.TextField();
        Browser = new javax.swing.JButton();
        linkfile2 = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        open = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        createkey = new javax.swing.JMenuItem();
        Encryption = new javax.swing.JMenu();
        Asymmetric = new javax.swing.JMenuItem();
        Symmetric = new javax.swing.JMenuItem();
        Decryption = new javax.swing.JMenu();
        Asymmetric_de = new javax.swing.JMenuItem();
        Symmetric_de = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        fileChooser.setDialogTitle("This is my open dialog");
        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encrytion/Decryption Tool");

        linkfile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkfile1ActionPerformed(evt);
            }
        });
        linkfile1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                linkfile1KeyPressed(evt);
            }
        });

        Browser.setIcon(new javax.swing.ImageIcon("D:\\MMANM\\Assignment 1\\JFileChooserDemo\\asset\\Untitled (2).png")); // NOI18N
        Browser.setText("Browser");
        Browser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowserActionPerformed(evt);
            }
        });

        linkfile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkfile2ActionPerformed(evt);
            }
        });
        linkfile2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                linkfile2KeyPressed(evt);
            }
        });

        jLabel1.setText("Decrypted File:");

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        createkey.setText(" Create Key");
        createkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createkeyActionPerformed(evt);
            }
        });
        jMenu1.add(createkey);

        jMenuBar1.add(jMenu1);

        Encryption.setText("Encryption");

        Asymmetric.setText("Asymmetric");
        Asymmetric.setToolTipText("");
        Asymmetric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsymmetricActionPerformed(evt);
            }
        });
        Encryption.add(Asymmetric);

        Symmetric.setText(" Symmetric");
        Symmetric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SymmetricActionPerformed(evt);
            }
        });
        Encryption.add(Symmetric);

        jMenuBar1.add(Encryption);

        Decryption.setText("Decryption");

        Asymmetric_de.setText("Asymmetric");
        Asymmetric_de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asymmetric_deActionPerformed(evt);
            }
        });
        Decryption.add(Asymmetric_de);

        Symmetric_de.setText("Symmetric");
        Decryption.add(Symmetric_de);

        jMenuBar1.add(Decryption);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(linkfile1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Browser)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19)
                        .addComponent(linkfile2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(open)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Browser)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(linkfile1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(linkfile2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(open)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AsymmetricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsymmetricActionPerformed
        // TODO add your handling code here:
//        textarea.setText("");
        this.dispose();
        ScreenEncryption enc_scr = new ScreenEncryption();
        enc_scr.setVisible(true);
        //        textarea.setText(Encryptions.encrypt());
    }//GEN-LAST:event_AsymmetricActionPerformed

    private void SymmetricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SymmetricActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SymmetricActionPerformed

    private void createkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createkeyActionPerformed
        // TODO add your handling code here:
        SecurityKeyPairGenerator.keygen();
    }//GEN-LAST:event_createkeyActionPerformed

    private void linkfile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkfile1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkfile1ActionPerformed

    private void linkfile1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linkfile1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            //            int returnVal = fileChooser.showOpenDialog(this);
            File file_encrypt = new File(linkfile1.getText());

            linkfile2.setText("");
            linkfile2.setText(Decryptions.decrypt(file_encrypt));
            //            try{
                //                textarea.read( new FileReader(file ), null );
                //            }
            //            catch (IOException ex){
                //                System.out.println("problem accessing file"+file.getAbsolutePath());
                //
                //            }
        }
    }//GEN-LAST:event_linkfile1KeyPressed

    private void BrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowserActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file_decrypt = fileChooser.getSelectedFile();
            linkfile1.setText(file_decrypt.getAbsolutePath());

            textarea.setText("");

            linkfile2.setText("");
            linkfile2.setText(Decryptions.decrypt(file_decrypt));
            //            textarea.setText(Encryptions.encrypt());

            //            try {
                //              // What to do with the file, e.g. display it in a TextArea
                //                textarea.setText("");
                //
                //                if (file.getAbsolutePath().endsWith(".txt")) {
                    //                    textarea.read( new FileReader( file.getAbsolutePath() ), null );
                    //                }
                //            } catch (IOException ex) {
                //              System.out.println("problem accessing file"+file.getAbsolutePath());
                //            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_BrowserActionPerformed

    private void linkfile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkfile2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkfile2ActionPerformed

    private void linkfile2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_linkfile2KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_linkfile2KeyPressed

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileChooserActionPerformed

    private void Asymmetric_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asymmetric_deActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ScreenDecryption dec_scr = new ScreenDecryption();
        dec_scr.setVisible(true);

    }//GEN-LAST:event_Asymmetric_deActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        // TODO add your handling code here:
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("C:\\Windows\\notepad.exe "+linkfile2.getText());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_openActionPerformed

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
            java.util.logging.Logger.getLogger(ScreenDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenDecryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenDecryption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Asymmetric;
    private javax.swing.JMenuItem Asymmetric_de;
    private javax.swing.JButton Browser;
    private javax.swing.JMenu Decryption;
    private javax.swing.JMenu Encryption;
    private javax.swing.JMenuItem Symmetric;
    private javax.swing.JMenuItem Symmetric_de;
    private javax.swing.JMenuItem createkey;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField linkfile1;
    private java.awt.TextField linkfile2;
    private javax.swing.JButton open;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables
}

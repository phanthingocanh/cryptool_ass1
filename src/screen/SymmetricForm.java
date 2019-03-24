/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen;

import java.io.File;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;
import aes_al.*;
import java.awt.Desktop;
import java.io.IOException;

/**
 *
 * @author NGPD
 */
public class SymmetricForm extends javax.swing.JFrame {

    /**
     * Creates new form AESForm
     */
    public SymmetricForm() {
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

        bgrAlgorithm = new javax.swing.ButtonGroup();
        fileChooser = new javax.swing.JFileChooser();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        keyInput = new javax.swing.JFormattedTextField();
        cbHex = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        ivInput = new javax.swing.JFormattedTextField();
        cbMode = new javax.swing.JCheckBox();
        btnEncrypt = new javax.swing.JButton();
        btnDecrypt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        decryptLink = new javax.swing.JTextField();
        btnOpen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setPreferredSize(new java.awt.Dimension(80, 40));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select a file:");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 30));

        txtPath.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPath.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPath.setPreferredSize(new java.awt.Dimension(600, 30));

        btnBrowse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBrowse.setText("Browse...");
        btnBrowse.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Algorithm:");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 30));

        bgrAlgorithm.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("AES128");
        jRadioButton1.setPreferredSize(new java.awt.Dimension(100, 30));

        bgrAlgorithm.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("AES-192");
        jRadioButton2.setActionCommand("AES192");
        jRadioButton2.setPreferredSize(new java.awt.Dimension(100, 30));

        bgrAlgorithm.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setText("AES-256");
        jRadioButton3.setActionCommand("AES256");
        jRadioButton3.setPreferredSize(new java.awt.Dimension(100, 30));

        bgrAlgorithm.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4.setText("DES");
        jRadioButton4.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Key:");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 30));

        keyInput.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        keyInput.setPreferredSize(new java.awt.Dimension(600, 30));
        keyInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyInputActionPerformed(evt);
            }
        });

        cbHex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbHex.setText("Hex");
        cbHex.setPreferredSize(new java.awt.Dimension(100, 30));
        cbHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHexActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Init Vector:");
        jLabel4.setPreferredSize(new java.awt.Dimension(80, 30));

        ivInput.setToolTipText("Zero-padding Initialize Vector");
        ivInput.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        ivInput.setPreferredSize(new java.awt.Dimension(600, 30));

        cbMode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbMode.setText("ECB Mode");
        cbMode.setPreferredSize(new java.awt.Dimension(100, 30));
        cbMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModeActionPerformed(evt);
            }
        });

        btnEncrypt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEncrypt.setText("Encrypt");
        btnEncrypt.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        btnDecrypt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDecrypt.setText("Decrypt");
        btnDecrypt.setPreferredSize(new java.awt.Dimension(150, 30));
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 150));

        textarea.setColumns(20);
        textarea.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        decryptLink.setPreferredSize(new java.awt.Dimension(600, 30));
        decryptLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptLinkActionPerformed(evt);
            }
        });

        btnOpen.setText("Open");
        btnOpen.setPreferredSize(new java.awt.Dimension(100, 30));
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Output:");
        jLabel5.setPreferredSize(new java.awt.Dimension(80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(keyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(cbHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ivInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(cbMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(decryptLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ivInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decryptLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        rsa_screen enc_scr = new rsa_screen();
        enc_scr.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void keyInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyInputActionPerformed

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        textarea.append("Encrypting...\n");
        new Thread() {
            @Override
            public void run() {
                construct(true);
            }
        }.start();
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void cbHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHexActionPerformed

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        textarea.append("Decrypting...\n");
        new Thread() {
            @Override
            public void run() {
                construct(false);
            }
        }.start();
    }//GEN-LAST:event_btnDecryptActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            txtPath.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void cbModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModeActionPerformed
        if (cbMode.isSelected()) {
            ivInput.setEnabled(false);
        } else {
            ivInput.setEnabled(true);
        }
    }//GEN-LAST:event_cbModeActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File(decryptLink.getText());
                Desktop.getDesktop().open(myFile);
            } catch (IOException e) {
                // System probably doesn't have a default PDF program
            }
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void decryptLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptLinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decryptLinkActionPerformed

    private void construct(boolean encrypt) {
        String algorithm = "AES128";
        Enumeration<AbstractButton> e = bgrAlgorithm.getElements();
        while (e.hasMoreElements()) {
            AbstractButton b = e.nextElement();
            if (b.isSelected()) {
                algorithm = b.getActionCommand();
            }
        }

        String mode = "CBC";
        if (cbMode.isSelected()) {
            mode = "ECB";
        }

        byte[] key = null;

        if (txtPath.getText().length() == 0) {
            textarea.append("You must choose a file!\n");
            return;
        }
        if (keyInput.getText().length() == 0) {
            textarea.append("You must insert key!\n");
            return;
        }
        if (!(new File(txtPath.getText()).exists())) {
            textarea.append("File not found!\n");
            return;
        }
        if (!encrypt && !txtPath.getText().endsWith("encrypted")) {
            textarea.append("Can't decrypt this file (file isn't end with .encrypted)!\n");
            return;
        }

        if (cbHex.isSelected()) {
            try {
                key = DatatypeConverter.parseHexBinary(keyInput.getText());
            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, x.getMessage(),
                        "Wrong Key", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            key = keyInput.getText().getBytes();
        }

        byte[] iv = null;
        try {
            iv = DatatypeConverter.parseHexBinary(ivInput.getText());
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, x.getMessage(),
                    "Wrong IV", JOptionPane.WARNING_MESSAGE);
        }

        cipherCore.initialize(algorithm, mode, iv, key);

        long startTime = System.currentTimeMillis();
        if (encrypt) {
            ivInput.setText(ByteUtil.toHexString(cipherCore.getInitVector()));
            decryptLink.setText(cipherCore.encrypt(txtPath.getText()));
            textarea.append("Encryption success in " + (System.currentTimeMillis() - startTime) + " ms\n");
        } else {
            decryptLink.setText(cipherCore.decrypt(txtPath.getText()));
            textarea.append("Decryption success in " + (System.currentTimeMillis() - startTime) + " ms\n");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        cipherCore = new Symmetric();
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SymmetricForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SymmetricForm().setVisible(true);
        });
    }

    private static Symmetric cipherCore;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrAlgorithm;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnOpen;
    private javax.swing.JCheckBox cbHex;
    private javax.swing.JCheckBox cbMode;
    private javax.swing.JTextField decryptLink;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JFormattedTextField ivInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField keyInput;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables
}

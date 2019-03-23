/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import javax.crypto.Cipher;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import aes_al.test;

/**
 *
 * @author ACER
 */

public class Decryption extends javax.swing.JFrame {

    /**
     * Creates new form Decryption
     */
    public Decryption() {
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        textfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        decryptButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        decryptLink = new javax.swing.JTextField();
        insertText = new javax.swing.JTextField();
        txtButton = new javax.swing.JRadioButton();
        docxButton = new javax.swing.JRadioButton();
        pngButton = new javax.swing.JRadioButton();
        jpgButton = new javax.swing.JRadioButton();
        mp3Button = new javax.swing.JRadioButton();
        mp4Button = new javax.swing.JRadioButton();
        pdfButton = new javax.swing.JRadioButton();
        bit128 = new javax.swing.JRadioButton();
        bit192 = new javax.swing.JRadioButton();
        bit256 = new javax.swing.JRadioButton();
        Open = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldActionPerformed(evt);
            }
        });

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        decryptButton.setText("Decrypt");
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("  Key:");

        decryptLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptLinkActionPerformed(evt);
            }
        });

        insertText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertTextActionPerformed(evt);
            }
        });

        buttonGroup1.add(txtButton);
        txtButton.setText(".txt");
        txtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(docxButton);
        docxButton.setText(".docx");

        buttonGroup1.add(pngButton);
        pngButton.setText(".png");

        buttonGroup1.add(jpgButton);
        jpgButton.setText(".jpg");
        jpgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpgButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(mp3Button);
        mp3Button.setText(".mp3");

        buttonGroup1.add(mp4Button);
        mp4Button.setText(".mp4");

        buttonGroup1.add(pdfButton);
        pdfButton.setText(".pdf");

        buttonGroup2.add(bit128);
        bit128.setText("128 bits");
        bit128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bit128ActionPerformed(evt);
            }
        });

        buttonGroup2.add(bit192);
        bit192.setText("192 bits");

        buttonGroup2.add(bit256);
        bit256.setText("256 bits");

        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });

        home.setText("Back");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bit128)
                        .addGap(118, 118, 118)
                        .addComponent(bit192)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bit256))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textfield)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decryptButton)
                            .addComponent(docxButton)
                            .addComponent(pngButton)
                            .addComponent(jpgButton)
                            .addComponent(txtButton)
                            .addComponent(mp3Button)
                            .addComponent(pdfButton)
                            .addComponent(mp4Button)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insertText)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(decryptLink)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Open))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 34, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(insertText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bit128)
                    .addComponent(bit192)
                    .addComponent(bit256))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decryptLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Open))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(docxButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pdfButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pngButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpgButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mp3Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mp4Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_textfieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        initJRadio();
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            textfield.setText(file.getAbsolutePath());

        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void initJRadio() {
    bit128.setSelected(true);
    //txtButton.setSelected(true);
   
    }
    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButtonActionPerformed
        // TODO add your handling code here:
        if (textfield.getText().length() == 0) {
                textarea.append("You must choose a file!\n");
                return;
            }
        if (insertText.getText().length()==0)
        {
            textarea.append("You must insert key!\n");
                return;
        }
        if (!(new File(textfield.getText()).exists())) {
                textarea.append("File not found!\n");
                return;
            }
        if (!textfield.getText().endsWith("aes")) {
                textarea.append("Can't decrypt this file (file isn't end with .aes)!\n");
                return;
            }
        File inputFile = new File(textfield.getText());
        String fileNameWithOutExt = inputFile.getName().replaceFirst("[.][^.]+$", "");
        File decryptedFile = new File("decrypted-"+fileNameWithOutExt+getSelectedButtonText(buttonGroup1));
        String s;

        s=test.fileProcessor(Cipher.DECRYPT_MODE,insertText.getText(),inputFile,decryptedFile,getSelectedButtonText(buttonGroup2));
        decryptLink.setText(s);
        if (s=="Fail"){
            textarea.append("Can't decrypt this file or key isn't match!\n");
        }
        else{
            textarea.append("Decrypt sucessful!\n");
        }
    }//GEN-LAST:event_decryptButtonActionPerformed

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                //System.out.println("aa");
                return button.getText();
            }
        }

        return null;
    }
    public void GetSelectedJRadioButtonFromButtonGroup() {
 
        // set flow layout for the frame
        
 
        txtButton.addActionListener((ActionListener) this);
        txtButton.setActionCommand(".txt");
        docxButton.addActionListener((ActionListener) this);
        docxButton.setActionCommand(".docx"); 
        pngButton.addActionListener((ActionListener) this);
        pngButton.setActionCommand(".png");
        jpgButton.addActionListener((ActionListener) this);
        jpgButton.setActionCommand(".jpg");
        mp3Button.addActionListener((ActionListener) this);
        mp3Button.setActionCommand(".mp3");
        mp4Button.addActionListener((ActionListener) this);
        mp4Button.setActionCommand(".mp4");
        pdfButton.addActionListener((ActionListener) this);
        pdfButton.setActionCommand(".pdf");
        txtButton.setSelected(true);
 
        
 
    }
    public void actionPerformed(ActionEvent e) {
        
//        if (null != e.getActionCommand()) {
//            System.out.println("aa");
//            switch (e.getActionCommand()) {
//                case ".txt":
//                    post=".txt";
//                    break;
//                case ".png":
//                    post=".png";
//                    break;
//                case ".jpg":
//                    post=".jpg";
//                    break;
//                case ".docx":
//                    post=".docx";
//                    break;
//                case ".mp3":
//                    post=".mp3";
//                    break;
//                case ".mp4":
//                    post=".mp4";
//                    break;
//                default:
//                    post=".pdf";
//                    break;
//            }
//        } else {
//        }
        
    }
    private void decryptLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptLinkActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_decryptLinkActionPerformed

    private void insertTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertTextActionPerformed

    private void txtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtButtonActionPerformed

    private void jpgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpgButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpgButtonActionPerformed

    private void bit128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bit128ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bit128ActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // TODO add your handling code here:
        if (Desktop.isDesktopSupported()) {
                    try {
                        File myFile = new File(decryptLink.getText());
                        Desktop.getDesktop().open(myFile);
                    } catch (IOException e) {
                        // System probably doesn't have a default PDF program
                    }
                }
    }//GEN-LAST:event_OpenActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        aes_screen enc_scr = new aes_screen();
        enc_scr.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Decryption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Open;
    private javax.swing.JRadioButton bit128;
    private javax.swing.JRadioButton bit192;
    private javax.swing.JRadioButton bit256;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton decryptButton;
    private javax.swing.JTextField decryptLink;
    private javax.swing.JRadioButton docxButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton home;
    private javax.swing.JTextField insertText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jpgButton;
    private javax.swing.JRadioButton mp3Button;
    private javax.swing.JRadioButton mp4Button;
    private javax.swing.JRadioButton pdfButton;
    private javax.swing.JRadioButton pngButton;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextField textfield;
    private javax.swing.JRadioButton txtButton;
    // End of variables declaration//GEN-END:variables
    private String post;
}
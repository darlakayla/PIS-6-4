/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author HP
 */
public class newResident extends javax.swing.JInternalFrame {

    /**
     * Creates new form newResident
     */
    public newResident() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Last Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 70, 130, 30);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("First Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 110, 130, 30);

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Middle Name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 150, 130, 30);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Gender:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 190, 130, 30);

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Marital Status:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 230, 130, 30);

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Name of Spouse:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 270, 130, 30);

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Purok:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 310, 130, 30);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Employment Status:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 350, 130, 30);

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel15.setText("Religion:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(450, 320, 120, 30);

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel14.setText("Weight in (KM):");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(450, 280, 120, 30);

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel13.setText("Height in (CM):");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(450, 240, 120, 30);

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 1, 15)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("UPLOAD PHOTO");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(700, 0, 140, 20);

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel11.setText("Age");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(450, 200, 120, 30);

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel9.setText("Birthdate:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 390, 130, 30);

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel10.setText("Place of Birth:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(450, 160, 120, 30);

        jTextField2.setBackground(new java.awt.Color(255, 153, 153));
        jTextField2.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 310, 230, 30);

        jTextField3.setBackground(new java.awt.Color(255, 153, 153));
        jTextField3.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 110, 230, 30);

        jTextField4.setBackground(new java.awt.Color(255, 153, 153));
        jTextField4.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 150, 230, 30);

        jTextField7.setBackground(new java.awt.Color(255, 153, 153));
        jTextField7.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField7);
        jTextField7.setBounds(170, 350, 230, 30);

        jTextField8.setBackground(new java.awt.Color(255, 153, 153));
        jTextField8.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8);
        jTextField8.setBounds(170, 270, 230, 30);

        jTextField9.setBackground(new java.awt.Color(255, 153, 153));
        jTextField9.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField9);
        jTextField9.setBounds(170, 70, 230, 30);

        jTextField11.setBackground(new java.awt.Color(255, 153, 153));
        jTextField11.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField11);
        jTextField11.setBounds(570, 160, 230, 30);

        jTextField12.setBackground(new java.awt.Color(255, 153, 153));
        jTextField12.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField12);
        jTextField12.setBounds(570, 200, 230, 30);

        jTextField14.setBackground(new java.awt.Color(255, 153, 153));
        jTextField14.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField14);
        jTextField14.setBounds(570, 240, 230, 30);

        jTextField15.setBackground(new java.awt.Color(255, 153, 153));
        jTextField15.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField15);
        jTextField15.setBounds(570, 280, 230, 30);

        jTextField16.setBackground(new java.awt.Color(255, 153, 153));
        jTextField16.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField16);
        jTextField16.setBounds(570, 320, 230, 30);

        jComboBox1.setBackground(new java.awt.Color(255, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced", "Separated", "Widowed" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(170, 230, 230, 30);

        jComboBox2.setBackground(new java.awt.Color(255, 153, 153));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registered", "Not Registered"}));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(570, 360, 230, 30);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 120));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(700, 20, 140, 120);

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel16.setText("Voter Status:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(450, 360, 120, 30);

        jComboBox3.setBackground(new java.awt.Color(255, 153, 153));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male"}));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(170, 190, 230, 30);

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(760, 440, 110, 30);

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Rockwell", 1, 13)); // NOI18N
        jButton2.setText("BROWSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(600, 70, 90, 25);

        jDateChooser1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(170, 390, 230, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnaf = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnaf);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION);
        File selectedImageFile = browseImageFile.getSelectedFile();
        String selectedImagePath = selectedImageFile.getAbsolutePath();
        JOptionPane.showMessageDialog(null, selectedImagePath);
        
        ImageIcon ii = new ImageIcon(selectedImagePath);
        
        Image image = ii.getImage().getScaledInstance(jLabel18.getWidth(),jLabel18.getHeight(), Image.SCALE_SMOOTH);
        jLabel18.setIcon(new ImageIcon(image));
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "Succesfully SAVE!");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
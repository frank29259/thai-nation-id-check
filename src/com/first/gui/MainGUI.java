
package com.first.gui;

import javax.swing.JOptionPane;

public class MainGUI extends javax.swing.JFrame {

    public MainGUI() {
        initComponents();       
        this.setTitle("Thailand Nation Identity Check");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDField = new javax.swing.JTextField();
        IDlable = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        CheckButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        IDlable.setText("ID:");

        CheckButton.setText("Check");
        CheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDlable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CheckButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Image)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDlable)
                    .addComponent(CheckButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(360, 102));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckButtonActionPerformed
        // เมื่อกด check จะมาตรงนี้
        //กำค่าไว้ชั่วคราว tmp จะ เก็บข้อมูลในช่อง field
        String tmp = IDField.getText();
        
        //ตรวจสอบค่าที่ป้อนว่ามี13ตัวไหม
        if(tmp.length()==13){
            
            //ตรวจสอบว่าใช่ตัวเลขรึเปล่า
            if(Tools.isNumber(tmp)){
                //ตรวจสอบว่าเลขนั้นถูกต้องรึเปล่า
                if(new NationID(tmp).isReal()){
                    //แสดงผลว่าถูก
                    JOptionPane.showMessageDialog(this, "เลขบัตรถูกต้อง");
                }else{
                    //แสดงผลว่าไม่ถูก
                    JOptionPane.showMessageDialog(this, "เลขบัตรไม่ถูกต้อง");
                }
            }else{
                //แสดงว่าไม่ใช่คตัวเลข
                JOptionPane.showMessageDialog(this, "ต้องมีแต่ตัวเลขเท่านั้น");
            }
        }else{
            //แสดงว่าตัวอักษรไม่ถึง13หลัก
            JOptionPane.showMessageDialog(this, "ป้อนเลขบัตร 13 หลัก");
        }
                
    }//GEN-LAST:event_CheckButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckButton;
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel IDlable;
    private javax.swing.JLabel Image;
    // End of variables declaration//GEN-END:variables
}
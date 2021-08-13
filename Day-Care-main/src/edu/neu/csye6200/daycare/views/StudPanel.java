/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.daycare.views;

import edu.neu.csye6200.daycare.controller.DayCareController;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author aayus
 */
public class StudPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudPanel
     */
    private static DayCareController controller = null;
    public static JPanel rightPanel;
    
    public StudPanel(JPanel rightPanel,DayCareController controller) {
        initComponents();
        this.controller = controller;
        this.rightPanel = rightPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddStudentButton = new javax.swing.JButton();
        StudentInfoButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 1000));

        AddStudentButton.setFont(new java.awt.Font("Calibri", 3, 20)); // NOI18N
        AddStudentButton.setIcon(new javax.swing.ImageIcon("/Users/jaidevmane/NetBeansProjects/DayCare Version Control/aayush new/15 Apr 2020/15 Apr 2020/DayCare/src/edu/neu/csye6200/daycare/icons/student.png")); // NOI18N
        AddStudentButton.setText("Add Student ");
        AddStudentButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddStudentButton.setBorderPainted(false);
        AddStudentButton.setPreferredSize(new java.awt.Dimension(150, 35));
        AddStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentButtonActionPerformed(evt);
            }
        });

        StudentInfoButton.setFont(new java.awt.Font("Calibri", 3, 20)); // NOI18N
        StudentInfoButton.setIcon(new javax.swing.ImageIcon("/Users/jaidevmane/NetBeansProjects/DayCare Version Control/aayush new/15 Apr 2020/15 Apr 2020/DayCare/src/edu/neu/csye6200/daycare/icons/info.png")); // NOI18N
        StudentInfoButton.setText("Student Info");
        StudentInfoButton.setActionCommand("STudent");
        StudentInfoButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        StudentInfoButton.setBorderPainted(false);
        StudentInfoButton.setPreferredSize(new java.awt.Dimension(150, 35));
        StudentInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(AddStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(StudentInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(605, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentButtonActionPerformed
        AddStudPan ast= new AddStudPan(controller, rightPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        rightPanel.add(ast);
        layout.next(rightPanel);
    }//GEN-LAST:event_AddStudentButtonActionPerformed

    private void StudentInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentInfoButtonActionPerformed
        StudInfoPan sip= new StudInfoPan(controller,rightPanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        rightPanel.add(sip);
        layout.next(rightPanel);
    }//GEN-LAST:event_StudentInfoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStudentButton;
    private javax.swing.JButton StudentInfoButton;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalManagement.AdministrativeWorkArea;

import userInterface.SystemAdminWorkArea.*;
import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;
import MainCentralisationSystem.HospitalManagementEnterprise;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
//import userinterface.createNewUser.createLogin;

/**
 *
 * @author animeshgiri
 */
public class AdministrativeReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem;
    public AdministrativeReceptionistWorkAreaJPanel(JPanel userProcessContainer,MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hospitalManagementEcoSystem = hospitalManagementEcoSystem;
        jPanel1.setVisible(false);
        //jSplitPane.setVisible(false);
        //jPanel2.setVisible(true);
//        populateTree();
    }
    
    public void populateTree(){
        //DefaultTreeModel model=(DefaultTreeModel)Admin.getModel();
       // Add the code for draw your system structure shown by JTree
       
      //  model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonPatientManagement = new javax.swing.JButton();
        jButtonAppointmentManagement = new javax.swing.JButton();
        bgdimg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1720, 1080));
        setLayout(new java.awt.BorderLayout());

        jSplitPane.setPreferredSize(new java.awt.Dimension(1720, 1080));

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 70, 169));
        jPanel2.setMaximumSize(new java.awt.Dimension(1920, 1183));
        jPanel2.setMinimumSize(new java.awt.Dimension(1920, 1183));
        jPanel2.setPreferredSize(new java.awt.Dimension(1920, 1183));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonPatientManagement.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPatientManagement.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jButtonPatientManagement.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPatientManagement.setText("Patient Management");
        jButtonPatientManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPatientManagementActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPatientManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 401, -1));

        jButtonAppointmentManagement.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAppointmentManagement.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jButtonAppointmentManagement.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAppointmentManagement.setText("Appointment Management");
        jButtonAppointmentManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAppointmentManagementActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAppointmentManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 401, -1));

        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Images/AdministrativeReceptionistWorkAreaJPanel_new.jpg"))); // NOI18N
        jPanel2.add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAppointmentManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAppointmentManagementActionPerformed
//        ManageRestaurantsWorkArena manageRestaurantsWorkArena = new ManageRestaurantsWorkArena(userProcessContainer,hospitalManagementEcoSystem);
//        userProcessContainer.add("ManageRestaurantsWorkArena",manageRestaurantsWorkArena);
//        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
//        cardLayout.show(userProcessContainer,"ManageRestaurantsWorkArena");
    }//GEN-LAST:event_jButtonAppointmentManagementActionPerformed

    private void jButtonPatientManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPatientManagementActionPerformed

//        ManageCustomersWorkArena mc = new ManageCustomersWorkArena(userProcessContainer,hospitalManagementEcoSystem);
//        userProcessContainer.add("manageCustomers",mc);
//        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
//        cardLayout.show(userProcessContainer,"manageCustomers");
    }//GEN-LAST:event_jButtonPatientManagementActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton jButtonAppointmentManagement;
    private javax.swing.JButton jButtonPatientManagement;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}

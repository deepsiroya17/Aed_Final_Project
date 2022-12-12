/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Hospital.HospitalAdminWorkArea;


import Hospital.Hospital.Hospital;
import System.MedicalServiceCentralisationEcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author animeshgiri
 */
public class HospitalAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem;
    Hospital hospital;
    public HospitalAdminWorkAreaJPanel(JPanel userProcessContainer,MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem, Hospital hospital) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hospitalManagementEcoSystem = hospitalManagementEcoSystem;
        this.hospital = hospital;
        jPanel1.setVisible(false);
        populateTree();
    }
    
    public void populateTree(){
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
        jPanel2 = new javax.swing.JPanel();
        jButtonMedTechnicalAccountsPage = new javax.swing.JButton();
        jButtonAdministrativeAccountsPage = new javax.swing.JButton();
        jButtonOperationalAccountsPage = new javax.swing.JButton();
        jButtonMedTechnicalAccountsPage1 = new javax.swing.JButton();
        bgdimg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1720, 1080));
        setLayout(new java.awt.BorderLayout());

        jSplitPane.setPreferredSize(new java.awt.Dimension(1720, 1080));

        jPanel2.setBackground(new java.awt.Color(0, 70, 169));
        jPanel2.setPreferredSize(new java.awt.Dimension(1720, 1080));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMedTechnicalAccountsPage.setBackground(new java.awt.Color(255, 255, 204));
        jButtonMedTechnicalAccountsPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonMedTechnicalAccountsPage.setText("Technical & Lab Examinations");
        jButtonMedTechnicalAccountsPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedTechnicalAccountsPageActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMedTechnicalAccountsPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 240, 60));

        jButtonAdministrativeAccountsPage.setBackground(new java.awt.Color(255, 255, 204));
        jButtonAdministrativeAccountsPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAdministrativeAccountsPage.setText("Admin & Accounting ");
        jButtonAdministrativeAccountsPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministrativeAccountsPageActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAdministrativeAccountsPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 240, 60));

        jButtonOperationalAccountsPage.setBackground(new java.awt.Color(255, 255, 204));
        jButtonOperationalAccountsPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonOperationalAccountsPage.setText("Operational Team");
        jButtonOperationalAccountsPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperationalAccountsPageActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonOperationalAccountsPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 230, 60));

        jButtonMedTechnicalAccountsPage1.setBackground(new java.awt.Color(255, 255, 204));
        jButtonMedTechnicalAccountsPage1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonMedTechnicalAccountsPage1.setText("Medical Inventory Admin");
        jButtonMedTechnicalAccountsPage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedTechnicalAccountsPage1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMedTechnicalAccountsPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 230, 60));

        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Images/OperationalAccountsPage_1920x1183.jpeg"))); // NOI18N
        jPanel2.add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1740, 1080));

        jSplitPane.setRightComponent(jPanel2);

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jSplitPane.setLeftComponent(jPanel1);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMedTechnicalAccountsPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedTechnicalAccountsPageActionPerformed
        // TODO add your handling code here:
        MedTechAccountsPage medTechnicalAccountsPage = new MedTechAccountsPage(userProcessContainer,hospitalManagementEcoSystem, hospital);
        userProcessContainer.add("MedTechnicalAccountsPage",medTechnicalAccountsPage);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.show(userProcessContainer,"MedTechnicalAccountsPage");
    }//GEN-LAST:event_jButtonMedTechnicalAccountsPageActionPerformed

    private void jButtonAdministrativeAccountsPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministrativeAccountsPageActionPerformed
        
        ReceptionAccountsPage administrativeAccountsPage = new ReceptionAccountsPage(userProcessContainer,hospitalManagementEcoSystem, hospital);
        userProcessContainer.add("AdministrativeAccountsPage",administrativeAccountsPage);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.show(userProcessContainer,"AdministrativeAccountsPage");
    }//GEN-LAST:event_jButtonAdministrativeAccountsPageActionPerformed

    private void jButtonOperationalAccountsPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperationalAccountsPageActionPerformed
        OperationalAccountsPage operationalAccountsPage = new OperationalAccountsPage(userProcessContainer,hospitalManagementEcoSystem, hospital);
        userProcessContainer.add("OperationalAccountsPage",operationalAccountsPage);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.show(userProcessContainer,"OperationalAccountsPage");
    }//GEN-LAST:event_jButtonOperationalAccountsPageActionPerformed

    private void jButtonMedTechnicalAccountsPage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedTechnicalAccountsPage1ActionPerformed
        // TODO add your handling code here:
        MedInvenAdminAccountsPage medSupAdminAccountsPage = new MedInvenAdminAccountsPage(userProcessContainer,hospitalManagementEcoSystem, hospital);
        userProcessContainer.add("MedSupAdminAccountsPage",medSupAdminAccountsPage);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.show(userProcessContainer,"MedSupAdminAccountsPage");
        
    }//GEN-LAST:event_jButtonMedTechnicalAccountsPage1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton jButtonAdministrativeAccountsPage;
    private javax.swing.JButton jButtonMedTechnicalAccountsPage;
    private javax.swing.JButton jButtonMedTechnicalAccountsPage1;
    private javax.swing.JButton jButtonOperationalAccountsPage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}

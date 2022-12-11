/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalManagement.AdministrativeWorkArea;


import userInterface.SystemAdminWorkArea.*;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author animeshgiri
 */
public class AdministrativeReceptionistManagePatient extends javax.swing.JPanel {

    /**
     * Creates new form AdministrativeAccountsPage
     */
//    JPanel userProcessContainer;
//    EcoSystem ecosystem;
//    DeliveryManDirectory deliveryManDirectory;
//    UserAccount userAccount;
//    DeliveryMan deliveryMan;
//    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
//    public AdministrativeReceptionistManagePatient(JPanel userProcessContainer , EcoSystem ecosystem) {
//        initComponents();
//        this.userProcessContainer = userProcessContainer;
//        this.ecosystem = ecosystem;
//        if(ecosystem.getDeliveryManDirectory() == null)
//           ecosystem.setDeliveryManDirectory(new DeliveryManDirectory());
//        populateTable();
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableManagePatient = new javax.swing.JTable();
        jTextFieldPatientName = new javax.swing.JTextField();
        jLabelPatientName = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jButtonCreate = new javax.swing.JButton();
        jTextFieldPPhoneNum = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jLabelBloodGroup = new javax.swing.JLabel();
        jComboBoxBloodGroup = new javax.swing.JComboBox<>();
        jTextFieldPAddress = new javax.swing.JTextField();
        jLabelAddress = new javax.swing.JLabel();
        jLabelZipcode = new javax.swing.JLabel();
        jTextFieldZipcode = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        jLabelAge = new javax.swing.JLabel();
        jLabelEmergencyContactName = new javax.swing.JLabel();
        jTextFieldEmergencyContactName = new javax.swing.JTextField();
        jTextFieldEPhoneNum = new javax.swing.JTextField();
        jLabelPhoneNumEmergency = new javax.swing.JLabel();
        jLabelERelationship = new javax.swing.JLabel();
        jTextFieldRelationship = new javax.swing.JTextField();
        jTextFieldEAddress = new javax.swing.JTextField();
        jLabelEAddress = new javax.swing.JLabel();
        jLabelConsultant = new javax.swing.JLabel();
        jTextFieldConsultant = new javax.swing.JTextField();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jLabelGender = new javax.swing.JLabel();
        jComboBoxRoleDepartment = new javax.swing.JComboBox<>();
        jLabelDepartment = new javax.swing.JLabel();
        jTextFieldHeight = new javax.swing.JTextField();
        jLabelHeight = new javax.swing.JLabel();
        jLabelWeight = new javax.swing.JLabel();
        jTextFieldWeight = new javax.swing.JTextField();
        jLabelDateofAdmission = new javax.swing.JLabel();
        jLabelEmailID = new javax.swing.JLabel();
        jTextFieldEmailID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 70, 169));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Management");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 807, -1));

        jButton1.setBackground(new java.awt.Color(0, 70, 169));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        jTableManagePatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Phone Number", "Address", "Zipcode", "Age", "Blood Group", "Gender", "Height", "Weight", "Admission Date", "Doctor", "Department"
            }
        ));
        jScrollPane1.setViewportView(jTableManagePatient);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 620, 980, 130));

        jTextFieldPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPatientNameActionPerformed(evt);
            }
        });
        add(jTextFieldPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 160, -1));

        jLabelPatientName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPatientName.setText("Patient Name :");
        add(jLabelPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 140, 90, 20));

        jButtonDelete.setText("DELETE");
        add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 80, -1));

        jLabelPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPhoneNumber.setText("Phone Number :");
        add(jLabelPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, 20));

        jButtonCreate.setText("CREATE");
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 80, -1));
        add(jTextFieldPPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 160, -1));

        jButtonUpdate.setText("UPDATE");
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, 80, -1));

        jButtonView.setText("VIEW");
        add(jButtonView, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, 80, -1));

        jLabelBloodGroup.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBloodGroup.setText("Blood Group :");
        add(jLabelBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 104, -1));

        jComboBoxBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-", "Rh_null", " " }));
        add(jComboBoxBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        jTextFieldPAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPAddressActionPerformed(evt);
            }
        });
        add(jTextFieldPAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 160, -1));

        jLabelAddress.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAddress.setText("Address :");
        add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 220, 60, 20));

        jLabelZipcode.setForeground(new java.awt.Color(255, 255, 255));
        jLabelZipcode.setText("Zipcode :");
        add(jLabelZipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 260, -1, 20));
        add(jTextFieldZipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 160, -1));

        jTextFieldAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAgeActionPerformed(evt);
            }
        });
        add(jTextFieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 160, -1));

        jLabelAge.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAge.setText("Age :");
        add(jLabelAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 30, 20));

        jLabelEmergencyContactName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmergencyContactName.setText("Emergency Contact Name :");
        add(jLabelEmergencyContactName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 20));
        add(jTextFieldEmergencyContactName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 160, -1));

        jTextFieldEPhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEPhoneNumActionPerformed(evt);
            }
        });
        add(jTextFieldEPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 160, -1));

        jLabelPhoneNumEmergency.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPhoneNumEmergency.setText("Phone Number [E] :");
        add(jLabelPhoneNumEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jLabelERelationship.setForeground(new java.awt.Color(255, 255, 255));
        jLabelERelationship.setText("Relationship :");
        add(jLabelERelationship, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));
        add(jTextFieldRelationship, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 160, -1));

        jTextFieldEAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEAddressActionPerformed(evt);
            }
        });
        add(jTextFieldEAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 160, -1));

        jLabelEAddress.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEAddress.setText("Address [E] :");
        add(jLabelEAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, -1));

        jLabelConsultant.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConsultant.setText("Consultant :");
        add(jLabelConsultant, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, -1));
        add(jTextFieldConsultant, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 160, -1));

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Prefer Not to Say", " ", " " }));
        add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        jLabelGender.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGender.setText("Gender : ");
        add(jLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 104, -1));

        jComboBoxRoleDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiology", "Radiology", "Ayurvedic", "Dermetology", "Optometry", "Genral Surgery", "Plastic Surgeon ", "Obstetrics", "Orthopedics", "Psychiatry", "Neurosurgery", "Hematology", "Pedatrics", "Oncology", "Stomatology", "Opthalmology", "Virology", "Bio-Chemistry" }));
        add(jComboBoxRoleDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        jLabelDepartment.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDepartment.setText("Department :");
        add(jLabelDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 104, -1));

        jTextFieldHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHeightActionPerformed(evt);
            }
        });
        add(jTextFieldHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 160, -1));

        jLabelHeight.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeight.setText("Height :");
        add(jLabelHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        jLabelWeight.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWeight.setText("Weight :");
        add(jLabelWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));
        add(jTextFieldWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 160, -1));

        jLabelDateofAdmission.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDateofAdmission.setText("Date of Admission :");
        add(jLabelDateofAdmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 120, -1));

        jLabelEmailID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmailID.setText("Email ID:");
        add(jLabelEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, -1, -1));
        add(jTextFieldEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        // TODO add your handling code here:
//        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
//            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPatientNameActionPerformed

    private void jTextFieldPAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPAddressActionPerformed

    private void jTextFieldAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAgeActionPerformed

    private void jTextFieldEPhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEPhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEPhoneNumActionPerformed

    private void jTextFieldEAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEAddressActionPerformed

    private void jTextFieldHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHeightActionPerformed
    
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_Name = jTextFieldPatientName.getText();
        String user_PhoneNumber = jTextFieldPPhoneNum.getText();
        String user_Address = jTextFieldPAddress.getText();
//        String user_deliveryUsername = DeliveryUName.getText();
 
        if(user_Name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Name can't be left empty");
       }
        else if(user_PhoneNumber.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter password");
        }
//        
        else if(user_Address.isEmpty()){
            JOptionPane.showMessageDialog(this, "Contact No can't be left empty.");
        }
//        else if(user_deliveryUsername.isEmpty()){
//            JOptionPane.showMessageDialog(this, "Username can't be left empty.");
//        }
        user_input.add(user_Name);
        user_input.add(user_PhoneNumber);
        user_input.add(user_Address);
//        user_input.add(user_deliverycontact);
//        
        return user_input;
        
    }
    
//    private void clearFields(){
//        DeliveryName.setText("");
//        DeliveryPasswd.setText("");
//        DeliveryContactNo.setText("");
//        DeliveryUName.setText("");
//
//    }
//        private DeliveryMan set_user_input_values(DeliveryMan deliveryMan, ArrayList<String> user_input){
//        
//        deliveryMan.getUserAccount().setUsername(user_input.get(0));
//        deliveryMan.setName(user_input.get(1));
//        deliveryMan.getUserAccount().setPassword(user_input.get(2));
//        deliveryMan.setContact_no(user_input.get(3));
//        return deliveryMan;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox<String> jComboBoxBloodGroup;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JComboBox<String> jComboBoxRoleDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelBloodGroup;
    private javax.swing.JLabel jLabelConsultant;
    private javax.swing.JLabel jLabelDateofAdmission;
    private javax.swing.JLabel jLabelDepartment;
    private javax.swing.JLabel jLabelEAddress;
    private javax.swing.JLabel jLabelERelationship;
    private javax.swing.JLabel jLabelEmailID;
    private javax.swing.JLabel jLabelEmergencyContactName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelHeight;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelPhoneNumEmergency;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelWeight;
    private javax.swing.JLabel jLabelZipcode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableManagePatient;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldConsultant;
    private javax.swing.JTextField jTextFieldEAddress;
    private javax.swing.JTextField jTextFieldEPhoneNum;
    private javax.swing.JTextField jTextFieldEmailID;
    private javax.swing.JTextField jTextFieldEmergencyContactName;
    private javax.swing.JTextField jTextFieldHeight;
    private javax.swing.JTextField jTextFieldPAddress;
    private javax.swing.JTextField jTextFieldPPhoneNum;
    private javax.swing.JTextField jTextFieldPatientName;
    private javax.swing.JTextField jTextFieldRelationship;
    private javax.swing.JTextField jTextFieldWeight;
    private javax.swing.JTextField jTextFieldZipcode;
    // End of variables declaration//GEN-END:variables

//    private void populateTable() {
//        deliveryManDirectory = ecosystem.getDeliveryManDirectory();
//        ArrayList<DeliveryMan> deliveryMen = deliveryManDirectory.getDeliveryManList();
//        DefaultTableModel model = (DefaultTableModel) deliveryManTable.getModel();
//        model.setRowCount(0);
//        for(DeliveryMan deliveryMan: deliveryMen)
//        {
//            model.addRow(new Object[]{deliveryMan,deliveryMan.getUserAccount().getUsername(),deliveryMan.getUserAccount().getPassword(),deliveryMan.getContact_no()});
//        }
//        deliveryManTable.setModel(model);
//        dB4OUtil.storeSystem(ecosystem);
//    }
}

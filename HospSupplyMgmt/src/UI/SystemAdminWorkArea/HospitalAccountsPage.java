/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminWorkArea;



import System.MedicalServiceCentralisationEcoSystem;


import System.Role.HospitalAdminRole;
import System.Role.Role;

import Hospital.Hospital.Hospital;
import Hospital.Hospital.HospitalDirectory;
import System.UserAccount;
import System.UserAccountDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class HospitalAccountsPage extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    HospitalDirectory hospitalDirectory;
//    FrontDeskOperatorDirectory frontDeskOperatorDirectory;
    UserAccount userAccount;
    UserAccountDirectory UserAccountDirectory;

    public HospitalAccountsPage(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem) {
        
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        initComponents();
        if(medicalServiceCentralisationEcoSystem.getHospitalDirectory()== null)
           medicalServiceCentralisationEcoSystem.setHospitalDirectory(new HospitalDirectory());
        
//        addRolesComboBox();
        
        addrecordstotable();
        
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
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployee = new javax.swing.JTable();
        jButtonCreate = new javax.swing.JButton();
        jTextFieldHospName = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldHospPassword = new javax.swing.JTextField();
        jTextFieldHospID = new javax.swing.JTextField();
        jLabelEmpID = new javax.swing.JLabel();
        jButtonRefresh = new javax.swing.JButton();
        jLabelEmpName = new javax.swing.JLabel();
        jLabelEmpName1 = new javax.swing.JLabel();
        jTextFieldHospPincode = new javax.swing.JTextField();
        jButtonDelete1 = new javax.swing.JButton();
        bgdimg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setPreferredSize(new java.awt.Dimension(1920, 1183));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 56)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Account");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 100, 706, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 110, 60));

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital ID", "Hospital Name", "Pincode", "Password"
            }
        ));
        jTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 787, 90));

        jButtonCreate.setBackground(new java.awt.Color(255, 255, 204));
        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCreate.setText("CREATE");
        jButtonCreate.setMaximumSize(new java.awt.Dimension(100, 24));
        jButtonCreate.setMinimumSize(new java.awt.Dimension(100, 24));
        jButtonCreate.setPreferredSize(new java.awt.Dimension(100, 24));
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 110, 60));
        add(jTextFieldHospName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 280, -1));

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 204));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.setMaximumSize(new java.awt.Dimension(100, 24));
        jButtonUpdate.setMinimumSize(new java.awt.Dimension(100, 24));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 110, 60));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPassword.setText("Password:");
        add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 120, 20));

        jTextFieldHospPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHospPasswordActionPerformed(evt);
            }
        });
        add(jTextFieldHospPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 280, -1));

        jTextFieldHospID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHospIDActionPerformed(evt);
            }
        });
        add(jTextFieldHospID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 280, -1));

        jLabelEmpID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEmpID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEmpID.setText("Hospital ID:");
        add(jLabelEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, -1));

        jButtonRefresh.setBackground(new java.awt.Color(255, 255, 204));
        jButtonRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRefresh.setText("REFRESH");
        jButtonRefresh.setMaximumSize(new java.awt.Dimension(100, 24));
        jButtonRefresh.setMinimumSize(new java.awt.Dimension(100, 24));
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });
        add(jButtonRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 110, 60));

        jLabelEmpName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEmpName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEmpName.setText("Hospital Name:");
        add(jLabelEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 252, 140, 30));

        jLabelEmpName1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEmpName1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpName1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEmpName1.setText("Pincode:");
        add(jLabelEmpName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 120, -1));
        add(jTextFieldHospPincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 280, -1));

        jButtonDelete1.setBackground(new java.awt.Color(255, 255, 204));
        jButtonDelete1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDelete1.setText("DELETE");
        jButtonDelete1.setMaximumSize(new java.awt.Dimension(100, 24));
        jButtonDelete1.setMinimumSize(new java.awt.Dimension(100, 24));
        jButtonDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelete1ActionPerformed(evt);
            }
        });
        add(jButtonDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 110, 60));

        bgdimg.setBackground(new java.awt.Color(255, 0, 0));
        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Images/HospitalAccounts_latest.jpg"))); // NOI18N
        bgdimg.setToolTipText("");
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 1160));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldHospPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHospPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHospPasswordActionPerformed

    private void jTextFieldHospIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHospIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHospIDActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ArrayList<String> user_input = check_empty_field();
        hospitalDirectory = medicalServiceCentralisationEcoSystem.getHospitalDirectory();
        UserAccountDirectory usersList = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        if(!user_input.isEmpty()) {
             if(usersList.checkIfUserIsUnique(user_input.get(0))){
            
//            Employee employee = new Employee(user_input.get(0),user_input.get(1),new HospitalAdminRole());
            
            
            userAccount = new UserAccount(user_input.get(0), user_input.get(3), new HospitalAdminRole());
            
            Hospital hospital = new Hospital(user_input.get(0), user_input.get(1), user_input.get(2));
            userAccount.setHospital(hospital);
            hospitalDirectory.addHospital(hospital);
            
            usersList.addUserAccount(userAccount);
            
            JOptionPane.showMessageDialog(this, "New Hospital Information has been added.");
            model.addRow(new Object[]{userAccount,user_input.get(1),user_input.get(2),user_input.get(3)});
            clearFields();
            }
            else{
                JOptionPane.showMessageDialog(this, "This username is not available. Please select a new one.");
            }
        } 
       
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);        
        UserAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        hospitalDirectory = medicalServiceCentralisationEcoSystem.getHospitalDirectory();
        ArrayList<UserAccount> userAccountList = UserAccountDirectory.getUserAccountList();
        for(UserAccount userAccount: userAccountList)
        {
            if(userAccount.getUsername().equals(select_account_details.getUsername()))
            {
                Hospital hospital = userAccount.getHospital();
                ArrayList<String> user_input = check_empty_field();
//                model.setValueAt(user_input.get(1), selected_row_ix, 0);
                model.setValueAt(user_input.get(1), selected_row_ix, 1);
                model.setValueAt(user_input.get(2), selected_row_ix, 2);
                model.setValueAt(user_input.get(3), selected_row_ix, 3);
                hospitalDirectory.updateHospital(user_input, hospital);
                UserAccountDirectory.updateAccount(set_user_input_values(userAccount, user_input));
                break;
            }
        }
        
//        medicalServiceCentralisationEcoSystem.setRestaurantDirectory(restaurantDirectory);
        JOptionPane.showMessageDialog(this, "Values updated");
//        addrecordstotable();
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        jButtonCreate.setEnabled(true);
        jTextFieldHospID.setEditable(true);     
        clearFields();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeMouseClicked
        // TODO add your handling code here:
        jButtonCreate.setEnabled(false);
        int selected_row_ix = jTableEmployee.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
        jTextFieldHospID.setEditable(false);
        jTextFieldHospID.setText(select_user_account_details.getUsername());
        jTextFieldHospName.setText(select_user_account_details.getHospital().getHospitalName());
        jTextFieldHospPassword.setText(select_user_account_details.getPassword());
        jTextFieldHospPincode.setText(select_user_account_details.getHospital().getHospitalpincode());
        
    }//GEN-LAST:event_jTableEmployeeMouseClicked

    private void jButtonDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelete1ActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
        UserAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        Hospital hospital = select_user_account_details.getHospital();
        hospitalDirectory.deleteHospital(hospital);
        UserAccountDirectory.deleteAccount(select_user_account_details);
//        ecosystem.setRestaurantDirectory(restaurantDirectory);
        model.removeRow(selected_row_ix);
        addrecordstotable();
        clearFields();
    }//GEN-LAST:event_jButtonDelete1ActionPerformed
    private UserAccount set_user_input_values(UserAccount userAccount, ArrayList<String> user_input) {
//        userAccount.getEmployee().setEmployee_id(user_input.get(0));
        userAccount.getHospital().setHospitalName(user_input.get(1));
        userAccount.getHospital().setHospitalpincode(user_input.get(2));
        userAccount.setPassword(user_input.get(3));
        return userAccount;
    }
    private void clearFields(){
        jTextFieldHospID.setText("");
        jTextFieldHospName.setText("");
        jTextFieldHospPassword.setText("");
        jTextFieldHospPincode.setText("");
    }
    
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_emp_id = jTextFieldHospID.getText();
        String user_emp_name = jTextFieldHospName.getText();
        String user_password = jTextFieldHospPassword.getText();
        String user_pincode = jTextFieldHospPincode.getText();

        
        if(user_emp_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "User ID can't be left empty.");
        }
        else if(user_emp_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "User Name can't be left empty.");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Password.");
        }
        else if(user_pincode.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter the pincode.");
        } 
        else {
            user_input.add(user_emp_id);
            user_input.add(user_emp_name);
            user_input.add(user_pincode);
            user_input.add(user_password);
        }
        
        
        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete1;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmpID;
    private javax.swing.JLabel jLabelEmpName;
    private javax.swing.JLabel jLabelEmpName1;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextFieldHospID;
    private javax.swing.JTextField jTextFieldHospName;
    private javax.swing.JTextField jTextFieldHospPassword;
    private javax.swing.JTextField jTextFieldHospPincode;
    // End of variables declaration//GEN-END:variables

    
    private void addrecordstotable() {
        UserAccountDirectory userAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        addDefaultvalues();
        ArrayList<UserAccount> usersList = userAccountDirectory.getUserAccountList();
//        hospitalDirectory = medicalServiceCentralisationEcoSystem.getHospitalDirectory();
    
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        model.setRowCount(0);
//        ArrayList<Hospital> hospitalList = hospitalDirectory.getHospitalList();
        for(UserAccount userAccount: usersList)
        {   
            if(userAccount.getRole().toString() == "HospitalAdmin"){
                model.addRow(new Object[]{userAccount,userAccount.getHospital().getHospitalName(),userAccount.getHospital().getHospitalpincode(),userAccount.getPassword()});
            }
        }
        
        jTableEmployee.setModel(model);
    }

    private void addDefaultvalues() {
        
        UserAccountDirectory usersList = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        userAccount = new UserAccount("hosp121", "pass",new HospitalAdminRole());
        Hospital hospital = new Hospital("hosp121","hospname1","02215");
        hospitalDirectory = medicalServiceCentralisationEcoSystem.getHospitalDirectory();
        hospitalDirectory.addHospital(hospital);
        userAccount.setHospital(hospital);
        if(usersList.checkIfUserIsUnique("hosp121")){
        usersList.addUserAccount(userAccount);
        }
        userAccount = new UserAccount("hosp122", "pass",new HospitalAdminRole());
        hospital = new Hospital("hosp122","hospname2","02215");
        hospitalDirectory.addHospital(hospital);
        userAccount.setHospital(hospital);
        if(usersList.checkIfUserIsUnique("hosp122")){
        usersList.addUserAccount(userAccount);
        }
    }
}
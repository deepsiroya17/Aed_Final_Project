/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Hospital.HospitalAdminWorkArea;



import System.MedicalServiceCentralisationEcoSystem;

import Hospital.Hospital.Hospital;


import System.Role.PathologistRole;
import System.Role.RadiologistRole;
import System.Role.Role;
import System.Role.TechnicianRole;
import Hospital.Technician.Technician;
import Hospital.Technician.TechnicianDirectory;

import System.UserAccount;
import System.UserAccountDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author animeshgiri
 */
public class MedTechAccountsPage extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem;
    TechnicianDirectory technicianDirectory;
    UserAccount userAccount;
    UserAccountDirectory UserAccountDirectory;
    Hospital hospital;
    public MedTechAccountsPage(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem, Hospital hospital) {
        
        this.userProcessContainer = userProcessContainer;
        this.hospitalManagementEcoSystem = hospitalManagementEcoSystem;
        this.hospital = hospital;
        initComponents();
        
        if(hospital.getTechnicianDirectory()== null)
           hospital.setTechnicianDirectory(new TechnicianDirectory());
        
        addRolesComboBox();
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

        lblTitle = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployee = new javax.swing.JTable();
        jButtonCreate = new javax.swing.JButton();
        jTextFieldEmpName = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldEmpID = new javax.swing.JTextField();
        jLabelRole = new javax.swing.JLabel();
        jComboBoxRole = new javax.swing.JComboBox<>();
        jLabelEmpID = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jLabelEmpName = new javax.swing.JLabel();
        jButtonRefresh = new javax.swing.JButton();
        bgdimg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setMaximumSize(new java.awt.Dimension(1920, 1183));
        setMinimumSize(new java.awt.Dimension(1920, 1920));
        setPreferredSize(new java.awt.Dimension(1920, 1183));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 56)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Lab Examinations and Technician");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 840, 70));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 110, 60));

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Role", "Password"
            }
        ));
        jTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 540, 110));

        jButtonCreate.setBackground(new java.awt.Color(255, 255, 204));
        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCreate.setForeground(new java.awt.Color(0, 102, 102));
        jButtonCreate.setText("CREATE");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 110, 60));
        add(jTextFieldEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 290, 30));

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 204));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(0, 102, 102));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 110, 60));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPassword.setText("Password:");
        add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 130, 30));

        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });
        add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 290, 30));

        jTextFieldEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpIDActionPerformed(evt);
            }
        });
        add(jTextFieldEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 290, 30));

        jLabelRole.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelRole.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRole.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelRole.setText("Role:");
        add(jLabelRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 120, -1));

        jComboBoxRole.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxRole.setForeground(new java.awt.Color(0, 102, 102));
        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Nurse" }));
        add(jComboBoxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        jLabelEmpID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEmpID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEmpID.setText("Employee ID:");
        add(jLabelEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 140, -1));

        jButtonDelete.setBackground(new java.awt.Color(255, 255, 204));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(0, 102, 102));
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 110, 60));

        jLabelEmpName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEmpName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEmpName.setText("Employee Name:");
        add(jLabelEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 160, 30));

        jButtonRefresh.setBackground(new java.awt.Color(255, 255, 204));
        jButtonRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRefresh.setForeground(new java.awt.Color(0, 102, 102));
        jButtonRefresh.setText("REFRESH");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });
        add(jButtonRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 110, 60));

        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Images/medicaltesttech1.jpg"))); // NOI18N
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-430, -690, 2530, 1870));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"hospitalAdminWorkAreaJPanel");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jTextFieldEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpIDActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ArrayList<String> user_input = check_empty_field();
        UserAccountDirectory usersList = hospitalManagementEcoSystem.getUserAccountDirectory();
        if(!user_input.isEmpty()) {
            if(usersList.checkIfUserIsUnique(user_input.get(0))){
            
            
            
            if(user_input.get(2) == "Technician"){

                userAccount = new UserAccount(user_input.get(0), user_input.get(3), new TechnicianRole());
                usersList.addUserAccount(userAccount);
                Technician technician = new Technician();
                technician.setTechnicianId(user_input.get(0));
                technician.setTechnicianName(user_input.get(1));                
                technicianDirectory.addTechnician(user_input.get(0), technician);
                hospital.setTechnicianDirectory(technicianDirectory);
                userAccount.setHospital(hospital);
            }
            
            JOptionPane.showMessageDialog(this, "New Employee Information has been added.");
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
        UserAccountDirectory = hospitalManagementEcoSystem.getUserAccountDirectory();
        ArrayList<UserAccount> userAccountList = UserAccountDirectory.getUserAccountList();
        for(UserAccount userAccount: userAccountList)
        {
            if(userAccount.getUsername().equals(select_account_details.getUsername()))
            {
                Hospital hospital = userAccount.getHospital();
                ArrayList<String> user_input = check_empty_field();
//                model.setValueAt(user_input.get(1), selected_row_ix, 0);
                model.setValueAt(user_input.get(1), selected_row_ix, 1);
//                model.setValueAt(user_input.get(2), selected_row_ix, 2);
                model.setValueAt(user_input.get(3), selected_row_ix, 3);
                UserAccountDirectory.updateAccount(set_user_input_values(userAccount, user_input));
                break;
            }
        }   

        JOptionPane.showMessageDialog(this, "Values updated");

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
        UserAccountDirectory = hospitalManagementEcoSystem.getUserAccountDirectory();
        UserAccountDirectory.deleteAccount(select_user_account_details);
//        ecosystem.setRestaurantDirectory(restaurantDirectory);
        model.removeRow(selected_row_ix);
        addrecordstotable();
        clearFields();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeMouseClicked
        // TODO add your handling code here:
        jButtonCreate.setEnabled(false);
        jComboBoxRole.setEnabled(false);
        int selected_row_ix = jTableEmployee.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
        jTextFieldEmpID.setEditable(false);
        jTextFieldEmpID.setText(select_user_account_details.getUsername());
        
        Role role = select_user_account_details.getRole();
        System.out.println("role.toString(): "+role.toString());
        jComboBoxRole.setSelectedItem(role.toString()); 
        
        
        if(role.toString().equals("Technician")){
            Hospital hospital = select_user_account_details.getHospital();
            technicianDirectory = hospital.getTechnicianDirectory();
            HashMap<String, Technician> technicianList = technicianDirectory.getTechnicianList();
            Technician technician = technicianList.get(select_user_account_details.getUsername());
            jTextFieldEmpName.setText(technician.getTechnicianName());
        }
        
        
        jTextFieldPassword.setText(select_user_account_details.getPassword());
        
    }//GEN-LAST:event_jTableEmployeeMouseClicked

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        jTextFieldEmpID.setEditable(true);
        jButtonCreate.setEnabled(true);
        jComboBoxRole.setEnabled(true);
        clearFields();
    }//GEN-LAST:event_jButtonRefreshActionPerformed
    private UserAccount set_user_input_values(UserAccount userAccount, ArrayList<String> user_input) {
//        userAccount.getEmployee().setEmployee_id(user_input.get(0));
//        userAccount.getEmployee().setEmployee_name(user_input.get(1));
        userAccount.setPassword(user_input.get(3));
        return userAccount;
    }
    private void clearFields(){
        jTextFieldEmpID.setText("");
        jTextFieldEmpName.setText("");
        jTextFieldPassword.setText("");
        jComboBoxRole.setSelectedItem("");
    }
    
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_emp_id = jTextFieldEmpID.getText();
        String user_emp_name = jTextFieldEmpName.getText();
        String user_password = jTextFieldPassword.getText();
        String user_role = (String) jComboBoxRole.getSelectedItem();

        
        if(user_emp_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "User ID can't be left empty.");
        }
        else if(user_emp_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "User Name can't be left empty.");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Password.");
        }
        else if(user_role.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please select a Role.");
        } 
        else {
            user_input.add(user_emp_id);
            user_input.add(user_emp_name);
            user_input.add(user_role);
            user_input.add(user_password);
        }
        
        
        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxRole;
    private javax.swing.JLabel jLabelEmpID;
    private javax.swing.JLabel jLabelEmpName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextFieldEmpID;
    private javax.swing.JTextField jTextFieldEmpName;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    

    private void addRolesComboBox() {
        jComboBoxRole.removeAllItems();
        jComboBoxRole.addItem("");
        jComboBoxRole.addItem("Radiologist");
        jComboBoxRole.addItem("Pathologist");
        jComboBoxRole.addItem("Technician");
    }

    private void addrecordstotable() {
        technicianDirectory = hospital.getTechnicianDirectory();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        model.setRowCount(0);

        UserAccountDirectory userAccountDirectory = hospitalManagementEcoSystem.getUserAccountDirectory();
        ArrayList<UserAccount> usersList = userAccountDirectory.getUserAccountList();

        
        model.setRowCount(0);
//        ArrayList<Hospital> hospitalList = hospitalDirectory.getHospitalList();
        for(UserAccount userAccount: usersList)
        {   
            
            if(userAccount.getRole().toString() == "Technician" && userAccount.getHospital().equals(hospital)){
                
                technicianDirectory = hospital.getTechnicianDirectory();
                HashMap<String, Technician> technicianList = technicianDirectory.getTechnicianList();
                Technician technician = technicianList.get(userAccount.getUsername());
                model.addRow(new Object[]{userAccount,technician.getTechnicianName(),userAccount.getRole(),userAccount.getPassword()});
            }
        }

        jTableEmployee.setModel(model);
    }
    
    
}
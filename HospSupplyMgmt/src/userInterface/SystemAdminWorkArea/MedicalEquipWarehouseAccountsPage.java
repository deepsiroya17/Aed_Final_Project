/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdminWorkArea;



import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;


import MainCentralisationSystem.Role.MedSupWarehouseAdminRole;
import MainCentralisationSystem.Role.Role;

import MedicalEquipmentWarehouse.MedSupWarehouse;
import MedicalEquipmentWarehouse.MedSupWarehouseDirectory;
import MainCentralisationSystem.UserAccount;
import MainCentralisationSystem.UserAccountDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class MedicalEquipWarehouseAccountsPage extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    MedSupWarehouseDirectory medSupWarehouseDirectory;
//    FrontDeskOperatorDirectory frontDeskOperatorDirectory;
    UserAccount userAccount;
    UserAccountDirectory UserAccountDirectory;

    public MedicalEquipWarehouseAccountsPage(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem) {
        
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        initComponents();
        if(medicalServiceCentralisationEcoSystem.getMedSupWarehouseDirectory()== null)
           medicalServiceCentralisationEcoSystem.setMedSupWarehouseDirectory(new MedSupWarehouseDirectory());
        
//        addRolesComboBox();
        addDefaultvalues();
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
        jTextFieldTeamName = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldTeamPassword = new javax.swing.JTextField();
        jTextFieldTeamID = new javax.swing.JTextField();
        jLabelEmpID = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jLabelEmpName = new javax.swing.JLabel();
        jButtonRefresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Med Equip Warehouse");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, 832, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Warehouse ID", "Warehouse Name", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 470, 770, 130));

        jButtonCreate.setBackground(new java.awt.Color(255, 255, 204));
        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCreate.setForeground(new java.awt.Color(0, 102, 102));
        jButtonCreate.setText("CREATE");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 90, 40));
        add(jTextFieldTeamName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 350, -1));

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 204));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(0, 102, 102));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 90, 40));

        jLabelPassword.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(0, 102, 102));
        jLabelPassword.setText("Password:");
        add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 90, -1));

        jTextFieldTeamPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTeamPasswordActionPerformed(evt);
            }
        });
        add(jTextFieldTeamPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 350, -1));

        jTextFieldTeamID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTeamIDActionPerformed(evt);
            }
        });
        add(jTextFieldTeamID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 351, -1));

        jLabelEmpID.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelEmpID.setForeground(new java.awt.Color(0, 102, 102));
        jLabelEmpID.setText("Warehouse ID:");
        add(jLabelEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, -1));

        jButtonDelete.setBackground(new java.awt.Color(255, 255, 204));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(0, 102, 102));
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 100, 40));

        jLabelEmpName.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelEmpName.setForeground(new java.awt.Color(0, 102, 102));
        jLabelEmpName.setText("Warehouse Name:");
        add(jLabelEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 180, -1));

        jButtonRefresh.setBackground(new java.awt.Color(255, 255, 204));
        jButtonRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRefresh.setForeground(new java.awt.Color(0, 102, 102));
        jButtonRefresh.setText("REFRESH");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });
        add(jButtonRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Images/medequipmentwarehouse.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1920, 1190));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldTeamPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTeamPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTeamPasswordActionPerformed

    private void jTextFieldTeamIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTeamIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTeamIDActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ArrayList<String> user_input = check_empty_field();
        medSupWarehouseDirectory = medicalServiceCentralisationEcoSystem.getMedSupWarehouseDirectory();
        UserAccountDirectory usersList = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        if(usersList.checkIfUserIsUnique(user_input.get(0))){
            
//            Employee employee = new Employee(user_input.get(0),user_input.get(1),new MedSupWarehouseAdminRole());
            
            
            userAccount = new UserAccount(user_input.get(0), user_input.get(2), new MedSupWarehouseAdminRole());
            
            MedSupWarehouse medSupWarehouse = new MedSupWarehouse(user_input.get(0), user_input.get(1));
            userAccount.setMedSupWarehouse(medSupWarehouse);
            medSupWarehouseDirectory.addMedSupWarehouse(medSupWarehouse);
            
            usersList.addUserAccount(userAccount);
            
            JOptionPane.showMessageDialog(this, "New MedSupWarehouse Information has been added.");
            model.addRow(new Object[]{userAccount,user_input.get(1),user_input.get(2)});
            clearFields();
        }
        else{
            JOptionPane.showMessageDialog(this, "This username is not available. Please select a new one.");
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
        medSupWarehouseDirectory = medicalServiceCentralisationEcoSystem.getMedSupWarehouseDirectory();
        ArrayList<UserAccount> userAccountList = UserAccountDirectory.getUserAccountList();
        for(UserAccount userAccount: userAccountList)
        {
            if(userAccount.getUsername().equals(select_account_details.getUsername()))
            {
                MedSupWarehouse medSupWarehouse = userAccount.getMedSupWarehouse();
                ArrayList<String> user_input = check_empty_field();
//                model.setValueAt(user_input.get(1), selected_row_ix, 0);
                model.setValueAt(user_input.get(1), selected_row_ix, 1);
                model.setValueAt(user_input.get(2), selected_row_ix, 2);
                medSupWarehouseDirectory.updateMedSupWarehouse(user_input, medSupWarehouse);
                UserAccountDirectory.updateAccount(set_user_input_values(userAccount, user_input));
                break;
            }
        }
        
//        medicalServiceCentralisationEcoSystem.setRestaurantDirectory(restaurantDirectory);
        JOptionPane.showMessageDialog(this, "Values updated");
//        addrecordstotable();
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
        UserAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        MedSupWarehouse medSupWarehouse = select_user_account_details.getMedSupWarehouse();
        medSupWarehouseDirectory.deleteMedSupWarehouse(medSupWarehouse);
        UserAccountDirectory.deleteAccount(select_user_account_details);
//        ecosystem.setRestaurantDirectory(restaurantDirectory);
        model.removeRow(selected_row_ix);
        addrecordstotable();
        clearFields();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeMouseClicked
        // TODO add your handling code here:
        jButtonCreate.setEnabled(false);
        int selected_row_ix = jTableEmployee.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
        jTextFieldTeamID.setEditable(false);
        jTextFieldTeamID.setText(select_user_account_details.getUsername());
        jTextFieldTeamName.setText(select_user_account_details.getMedSupWarehouse().getMedSupWarehouseName());
        jTextFieldTeamPassword.setText(select_user_account_details.getPassword());
        
    }//GEN-LAST:event_jTableEmployeeMouseClicked

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        jButtonCreate.setEnabled(true);
        jTextFieldTeamID.setEditable(true);
        clearFields();
    }//GEN-LAST:event_jButtonRefreshActionPerformed
    private UserAccount set_user_input_values(UserAccount userAccount, ArrayList<String> user_input) {
//        userAccount.getEmployee().setEmployee_id(user_input.get(0));
        userAccount.getMedSupWarehouse().setMedSupWarehouseName(user_input.get(1));
        userAccount.setPassword(user_input.get(2));
        return userAccount;
    }
    private void clearFields(){
        jTextFieldTeamID.setText("");
        jTextFieldTeamName.setText("");
        jTextFieldTeamPassword.setText("");
    }
    
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_emp_id = jTextFieldTeamID.getText();
        String user_emp_name = jTextFieldTeamName.getText();
        String user_password = jTextFieldTeamPassword.getText();

        
        if(user_emp_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "User ID can't be left empty.");
        }
        else if(user_emp_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "User Name can't be left empty.");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Password.");
        }
        
        
        user_input.add(user_emp_id);
        user_input.add(user_emp_name);
        user_input.add(user_password);
        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEmpID;
    private javax.swing.JLabel jLabelEmpName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextFieldTeamID;
    private javax.swing.JTextField jTextFieldTeamName;
    private javax.swing.JTextField jTextFieldTeamPassword;
    // End of variables declaration//GEN-END:variables

    
    private void addrecordstotable() {
        UserAccountDirectory userAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        ArrayList<UserAccount> usersList = userAccountDirectory.getUserAccountList();
//        medSupWarehouseDirectory = medicalServiceCentralisationEcoSystem.getMedSupWarehouseDirectory();
    
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        model.setRowCount(0);
//        ArrayList<MedSupWarehouse> medSupWarehouseList = medSupWarehouseDirectory.getMedSupWarehouseList();
        for(UserAccount userAccount: usersList)
        {   
            if(userAccount.getRole().toString() == "MedSupWarehouseAdmin"){
                model.addRow(new Object[]{userAccount,userAccount.getMedSupWarehouse().getMedSupWarehouseName(),userAccount.getPassword()});
            }
            
        }
        
        jTableEmployee.setModel(model);
    }

    private void addDefaultvalues() {
        
        UserAccountDirectory usersList = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        userAccount = new UserAccount("warehouse121", "pass",new MedSupWarehouseAdminRole());
        MedSupWarehouse medSupWarehouse = new MedSupWarehouse("warehouse121","warehouse1");
        medSupWarehouseDirectory = medicalServiceCentralisationEcoSystem.getMedSupWarehouseDirectory();
        medSupWarehouseDirectory.addMedSupWarehouse(medSupWarehouse);
        userAccount.setMedSupWarehouse(medSupWarehouse);
        if(usersList.checkIfUserIsUnique("warehouse121")){
            usersList.addUserAccount(userAccount);
        }
        
        userAccount = new UserAccount("warehouse122", "pass",new MedSupWarehouseAdminRole());
        medSupWarehouse = new MedSupWarehouse("warehouse122","warehouse2");
        medSupWarehouseDirectory.addMedSupWarehouse(medSupWarehouse);
        userAccount.setMedSupWarehouse(medSupWarehouse);
        if(usersList.checkIfUserIsUnique("warehouse122")){
            usersList.addUserAccount(userAccount);
        }    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalManagement.MedTechnicalWorkArea;


import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;
import userInterface.SystemAdminWorkArea.*;
import java.awt.CardLayout;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.HospitalManagementMainJFrame;
/**
 *
 * @author animeshgiri
 */
public class MedTechnicalEmployeeAttendance extends javax.swing.JPanel {

    /**
     * Creates new form MedTechnicalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem;
//    CustomerDirectory customerDirectory;
//    RestaurantDirectory restaurantDirectory;
//    UserAccount userAccount;
//    Restaurant restaurant;
//    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
//    
//    public MedTechnicalEmployeeAttendance(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem) {
//        this.userProcessContainer = userProcessContainer;
//        this.ecosystem = ecosystem;
//        initComponents();
//        if(ecosystem.getRestaurantDirectory() == null)
//           ecosystem.setRestaurantDirectory(new RestaurantDirectory());
////        this.ecosystem = dB4OUtil.retrieveSystem();
//        addrecordstotable(2);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEmpID = new javax.swing.JTextField();
        jLabelEmpID = new javax.swing.JLabel();
        jLabelEmpName = new javax.swing.JLabel();
        jTextFieldEmpName = new javax.swing.JTextField();
        jLabelDept = new javax.swing.JLabel();
        jComboBoxDept = new javax.swing.JComboBox<>();
        jButtonView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployee = new javax.swing.JTable();
        bgdimg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1181, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 70, 169));
        jPanel1.setPreferredSize(new java.awt.Dimension(1381, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1245, 0, 0, 89));

        jLabel1.setBackground(new java.awt.Color(0, 70, 169));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Attendance");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 200, 891, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 182, 1137, -1));

        jTextFieldEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpIDActionPerformed(evt);
            }
        });
        add(jTextFieldEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 190, -1));

        jLabelEmpID.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelEmpID.setText("Employee ID:");
        add(jLabelEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 100, -1));

        jLabelEmpName.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelEmpName.setText("Employee Name:");
        add(jLabelEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 130, -1));
        add(jTextFieldEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 190, -1));

        jLabelDept.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelDept.setText("Role:");
        add(jLabelDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 100, -1));

        jComboBoxDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pathologist", "Radiologist", "Technician", " ", " " }));
        jComboBoxDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDeptActionPerformed(evt);
            }
        });
        add(jComboBoxDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 170, 30));

        jButtonView.setBackground(new java.awt.Color(0, 0, 0));
        jButtonView.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonView.setForeground(new java.awt.Color(255, 255, 255));
        jButtonView.setText("Search");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });
        add(jButtonView, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 100, 40));

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "EMP ID", "Employee Name", "Role", "On-Duty", "Next Available Employee"
            }
        ));
        jScrollPane1.setViewportView(jTableEmployee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 520, 670, 110));

        bgdimg.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Images/custsupp1.jpg"))); // NOI18N
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-380, 0, 2300, 1710));
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpIDActionPerformed

    private void jComboBoxDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDeptActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonViewActionPerformed
    /*private void clearFields(){
        restaurantID.setText("");
        restaurantName.setText("");
        restaurantPincode.setText("");
        restaurantPhone.setText("");
        restaurantPassword.setText("");
    }
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_rest_id = restaurantID.getText();
        String user_rest_name = restaurantName.getText();
        String user_pincode = restaurantPincode.getText();
        String user_contact_no = restaurantPhone.getText();
        String user_password = restaurantPassword.getText();
        
        
        if(user_rest_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Restaurant ID can't be left empty.");
        }
        else if(user_rest_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Restaurant Name can't be left empty.");
        }
        else if(user_pincode.isEmpty()){
            JOptionPane.showMessageDialog(this, "Restaurant Pincode can't be left empty.");
        }
        else if(user_contact_no.isEmpty()){
            JOptionPane.showMessageDialog(this, "Restaurant Contact No can't be left empty.");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Password.");
        }
        
        
        user_input.add(user_rest_id);
        user_input.add(user_rest_name);
        user_input.add(user_pincode);
        user_input.add(user_contact_no);
        user_input.add(user_password);
        
        return user_input;
        
    }
    private Restaurant set_user_input_values(Restaurant restaurant, ArrayList<String> user_input){
        
        restaurant.setRest_id(user_input.get(0));
        restaurant.setName(user_input.get(1));
        restaurant.setRest_pincode(user_input.get(2));
        restaurant.setContact_no(user_input.get(3));
        return restaurant;
    }*/
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox<String> jComboBoxDept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDept;
    private javax.swing.JLabel jLabelEmpID;
    private javax.swing.JLabel jLabelEmpName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextFieldEmpID;
    private javax.swing.JTextField jTextFieldEmpName;
    // End of variables declaration//GEN-END:variables

//    private void addrecordstotable(int par) {
//        restaurantDirectory = ecosystem.getRestaurantDirectory();
//        DefaultTableModel model = (DefaultTableModel) RestaurantsTable.getModel();
////        DefaultComboBo/xModel dc = new DefaultComboBoxModel();
//        model.setRowCount(0);
//        ArrayList<Restaurant> restaurants = restaurantDirectory.getRestaurantList();
//        for(Restaurant r: restaurants)
//        {
//            model.addRow(new Object[]{r,r.getName(),r.getContact_no(),r.getRest_pincode(),r.getUserAccount().getPassword()});
//        }
//        RestaurantsTable.setModel(model);
//        dB4OUtil.storeSystem(ecosystem);
//    }
}

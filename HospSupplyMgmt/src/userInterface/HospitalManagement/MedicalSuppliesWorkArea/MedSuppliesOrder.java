/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalManagement.MedicalSuppliesWorkArea;


import userInterface.HospitalManagement.MedTechnicalWorkArea.*;
import HospitalManagement.Hospital.Hospital;
import HospitalManagement.LabTest.LabTest;
import HospitalManagement.LabTest.LabTestDirectory;
import HospitalManagement.MedSupEquipInternal.MedSupEquipInternalDirectory;
import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;
import MainCentralisationSystem.UserAccount;
import MainCentralisationSystem.UserAccountDirectory;
import MedicalEquipmentWarehouse.MedSupEquip.MedSupEquip;
import MedicalEquipmentWarehouse.MedSupEquip.MedSupEquipDirectory;
import MedicalEquipmentWarehouse.MedSupWarehouse;
import MedicalEquipmentWarehouse.MedSupWarehouseDirectory;
import MedicalEquipmentWarehouse.Orders.Order;
import MedicalEquipmentWarehouse.Orders.OrderDirectory;
import userInterface.SystemAdminWorkArea.*;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author animeshgiri
 */
public class MedSuppliesOrder extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    UserAccount userAccount;
    UserAccountDirectory userAccountDirectory;
//    PatientTestDirectory patientTestDirectory;
    LabTestDirectory labTestDirectory;
    Hospital hospital;
    Order new_order = new Order();
    public MedSuppliesOrder(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem, Hospital hospital) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        this.hospital = hospital;
        if(hospital.getMedSupEquipInternalDirectory()== null)
           hospital.setMedSupEquipInternalDirectory(new MedSupEquipInternalDirectory());
        
//        addrecordstotable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jLabelPatientID = new javax.swing.JLabel();
        jTextFieldMedSupEquipName = new javax.swing.JTextField();
        jLabelTitle2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();
        jButtonPlaceOrder = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSearchResults = new javax.swing.JTable();
        jButtonAddToCart = new javax.swing.JButton();
        jLabelPatientID1 = new javax.swing.JLabel();
        jTextFieldMedSupEquipOrderQuantity = new javax.swing.JTextField();
        jButtonClearCart = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 102, 102));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Search Results");
        add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 840, -1));

        jButtonHome.setBackground(new java.awt.Color(0, 102, 102));
        jButtonHome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(255, 255, 204));
        jButtonHome.setText("HOME");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        jButtonSearch.setBackground(new java.awt.Color(0, 102, 102));
        jButtonSearch.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButtonSearch.setForeground(new java.awt.Color(255, 255, 204));
        jButtonSearch.setText("SEARCH");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        jLabelPatientID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabelPatientID.setForeground(new java.awt.Color(0, 102, 102));
        jLabelPatientID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientID.setText("Medical Equipment Name");
        add(jLabelPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 160, 20));

        jTextFieldMedSupEquipName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMedSupEquipNameActionPerformed(evt);
            }
        });
        add(jTextFieldMedSupEquipName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 270, -1));

        jLabelTitle2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle2.setForeground(new java.awt.Color(0, 102, 102));
        jLabelTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle2.setText("Hospital Test Database");
        add(jLabelTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 706, -1));

        jTableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medical Equipment Name", "Medical Equipment Price", "Medical Equipment Quantity", "Warehouse ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCart);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 820, 110));

        jButtonPlaceOrder.setBackground(new java.awt.Color(0, 102, 102));
        jButtonPlaceOrder.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButtonPlaceOrder.setForeground(new java.awt.Color(255, 255, 204));
        jButtonPlaceOrder.setText("PLACE ORDER");
        jButtonPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlaceOrderActionPerformed(evt);
            }
        });
        add(jButtonPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, -1, -1));

        jButtonRefresh.setBackground(new java.awt.Color(0, 102, 102));
        jButtonRefresh.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButtonRefresh.setForeground(new java.awt.Color(255, 255, 204));
        jButtonRefresh.setText("REFRESH");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });
        add(jButtonRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        jTableSearchResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Medical Equipment Name", "Medical Equipment Price", "Medical Equipment Quantity", "Warehouse ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSearchResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSearchResultsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableSearchResults);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 820, 110));

        jButtonAddToCart.setBackground(new java.awt.Color(0, 102, 102));
        jButtonAddToCart.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButtonAddToCart.setForeground(new java.awt.Color(255, 255, 204));
        jButtonAddToCart.setText("ADD TO CART");
        jButtonAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddToCartActionPerformed(evt);
            }
        });
        add(jButtonAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, -1, -1));

        jLabelPatientID1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabelPatientID1.setForeground(new java.awt.Color(0, 102, 102));
        jLabelPatientID1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientID1.setText("Medical Equipment Quantity");
        add(jLabelPatientID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 190, 20));

        jTextFieldMedSupEquipOrderQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMedSupEquipOrderQuantityActionPerformed(evt);
            }
        });
        add(jTextFieldMedSupEquipOrderQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 270, -1));

        jButtonClearCart.setBackground(new java.awt.Color(0, 102, 102));
        jButtonClearCart.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButtonClearCart.setForeground(new java.awt.Color(255, 255, 204));
        jButtonClearCart.setText("CLEAR CART");
        jButtonClearCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearCartActionPerformed(evt);
            }
        });
        add(jButtonClearCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"medSupAdminWorkAreaJPanel");
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTextFieldMedSupEquipNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMedSupEquipNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMedSupEquipNameActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableSearchResults.getModel();
        model.setRowCount(0);
        MedSupWarehouseDirectory medSupWarehouseDirectory = medicalServiceCentralisationEcoSystem.getMedSupWarehouseDirectory();
        ArrayList<MedSupWarehouse> medSupWarehouseList = medSupWarehouseDirectory.getMedSupWarehouseList();
        String medSupEquip_name = jTextFieldMedSupEquipName.getText();

        for(MedSupWarehouse medSupWarehouse: medSupWarehouseList){
            MedSupEquipDirectory medSupEquipDirectory = medSupWarehouse.getMedSupEquipDirectory();
            if(medSupEquipDirectory!= null){
                ArrayList<MedSupEquip> medSupEquipList = medSupEquipDirectory.getMedSupEquipList();
                for(MedSupEquip medSupEquip: medSupEquipList){
                    if(medSupEquip.getMedSupEquip_name().contains(medSupEquip_name)){
                        model.addRow(new Object[]{medSupEquip,medSupEquip.getMedSupEquip_price(),medSupEquip.getMedSupEquip_quantity(),medSupEquip.getMedSupWarehouseId()});
                    }
                }
            }
            
        }
        
        clearFields();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlaceOrderActionPerformed
        // TODO add your handling code here:
       MedSupWarehouseDirectory medSupWarehouseDirectory = medicalServiceCentralisationEcoSystem.getMedSupWarehouseDirectory();
       ArrayList<MedSupWarehouse> medSupWarehouseList = medSupWarehouseDirectory.getMedSupWarehouseList();
        
       String new_order_warehouse_id = new_order.getWarehouseId();
       for(MedSupWarehouse medSupWarehouse: medSupWarehouseList){
           if(medSupWarehouse.getMedSupWarehouseId().equals(new_order_warehouse_id)){
               OrderDirectory orderDirectory = medSupWarehouse.getOrderDirectory();
               String last_order_id = orderDirectory.getLast_order_id();
                int last_order_id_int = Integer.parseInt(last_order_id.replaceAll("[\\D]", ""));
                last_order_id_int++;
                new_order.setOrder_id(String.valueOf(last_order_id_int));
                new_order.setHospital_id(hospital.getHospitalId());
                new_order.calculate_order_amount();
               orderDirectory.addOrder(new_order);
               orderDirectory.setLast_order_id(last_order_id);
               medSupWarehouse.setOrderDirectory(orderDirectory);
               JOptionPane.showMessageDialog(this, "Order Placed");
           }
       }

    }//GEN-LAST:event_jButtonPlaceOrderActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        // TODO add your handling code here:
        clearFields();
        DefaultTableModel model = (DefaultTableModel) jTableSearchResults.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddToCartActionPerformed
        // TODO add your handling code here:
        int selected_row_ix = jTableSearchResults.getSelectedRow();
        DefaultTableModel modelSearch = (DefaultTableModel) jTableSearchResults.getModel();
        MedSupEquip medSupEquip = (MedSupEquip) modelSearch.getValueAt(selected_row_ix, 0);
        String user_quantity = jTextFieldMedSupEquipOrderQuantity.getText();
        String tot_price="";
        if(!user_quantity.isEmpty()){
            DefaultTableModel modelCart = (DefaultTableModel) jTableCart.getModel();
            if(new_order.getMedSupEquipItemsWithQuantity().size()==0){
                new_order.addItemToOrder(medSupEquip, user_quantity);
                new_order.setStatus("new");
                tot_price = String.valueOf(Integer.parseInt(medSupEquip.getMedSupEquip_price())*Integer.parseInt(user_quantity));
                new_order.setWarehouseId(medSupEquip.getMedSupWarehouseId());
                modelCart.addRow(new Object[]{medSupEquip,tot_price,user_quantity,medSupEquip.getMedSupWarehouseId()});
            }
            else{
                if(!medSupEquip.getMedSupWarehouseId().equals(new_order.getWarehouseId())){
                    JOptionPane.showMessageDialog(this, "Please order items from one warehouse or clear the cart");
                }
                else{
                    new_order.addItemToOrder(medSupEquip, user_quantity);
                    tot_price = String.valueOf(Integer.parseInt(medSupEquip.getMedSupEquip_price())*Integer.parseInt(user_quantity));
                    modelCart.addRow(new Object[]{medSupEquip,tot_price,user_quantity,medSupEquip.getMedSupWarehouseId()});
                }
            }
            
            

//            MedSupEquip medSupEquipCart = (MedSupEquip) modelCart.getValueAt(selected_row_ix, 0);
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Please enter item quantity");
        }
        
        
    }//GEN-LAST:event_jButtonAddToCartActionPerformed

    private void jTextFieldMedSupEquipOrderQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMedSupEquipOrderQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMedSupEquipOrderQuantityActionPerformed

    private void jTableSearchResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSearchResultsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableSearchResultsMouseClicked

    private void jButtonClearCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearCartActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelCart = (DefaultTableModel) jTableCart.getModel();
        modelCart.setRowCount(0);
        new_order = new Order();
        
    }//GEN-LAST:event_jButtonClearCartActionPerformed
    /*private Customer set_user_input_values(Customer customer, ArrayList<String> user_input){
        
        customer.getUserAccount().setPassword(user_input.get(1));
        customer.setCustomerPhone(user_input.get(2));
        return customer;
    }
        private void clearFields(){
        custUsername.setText("");
        custPassword.setText("");
        custContact.setText("");

    }
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_custName = custUsername.getText();
        String user_custPass = custPassword.getText();
        String user_contact = custContact.getText();
 
        if(user_custName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Customer Name can't be left empty");
        }
        else if(user_custPass.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter password");
        }
        
        else if(user_contact.isEmpty()){
            JOptionPane.showMessageDialog(this, "Customer Contact No can't be left empty.");
        }
        user_input.add(user_custName);
        user_input.add(user_custPass);
        user_input.add(user_contact);
        
        return user_input;
        
    }
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddToCart;
    private javax.swing.JButton jButtonClearCart;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonPlaceOrder;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabelPatientID;
    private javax.swing.JLabel jLabelPatientID1;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCart;
    private javax.swing.JTable jTableSearchResults;
    private javax.swing.JTextField jTextFieldMedSupEquipName;
    private javax.swing.JTextField jTextFieldMedSupEquipOrderQuantity;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        jTextFieldMedSupEquipName.setText("");
        jTextFieldMedSupEquipOrderQuantity.setText("");
    }
}

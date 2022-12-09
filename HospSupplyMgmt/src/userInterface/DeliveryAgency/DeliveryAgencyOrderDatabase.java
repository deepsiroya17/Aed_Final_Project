/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.DeliveryAgency;


import DeliveryAgency.DeliveryAgency;
import userInterface.MedSupWarehouseAdminWorkArea.*;
import userInterface.HospitalManagement.MedTechnicalWorkArea.*;
import HospitalManagement.Hospital.Hospital;
import HospitalManagement.Hospital.HospitalDirectory;
import HospitalManagement.MedSupEquipInternal.MedSupEquipInternal;
import HospitalManagement.MedSupEquipInternal.MedSupEquipInternalDirectory;
import MedicalEquipmentWarehouse.MedSupEquip.MedSupEquip;
import MedicalEquipmentWarehouse.MedSupEquip.MedSupEquipDirectory;
import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;
import MainCentralisationSystem.UserAccount;
import MainCentralisationSystem.UserAccountDirectory;
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
 * @author sarth
 */
public class DeliveryAgencyOrderDatabase extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    UserAccount userAccount;
    UserAccountDirectory userAccountDirectory;
//    PatientMedSupEquipDirectory patientMedSupEquipDirectory;
    MedSupEquipDirectory medSupEquipDirectory;
    DeliveryAgency deliveryAgencyCurrent;
    
    public DeliveryAgencyOrderDatabase(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem, DeliveryAgency deliveryAgencyCurrent) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        this.deliveryAgencyCurrent = deliveryAgencyCurrent;
        
        addneworderstotable();
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
        jButtonAssignDeliveryAgency = new javax.swing.JButton();
        jLabelTitle2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAllOrders = new javax.swing.JTable();
        jButtonAssignDeliveryAgency1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableNewOrders = new javax.swing.JTable();
        jLabelTitle1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 102, 102));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("All Orders");
        add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1000, -1));

        jButtonHome.setBackground(new java.awt.Color(0, 102, 102));
        jButtonHome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(255, 255, 204));
        jButtonHome.setText("HOME");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        jButtonAssignDeliveryAgency.setBackground(new java.awt.Color(0, 102, 102));
        jButtonAssignDeliveryAgency.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAssignDeliveryAgency.setForeground(new java.awt.Color(255, 255, 204));
        jButtonAssignDeliveryAgency.setText("ACCEPT");
        jButtonAssignDeliveryAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAssignDeliveryAgencyActionPerformed(evt);
            }
        });
        add(jButtonAssignDeliveryAgency, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 90, 20));

        jLabelTitle2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitle2.setForeground(new java.awt.Color(0, 102, 102));
        jLabelTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle2.setText("Delivery Agency Order Database");
        add(jLabelTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, -1));

        jTableAllOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Medical Equipment Names", "Medical Equipment Total Price", "Hospital ID", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAllOrders);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 680, 150));

        jButtonAssignDeliveryAgency1.setBackground(new java.awt.Color(0, 102, 102));
        jButtonAssignDeliveryAgency1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAssignDeliveryAgency1.setForeground(new java.awt.Color(255, 255, 204));
        jButtonAssignDeliveryAgency1.setText("MARK DELIVERED");
        jButtonAssignDeliveryAgency1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAssignDeliveryAgency1ActionPerformed(evt);
            }
        });
        add(jButtonAssignDeliveryAgency1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 240, 20));

        jTableNewOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Medical Equipment Names", "Medical Equipment Total Price", "Hospital ID", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableNewOrders);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 680, 140));

        jLabelTitle1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitle1.setForeground(new java.awt.Color(0, 102, 102));
        jLabelTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle1.setText("New Orders");
        add(jLabelTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1000, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonAssignDeliveryAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAssignDeliveryAgencyActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableNewOrders.getModel();
        int selected_row_ix = jTableNewOrders.getSelectedRow();
        Order order = (Order) model.getValueAt(selected_row_ix, 0);
        model.setValueAt("accepted", selected_row_ix, 4);
        order.setStatus("accpeted");
//        String delivery_agency_id = (String) jComboBoxDeliveryAgency.getSelectedItem();
//        order.setDelivery_agency_id(delivery_agency_id);
        jTableNewOrders.setModel(model);
    }//GEN-LAST:event_jButtonAssignDeliveryAgencyActionPerformed

    private void jButtonAssignDeliveryAgency1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAssignDeliveryAgency1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableNewOrders.getModel();
        int selected_row_ix = jTableNewOrders.getSelectedRow();
        Order order = (Order) model.getValueAt(selected_row_ix, 0);
        model.setValueAt("delivered", selected_row_ix, 4);
        order.setStatus("delivered");
        addneworderstotable();
        DefaultTableModel modelAllOrders = (DefaultTableModel) jTableAllOrders.getModel();
        modelAllOrders.addRow(new Object[]{order, order.getMedSupEquipItemsWithQuantity(), order.getOrder_amount(),order.getWarehouseId(),order.getStatus()});
        
        HospitalDirectory hospitalDirectory = medicalServiceCentralisationEcoSystem.getHospitalDirectory();
        ArrayList<Hospital> hospitalList = hospitalDirectory.getHospitalList();
        
        for(Hospital hospital: hospitalList){
            if(order.getHospital_id().equals(hospital.getHospitalId())){
                MedSupEquipInternalDirectory medSupEquipInternalDirectory = hospital.getMedSupEquipInternalDirectory();
                ArrayList<MedSupEquipInternal> medSupEquipInternalList = medSupEquipInternalDirectory.getMedSupEquipInternalList();                
                for(MedSupEquipInternal medSupEquipInternal: medSupEquipInternalList){
                    for (HashMap.Entry<MedSupEquip,String> entry : order.getMedSupEquipItemsWithQuantity().entrySet()){
                        if(entry.getKey().toString().equals(medSupEquipInternal.getMedSupEquipInternal_name())){
                            String qty_str = medSupEquipInternal.getMedSupEquipInternal_quantity();
                            String new_qty_str = String.valueOf(Integer.parseInt(entry.getValue()) + Integer.parseInt(qty_str));
                            medSupEquipInternal.setMedSupEquipInternal_quantity(new_qty_str);
                        }
                    }
                }
                medSupEquipInternalDirectory.setMedSupEquipInternalList(medSupEquipInternalList);
                hospital.setMedSupEquipInternalDirectory(medSupEquipInternalDirectory);
            }
            
        }
        
        
        
    }//GEN-LAST:event_jButtonAssignDeliveryAgency1ActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAssignDeliveryAgency;
    private javax.swing.JButton jButtonAssignDeliveryAgency1;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JLabel jLabelTitle2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAllOrders;
    private javax.swing.JTable jTableNewOrders;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
//        jTextFieldMedSupEquipName.setText("");
//        jTextFieldMedSupEquipPrice.setText("");
//        jTextFieldMedSupEquipQuantity.setText("");
    }

    private void addneworderstotable() {
        MedSupWarehouseDirectory medSupWarehousedirectory = medicalServiceCentralisationEcoSystem.getMedSupWarehouseDirectory();
        ArrayList<MedSupWarehouse> medSupWarehouseList = medSupWarehousedirectory.getMedSupWarehouseList();
        
        DefaultTableModel model = (DefaultTableModel) jTableNewOrders.getModel();
        model.setRowCount(0);
//        DefaultComboBoxModel dc = new DefaultComboBoxModel();
        
        for(MedSupWarehouse medSupWarehouse: medSupWarehouseList)
        {
            OrderDirectory orderDirectory = medSupWarehouse.getOrderDirectory();
            if(orderDirectory!=null){
            ArrayList<Order> orderList = orderDirectory.getOrderList();
            
                for(Order order: orderList)
            if(order.getStatus().equals("new") && order.getDelivery_agency_id().equals(deliveryAgencyCurrent.getDeliveryAgencyId())){
                model.addRow(new Object[]{order, order.getMedSupEquipItemsWithQuantity(), order.getOrder_amount(),order.getWarehouseId(),order.getStatus()});
            }
            }
            
        }
        jTableNewOrders.setModel(model);
    }
}

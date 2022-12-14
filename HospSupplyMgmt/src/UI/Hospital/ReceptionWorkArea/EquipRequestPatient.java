/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Hospital.ReceptionWorkArea;


import UI.SystemAdminWorkArea.SendMessageTwilio;
import UI.SystemAdminWorkArea.SendMail;
import Hospital.Hospital.Hospital;
import Hospital.Patient.Patient;
import Hospital.Patient.PatientDirectory;
import Hospital.Patient.PatientTest;
import Hospital.LabExam.LabTest;
import Hospital.LabExam.LabTestDirectory;
import Hospital.MedSupInvenInternal.MedSupEquipInternal;
import Hospital.MedSupInvenInternal.MedSupEquipInternalDirectory;
import Hospital.Patient.PatientOrder;
import Hospital.Requests.Request;
import Hospital.Requests.RequestDirectory;
import System.MedicalServiceCentralisationEcoSystem;
import Warehouse.Orders.Order;
import Warehouse.Orders.OrderDirectory;
import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author animeshgiri
 */
public class EquipRequestPatient extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    Hospital hospital;
    String report_avalibility;
    Patient patient;
    SendMessageTwilio sendMessageTwilio;
    String report_path;
    public EquipRequestPatient(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem, Hospital hospital) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        this.hospital = hospital;
        if(hospital.getPatientDirectory()== null)
           hospital.setPatientDirectory(new PatientDirectory());
        populateNewRequestsTable();
        populateEquipmentComboBox();
        populateAllOrdersTable();
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
        jLabelTitle1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNewTests = new javax.swing.JTable();
        jButtonCreate = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLabelTestName = new javax.swing.JLabel();
        jLabelPatientID = new javax.swing.JLabel();
        jTextFieldPatientId = new javax.swing.JTextField();
        jLabelPatientName = new javax.swing.JLabel();
        jTextFieldOrderDate = new javax.swing.JTextField();
        jComboBoxEquipment = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAllTests = new javax.swing.JTable();
        jLabelTitle3 = new javax.swing.JLabel();
        jTextFieldPatientName = new javax.swing.JTextField();
        jLabelTestDate1 = new javax.swing.JLabel();
        jLabelPatientName1 = new javax.swing.JLabel();
        jTextFieldPatientEmail = new javax.swing.JTextField();
        jLabelTestName1 = new javax.swing.JLabel();
        jTextFieldQuantity = new javax.swing.JTextField();
        jLabelTestDate2 = new javax.swing.JLabel();
        jTextFieldOrderID = new javax.swing.JTextField();
        jLabelTestName2 = new javax.swing.JLabel();
        jTextFieldMode = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Equipment Order Request");
        add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 43, 706, -1));

        jLabelTitle1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle1.setText("All order");
        add(jLabelTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 706, -1));

        jTableNewTests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient PhoneNo", "PatientEmail", "Order Date", "Case ID", "Case Description", "Request Mode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNewTests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNewTestsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNewTests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 570, 160));

        jButtonCreate.setBackground(new java.awt.Color(255, 255, 204));
        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCreate.setText("CREATE");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 100, 40));

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 204));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 100, 40));

        jLabelTestName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTestName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTestName.setText(" Equipment Quantity:");
        add(jLabelTestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 130, 20));

        jLabelPatientID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPatientID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientID.setText("Patient ID:");
        add(jLabelPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 104, -1));
        add(jTextFieldPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 270, -1));

        jLabelPatientName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPatientName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientName.setText("Patient Name :");
        add(jLabelPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 100, -1));
        add(jTextFieldOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 270, -1));

        jComboBoxEquipment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood Test", "Cholestrol", "CBP", "Urine test", "X-Ray", "C.T Scan", "M.R.I ", "Dental Scan", "Ultrasound", "ECG", "EEG", " " }));
        add(jComboBoxEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 110, -1));

        jTableAllTests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Order ID", "Equipment Name", "Order Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAllTests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAllTestsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableAllTests);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 540, 160));

        jLabelTitle3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle3.setText("New equipment requests");
        add(jLabelTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 660, -1));
        add(jTextFieldPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 270, -1));

        jLabelTestDate1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTestDate1.setText("Order Date:");
        add(jLabelTestDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 315, 80, 20));

        jLabelPatientName1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPatientName1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientName1.setText("Patient Email :");
        add(jLabelPatientName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, -1));
        add(jTextFieldPatientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 270, -1));

        jLabelTestName1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTestName1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTestName1.setText(" Equipment:");
        add(jLabelTestName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 80, 20));
        add(jTextFieldQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 270, -1));

        jLabelTestDate2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTestDate2.setText("Order ID:");
        add(jLabelTestDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 285, 60, 20));
        add(jTextFieldOrderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 270, -1));

        jLabelTestName2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTestName2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTestName2.setText("Request Mode:");
        add(jLabelTestName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 90, 20));
        add(jTextFieldMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 270, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTableNewTestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNewTestsMouseClicked
        // TODO add your handling code here:
        
        int selected_row_ix = jTableNewTests.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableNewTests.getModel();
        jTextFieldPatientId.setText(model.getValueAt(selected_row_ix, 1).toString());
        jTextFieldPatientName.setText(model.getValueAt(selected_row_ix, 0).toString());
        jTextFieldPatientEmail.setText(model.getValueAt(selected_row_ix, 2).toString());
        jTextFieldOrderDate.setText(model.getValueAt(selected_row_ix, 3).toString());
        jTextFieldMode.setText(model.getValueAt(selected_row_ix, 6).toString());
        report_avalibility = "No";
        changeRequestStatus(model.getValueAt(selected_row_ix, 4).toString());
    }//GEN-LAST:event_jTableNewTestsMouseClicked
    
    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableAllTests.getModel();
        model.setRowCount(0);
        ArrayList<String> user_input = check_empty_field();
        PatientDirectory patientDirectory = hospital.getPatientDirectory();
        ArrayList<Patient> patientList = patientDirectory.getPatientList();
        Patient newPatient = new Patient();
        for(Patient patient: patientList){
            if(patient.getPatient_id().equals(user_input.get(0))){
                newPatient = patient;
                break;
            }
        }


        newPatient.setPatient_id(user_input.get(0));
        newPatient.setPatient_name(user_input.get(1));
        newPatient.setPatient_email(user_input.get(5));
        PatientOrder patientOrder = new PatientOrder();
       
        patientOrder.setOrder_id(user_input.get(2));
        patientOrder.setOrder_item(user_input.get(3));
        patientOrder.setOrder_date(user_input.get(4));
        patientOrder.setItem_count(user_input.get(6));
        
        ArrayList<PatientOrder> patientOrderList = newPatient.getPatientOrderList();

        patientOrderList.add(patientOrder);
        newPatient.setPatientOrderList(patientOrderList);
        patientList.add(newPatient);
        patientDirectory.setPatientList(patientList);
        hospital.setPatientDirectory(patientDirectory);
        String message = "";
        if(user_input.get(7).equals("HUMAN")){
            message = "\n\nHi " + user_input.get(1) +" your " + user_input.get(6) + user_input.get(3) +" for date " +user_input.get(4) + " in " + hospital.getHospitalName() +" has been booked";
            
        }
        else{
            message = "\n\nHi " + user_input.get(1) +", this your bot Deep. I wanted to let you know that your " + user_input.get(6) + " " +user_input.get(3) +" for date " +user_input.get(4) + " in " + hospital.getHospitalName() +" has been booked.";
        }
        System.out.println("message: "+message);
        sendMessageTwilio = new SendMessageTwilio();
        sendMessageTwilio.sendMessage(message);
        
        model.addRow(new Object[]{newPatient,newPatient.getPatient_name(),patientOrder.getOrder_id(), patientOrder.getOrder_item(),patientOrder.getOrder_date()});
        populateNewRequestsTable();
        populateAllOrdersTable();
        
        SendMail sendMail = new SendMail();
        String subject = "Medical Equipment Booked";
        try {
            sendMail.sendEmail(message, subject, user_input.get(5));
        } catch (IOException ex) {
            Logger.getLogger(EquipRequestPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        clearFields();
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jTableAllTestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAllTestsMouseClicked
        // TODO add your handling code here:
        jButtonCreate.setEnabled(false);
        int selected_row_ix = jTableAllTests.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableAllTests.getModel();
        Patient select_patient_details = (Patient) model.getValueAt(selected_row_ix, 0);
        jTextFieldPatientId.setText(select_patient_details.getPatient_id());
        jTextFieldPatientName.setText(select_patient_details.getPatient_name());
        jTextFieldPatientEmail.setText(select_patient_details.getPatient_email());
        String order_id = model.getValueAt(selected_row_ix, 2).toString();
        ArrayList<PatientOrder> patientOrderList = select_patient_details.getPatientOrderList();
        for(PatientOrder patientOrder: patientOrderList){
            if(patientOrder.getOrder_id().equals(order_id)){
                jTextFieldOrderDate.setText(patientOrder.getOrder_date());
                jTextFieldOrderID.setText(patientOrder.getOrder_id());
                jComboBoxEquipment.setSelectedItem(patientOrder.getOrder_item());
                jTextFieldQuantity.setText(patientOrder.getItem_count());
            }   
        }
    }//GEN-LAST:event_jTableAllTestsMouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        
        int selected_row_ix = jTableAllTests.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableAllTests.getModel();
        Patient select_patient_details = (Patient) model.getValueAt(selected_row_ix, 0);
        PatientDirectory patientDirectory = hospital.getPatientDirectory();

        patientDirectory.updatePatient(select_patient_details.getPatient_id());
        hospital.setPatientDirectory(patientDirectory);
        populateAllOrdersTable();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

        private void clearFields(){
            jTextFieldPatientId.setText("");
            jTextFieldPatientName.setText("");
            jTextFieldPatientEmail.setText("");
            jTextFieldOrderDate.setText("");  
            jTextFieldOrderID.setText("");
            jTextFieldQuantity.setText("");
            jTextFieldMode.setText("");
        }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxEquipment;
    private javax.swing.JLabel jLabelPatientID;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelPatientName1;
    private javax.swing.JLabel jLabelTestDate1;
    private javax.swing.JLabel jLabelTestDate2;
    private javax.swing.JLabel jLabelTestName;
    private javax.swing.JLabel jLabelTestName1;
    private javax.swing.JLabel jLabelTestName2;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JLabel jLabelTitle3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAllTests;
    private javax.swing.JTable jTableNewTests;
    private javax.swing.JTextField jTextFieldMode;
    private javax.swing.JTextField jTextFieldOrderDate;
    private javax.swing.JTextField jTextFieldOrderID;
    private javax.swing.JTextField jTextFieldPatientEmail;
    private javax.swing.JTextField jTextFieldPatientId;
    private javax.swing.JTextField jTextFieldPatientName;
    private javax.swing.JTextField jTextFieldQuantity;
    // End of variables declaration//GEN-END:variables
    private void changeRequestStatus(String request_id){
        RequestDirectory requestDirectory = medicalServiceCentralisationEcoSystem.getRequestDirectory();
        ArrayList<Request> requestList = requestDirectory.getRequestList();
        for(Request request: requestList){
            if(request.getRequest_status().equals("new") && request.getCase_id().equals(request_id)){
                request.setRequest_status("Completed");
            }
        }
        requestDirectory.setRequestList(requestList);
    }
    private void populateNewRequestsTable() {
        
        DefaultTableModel model = (DefaultTableModel) jTableNewTests.getModel();
        model.setRowCount(0);
        RequestDirectory requestDirectory = medicalServiceCentralisationEcoSystem.getRequestDirectory();
        ArrayList<Request> requestList = requestDirectory.getRequestList();
        for(Request request: requestList){
            if(request.getRequest_status().equals("new") && request.getRequest_category().equals("MedicalEquipment")){
           
                model.addRow(new Object []{request.getCustomer_name(),request.getCustomer_phone(),request.getCustomer_email(),request.getRequest_date(),request.getCase_id(),request.getRequest_description(), request.getMode()});
            }
        }
        jTableNewTests.setModel(model);
    }

    private void populateEquipmentComboBox() {
        MedSupEquipInternalDirectory medSupEquipInternalDirectory = hospital.getMedSupEquipInternalDirectory();
        ArrayList<MedSupEquipInternal> medSupEquipList = medSupEquipInternalDirectory.getMedSupEquipInternalList();
        jComboBoxEquipment.removeAllItems();
        for(MedSupEquipInternal medSupEquipInternal: medSupEquipList){
            jComboBoxEquipment.addItem(medSupEquipInternal.getMedSupEquipInternal_name());
        }
    }

    private ArrayList<String> check_empty_field() {
        ArrayList<String> user_input = new ArrayList<>();
        String user_patient_id = jTextFieldPatientId.getText();
        String user_patient_name = jTextFieldPatientName.getText();
        String user_equip_name = (String) jComboBoxEquipment.getSelectedItem();
        String user_order_date = jTextFieldOrderDate.getText();
        String user_order_id = jTextFieldOrderID.getText();
        String user_patient_email = jTextFieldPatientEmail.getText();
        String user_quantity = jTextFieldQuantity.getText();
        String user_mode = jTextFieldMode.getText();
        if(user_patient_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Patient ID can't be left empty.");
        }
        else if(user_patient_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Patient Name can't be left empty.");
        }
        else if(user_equip_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please choose an equipment.");
        }
  
        else if(user_order_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter an order id.");
        }
        else if(user_order_date.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a test date.");
        }
        else if(user_quantity.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a quantity.");
        }
        
        
        user_input.add(user_patient_id);
        user_input.add(user_patient_name);
        user_input.add(user_order_id);
        user_input.add(user_equip_name);
        user_input.add(user_order_date);
        user_input.add(user_patient_email);
        user_input.add(user_quantity);
        user_input.add(user_mode);
        
        
        return user_input;
    }

    private void populateAllOrdersTable() {
        DefaultTableModel model = (DefaultTableModel) jTableAllTests.getModel();
        model.setRowCount(0);
        PatientDirectory patientDirectory = hospital.getPatientDirectory();
        ArrayList<Patient> patientList = patientDirectory.getPatientList();
        for(Patient patient: patientList){
            ArrayList<PatientOrder> patientOrderList = patient.getPatientOrderList();
            for(PatientOrder patientOrder: patientOrderList){
                model.addRow(new Object[]{patient,patient.getPatient_name(),patientOrder.getOrder_id(), patientOrder.getOrder_item(),patientOrder.getOrder_date()});
            }   
        }
        jTableAllTests.setModel(model);
    }
}

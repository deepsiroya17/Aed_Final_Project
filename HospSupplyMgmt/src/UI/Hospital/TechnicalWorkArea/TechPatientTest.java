/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Hospital.TechnicalWorkArea;


import UI.SystemAdminWorkArea.SendMessageTwilio;
import UI.SystemAdminWorkArea.SendMail;
import Hospital.Hospital.Hospital;
import Hospital.Patient.Patient;
import Hospital.Patient.PatientDirectory;
import Hospital.Patient.PatientTest;
import Hospital.LabExam.LabTest;
import Hospital.LabExam.LabTestDirectory;
import Hospital.Requests.Request;
import Hospital.Requests.RequestDirectory;
import System.MedicalServiceCentralisationEcoSystem;
import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author animeshgiri
 */
public class TechPatientTest extends javax.swing.JPanel {

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
    public TechPatientTest(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem, Hospital hospital) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        this.hospital = hospital;
        if(hospital.getPatientDirectory()== null)
           hospital.setPatientDirectory(new PatientDirectory());
        populateNewRequestsTable();
        populateTestNameComboBox();
        populateAllTestsTable();
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
        jLabelTitle1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNewTests = new javax.swing.JTable();
        jButtonCreate = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jTextFieldTestID = new javax.swing.JTextField();
        jLabelTestName = new javax.swing.JLabel();
        jLabelTestID = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jLabelPatientID = new javax.swing.JLabel();
        jTextFieldPatientId = new javax.swing.JTextField();
        jLabelPatientName = new javax.swing.JLabel();
        jTextFieldTestDate = new javax.swing.JTextField();
        jComboBoxTestName = new javax.swing.JComboBox<>();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAllTests = new javax.swing.JTable();
        jLabelTitle3 = new javax.swing.JLabel();
        jTextFieldPatientName = new javax.swing.JTextField();
        jLabelReportAvailability = new javax.swing.JLabel();
        jLabelTestDate1 = new javax.swing.JLabel();
        jRadioButtonYes = new javax.swing.JRadioButton();
        jRadioButtonNo = new javax.swing.JRadioButton();
        jLabelReportAvailability1 = new javax.swing.JLabel();
        jTextFieldAvailableAt = new javax.swing.JTextField();
        jButtonEmailReport = new javax.swing.JButton();
        jButtonDownloadReport1 = new javax.swing.JButton();
        jLabelPatientName1 = new javax.swing.JLabel();
        jTextFieldPatientEmail = new javax.swing.JTextField();
        bgdimg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Times New Roman", 1, 56)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Patient Test");
        add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 820, 100));

        jButtonHome.setBackground(new java.awt.Color(255, 255, 204));
        jButtonHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonHome.setText("HOME");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 110, 60));

        jLabelTitle1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle1.setText("ALL TESTS");
        add(jLabelTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 706, -1));

        jTableNewTests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient PhoneNo", "PatientEmail", "Test Date", "Case ID", "Case Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 510, 160));

        jButtonCreate.setBackground(new java.awt.Color(255, 255, 204));
        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCreate.setText("CREATE");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 110, 60));

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 204));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 110, 60));
        add(jTextFieldTestID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 260, -1));

        jLabelTestName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTestName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTestName.setText("Test Name :");
        add(jLabelTestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 140, 20));

        jLabelTestID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTestID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTestID.setText("Test ID:");
        add(jLabelTestID, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 280, 160, -1));

        jButtonDelete.setBackground(new java.awt.Color(255, 255, 204));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDelete.setText("DELETE");
        add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 110, 60));

        jLabelPatientID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPatientID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientID.setText("Patient ID:");
        add(jLabelPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 170, 160, -1));
        add(jTextFieldPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 270, -1));

        jLabelPatientName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPatientName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientName.setText("Patient Name :");
        add(jLabelPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 160, -1));
        add(jTextFieldTestDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 270, -1));

        jComboBoxTestName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood Test", "Cholestrol", "CBP", "Urine test", "X-Ray", "C.T Scan", "M.R.I ", "Dental Scan", "Ultrasound", "ECG", "EEG", " " }));
        add(jComboBoxTestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 110, -1));

        jButtonSearch.setBackground(new java.awt.Color(255, 255, 204));
        jButtonSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSearch.setText("SEARCH");
        add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 110, 60));

        jTableAllTests.setModel(new javax.swing.table.DefaultTableModel(
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
                "Patient ID", "Patient Name", "Test ID", "Test Name", "Test Date", "Report Available", "Available At"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, 540, 160));

        jLabelTitle3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle3.setText("NEW TEST REQUESTS");
        add(jLabelTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 706, -1));
        add(jTextFieldPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 270, -1));

        jLabelReportAvailability.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelReportAvailability.setText("Available at:");
        add(jLabelReportAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 470, 160, -1));

        jLabelTestDate1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTestDate1.setText("Test Date:");
        add(jLabelTestDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 380, 160, -1));

        jRadioButtonYes.setText("Yes");
        jRadioButtonYes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jRadioButtonYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonYesActionPerformed(evt);
            }
        });
        add(jRadioButtonYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 50, 30));

        jRadioButtonNo.setText("No");
        jRadioButtonNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jRadioButtonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNoActionPerformed(evt);
            }
        });
        add(jRadioButtonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 50, 30));

        jLabelReportAvailability1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelReportAvailability1.setText("Report Availabilty :");
        add(jLabelReportAvailability1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 430, -1, -1));
        add(jTextFieldAvailableAt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 260, -1));

        jButtonEmailReport.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEmailReport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEmailReport.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEmailReport.setText(" Email Report");
        jButtonEmailReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmailReportActionPerformed(evt);
            }
        });
        add(jButtonEmailReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 220, 40));

        jButtonDownloadReport1.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDownloadReport1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDownloadReport1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDownloadReport1.setText("Upload Report");
        jButtonDownloadReport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDownloadReport1ActionPerformed(evt);
            }
        });
        add(jButtonDownloadReport1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 220, 40));

        jLabelPatientName1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPatientName1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientName1.setText("Patient Email :");
        add(jLabelPatientName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 160, -1));
        add(jTextFieldPatientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 270, -1));

        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Images/labtesting1.jpg"))); // NOI18N
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1930, 1200));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        TechnicianWorkAreaJPanel medTechnicalWorkAreaJPanel = new TechnicianWorkAreaJPanel(userProcessContainer,medicalServiceCentralisationEcoSystem, hospital);
        userProcessContainer.add("medTechnicalWorkAreaJPanel",medTechnicalWorkAreaJPanel);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.show(userProcessContainer,"medTechnicalWorkAreaJPanel");
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonEmailReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmailReportActionPerformed
        try {
            // TODO add your handling code here:
            SendMail sendMail = new SendMail();
            String message = "Please find your report attached with this email";
            String subject = "Medical Test Report";
            sendMail.sendEmailWithFile(message, subject, jTextFieldPatientEmail.getText(),report_path);
        } catch (IOException ex) {
            Logger.getLogger(PatientTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEmailReportActionPerformed

    private void jTableNewTestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNewTestsMouseClicked
        // TODO add your handling code here:
        
        int selected_row_ix = jTableNewTests.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableNewTests.getModel();
        jTextFieldPatientId.setText(model.getValueAt(selected_row_ix, 1).toString());
        jTextFieldPatientName.setText(model.getValueAt(selected_row_ix, 0).toString());
        jTextFieldPatientEmail.setText(model.getValueAt(selected_row_ix, 2).toString());
        jTextFieldTestDate.setText(model.getValueAt(selected_row_ix, 3).toString());
        jRadioButtonNo.setSelected(true);
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
        LabTestDirectory labTestDirectory = hospital.getLabTestDirectory();
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
        PatientTest patientTest = new PatientTest();
        patientTest.setTest_date(user_input.get(4));
        patientTest.setReport_avalaible(report_avalibility);
        patientTest.setTest_id(user_input.get(2));
        patientTest.setLabTest(labTestDirectory.findLabTestByName(user_input.get(3)));
        
        ArrayList<PatientTest> patientTestList = newPatient.getPatientTestList();
        patientTestList.add(patientTest);
        newPatient.setPatientTestList(patientTestList);
        patientList.add(newPatient);
        patientDirectory.setPatientList(patientList);
        hospital.setPatientDirectory(patientDirectory);
        String message = "\n\nHi " + user_input.get(1) +" your " + user_input.get(3) +" test for date " +user_input.get(4) + " in " + hospital.getHospitalName() +" has been booked";
        System.out.println("message: "+message);
        sendMessageTwilio = new SendMessageTwilio();
        sendMessageTwilio.sendMessage(message);
        
        model.addRow(new Object[]{newPatient,newPatient.getPatient_name(),patientTest.getTest_id(), patientTest.getLabTest().getTest_name(),patientTest.getTest_date(),patientTest.getReport_avalaible()});
//        populateNewRequestsTable();
        populateAllTestsTable();
        
        SendMail sendMail = new SendMail();
        String subject = "Medical Test Booked";
        try {
            sendMail.sendEmail(message, subject, user_input.get(5));
        } catch (IOException ex) {
            Logger.getLogger(PatientTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        clearFields();
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jRadioButtonYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonYesActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonYes.isSelected()){
            jRadioButtonNo.setSelected(false);
            report_avalibility = "yes";
        }
    }//GEN-LAST:event_jRadioButtonYesActionPerformed

    private void jRadioButtonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNoActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonNo.isSelected()){
            jRadioButtonYes.setSelected(false);
            report_avalibility = "no";
        }
    }//GEN-LAST:event_jRadioButtonNoActionPerformed

    private void jTableAllTestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAllTestsMouseClicked
        // TODO add your handling code here:
        jButtonCreate.setEnabled(false);
        int selected_row_ix = jTableAllTests.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableAllTests.getModel();
        Patient select_patient_details = (Patient) model.getValueAt(selected_row_ix, 0);
        jTextFieldPatientId.setText(select_patient_details.getPatient_id());
        jTextFieldPatientName.setText(select_patient_details.getPatient_name());
        jTextFieldPatientEmail.setText(select_patient_details.getPatient_email());
        jTextFieldAvailableAt.setText("");  
            
        String test_id = model.getValueAt(selected_row_ix, 2).toString();
        ArrayList<PatientTest> patientTestList = select_patient_details.getPatientTestList();
        for(PatientTest patientTest: patientTestList){
            if(patientTest.getTest_id().equals(test_id)){
                jTextFieldTestDate.setText(patientTest.getTest_date());
                jTextFieldTestID.setText(patientTest.getTest_id());
                jComboBoxTestName.setSelectedItem(patientTest.getLabTest().getTest_name());
                if(patientTest.getReport_avalaible().toLowerCase().equals("no")){
                    jRadioButtonYes.setSelected(false);
                    jRadioButtonNo.setSelected(true);
                }
                else{
                    jRadioButtonYes.setSelected(true);
                    jRadioButtonNo.setSelected(false);
                }
                jTextFieldAvailableAt.setText(patientTest.getReport_availibility_time());
            
            }   
        }
    }//GEN-LAST:event_jTableAllTestsMouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        
        int selected_row_ix = jTableAllTests.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableAllTests.getModel();
        Patient select_patient_details = (Patient) model.getValueAt(selected_row_ix, 0);
        PatientDirectory patientDirectory = hospital.getPatientDirectory();
//        ArrayList<Patient> patientList = patientDirectory.getPatientList();
        
        if(jRadioButtonYes.isSelected()){
            String test_id = model.getValueAt(selected_row_ix, 2).toString();
            ArrayList<PatientTest> patientTestList = select_patient_details.getPatientTestList();
            select_patient_details.updateReportStatus(test_id);
        }
        patientDirectory.updatePatient(select_patient_details.getPatient_id());
        hospital.setPatientDirectory(patientDirectory);
        populateAllTestsTable();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDownloadReport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDownloadReport1ActionPerformed
        // TODO add your handling code here:
        
            JFileChooser fileChooser = new JFileChooser();
			
            fileChooser.setCurrentDirectory(new File(".")); 

            int response = fileChooser.showOpenDialog(null);

            if(response == JFileChooser.APPROVE_OPTION) {
                    report_path = fileChooser.getSelectedFile().getAbsolutePath();
                    File file = new File(report_path);
                    System.out.println(file);
            }
    }//GEN-LAST:event_jButtonDownloadReport1ActionPerformed

        private void clearFields(){
            jTextFieldPatientId.setText("");
            jTextFieldPatientName.setText("");
            jTextFieldPatientEmail.setText("");
            jTextFieldTestDate.setText("");
            jTextFieldTestID.setText("");
            jTextFieldAvailableAt.setText("");            
        }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDownloadReport1;
    private javax.swing.JButton jButtonEmailReport;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxTestName;
    private javax.swing.JLabel jLabelPatientID;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelPatientName1;
    private javax.swing.JLabel jLabelReportAvailability;
    private javax.swing.JLabel jLabelReportAvailability1;
    private javax.swing.JLabel jLabelTestDate1;
    private javax.swing.JLabel jLabelTestID;
    private javax.swing.JLabel jLabelTestName;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JLabel jLabelTitle3;
    private javax.swing.JRadioButton jRadioButtonNo;
    private javax.swing.JRadioButton jRadioButtonYes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAllTests;
    private javax.swing.JTable jTableNewTests;
    private javax.swing.JTextField jTextFieldAvailableAt;
    private javax.swing.JTextField jTextFieldPatientEmail;
    private javax.swing.JTextField jTextFieldPatientId;
    private javax.swing.JTextField jTextFieldPatientName;
    private javax.swing.JTextField jTextFieldTestDate;
    private javax.swing.JTextField jTextFieldTestID;
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
            if(request.getRequest_status().equals("new") && request.getRequest_category().equals("MedicalTest")){
                model.addRow(new Object []{
                    request.getCustomer_name(),
                    request.getCustomer_phone(),
                    request.getCustomer_email(),
                    request.getRequest_date(),
                    request.getCase_id(),
                    request.getRequest_description()});
            }
        }
        jTableNewTests.setModel(model);
    }

    private void populateTestNameComboBox() {
        LabTestDirectory labTestDirectory = hospital.getLabTestDirectory();
        ArrayList<LabTest> labTestList = labTestDirectory.getLabTestList();
        jComboBoxTestName.removeAllItems();
        for(LabTest labTest: labTestList){
            jComboBoxTestName.addItem(labTest.getTest_name());
        }
    }

    private ArrayList<String> check_empty_field() {
        ArrayList<String> user_input = new ArrayList<>();
        String user_patient_id = jTextFieldPatientId.getText();
        String user_patient_name = jTextFieldPatientName.getText();
        String user_test_id = jTextFieldTestID.getText();
        String user_test_name = (String) jComboBoxTestName.getSelectedItem();
        String user_test_date = jTextFieldTestDate.getText();
        String user_patient_email = jTextFieldPatientEmail.getText();
        
        if(user_patient_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Patient ID can't be left empty.");
        }
        else if(user_patient_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Patient Name can't be left empty.");
        }
        else if(user_test_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Test ID cant be left empty");
        }

        else if(user_test_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please choose a test.");
        }
        else if(user_test_date.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a test date.");
        }
        
        
        user_input.add(user_patient_id);
        user_input.add(user_patient_name);
        user_input.add(user_test_id);
        user_input.add(user_test_name);
        user_input.add(user_test_date);
        user_input.add(user_patient_email);
        
        
        return user_input;
    }

    private void populateAllTestsTable() {
        DefaultTableModel model = (DefaultTableModel) jTableAllTests.getModel();
        model.setRowCount(0);
        PatientDirectory patientDirectory = hospital.getPatientDirectory();
        ArrayList<Patient> patientList = patientDirectory.getPatientList();
        for(Patient patient: patientList){
            ArrayList<PatientTest> patientTestList = patient.getPatientTestList();
            for(PatientTest patientTest: patientTestList){
                model.addRow(new Object[]{
                    patient,
                    patient.getPatient_name(),
                    patientTest.getTest_id(), 
                    patientTest.getLabTest().getTest_name(),
                    patientTest.getTest_date(),
                    patientTest.getReport_avalaible()
                });
                
            }   
        }
        jTableAllTests.setModel(model);
    }
}

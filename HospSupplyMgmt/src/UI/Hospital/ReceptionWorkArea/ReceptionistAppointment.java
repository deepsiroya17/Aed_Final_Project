/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Hospital.ReceptionWorkArea;


import Hospital.Hospital.Hospital;
import Hospital.Patient.PatientAppointment;
import Hospital.Patient.PatientAppointmentDirectory;
import System.MedicalServiceCentralisationEcoSystem;
import System.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author animeshgiri
 */
public class ReceptionistAppointment extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    PatientAppointment patientAppointment;
    PatientAppointmentDirectory patientAppointmentDirectory;
    UserAccount userAccount;
    Hospital hospital;
    
    public ReceptionistAppointment(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem, Hospital hospital) {
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;     
        this.hospital = hospital;
        if(medicalServiceCentralisationEcoSystem.getPatientAppointmentDirectory() == null)
           medicalServiceCentralisationEcoSystem.setPatientAppointmentDirectory(new PatientAppointmentDirectory());
        initComponents();
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAppointment = new javax.swing.JTable();
        jButtonCreate = new javax.swing.JButton();
        jTextFieldPatientName = new javax.swing.JTextField();
        jTextFieldPatientID = new javax.swing.JTextField();
        jLabelPatientID = new javax.swing.JLabel();
        jLabelPatientName = new javax.swing.JLabel();
        jTextFieldDoctorName = new javax.swing.JTextField();
        jLabelAppointmentTime = new javax.swing.JLabel();
        jLabelDepartment = new javax.swing.JLabel();
        jComboBoxDepartment = new javax.swing.JComboBox<>();
        jLabelDoctorName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDateAppointmentDate = new com.toedter.calendar.JDateChooser();
        jTextFieldAppointmentTime = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Times New Roman", 1, 56)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("APPOINTMENT MANAGEMENT");
        add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 50, 880, -1));

        jTableAppointment.setModel(new javax.swing.table.DefaultTableModel(
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
                "Patient ID", "Patient Name", "Doctor", "Department", "Appointment Date", "Appointment Time"
            }
        ));
        jScrollPane1.setViewportView(jTableAppointment);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 787, 160));

        jButtonCreate.setBackground(new java.awt.Color(255, 255, 204));
        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCreate.setText("CREATE");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 110, 40));
        add(jTextFieldPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 140, -1));
        add(jTextFieldPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 198, 140, -1));

        jLabelPatientID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPatientID.setText("Patient ID :");
        add(jLabelPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 70, 20));

        jLabelPatientName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPatientName.setText("Patient Name :");
        add(jLabelPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, 20));
        add(jTextFieldDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, -1));

        jLabelAppointmentTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAppointmentTime.setText("Appointment Date :");
        add(jLabelAppointmentTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 367, 120, 20));

        jLabelDepartment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDepartment.setText("Department :");
        add(jLabelDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 104, 20));

        jComboBoxDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiology", "Radiology", "Ayurvedic", "Dermetology", "Optometry", "Genral Surgery", "Plastic Surgeon ", "Obstetrics", "Orthopedics", "Psychiatry", "Neurosurgery", "Hematology", "Pedatrics", "Oncology", "Stomatology", "Opthalmology", "Virology", "Bio-Chemistry" }));
        add(jComboBoxDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 140, -1));

        jLabelDoctorName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDoctorName.setText("Doctor Name :");
        add(jLabelDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 104, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Appointment Time :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 130, 20));
        add(jDateAppointmentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 170, 30));
        add(jTextFieldAppointmentTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) jTableAppointment.getModel();
        model.setRowCount(0);
        ArrayList<String> user_input = check_empty_field();
        PatientAppointmentDirectory patientAppointmentList = medicalServiceCentralisationEcoSystem.getPatientAppointmentDirectory();
//        ArrayList<PatientAppointment> patientAppointmentList = patientAppointmentDirectory.getPatientAppointmentList();
        
        patientAppointment = new PatientAppointment();
        
        patientAppointment.setPatient_id(user_input.get(0));
        patientAppointment.setPatient_name(user_input.get(1));
        patientAppointment.setDoctor_name(user_input.get(2));
        patientAppointment.setDepartment(user_input.get(3));
        patientAppointment.setAppointmentDate(user_input.get(4));
        patientAppointment.setAppointmentTime(user_input.get(5));
        patientAppointmentList.addPatientAppointment(patientAppointment);
        JOptionPane.showMessageDialog(this, "Appointment Booked");
        model.addRow(new Object[]{
            patientAppointment.getPatient_id(),
            patientAppointment.getPatient_name(),
            patientAppointment.getDoctor_name(),
            patientAppointment.getDepartment(),
            patientAppointment.getAppointmentDate(),
            patientAppointment.getAppointmentTime()
        });
        
        

        clearFields();

    }//GEN-LAST:event_jButtonCreateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JComboBox<String> jComboBoxDepartment;
    private com.toedter.calendar.JDateChooser jDateAppointmentDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAppointmentTime;
    private javax.swing.JLabel jLabelDepartment;
    private javax.swing.JLabel jLabelDoctorName;
    private javax.swing.JLabel jLabelPatientID;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAppointment;
    private javax.swing.JTextField jTextFieldAppointmentTime;
    private javax.swing.JTextField jTextFieldDoctorName;
    private javax.swing.JTextField jTextFieldPatientID;
    private javax.swing.JTextField jTextFieldPatientName;
    // End of variables declaration//GEN-END:variables

    private void clearFields(){
            jTextFieldPatientID.setText("");
            jTextFieldPatientName.setText("");
            jTextFieldDoctorName.setText("");
            jComboBoxDepartment.setSelectedItem("");
            jTextFieldAppointmentTime.setText("");            
    }
    
    private ArrayList<String> check_empty_field() {
        
        ArrayList<String> user_input = new ArrayList<>();
        String user_patient_id = jTextFieldPatientID.getText();
        String user_patient_name = jTextFieldPatientName.getText();
        String user_patient_doctor = jTextFieldDoctorName.getText();
        String user_patient_department = (String) jComboBoxDepartment.getSelectedItem();
        Date date = jDateAppointmentDate.getDate();
        String user_patient_date = new SimpleDateFormat("MM.dd.yyyy").format(date);
        String user_patient_time = jTextFieldAppointmentTime.getText();
        
        if(user_patient_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Patient ID can't be left empty.");
        }
        else if(user_patient_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Patient Name can't be left empty.");
        }
        else if(user_patient_doctor.isEmpty()){
            JOptionPane.showMessageDialog(this, "Doctor Name can't be left empty");
        }

        else if(user_patient_department.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please choose a department.");
        }
        else if(user_patient_date.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a test date.");
        }
        else if(user_patient_time.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a test time.");
        } else {
            user_input.add(user_patient_id);
            user_input.add(user_patient_name);
            user_input.add(user_patient_doctor);
            user_input.add(user_patient_department);
            user_input.add(user_patient_date);
            user_input.add(user_patient_time);
        }
        
        return user_input;
    }
    
    private void populateTable() {
        
        patientAppointmentDirectory = medicalServiceCentralisationEcoSystem.getPatientAppointmentDirectory();
        ArrayList<PatientAppointment> appointments = patientAppointmentDirectory.getPatientAppointmentList();
        DefaultTableModel model = (DefaultTableModel) jTableAppointment.getModel();
        model.setRowCount(0);
        
        for(PatientAppointment a: appointments)
        {
            model.addRow(new Object[]{
                a, 
                a.getPatient_name(), 
                a.getDoctor_name(), 
                a.getDepartment(), 
                a.getAppointmentDate(), 
                a.getAppointmentTime()
            });
        }
        jTableAppointment.setModel(model);

    }
}

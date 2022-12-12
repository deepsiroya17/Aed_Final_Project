/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Patient;

import java.util.ArrayList;

/**
 *
 * @author sarth
 */
public class Patient {
 
    
    String patient_id;
    String patient_name;
    String patient_phone_number;
    String patient_email;

    ArrayList<PatientTest> patientTestList = new ArrayList<>();
    ArrayList<PatientOrder> patientOrderList = new ArrayList<>();
    
    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_phone_number() {
        return patient_phone_number;
    }

    public void setPatient_phone_number(String patient_phone_number) {
        this.patient_phone_number = patient_phone_number;
    }

    public String getPatient_email() {
        return patient_email;
    }

    public void setPatient_email(String patient_email) {
        this.patient_email = patient_email;
    }

    public ArrayList<PatientTest> getPatientTestList() {
        return patientTestList;
    }

    public void setPatientTestList(ArrayList<PatientTest> patientTestList) {
        this.patientTestList = patientTestList;
    }

    public ArrayList<PatientOrder> getPatientOrderList() {
        return patientOrderList;
    }

    public void setPatientOrderList(ArrayList<PatientOrder> patientOrderList) {
        this.patientOrderList = patientOrderList;
    }
    
    @Override
    public String toString(){
        return patient_id;
    }
    
    public void updateReportStatus(String test_id){
        for(PatientTest patientTest: patientTestList){
                if(patientTest.getTest_id().equals(test_id)){
                    patientTest.setReport_avalaible("yes");
                    int ix = patientTestList.indexOf(patientTest);
                    patientTestList.set(ix, patientTest);
                    
                }
            }
    }
    
}

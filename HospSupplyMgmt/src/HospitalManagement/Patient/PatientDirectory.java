/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Patient;

import java.util.ArrayList;

/**
 *
 * @author sarth
 */
public class PatientDirectory {

    ArrayList<Patient> patientList = new ArrayList<>();

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public void addTest(Patient patient){
        patientList.add(patient);
    }

    public void updatePatient(String patient_id){
        
        for(Patient patient: patientList){
            if(patient.getPatient_id().equals(patient_id)){
                int ix = patientList.indexOf(patient);
                patientList.set(ix, patient);
            }
        }
    }
}

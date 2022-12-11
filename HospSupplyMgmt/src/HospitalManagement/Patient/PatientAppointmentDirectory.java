/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalManagement.Patient;

import java.util.ArrayList;

/**
 *
 * @author animeshgiri
 */
public class PatientAppointmentDirectory {
    
    ArrayList<PatientAppointment> patientAppointmentList = new ArrayList<>();

    public ArrayList<PatientAppointment> getPatientAppointmentList() {
        return patientAppointmentList;
    }

    public void setPatientAppointmentList(ArrayList<PatientAppointment> patientAppointmentList) {
        this.patientAppointmentList = patientAppointmentList;
    }
    
    public PatientAppointmentDirectory() {
    }

    public void addPatientAppointment(PatientAppointment patientAppointment) {
        patientAppointmentList.add(patientAppointment);
    }

    public void updatePatientAppointment(ArrayList<String> user_input, PatientAppointment updated_patientAppointment) {
        
        for(PatientAppointment patientAppointment: patientAppointmentList)
        {
            if(patientAppointment.getPatient_id().equals(updated_patientAppointment.getPatient_id()))
            {   
                patientAppointment.setAppointmentDate(user_input.get(4));
                patientAppointment.setAppointmentTime(user_input.get(5));
                
                break;
            }
        }
    }

    public void deletePatientAppointment(PatientAppointment selected_patientAppointment) {
        for(PatientAppointment patientAppointment: patientAppointmentList)
        {
            if(patientAppointment.getPatient_id().equals(selected_patientAppointment.getPatient_id()))
            {   
                patientAppointmentList.remove(patientAppointment);
                break;
            }
        }
    }

}

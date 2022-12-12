/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Hospital;

import System.UserAccountDirectory;
import Hospital.Doctor.DoctorDirectory;
import Hospital.Nurse.NurseDirectory;

import Hospital.Technician.TechnicianDirectory;

import Hospital.Receptionist.FrontDeskOperatorDirectory;
import Hospital.Patient.PatientDirectory;
import Hospital.LabExam.LabTestDirectory;
import Hospital.MedSupInvenAdmin.MedSupEquipAdmin;
import Hospital.MedSupInvenInternal.MedSupEquipInternalDirectory;

/**
 *
 * @author animeshgiri
 */
public class Hospital {
    
    String hospitalId;
    String hospitalName;
    String hospitalpincode;
    FrontDeskOperatorDirectory frontDeskOperatorDirectory;
    DoctorDirectory doctorDirectory;
    NurseDirectory nurseDirectory;
    TechnicianDirectory technicianDirectory;
    UserAccountDirectory UserAccountDirectory;
    PatientDirectory patientDirectory;
    LabTestDirectory labTestDirectory;
    
    MedSupEquipAdmin medSupEquipAdmin;
    MedSupEquipInternalDirectory medSupEquipInternalDirectory;

    
    public Hospital(String hospitalId, String hospitalName, String hospitalpincode){
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.hospitalpincode = hospitalpincode;
    }
    
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalpincode() {
        return hospitalpincode;
    }

    public void setHospitalpincode(String hospitalpincode) {
        this.hospitalpincode = hospitalpincode;
    }

    public FrontDeskOperatorDirectory getFrontDeskOperatorDirectory() {
        return frontDeskOperatorDirectory;
    }

    public void setFrontDeskOperatorDirectory(FrontDeskOperatorDirectory frontDeskOperatorDirectory) {
        this.frontDeskOperatorDirectory = frontDeskOperatorDirectory;
    }


    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public NurseDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(NurseDirectory nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }

    public TechnicianDirectory getTechnicianDirectory() {
        return technicianDirectory;
    }

    public void setTechnicianDirectory(TechnicianDirectory technicianDirectory) {
        this.technicianDirectory = technicianDirectory;
    }

    public LabTestDirectory getLabTestDirectory() {
        return labTestDirectory;
    }

    public void setLabTestDirectory(LabTestDirectory labTestDirectory) {
        this.labTestDirectory = labTestDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public MedSupEquipInternalDirectory getMedSupEquipInternalDirectory() {
        return medSupEquipInternalDirectory;
    }

    public void setMedSupEquipInternalDirectory(MedSupEquipInternalDirectory medSupEquipInternalDirectory) {
        this.medSupEquipInternalDirectory = medSupEquipInternalDirectory;
    }

    public MedSupEquipAdmin getMedSupEquipAdmin() {
        return medSupEquipAdmin;
    }

    public void setMedSupEquipAdmin(MedSupEquipAdmin medSupEquipAdmin) {
        this.medSupEquipAdmin = medSupEquipAdmin;
    }
    
        
     public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }
    
    
    
    
    
    @Override
    public String toString(){
        return hospitalId;
    }
    
}

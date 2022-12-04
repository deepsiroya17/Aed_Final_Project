/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Hospital;

import MainCentralisationSystem.UserAccountDirectory;
import HospitalManagement.Doctor.DoctorDirectory;
import HospitalManagement.Nurse.NurseDirectory;
import HospitalManagement.Radiologist.RadiologistDirectory;
import HospitalManagement.Pathologist.PathologistDirectory;
import HospitalManagement.Technician.TechnicianDirectory;

import HospitalManagement.FrontDeskOperator.FrontDeskOperatorDirectory;
import HospitalManagement.Accountant.AccountantDirectory;
import HospitalManagement.Patient.PatientDirectory;
import HospitalManagement.LabTest.LabTestDirectory;
import HospitalManagement.MedSupEquipAdmin.MedSupEquipAdmin;
import HospitalManagement.MedSupEquipInternal.MedSupEquipInternalDirectory;
import java.util.HashMap;

/**
 *
 * @author prans
 */
public class Hospital {
    
    String hospitalId;
    String hospitalName;
    String hospitalpincode;
    FrontDeskOperatorDirectory frontDeskOperatorDirectory;
    AccountantDirectory accountantDirectory;
    DoctorDirectory doctorDirectory;
    NurseDirectory nurseDirectory;
    RadiologistDirectory radiologistDirectory;
    PathologistDirectory pathologistDirectory;
    TechnicianDirectory technicianDirectory;
    UserAccountDirectory UserAccountDirectory;
    PatientDirectory patientDirectory;
//    HashMap<String, String> labTests = new HashMap<>();
    LabTestDirectory labTestDirectory;
    
    MedSupEquipAdmin medSupEquipAdmin;
    MedSupEquipInternalDirectory medSupEquipInternalDirectory;
    //    UserAccount userAccount;

    
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

    public AccountantDirectory getAccountantDirectory() {
        return accountantDirectory;
    }

    public void setAccountantDirectory(AccountantDirectory accountantDirectory) {
        this.accountantDirectory = accountantDirectory;
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

    public RadiologistDirectory getRadiologistDirectory() {
        return radiologistDirectory;
    }

    public void setRadiologistDirectory(RadiologistDirectory radiologistDirectory) {
        this.radiologistDirectory = radiologistDirectory;
    }

    public PathologistDirectory getPathologistDirectory() {
        return pathologistDirectory;
    }

    public void setPathologistDirectory(PathologistDirectory pathologistDirectory) {
        this.pathologistDirectory = pathologistDirectory;
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
    
    
    
    

//    public UserAccountDirectory getUserAccountDirectory() {
//        return UserAccountDirectory;
//    }
//
//    public void setUserAccountDirectory(UserAccountDirectory UserAccountDirectory) {
//        this.UserAccountDirectory = UserAccountDirectory;
//    }
    
    
    
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

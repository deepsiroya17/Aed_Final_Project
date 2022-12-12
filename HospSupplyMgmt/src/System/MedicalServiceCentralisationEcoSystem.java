/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import CustomerAssistanceTeam.CustomerSupportTeamDirectory;
import CarrierAgency.DeliveryAgencyDirectory;
import Hospital.Hospital.HospitalDirectory;
import Hospital.Patient.PatientAppointmentDirectory;
import Hospital.Requests.RequestDirectory;

import System.Role.Role;
import System.Role.SystemAdminRole;
import Warehouse.MedSupWarehouseDirectory;

import java.util.ArrayList;


public class MedicalServiceCentralisationEcoSystem extends HospitalManagementEnterprise{
    
    private HospitalDirectory hospitalDirectory;
    private CustomerSupportTeamDirectory customerSupportTeamDirectory;
    private MedSupWarehouseDirectory medSupWarehouseDirectory;
    private DeliveryAgencyDirectory deliveryAgencyDirectory;
    private UserAccountDirectory userAccountDirectory;
    private RequestDirectory requestDirectory;
    private PatientAppointmentDirectory patientAppointmentDirectory;
    
    public MedicalServiceCentralisationEcoSystem(){
        userAccountDirectory = new UserAccountDirectory();
        requestDirectory = new RequestDirectory();
        hospitalDirectory = new HospitalDirectory();
        customerSupportTeamDirectory = new CustomerSupportTeamDirectory();
        medSupWarehouseDirectory =  new MedSupWarehouseDirectory();
        deliveryAgencyDirectory = new DeliveryAgencyDirectory();
        patientAppointmentDirectory = new PatientAppointmentDirectory();
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public RequestDirectory getRequestDirectory() {
        return requestDirectory;
    }

    public void setRequestDirectory(RequestDirectory requestDirectory) {
        this.requestDirectory = requestDirectory;
    }

    public MedSupWarehouseDirectory getMedSupWarehouseDirectory() {
        return medSupWarehouseDirectory;
    }

    public void setMedSupWarehouseDirectory(MedSupWarehouseDirectory medSupWarehouseDirectory) {
        this.medSupWarehouseDirectory = medSupWarehouseDirectory;
    }
    
    public CustomerSupportTeamDirectory getCustomerSupportTeamDirectory() {
        return customerSupportTeamDirectory;
    }

    public void setCustomerSupportTeamDirectory(CustomerSupportTeamDirectory customerSupportTeamDirectory) {
        this.customerSupportTeamDirectory = customerSupportTeamDirectory;
    }

    public DeliveryAgencyDirectory getDeliveryAgencyDirectory() {
        return deliveryAgencyDirectory;
    }

    public void setDeliveryAgencyDirectory(DeliveryAgencyDirectory deliveryAgencyDirectory) {
        this.deliveryAgencyDirectory = deliveryAgencyDirectory;
    }

    public PatientAppointmentDirectory getPatientAppointmentDirectory() {
        return patientAppointmentDirectory;
    }

    public void setPatientAppointmentDirectory(PatientAppointmentDirectory patientAppointmentDirectory) {
        this.patientAppointmentDirectory = patientAppointmentDirectory;
    }
    
    
    



    

    
}

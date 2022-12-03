/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainCentralisationSystem;

import CustomerSupportTeam.CustomerSupportTeamDirectory;
import DeliveryAgency.DeliveryAgencyDirectory;
import HospitalManagement.Hospital.HospitalDirectory;
import HospitalManagement.Requests.RequestDirectory;

import MainCentralisationSystem.Role.Role;
import MainCentralisationSystem.Role.SystemAdminRole;
import MedicalEquipmentWarehouse.MedSupWarehouseDirectory;

import java.util.ArrayList;


public class MedicalServiceCentralisationEcoSystem extends HospitalManagementEnterprise{
    
    private HospitalDirectory hospitalDirectory;
    private CustomerSupportTeamDirectory customerSupportTeamDirectory;
    private MedSupWarehouseDirectory medSupWarehouseDirectory;
    private DeliveryAgencyDirectory deliveryAgencyDirectory;
    private UserAccountDirectory userAccountDirectory;
    private RequestDirectory requestDirectory;
    
    public MedicalServiceCentralisationEcoSystem(){
        userAccountDirectory = new UserAccountDirectory();
        requestDirectory = new RequestDirectory();
        hospitalDirectory = new HospitalDirectory();
        customerSupportTeamDirectory = new CustomerSupportTeamDirectory();
        medSupWarehouseDirectory =  new MedSupWarehouseDirectory();
        deliveryAgencyDirectory = new DeliveryAgencyDirectory();
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
    
    
    



    

    
}

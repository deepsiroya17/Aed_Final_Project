/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import CustomerAssistanceTeam.CustomerSupportTeam;
import CarrierAgency.DeliveryAgency;
import Hospital.Hospital.Hospital;
import System.Role.Role;
import Warehouse.MedSupWarehouse;

/**
 *
 * @author asus
 */

public class UserAccount {
    
    private String username;
    private String password;
    private Hospital hospital;
    private CustomerSupportTeam CustomerSupportTeam;
    private MedSupWarehouse medSupWarehouse;
    private DeliveryAgency deliveryAgency;
    private Role role;

    public UserAccount(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public Role getRole() {
        return role;
    }

    public DeliveryAgency getDeliveryAgency() {
        return deliveryAgency;
    }

    public void setDeliveryAgency(DeliveryAgency deliveryAgency) {
        this.deliveryAgency = deliveryAgency;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public CustomerSupportTeam getCustomerSupportTeam() {
        return CustomerSupportTeam;
    }

    public void setCustomerSupportTeam(CustomerSupportTeam CustomerSupportTeam) {
        this.CustomerSupportTeam = CustomerSupportTeam;
    }

    public MedSupWarehouse getMedSupWarehouse() {
        return medSupWarehouse;
    }

    public void setMedSupWarehouse(MedSupWarehouse medSupWarehouse) {
        this.medSupWarehouse = medSupWarehouse;
    }
    
    @Override
    public String toString() {
        return username;
    }
}

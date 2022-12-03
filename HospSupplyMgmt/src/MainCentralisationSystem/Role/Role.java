/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainCentralisationSystem.Role;

import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;
import MainCentralisationSystem.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author asus
 */
public abstract class Role {
    
    String role;
    /*public enum RoleType{
        Patient("Patient"),
        Technician("Technician"),
        Radiologist("Radiologist"),
        Pathologist("Pathologist"),
        Doctor("Doctor"),
        Nurse("Nurse"),
        FrontDeskOperator("FrontDeskOperator"),
        SystemAdmin("SystemAdmin");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }*/

    public String getRole() {
        return role;
    }

    public void Role(String role) {
        this.role = role;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}

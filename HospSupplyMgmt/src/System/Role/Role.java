/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.MedicalServiceCentralisationEcoSystem;
import System.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author asus
 */
public abstract class Role {
    
    String role;
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

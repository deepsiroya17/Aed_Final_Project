/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainCentralisationSystem.Role;

import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;
import MainCentralisationSystem.UserAccount;
import javax.swing.JPanel;
import userInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author asus
 */
public class CustomerSupportMemberRole extends Role {

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, medicalServiceCentralisationEcoSystem);
    }
    
    @Override
    public String toString(){
        return "CustomerSupportMember";
    }
}

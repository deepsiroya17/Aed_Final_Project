/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.MedicalServiceCentralisationEcoSystem;
import System.UserAccount;
import javax.swing.JPanel;
import UI.SystemAdminWorkArea.SystemAdminWorkPanel;

/**
 *
 * @author asus
 */
public class CustomerSupportMemberRole extends Role {

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem) {
        return new SystemAdminWorkPanel(userProcessContainer, medicalServiceCentralisationEcoSystem);
    }
    
    @Override
    public String toString(){
        return "CustomerSupportMember";
    }
}

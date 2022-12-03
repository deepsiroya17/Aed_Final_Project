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
public class AccountantRole extends Role {

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, hospitalManagementEcoSystem);
    }
    
    @Override
    public String toString(){
        return "Accountant";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.MedicalServiceCentralisationEcoSystem;
import System.UserAccount;
import javax.swing.JPanel;
import UI.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author asus
 */
public class RadiologistRole extends Role {

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, hospitalManagementEcoSystem);
    }
    
    @Override
    public String toString(){
        return "Radiologist";
    }
}

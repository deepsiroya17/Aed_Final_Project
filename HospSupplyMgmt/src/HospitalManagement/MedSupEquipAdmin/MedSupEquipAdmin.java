/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.MedSupEquipAdmin;

import HospitalManagement.MedSupEquipAdmin.*;
import HospitalManagement.MedSupEquipAdmin.*;
import MainCentralisationSystem.UserAccount;

/**
 *
 * @author Shreya
 */
public class MedSupEquipAdmin {
    
//    UserAccount userAccount;
    String MedSupEquipAdminId;
    String MedSupEquipAdminName;
    
    public String getMedSupEquipAdminId() {
        return MedSupEquipAdminId;
    }

//    public UserAccount getUserAccount() {
//        return userAccount;
//    }
//
//    public void setUserAccount(UserAccount userAccount) {
//        this.userAccount = userAccount;
//    }
    public void setMedSupEquipAdminId(String MedSupEquipAdminId) {    
        this.MedSupEquipAdminId = MedSupEquipAdminId;
    }

    public String getMedSupEquipAdminName() {
        return MedSupEquipAdminName;
    }

    public void setMedSupEquipAdminName(String MedSupEquipAdminName) {
        this.MedSupEquipAdminName = MedSupEquipAdminName;
    }
    
    
    @Override
    public String toString(){
        return MedSupEquipAdminId;
    }

    
}

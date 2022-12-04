/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Technician;

import HospitalManagement.Technician.*;
import MainCentralisationSystem.UserAccount;

/**
 *
 * @author sarth
 */
public class Technician {
    
//    UserAccount userAccount;
    String TechnicianId;
    String TechnicianName;
    
    public String getTechnicianId() {
        return TechnicianId;
    }

//    public UserAccount getUserAccount() {
//        return userAccount;
//    }
//
//    public void setUserAccount(UserAccount userAccount) {
//        this.userAccount = userAccount;
//    }
    public void setTechnicianId(String TechnicianId) {    
        this.TechnicianId = TechnicianId;
    }

    public String getTechnicianName() {
        return TechnicianName;
    }

    public void setTechnicianName(String TechnicianName) {
        this.TechnicianName = TechnicianName;
    }
    
    
    @Override
    public String toString(){
        return TechnicianId;
    }

    
}

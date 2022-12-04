/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Pathologist;

import MainCentralisationSystem.UserAccount;

/**
 *
 * @author sarth
 */
public class Pathologist {
    
//    UserAccount userAccount;
    String PathologistId;
    String PathologistName;
    
    public String getPathologistId() {
        return PathologistId;
    }

//    public UserAccount getUserAccount() {
//        return userAccount;
//    }
//
//    public void setUserAccount(UserAccount userAccount) {
//        this.userAccount = userAccount;
//    }
    public void setPathologistId(String PathologistId) {    
        this.PathologistId = PathologistId;
    }

    public String getPathologistName() {
        return PathologistName;
    }

    public void setPathologistName(String PathologistName) {
        this.PathologistName = PathologistName;
    }
    
    
    @Override
    public String toString(){
        return PathologistId;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Radiologist;

import System.UserAccount;

/**
 *
 * @author sarth
 */
public class Radiologist {
    
//    UserAccount userAccount;
    String RadiologistId;
    String RadiologistName;
    
    public String getRadiologistId() {
        return RadiologistId;
    }

//    public UserAccount getUserAccount() {
//        return userAccount;
//    }
//
//    public void setUserAccount(UserAccount userAccount) {
//        this.userAccount = userAccount;
//    }
    public void setRadiologistId(String RadiologistId) {    
        this.RadiologistId = RadiologistId;
    }

    public String getRadiologistName() {
        return RadiologistName;
    }

    public void setRadiologistName(String RadiologistName) {
        this.RadiologistName = RadiologistName;
    }
    
    
    @Override
    public String toString(){
        return RadiologistId;
    }

    
}

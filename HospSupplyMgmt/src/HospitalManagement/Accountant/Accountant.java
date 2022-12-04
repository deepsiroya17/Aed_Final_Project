/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Accountant;

import HospitalManagement.Nurse.*;
import MainCentralisationSystem.UserAccount;

/**
 *
 * @author asus
 */
public class Accountant {
    
//    UserAccount userAccount;
//
//    public UserAccount getUserAccount() {
//        return userAccount;
//    }
//
//    public void setUserAccount(UserAccount userAccount) {
//        this.userAccount = userAccount;
//    }
    
    String AccountantId;
    String AccountantName;

    public String getAccountantId() {
        return AccountantId;
    }

    public void setAccountantId(String AccountantId) {
        this.AccountantId = AccountantId;
    }

    public String getAccountantName() {
        return AccountantName;
    }

    public void setAccountantName(String AccountantName) {
        this.AccountantName = AccountantName;
    }
    
    
    @Override
    public String toString(){
        return AccountantId;
    }

    
}

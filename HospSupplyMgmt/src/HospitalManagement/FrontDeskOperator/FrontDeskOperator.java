/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.FrontDeskOperator;

import MainCentralisationSystem.UserAccount;

/**
 *
 * @author prans
 */
public class FrontDeskOperator {
    
//    UserAccount userAccount;
    String FrontDeskOperatorId;
    String FrontDeskOperatorName;
    
    public String getFrontDeskOperatorId() {
        return FrontDeskOperatorId;
    }

//    public UserAccount getUserAccount() {
//        return userAccount;
//    }
//
//    public void setUserAccount(UserAccount userAccount) {
//        this.userAccount = userAccount;
//    }
    public void setFrontDeskOperatorId(String FrontDeskOperatorId) {    
        this.FrontDeskOperatorId = FrontDeskOperatorId;
    }

    public String getFrontDeskOperatorName() {
        return FrontDeskOperatorName;
    }

    public void setFrontDeskOperatorName(String FrontDeskOperatorName) {
        this.FrontDeskOperatorName = FrontDeskOperatorName;
    }
    
    
    @Override
    public String toString(){
        return FrontDeskOperatorId;
    }

    
}

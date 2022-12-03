/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerSupportTeam;

import CustomerSupportTeam.CustomerSupportMember.CustomerSupportMemberDirectory;
import MainCentralisationSystem.UserAccountDirectory;

import java.util.HashMap;

/**
 *
 * @author sarth
 */
public class CustomerSupportTeam {
    
    String customerSupportTeamId;
    String customerSupportTeamName;
    
    UserAccountDirectory UserAccountDirectory;
    
    CustomerSupportMemberDirectory customerSupportMemberDirectory;
    //    UserAccount userAccount;

    
    public CustomerSupportTeam(String customerSupportTeamId, String customerSupportTeamName){
        this.customerSupportTeamId = customerSupportTeamId;
        this.customerSupportTeamName = customerSupportTeamName;
    }
    
    public String getCustomerSupportTeamName() {
        return customerSupportTeamName;
    }

    public void setCustomerSupportTeamName(String customerSupportTeamName) {
        this.customerSupportTeamName = customerSupportTeamName;
    }

    public CustomerSupportMemberDirectory getCustomerSupportMemberDirectory() {
        return customerSupportMemberDirectory;
    }

    public void setCustomerSupportMemberDirectory(CustomerSupportMemberDirectory customerSupportMemberDirectory) {
        this.customerSupportMemberDirectory = customerSupportMemberDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return UserAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory UserAccountDirectory) {
        this.UserAccountDirectory = UserAccountDirectory;
    }
    
    
    
     public String getCustomerSupportTeamId() {
        return customerSupportTeamId;
    }

    public void setCustomerSupportTeamId(String customerSupportTeamId) {
        this.customerSupportTeamId = customerSupportTeamId;
    }
    
    
    
    
    
    @Override
    public String toString(){
        return customerSupportTeamName;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerAssistanceTeam.CustomerAssistanceRepresentative;
/**
 *
 * @author sarth
 */
public class CustomerSupportMember {
    
//    UserAccount userAccount;
//
//    public UserAccount getUserAccount() {
//        return userAccount;
//    }
//
//    public void setUserAccount(UserAccount userAccount) {
//        this.userAccount = userAccount;
//    }
    
    String CustomerSupportMemberId;
    String CustomerSupportMemberName;
    
    public String getCustomerSupportMemberId() {
        return CustomerSupportMemberId;
    }

    public void setCustomerSupportMemberId(String CustomerSupportMemberId) {
        this.CustomerSupportMemberId = CustomerSupportMemberId;
    }

    public String getCustomerSupportMemberName() {
        return CustomerSupportMemberName;
    }

    public void setCustomerSupportMemberName(String CustomerSupportMemberName) {
        this.CustomerSupportMemberName = CustomerSupportMemberName;
    }
    
    
    @Override
    public String toString(){
        return CustomerSupportMemberId;
    }

    
}

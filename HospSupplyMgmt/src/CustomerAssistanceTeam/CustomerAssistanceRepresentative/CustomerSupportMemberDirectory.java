/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerAssistanceTeam.CustomerAssistanceRepresentative;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sarth
 */
public class CustomerSupportMemberDirectory {
    
    HashMap<String, CustomerSupportMember> customerSupportMemberList = new HashMap<>();

    public HashMap<String, CustomerSupportMember> getCustomerSupportMemberList() {
        return customerSupportMemberList;
    }

    public void setCustomerSupportMemberList(HashMap<String, CustomerSupportMember> customerSupportMemberList) {
        this.customerSupportMemberList = customerSupportMemberList;
    }
    public CustomerSupportMemberDirectory() {
    }

    public void addCustomerSupportMember(String user_id, CustomerSupportMember customerSupportMember) {
        customerSupportMemberList.put(user_id, customerSupportMember);
    }

    
    
}

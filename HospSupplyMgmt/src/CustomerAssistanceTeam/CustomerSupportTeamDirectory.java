/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerAssistanceTeam;

import java.util.ArrayList;

/**
 *
 * @author sarth
 */
public class CustomerSupportTeamDirectory {
    
    ArrayList<CustomerSupportTeam> customerSupportTeamList = new ArrayList<>();

    public ArrayList<CustomerSupportTeam> getCustomerSupportTeamList() {
        return customerSupportTeamList;
    }

    public void setCustomerSupportTeamList(ArrayList<CustomerSupportTeam> customerSupportTeamList) {
        this.customerSupportTeamList = customerSupportTeamList;
    }
    public CustomerSupportTeamDirectory() {
    }

    public void addCustomerSupportTeam(CustomerSupportTeam customerSupportTeam) {
        customerSupportTeamList.add(customerSupportTeam);
    }

    public void updateCustomerSupportTeam(ArrayList<String> user_input, CustomerSupportTeam updated_customerSupportTeam) {
        
        for(CustomerSupportTeam customerSupportTeam: customerSupportTeamList)
        {
            if(customerSupportTeam.getCustomerSupportTeamId().equals(updated_customerSupportTeam.getCustomerSupportTeamId()))
            {   
                customerSupportTeam.setCustomerSupportTeamName(user_input.get(1));
                break;
            }
        }
    }

    public void deleteCustomerSupportTeam(CustomerSupportTeam selected_customerSupportTeam) {
        for(CustomerSupportTeam customerSupportTeam: customerSupportTeamList)
        {
            if(customerSupportTeam.getCustomerSupportTeamId().equals(selected_customerSupportTeam.getCustomerSupportTeamId()))
            {   
                customerSupportTeamList.remove(customerSupportTeam);
                break;
            }
        }
    }
    
}

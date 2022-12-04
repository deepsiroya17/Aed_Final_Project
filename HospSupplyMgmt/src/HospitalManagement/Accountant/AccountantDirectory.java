/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Accountant;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author asus
 */
public class AccountantDirectory {
    
    HashMap<String, Accountant> accountantList = new HashMap<>();

    public HashMap<String, Accountant> getAccountantList() {
        return accountantList;
    }

    public void setAccountantList(HashMap<String, Accountant> accountantList) {
        this.accountantList = accountantList;
    }
    public AccountantDirectory() {
    }

    public void addAccountant(String user_id, Accountant accountant) {
        accountantList.put(user_id, accountant);
    }

    
    
}

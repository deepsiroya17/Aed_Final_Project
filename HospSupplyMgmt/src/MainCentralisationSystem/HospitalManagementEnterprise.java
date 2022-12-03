/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MainCentralisationSystem;


import HospitalManagement.Employee.EmployeeDirectory;
import MainCentralisationSystem.Role.Role;
import java.util.ArrayList;

public abstract class HospitalManagementEnterprise {

    private String name;
//    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    
//    public HospitalManagementEnterprise(String name) {
//        
//        this.name = name;
////        employeeDirectory = new EmployeeDirectory();
//        userAccountDirectory = new UserAccountDirectory();
//        
//    }

    public HospitalManagementEnterprise(){
        
    }
    
//    public abstract ArrayList<Role> getSupportedRole();
    
//    public UserAccountDirectory getUserAccountDirectory() {
//        return userAccountDirectory;
//    }

//    public int getOrganizationID() {
//        return organizationID;
//    }

//    public EmployeeDirectory getEmployeeDirectory() {
//        return employeeDirectory;
//    }
//    
//    public String getName() {
//        return name;
//    }
//
////    public WorkQueue getWorkQueue() {
////        return workQueue;
////    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    public void setWorkQueue(WorkQueue workQueue) {
//        this.workQueue = workQueue;
//    }

    @Override
    public String toString() {
        return name;
    }
    
//    public boolean checkIfUserIsUnique(String user_id){
////        UserAccountDirectory usersList = hospitalManagementEcoSystem.getUserAccountDirectory();
//        ArrayList<UserAccount> userAccounts = userAccountDirectory.getUserAccountList();
//        
//        for(UserAccount userAccount : userAccounts)
//        {
//            if(userAccount.getUsername().equals(user_id))
//                return false;
//        }
//        
//       return true;
//    }
    
}

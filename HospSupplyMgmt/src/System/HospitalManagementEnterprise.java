/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System;


import Hospital.Employee.EmployeeDirectory;
import System.Role.Role;
import java.util.ArrayList;

public abstract class HospitalManagementEnterprise {

    private String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    public HospitalManagementEnterprise(){     
    }
    @Override
    public String toString() {
        return name;
    }
}

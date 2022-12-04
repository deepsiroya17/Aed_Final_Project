/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Employee;

import MainCentralisationSystem.Role.Role;

/**
 *
 * @author prans
 */
public class Employee {
    
    private String employee_name;
    private String employee_id;
    private Role role;

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    public Employee(String employee_id, String employee_name, Role role) {
        this.employee_name = employee_name;
        this.employee_id = employee_id;
        this.role = role;
    }

    
    @Override
    public String toString() {
        return employee_id;
    }
}

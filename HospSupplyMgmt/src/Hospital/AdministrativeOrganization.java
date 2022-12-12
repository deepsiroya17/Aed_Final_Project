/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

/**
 *
 * @author asus
 */
public abstract class AdministrativeOrganization {

    private String name;
    private WorkQueue workQueue;
    private int organizationID;
    private static int counter=0;
    
    
    public enum Type{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public AdministrativeOrganization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
//        employeeDirectory = new EmployeeDirectory();
//        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public int getOrganizationID() {
        return organizationID;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}

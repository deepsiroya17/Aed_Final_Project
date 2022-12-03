package MainCentralisationSystem;

import HospitalManagement.Employee.Employee;
import HospitalManagement.Employee.EmployeeDirectory;
import HospitalManagement.Hospital.Hospital;
import HospitalManagement.Hospital.HospitalDirectory;
import MainCentralisationSystem.Role.HospitalAdminRole;
import MainCentralisationSystem.Role.SystemAdminRole;

public class ConfigureASystem {
    
    public static MedicalServiceCentralisationEcoSystem configure(){
        
        MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem = new MedicalServiceCentralisationEcoSystem();
        UserAccountDirectory userAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        UserAccount userAccount = new UserAccount("sysadmin", "sysadmin",new SystemAdminRole());
        userAccountDirectory.addUserAccount(userAccount);
        
        return medicalServiceCentralisationEcoSystem;
    }
    
}

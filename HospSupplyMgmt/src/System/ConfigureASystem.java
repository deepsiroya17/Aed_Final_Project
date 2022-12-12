package System;

import System.Role.SystemAdminRole;

public class ConfigureASystem {
    
    public static MedicalServiceCentralisationEcoSystem configure(){
        
        MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem = new MedicalServiceCentralisationEcoSystem();
        UserAccountDirectory userAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        UserAccount userAccount = new UserAccount("sysadmin", "sysadmin",new SystemAdminRole());
        userAccountDirectory.addUserAccount(userAccount);
        
        return medicalServiceCentralisationEcoSystem;
    }
    
}

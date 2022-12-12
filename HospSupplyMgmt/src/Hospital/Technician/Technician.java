/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Technician;

/**
 *
 * @author sarth
 */
public class Technician {
    
//    UserAccount userAccount;
    String TechnicianId;
    String TechnicianName;
    
    public String getTechnicianId() {
        return TechnicianId;
    }

    public void setTechnicianId(String TechnicianId) {    
        this.TechnicianId = TechnicianId;
    }

    public String getTechnicianName() {
        return TechnicianName;
    }

    public void setTechnicianName(String TechnicianName) {
        this.TechnicianName = TechnicianName;
    }
    
    
    @Override
    public String toString(){
        return TechnicianId;
    }

    
}

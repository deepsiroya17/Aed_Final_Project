/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Technician;


import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sarth
 */
public class TechnicianDirectory {
    
//    ArrayList<Technician> technicianList = new ArrayList<>();
    HashMap<String, Technician> technicianList = new HashMap<>();

    public HashMap<String, Technician> getTechnicianList() {
        return technicianList;
    }

    public void setTechnicianList(HashMap<String, Technician> technicianList) {
        this.technicianList = technicianList;
    }
    public TechnicianDirectory() {
    }

    public void addTechnician(String user_id, Technician technician) {
        technicianList.put(user_id, technician);
    }
    
}

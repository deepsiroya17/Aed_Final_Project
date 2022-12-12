/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Radiologist;


import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sarth
 */
public class RadiologistDirectory {
    
//    ArrayList<Radiologist> radiologistList = new ArrayList<>();
    HashMap<String, Radiologist> radiologistList = new HashMap<>();

    public HashMap<String, Radiologist> getRadiologistList() {
        return radiologistList;
    }

    public void setRadiologistList(HashMap<String, Radiologist> radiologistList) {
        this.radiologistList = radiologistList;
    }
    public RadiologistDirectory() {
    }

    public void addRadiologist(String user_id, Radiologist radiologist) {
        radiologistList.put(user_id, radiologist);
    }
    
}

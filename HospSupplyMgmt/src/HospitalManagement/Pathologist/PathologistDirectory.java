/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Pathologist;


import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sarth
 */
public class PathologistDirectory {
    
//    ArrayList<Pathologist> pathologistList = new ArrayList<>();
    HashMap<String, Pathologist> pathologistList = new HashMap<>();

    public HashMap<String, Pathologist> getPathologistList() {
        return pathologistList;
    }

    public void setPathologistList(HashMap<String, Pathologist> pathologistList) {
        this.pathologistList = pathologistList;
    }
    public PathologistDirectory() {
    }

    public void addPathologist(String user_id, Pathologist pathologist) {
        pathologistList.put(user_id, pathologist);
    }
    
}

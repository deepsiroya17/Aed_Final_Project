/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Doctor;


import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author animeshgiri
 */
public class DoctorDirectory {
    HashMap<String, Doctor> doctorList = new HashMap<>();

    public HashMap<String, Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(HashMap<String, Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    public DoctorDirectory() {
    }

    public void addDoctor(String user_id, Doctor doctor) {
        doctorList.put(user_id, doctor);
    }

    
    
}
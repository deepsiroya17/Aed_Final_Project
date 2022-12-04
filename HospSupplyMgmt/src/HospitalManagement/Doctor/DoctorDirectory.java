/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Doctor;


import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author prans
 */
public class DoctorDirectory {
    
//    ArrayList<Doctor> doctorList = new ArrayList<>();
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

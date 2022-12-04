/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Doctor;

import MainCentralisationSystem.UserAccount;

/**
 *
 * @author prans
 */
public class Doctor {
    
//    UserAccount userAccount;
    String DoctorId;
    String DoctorName;
    
    public String getDoctorId() {
        return DoctorId;
    }

//    public UserAccount getUserAccount() {
//        return userAccount;
//    }
//
//    public void setUserAccount(UserAccount userAccount) {
//        this.userAccount = userAccount;
//    }
    public void setDoctorId(String DoctorId) {    
        this.DoctorId = DoctorId;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }
    
    
    @Override
    public String toString(){
        return DoctorId;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Doctor;

/**
 *
 * @author animeshgiri
 */
public class Doctor {

    String DoctorId;
    String DoctorName;
    
    public String getDoctorId() {
        return DoctorId;
    }

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

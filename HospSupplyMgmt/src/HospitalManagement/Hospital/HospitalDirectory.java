/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Hospital;

import MainCentralisationSystem.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author prans
 */
public class HospitalDirectory {
    
    ArrayList<Hospital> hospitalList = new ArrayList<>();

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    public HospitalDirectory() {
    }

    public void addHospital(Hospital hospital) {
        hospitalList.add(hospital);
    }

    public void updateHospital(ArrayList<String> user_input, Hospital updated_hospital) {
        
        for(Hospital hospital: hospitalList)
        {
            if(hospital.getHospitalId().equals(updated_hospital.getHospitalId()))
            {   
                hospital.setHospitalName(user_input.get(1));
                hospital.setHospitalpincode(user_input.get(2));
                break;
            }
        }
    }

    public void deleteHospital(Hospital selected_hospital) {
        for(Hospital hospital: hospitalList)
        {
            if(hospital.getHospitalId().equals(selected_hospital.getHospitalId()))
            {   
                hospitalList.remove(hospital);
                break;
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicalEquipmentWarehouse.MedSupEquip;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author asus
 */
public class MedSupEquipDirectory {
    
    ArrayList<MedSupEquip> medSupEquipList = new ArrayList<>();

    public ArrayList<MedSupEquip> getMedSupEquipList() {
        return medSupEquipList;
    }

    public void setMedSupEquipList(ArrayList<MedSupEquip> medSupEquipList) {
        this.medSupEquipList = medSupEquipList;
    }
    
    public void addMedSupEquip(MedSupEquip medSupEquip){
        medSupEquipList.add(medSupEquip);
    }
    
    public MedSupEquip findMedSupEquipByName(String medSupEquip_name){
        for(MedSupEquip medSupEquip: medSupEquipList){
            if(medSupEquip.medSupEquip_name.equals(medSupEquip_name))
                return medSupEquip;
        }
        return null;
    }

   
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.MedSupEquipInternal;


/**
 *
 * @author Shreya
 */
public class MedSupEquipInternal {
 
    String medSupEquipInternal_name;
    String medSupEquipInternal_price;
    String medSupEquipInternal_quantity;

    public String getMedSupEquipInternal_name() {
        return medSupEquipInternal_name;
    }

    public void setMedSupEquipInternal_name(String medSupEquipInternal_name) {
        this.medSupEquipInternal_name = medSupEquipInternal_name;
    }

    public String getMedSupEquipInternal_price() {
        return medSupEquipInternal_price;
    }

    public void setMedSupEquipInternal_price(String medSupEquipInternal_price) {
        this.medSupEquipInternal_price = medSupEquipInternal_price;
    }

    public String getMedSupEquipInternal_quantity() {
        return medSupEquipInternal_quantity;
    }

    public void setMedSupEquipInternal_quantity(String medSupEquipInternal_quantity) {
        this.medSupEquipInternal_quantity = medSupEquipInternal_quantity;
    }
    
    
    
    @Override
    public String toString(){
        return medSupEquipInternal_name;
    }
}

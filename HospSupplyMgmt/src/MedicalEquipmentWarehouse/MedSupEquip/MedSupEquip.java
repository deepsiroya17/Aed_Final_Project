/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicalEquipmentWarehouse.MedSupEquip;


/**
 *
 * @author asus
 */
public class MedSupEquip {
 
    String medSupEquip_name;
    String medSupEquip_price;
    String medSupEquip_quantity;
    String medSupWarehouseId;
    
    public String getMedSupEquip_name() {
        return medSupEquip_name;
    }

    public void setMedSupEquip_name(String medSupEquip_name) {
        this.medSupEquip_name = medSupEquip_name;
    }

    public String getMedSupEquip_price() {
        return medSupEquip_price;
    }

    public void setMedSupEquip_price(String medSupEquip_price) {
        this.medSupEquip_price = medSupEquip_price;
    }

    public String getMedSupEquip_quantity() {
        return medSupEquip_quantity;
    }

    public void setMedSupEquip_quantity(String medSupEquip_quantity) {
        this.medSupEquip_quantity = medSupEquip_quantity;
    }

    public String getMedSupWarehouseId() {
        return medSupWarehouseId;
    }

    public void setMedSupWarehouseId(String medSupWarehouseId) {
        this.medSupWarehouseId = medSupWarehouseId;
    }
    
    @Override
    public String toString(){
        return medSupEquip_name;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicalEquipmentWarehouse;

import MainCentralisationSystem.UserAccountDirectory;
import MedicalEquipmentWarehouse.MedSupEquip.MedSupEquipDirectory;
import MedicalEquipmentWarehouse.Orders.OrderDirectory;

import java.util.HashMap;

/**
 *
 * @author asus
 */
public class MedSupWarehouse {
    
    String medSupWarehouseId;
    String medSupWarehouseName;
    MedSupEquipDirectory medSupEquipDirectory;
    UserAccountDirectory UserAccountDirectory;
    OrderDirectory orderDirectory;
    
    
    
    public MedSupWarehouse(String medSupWarehouseId, String medSupWarehouseName){
        this.medSupWarehouseId = medSupWarehouseId;
        this.medSupWarehouseName = medSupWarehouseName;
    }
    
    public String getMedSupWarehouseName() {
        return medSupWarehouseName;
    }

    public void setMedSupWarehouseName(String medSupWarehouseName) {
        this.medSupWarehouseName = medSupWarehouseName;
    }
    
    
    
     public String getMedSupWarehouseId() {
        return medSupWarehouseId;
    }

    public void setMedSupWarehouseId(String medSupWarehouseId) {
        this.medSupWarehouseId = medSupWarehouseId;
    }

    public MedSupEquipDirectory getMedSupEquipDirectory() {
        return medSupEquipDirectory;
    }

    public void setMedSupEquipDirectory(MedSupEquipDirectory medSupEquipDirectory) {
        this.medSupEquipDirectory = medSupEquipDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    
    
    
    
    
    @Override
    public String toString(){
        return medSupWarehouseName;
    }
    
}

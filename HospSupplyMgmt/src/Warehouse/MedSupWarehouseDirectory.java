/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class MedSupWarehouseDirectory {
    
    ArrayList<MedSupWarehouse> medSupWarehouseList = new ArrayList<>();

    public ArrayList<MedSupWarehouse> getMedSupWarehouseList() {
        return medSupWarehouseList;
    }

    public void setMedSupWarehouseList(ArrayList<MedSupWarehouse> medSupWarehouseList) {
        this.medSupWarehouseList = medSupWarehouseList;
    }
    public MedSupWarehouseDirectory() {
    }

    public void addMedSupWarehouse(MedSupWarehouse medSupWarehouse) {
        medSupWarehouseList.add(medSupWarehouse);
    }

    public void updateMedSupWarehouse(ArrayList<String> user_input, MedSupWarehouse updated_medSupWarehouse) {
        
        for(MedSupWarehouse medSupWarehouse: medSupWarehouseList)
        {
            if(medSupWarehouse.getMedSupWarehouseId().equals(updated_medSupWarehouse.getMedSupWarehouseId()))
            {   
                medSupWarehouse.setMedSupWarehouseName(user_input.get(1));
                break;
            }
        }
    }

    public void deleteMedSupWarehouse(MedSupWarehouse selected_medSupWarehouse) {
        for(MedSupWarehouse medSupWarehouse: medSupWarehouseList)
        {
            if(medSupWarehouse.getMedSupWarehouseId().equals(selected_medSupWarehouse.getMedSupWarehouseId()))
            {   
                medSupWarehouseList.remove(medSupWarehouse);
                break;
            }
        }
    }
    
}

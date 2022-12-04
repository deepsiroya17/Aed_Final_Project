/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.MedSupEquipInternal;

import MedicalEquipmentWarehouse.MedSupEquip.*;
import MedicalEquipmentWarehouse.Orders.Order;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Shreya
 */
public class MedSupEquipInternalDirectory {
    
    ArrayList<MedSupEquipInternal> medSupEquipInternalList = new ArrayList<>();
    ArrayList<Order> orderList = new ArrayList<>();
    
    public ArrayList<MedSupEquipInternal> getMedSupEquipInternalList() {
        return medSupEquipInternalList;
    }

    public void setMedSupEquipInternalList(ArrayList<MedSupEquipInternal> medSupEquipInternalList) {
        this.medSupEquipInternalList = medSupEquipInternalList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public void addOrder(Order order){
        orderList.add(order);
    }
    
    
    
    public void addMedSupEquip(MedSupEquipInternal medSupEquipInternal){
        medSupEquipInternalList.add(medSupEquipInternal);
    }
    
    public MedSupEquipInternal findMedSupEquipByName(String medSupEquip_name){
        for(MedSupEquipInternal medSupEquipInternal: medSupEquipInternalList){
            if(medSupEquipInternal.getMedSupEquipInternal_name().equals(medSupEquip_name))
                return medSupEquipInternal;
        }
        return null;
    }

   
    
    
}

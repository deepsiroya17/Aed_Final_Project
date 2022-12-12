/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse.Orders;

import Warehouse.MedSupInven.MedSupEquip;
import Warehouse.MedSupWarehouse;
import java.util.HashMap;

/**
 *
 * @author asus
 */
public class Order {
    
    String order_id;
    HashMap<MedSupEquip, String> MedSupEquipItemsWithQuantity = new HashMap<>();
    String status;
    String warehouseId;
    String hospital_id;
    String order_amount;
    String delivery_agency_id;
    
    public String getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(String hospital_id) {
        this.hospital_id = hospital_id;
    }
    
    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(String order_amount) {
        this.order_amount = order_amount;
    }

    public String getDelivery_agency_id() {
        return delivery_agency_id;
    }

    public void setDelivery_agency_id(String delivery_agency_id) {
        this.delivery_agency_id = delivery_agency_id;
    }
    
    public HashMap<MedSupEquip, String> getMedSupEquipItemsWithQuantity() {
        return MedSupEquipItemsWithQuantity;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public void setMedSupEquipItemsWithQuantity(HashMap<MedSupEquip, String> MedSupEquipItemsWithQuantity) {
        this.MedSupEquipItemsWithQuantity = MedSupEquipItemsWithQuantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
     public void addItemToOrder(MedSupEquip medSupEquip, String quantity){
         MedSupEquipItemsWithQuantity.put(medSupEquip, quantity);
     }
    
     public void calculate_order_amount(){
         int curr_order_amount = 0;
         for(HashMap.Entry<MedSupEquip, String> set: MedSupEquipItemsWithQuantity.entrySet()){
             
             curr_order_amount += Integer.parseInt(set.getKey().getMedSupEquip_price())*Integer.parseInt(set.getValue());
         }
         order_amount = String.valueOf(curr_order_amount);
     }
     
    @Override
     public String toString(){
         return order_id;
     }
}

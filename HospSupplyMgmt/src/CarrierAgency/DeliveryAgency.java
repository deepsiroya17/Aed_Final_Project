/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarrierAgency;

import System.UserAccountDirectory;
import Warehouse.MedSupInven.MedSupEquipDirectory;
import Warehouse.Orders.OrderDirectory;

import java.util.HashMap;

/**
 *
 * @author sarth
 */
public class DeliveryAgency {
    
    String deliveryAgencyId;
    String deliveryAgencyName;
    
    public DeliveryAgency(String deliveryAgencyId, String deliveryAgencyName){
        this.deliveryAgencyId = deliveryAgencyId;
        this.deliveryAgencyName = deliveryAgencyName;
    }
    
    public String getDeliveryAgencyName() {
        return deliveryAgencyName;
    }

    public void setDeliveryAgencyName(String deliveryAgencyName) {
        this.deliveryAgencyName = deliveryAgencyName;
    }
    
    
    
     public String getDeliveryAgencyId() {
        return deliveryAgencyId;
    }

    public void setDeliveryAgencyId(String deliveryAgencyId) {
        this.deliveryAgencyId = deliveryAgencyId;
    }

    @Override
    public String toString(){
        return deliveryAgencyName;
    }
    
}

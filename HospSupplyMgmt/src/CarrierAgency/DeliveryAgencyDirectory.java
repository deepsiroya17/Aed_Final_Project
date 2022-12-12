/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarrierAgency;

import java.util.ArrayList;

/**
 *
 * @author sarth
 */
public class DeliveryAgencyDirectory {
    
    ArrayList<DeliveryAgency> deliveryAgencyList = new ArrayList<>();

    public ArrayList<DeliveryAgency> getDeliveryAgencyList() {
        return deliveryAgencyList;
    }

    public void setDeliveryAgencyList(ArrayList<DeliveryAgency> deliveryAgencyList) {
        this.deliveryAgencyList = deliveryAgencyList;
    }
    public DeliveryAgencyDirectory() {
    }

    public void addDeliveryAgency(DeliveryAgency deliveryAgency) {
        deliveryAgencyList.add(deliveryAgency);
    }

    public void updateDeliveryAgency(ArrayList<String> user_input, DeliveryAgency updated_deliveryAgency) {
        
        for(DeliveryAgency deliveryAgency: deliveryAgencyList)
        {
            if(deliveryAgency.getDeliveryAgencyId().equals(updated_deliveryAgency.getDeliveryAgencyId()))
            {   
                deliveryAgency.setDeliveryAgencyName(user_input.get(1));
                break;
            }
        }
    }

    public void deleteDeliveryAgency(DeliveryAgency selected_deliveryAgency) {
        for(DeliveryAgency deliveryAgency: deliveryAgencyList)
        {
            if(deliveryAgency.getDeliveryAgencyId().equals(selected_deliveryAgency.getDeliveryAgencyId()))
            {   
                deliveryAgencyList.remove(deliveryAgency);
                break;
            }
        }
    }
    
}

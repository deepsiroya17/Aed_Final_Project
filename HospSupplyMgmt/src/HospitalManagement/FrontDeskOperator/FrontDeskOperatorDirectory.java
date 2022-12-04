/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.FrontDeskOperator;

import HospitalManagement.FrontDeskOperator.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author prans
 */
public class FrontDeskOperatorDirectory {
    
//    ArrayList<FrontDeskOperator> frontDeskOperatorList = new ArrayList<>();
    HashMap<String, FrontDeskOperator> frontDeskOperatorList = new HashMap<>();

    public HashMap<String, FrontDeskOperator> getFrontDeskOperatorList() {
        return frontDeskOperatorList;
    }

    public void setFrontDeskOperatorList(HashMap<String, FrontDeskOperator> frontDeskOperatorList) {
        this.frontDeskOperatorList = frontDeskOperatorList;
    }
    public FrontDeskOperatorDirectory() {
    }

    public void addFrontDeskOperator(String user_id, FrontDeskOperator frontDeskOperator) {
        frontDeskOperatorList.put(user_id, frontDeskOperator);
    }

    
    
}

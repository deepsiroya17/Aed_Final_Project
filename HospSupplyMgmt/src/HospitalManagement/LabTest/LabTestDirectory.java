/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.LabTest;

import java.util.ArrayList;

/**
 *
 * @author prans
 */
public class LabTestDirectory {
    
    ArrayList<LabTest> labTestList = new ArrayList<>();

    public ArrayList<LabTest> getLabTestList() {
        return labTestList;
    }

    public void setLabTestList(ArrayList<LabTest> labTestList) {
        this.labTestList = labTestList;
    }
    
    public void addTest(LabTest labTest){
        labTestList.add(labTest);
    }
    
    public LabTest findLabTestByName(String test_name){
        for(LabTest labTest: labTestList){
            if(labTest.test_name.equals(test_name))
                return labTest;
        }
        return null;
    }
    
    
}

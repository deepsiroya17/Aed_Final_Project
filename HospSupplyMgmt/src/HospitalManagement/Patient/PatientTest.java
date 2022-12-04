/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Patient;

import HospitalManagement.LabTest.LabTest;
import java.util.HashMap;

/**
 *
 * @author sarth
 */
public class PatientTest {
    
    String test_date;
    String report_avalaible;
    String report_availibility_time;
    String test_id;
    LabTest labTest;
    HashMap<String, LabTest> patient_test_list = new HashMap<>();

    public String getTest_date() {
        return test_date;
    }

    public void setTest_date(String test_date) {
        this.test_date = test_date;
    }

    public HashMap<String, LabTest> getPatient_test_list() {
        return patient_test_list;
    }

    public void setPatient_test_list(HashMap<String, LabTest> patient_test_list) {
        this.patient_test_list = patient_test_list;
    }

    public String getReport_avalaible() {
        return report_avalaible;
    }

    public void setReport_avalaible(String report_avalaible) {
        this.report_avalaible = report_avalaible;
    }

    public String getTest_id() {
        return test_id;
    }

    public void setTest_id(String test_id) {
        this.test_id = test_id;
    }

    public LabTest getLabTest() {
        return labTest;
    }

    public void setLabTest(LabTest labTest) {
        this.labTest = labTest;
    }

    public String getReport_availibility_time() {
        return report_availibility_time;
    }

    public void setReport_availibility_time(String report_availibility_time) {
        this.report_availibility_time = report_availibility_time;
    }
    
    
}

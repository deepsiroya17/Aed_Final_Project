/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Nurse;

/**
 *
 * @author sarth
 */
public class Nurse {
    
//    UserAccount userAccount;
    String NurseId;
    String NurseName;
    
    public String getNurseId() {
        return NurseId;
    }
    public void setNurseId(String NurseId) {    
        this.NurseId = NurseId;
    }

    public String getNurseName() {
        return NurseName;
    }

    public void setNurseName(String NurseName) {
        this.NurseName = NurseName;
    }
    
    
    @Override
    public String toString(){
        return NurseId;
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;

/**
 *
 * @author animeshgiri
 */
public class SystemAdmin {
    private String Sys_username;
    private String Sys_password;
    
    public SystemAdmin(String Sys_username, String Sys_password) {
        this.Sys_username = Sys_username;
        this.Sys_password = Sys_password;
    }

    public String getSys_username() {
        return Sys_username;
    }

    public void setSys_username(String Sys_username) {
        this.Sys_username = Sys_username;
    }

    public String getSys_password() {
        return Sys_password;
    }

    public void setSys_password(String Sys_password) {
        this.Sys_password = Sys_password;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

/**
 *
 * @author casanova
 */
public class Email {
    private String address;
    
    public Email() {
        this.address = "";
    }
    
    public Email(String address) {
        this.address = address;
    }
    
    public String getAddress() {
       return address;
    }
    
    public void setAddress(String address) {
        this.address=address;
    }
}

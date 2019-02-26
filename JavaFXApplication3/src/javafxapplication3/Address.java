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
public class Address {
    private String street;
    private String city;
    private Integer postalCode;
    
    public Address() {
        this.street = "";
        this.city = "";
        this.postalCode = 0;
    }
    
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public Integer getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }
    
}

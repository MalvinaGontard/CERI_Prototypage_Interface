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
public class PhoneNumber {
    private String prefix;
    private Integer number;
    private PhoneNumberType type;
    
    public PhoneNumber() {
        this.prefix = "";
        this.number = 0;
    }
    
    public PhoneNumber(String prefix, Integer number, PhoneNumberType type) {
        this.prefix = prefix;
        this.number = number;
        this.type = type;
    }
    
    public String getPrefix() {
        return this.prefix;
    }
    
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    public Integer getNumber() {
        return this.number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }
    
    public PhoneNumberType getType() {
        return this.type;
    }
    
    public void setType(PhoneNumberType type) {
        this.type = type;
    }
}

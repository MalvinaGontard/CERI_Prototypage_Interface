/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.util.List;

/**
 *
 * @author casanova
 */
public class AddressBook {
    private String name;
    private AddressBookType type;
    private List<Contact> contactes;

    public AddressBook(String name, AddressBookType type, List<Contact> contactes) {
        this.name = name;
        this.type = type;
        this.contactes = contactes;
    }
    
    public String getName() {
        return name;
    }

    public AddressBookType getType() {
        return type;
    }

    public List<Contact> getContactes() {
        return contactes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(AddressBookType type) {
        this.type = type;
    }

    public void setContactes(List<Contact> contactes) {
        this.contactes = contactes;
    }
    
   
    
} 

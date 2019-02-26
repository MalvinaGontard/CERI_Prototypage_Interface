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
public class Contact {
    private String firstName;
    private String lastName;
    private Integer age;
    private Boolean genre;
    
    private List<PhoneNumber> numerots;
    private Email email;
    private Address address;
    
    public Contact(String firstName, String lastName, Integer age, Boolean genre, Email email, Address address, List<PhoneNumber> numerots) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.genre = genre;
        this.address = address;
        this.email = email;
        this.numerots = numerots;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public Boolean getGenre() {
        return this.genre;
    }
    
    public void setGenre(Boolean genre) {
        this.genre = genre;
    }
    
    public List<PhoneNumber> getNumerots() {
        return this.numerots;
    }
    
    public void setNumerots(List<PhoneNumber> numerots) {
        this.numerots = numerots;
    }
    
    public Email getEmail() {
        return this.email;
    }
    
    public void setEmail(Email email) {
        this.email = email;
    }
    
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
}

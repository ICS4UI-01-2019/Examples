/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author lamon
 */
public class Person {
    private String name;
    private String address;
    private String email;
    private String password;
    
    public Person(String name, String address, String email, String password){
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
    }
    
    /**
     * Get the name of the person
     * @return the name of the person
     */
    public String getName(){
        return this.name; // stub
    }
    
    /**
     * Get the address of this person
     * @return the address of the person
     */
    public String getAddress(){
        return this.address; 
    }
    
    /**
     * Changes the address of this person to a new address
     * @param address the new address to change to
     */
    public void changeAddress(String address){
        this.address = address;
    }
    
    /**
     * Checks if the login info is correct for this person
     * @param email the email used for the account
     * @param password the password for the account
     * @return true if the email and password match this person
     */
    public boolean isValid(String email, String password){
        if(this.email.equals(email) && this.password.equals(password)){
            return true;
        }else{
            return false;
        }
    }
}

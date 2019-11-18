/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author lamon
 */
public abstract class Pet {
    private String name;
    private int age;
    private int size;
    
    // constructor
    public Pet(String name, int age, int size){
        this.name = name;
        this.age = age;
        this.size = size;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    // everyone needs to know how to speak their own way
    public abstract void speak();
    
    // another method that is shared by all pets
    public void walk(){
        System.out.println("We are walking");
    }
    
    @Override
    public String toString(){
        String n = this.name + "\nAge: " + this.age;
        return n;
    }
}

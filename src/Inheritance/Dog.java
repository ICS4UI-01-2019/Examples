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
public class Dog extends Pet{

    private String furColour;
    
    public Dog(String name, int age, int size, String furColour){
        // send info to the Pet constructor (super class)
        super(name, age, size);
        this.furColour = furColour;
    }
    
    @Override
    public void speak() {
        System.out.println("BARK BARK");
    }
    
    public void howl(){
        System.out.println("WOOOOOOOOO");
    }
    
}

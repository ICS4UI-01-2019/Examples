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
public class Turtle extends Pet{

    public Turtle(String name, int age, int size){
        super(name, age, size);
    }
    
    public void swim(){
        System.out.println("I am swimming...");
    }
    
    @Override
    public void speak() {
        System.out.println("SCREE");
    }
    
}

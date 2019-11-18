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
public class Cat extends Pet{
    private String furColour;
    private int lives;
    
    public Cat(String name, int age, int size, String furColour, int lives){
        super(name, age, size);
        this.furColour = furColour;
        this.lives = lives;
    }
    
    public int getLives(){
        return this.lives;
    }
    
    public void loseLife(){
        if(this.lives > 0){
            this.lives--;
        }
    }
    
    @Override
    public void speak() {
        System.out.println("MEOW");
    }
    
    public String toString(){
        String n = super.toString();
        n = "Cat\n" + n;
        return n;
    }
    
    
}

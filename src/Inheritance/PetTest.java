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
public class PetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test dog
        Dog rex = new Dog("Rex", 5, 100, "Black");
        rex.speak();
        rex.howl();
        rex.walk();
        System.out.println(rex.getName());
        System.out.println(rex.getAge());
        
        Cat fluffy = new Cat("Fluffy", 7, 25, "White", 5);
        Turtle leo = new Turtle("Leonardo", 67, 15);
        
        leo.walk();
        leo.speak();
        leo.swim();
        
        System.out.println(fluffy.getLives());
        fluffy.loseLife();
        System.out.println(fluffy.getLives());
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        Pet[] pets = new Pet[3];
        pets[0] = new Dog("Spike", 3, 34, "Brown");
        pets[1] = new Turtle("Michaelangelo", 16, 150);
        pets[2] = new Cat("Kitty", 5, 18, "Black", 9);
        
        for(int i = 0; i < 3; i++){
            if(pets[i] instanceof Dog){
                Dog d = (Dog)pets[i];
                d.howl();
            }else{
                System.out.println(pets[i]);
            }
            
        }
    }
    
}

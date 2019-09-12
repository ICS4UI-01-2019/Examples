
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hello ");
        System.out.print("World\n");
        
        int myAge = 34;
        
        System.out.println("I am " + myAge + " years old!");
        
        int calculatedAge = 2019 - 1985;
      
        double pi = 3.14159;
        
        // input data using Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("How many apples did you take?");
        int numApples = input.nextInt();
        
        // if statements
        if(numApples > 10){
            System.out.println("Wow! that's a lot of apples!");
            System.out.println("Blah Blah Blah");
        }else if(numApples > 0 && numApples <= 10){
            System.out.println("I like you....");
        }else if(numApples == 0){
            System.out.println("Come on.... take an apple!");
        }else{
            System.out.println("I don't think so");
        }
        
        
        // math operations
        // + : addition
        // - : subtraction
        // * : multiplication
        // / : division
        // Math.pow(base, exponent) : powers
        // Math.sqrt(num) : square root
        // % : modulo/remainder
        // (int)(Math.random()*(max - min + 1) + min) : random number
        // Math.round(num) : round to nearest whole
        // Math.ceil(num)
        // Math.floor(num)
        // Math.abs(num): absolute
        
        // arrays
        double[] marks = new double[5];
        marks[0] = 76.5;
        marks[1] = 80.3;
        marks[2] = 88.7;
        
        // using a loop to fill the array
        for(int i = 0; i < 5; i++){
            System.out.println("Please enter a mark");
            marks[i] = input.nextDouble();
        }
        
        // while loop
        int count = 0;
        while(count < 5){
            // read in the mark
            System.out.println("Please enter the mark");
            marks[count] = input.nextDouble();
            // move to next mark
            count++;
        }
        
        // check condition at end
        // execute code at least once
        do{
            // code goes here
        }while(count < 5);
        
        
        
    }
    
}

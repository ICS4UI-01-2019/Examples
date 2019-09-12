/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class RecursionExample {

    // finds the nth Fibbonacci number
    public static int fibLoop(int n){
        // array to store numbers
        int[] numbers = new int[n+1];
        // the starting values
        numbers[0] = 1;
        numbers[1] = 1;
        // iterate over the numbers to make Fib numbers
        for(int i = 2; i < numbers.length; i++){
            // fib formula
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
        // return the answer
        return numbers[n];
    }
    
    
    public static int fibR(int n){
        // base case
        // 0th or 1st Fibbonacci number
        if(n == 0 || n == 1){
            return 1;
        }
        // recursive call
        int num = fibR(n-1) + fibR(n-2);
        // return the answer
        return num;
        
    }
    
    // greatest common divisor of a and b
    public static int gcd(int a, int b){
        //base case: b is 0
        if( b == 0){
            return a;
        }
        // recursive call
        int divisor = gcd(b, a%b);
        // returning the answer
        return divisor;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f5 = fibLoop(5);
        System.out.println(f5);
        int f20 = fibLoop(20);
        System.out.println(f20);
        
        int f5R = fibR(5);
        System.out.println(f5R);
        int f20R = fibR(20);
        System.out.println(f20R);
        
        System.out.println("");
        System.out.println("");
        int divisor = gcd(100, 75);
        System.out.println(divisor);
    }
    
}

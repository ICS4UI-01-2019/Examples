/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADTs;

/**
 *
 * @author lamon
 */
public abstract class List {
    
    public abstract void add(int n);
    public abstract void remove(int pos);
    public abstract int get(int pos);
    public abstract void insert(int pos, int n); 
    public abstract int size();  
    public abstract boolean isEmpty();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADTs;

/**
 * An implementation of the List ADT
 * @author lamon
 */
public class MyArrayList extends List{

    private int[] list;
    private int numItems;
    
    /**
     * Creates an empty list
     */
    public MyArrayList(){
        this.list = new int[10];
        this.numItems = 0;
    }
   
    
    /**
     * Adds an item to the end of the list
     * @param n The number to add to the list
     */
    @Override
    public void add(int n) {
        // check if there is room
        if(this.numItems < this.list.length){
            // if there is room, add the item
            this.list[this.numItems] = n;
        // if there is no room
        }else{
            // make the array bigger
            int[] newList = new int[this.list.length * 2];
            for(int i = 0; i < this.list.length; i++){
                newList[i] = this.list[i];
            }
            this.list = newList;
            // add the item
            this.list[this.numItems] = n;
        }
        // increase num items counter  
        this.numItems++;
    }

    /**
     * Remove an item at a specific position in the list
     * @param pos The position of the item to be removed
     */
    @Override
    public void remove(int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Checks what items is in a specified position in the list
     * @param pos the position in the list you want to check
     * @return the item at the specific position
     */
    @Override
    public int get(int pos) {
        // check to see if position exists
        if(pos < this.numItems){
            // return item if so
            return this.list[pos];
        }else{
            // throw error if not
            throw new IndexOutOfBoundsException(pos + " is not a valid position");
        }
    }

    @Override
    public void insert(int pos, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Retrieves how many items are in the list
     * @return The number of items in the list
     */
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

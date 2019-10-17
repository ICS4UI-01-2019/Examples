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
public class ADTTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArrayList aList = new MyArrayList();
        
        aList.add(7);
        aList.add(-10);
        aList.add(140);
        aList.add(72);
        aList.add(-110);
        aList.add(80);
        aList.add(70);
        aList.add(-310);
        aList.add(800);
        aList.add(73);
        aList.add(-190);
        aList.add(7100);
        
        for(int i = 0; i < 12; i++){
            System.out.println(aList.get(i));
        }
    }
    
}

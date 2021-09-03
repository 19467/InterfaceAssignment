/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceassignment;

/**
 *
 * @author tweiderman
 */
public class Fish extends Animal{
    /**
     * Basic constructor, getter, and overrides
     */
    
    private boolean isSaltWater;

    public Fish(boolean isSaltWater, String name) {
        super(name);
        this.isSaltWater = isSaltWater;
    }
    
    public boolean getSaltWater() {
        return isSaltWater;
    }

    @Override
    public String toString() {
        return "Fish{" + "isSaltWater=" + isSaltWater + '}';
    }
    
}

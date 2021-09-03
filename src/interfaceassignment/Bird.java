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
public class Bird extends Animal{
    /**
     * Basic constructor, getter, and overrides
     */
    
    private float wingspan;

    public Bird(float wingspan, String name) {
        super(name);
        this.wingspan = wingspan;
    }
    
//    public Bird(float wingspan) {
//        this.wingspan = wingspan;
//    }
//    
    float getWingspan() {
        return wingspan;
    }

    @Override
    public String toString() {
        return "Bird{" + "wingspan = " + wingspan + '}';
    }
    
    
}

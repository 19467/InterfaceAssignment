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
public class Mammal extends Animal{
    /**
     * Basic constructor, getter, and overrides
     */
    
    private float bodyTemp;

    public Mammal(float bodyTemp, String name) {
        super(name);
        this.bodyTemp = bodyTemp;
    }

    float getBodyTemp() {
        return bodyTemp;
    }

    @Override
    public String toString() {
        return "Mammal{" + "bodyTemp = " + bodyTemp + '}';
    }
    
   
}

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
public class Shark extends Fish implements ISwim {
    /**
    * Basic constructor, getter, and overrides
    */
    
    public Shark(boolean isSaltWater, String name) {
        super(isSaltWater, name);
    }
    
    @Override
    public void swim() {
        System.out.println("Shark: Can Swim");
    }

    @Override
    public String toString() {
        return "Shark{" + getSaltWater() + '}';
    }
    
}

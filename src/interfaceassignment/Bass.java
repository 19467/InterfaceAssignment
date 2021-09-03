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
public class Bass extends Fish implements ISwim {

    /**
     * Basic constructor, getter, and overrides
     */
    
    public Bass(boolean isSaltWater, String name) {
        super(isSaltWater, name);
    }
    
    @Override
    public void swim() {
        System.out.println("Bass: Can Swim");
    }

    @Override
    public String toString() {
        return "Bass{" + getSaltWater() + '}';
    }

    
}

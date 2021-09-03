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
public class FlyingFish extends Fish implements IFly, ISwim {

    /**
     * Basic constructor, getter, and overrides
     */
    
    public FlyingFish(boolean isSaltWater, String name) {
        super(isSaltWater, name);
    }
    
    @Override
    public void fly() {
        System.out.println("FlyingFish: Can Fly");
    }

    @Override
    public void swim() {
        System.out.println("FlyingFish: Can Swim");
    }

    @Override
    public String toString() {
        return "FlyingFish{" + getSaltWater() + '}';
    }
    
    
    
}

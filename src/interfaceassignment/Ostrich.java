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
public class Ostrich extends Bird implements IWalk, IMakeSound {
     /**
     * Basic constructor, getter, and overrides
     */
    
    public Ostrich(float wingspan, String name) {
        super(wingspan, name);
    }

    @Override
    public void walk() {
        System.out.println("Ostrich: Can Walk");
    }

    @Override
    public void makeSound() {
        System.out.println("Ostrich: Can Make Sound");
    }    

    @Override
    public String toString() {
        return "Ostrich{" + getWingspan() + '}';
    }
}

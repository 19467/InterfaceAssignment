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
public class Penguin extends Bird implements IMakeSound, IWalk, ISwim {
    /**
     * Basic constructor, getter, and overrides
     */
    
    public Penguin(float wingspan, String name) {
        super(wingspan, name);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Penguin: Make Sound");
    }

    @Override
    public void walk() {
        System.out.println("Penguin: Can Walk");
    }

    @Override
    public void swim() {
        System.out.println("Penguin: Can Swim");
    }

    @Override
    public String toString() {
        return "Penguin{" + getWingspan() + '}';
    }
}

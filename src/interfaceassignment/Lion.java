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
public class Lion extends Mammal implements IWalk, IMakeSound, ISwim {
    /**
     * Basic constructor, getter, and overrides
     */
    
    public Lion(float bodyTemp, String name) {
        super(bodyTemp, name);
    }

    @Override
    public void walk() {
        System.out.println("Lion: Can Walk");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion: Can Make Sound");
    }

    @Override
    public void swim() {
        System.out.println("Lion: Can Swim");
    }

    @Override
    public String toString() {
        return "Lion{" + getBodyTemp() + '}';
    }
    
}

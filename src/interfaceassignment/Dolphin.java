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
public class Dolphin extends Mammal implements ISwim, IMakeSound {

    /**
     * Basic constructor, getter, and overrides
     */
    
    public Dolphin(float bodyTemp, String name) {
        super(bodyTemp, name);
    }

    
    @Override
    public void swim() {
        System.out.println("Dolphin: Can Swim");
    }

    @Override
    public void makeSound() {
        System.out.println("Dolphin: Can Make Sound");
    }

    @Override
    public String toString() {
        return "Dolphin{" + getBodyTemp() + '}';
    }
    
    
}

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
public class Bat extends Mammal implements IMakeSound, IFly, IWalk {

    /**
     * Basic constructor, getter, and overrides
     */
    
    public Bat(float bodyTemp, String name) {
        super(bodyTemp, name);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Bat: Can Make Sound");
    }

    @Override
    public void fly() {
        System.out.println("Bat: Can Fly");
    }

    @Override
    public void walk() {
        System.out.println("Bat: Can Walk");
    }

    @Override
    public String toString() {
        return "Bat{" + getBodyTemp() + '}';
    }
    
    
}

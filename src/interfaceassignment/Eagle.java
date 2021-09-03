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
public class Eagle extends Bird implements IFly, IMakeSound, IWalk {

//    public Eagle(float wingspan) {
//        super(wingspan);
//    }
    
    
    
    public Eagle(float wingspan, String name) {
        super(wingspan, name);
    }

    @Override
    public void fly() {
        System.out.println("Eagle: Can Fly");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle: Can Make Sound");
    }

    @Override
    public void walk() {
        System.out.println("Eagle: Can Walk");
    }

    @Override
    public String toString() {
        return "Eagle{" + getWingspan() + '}';
    }
    
    
    
}

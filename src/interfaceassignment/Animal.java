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
public class Animal {
    /**
     * Basic constructor, getter, and overrides
     */
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';
    }
    
    
}

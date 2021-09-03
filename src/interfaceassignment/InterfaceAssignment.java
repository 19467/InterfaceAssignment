/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceassignment;

import java.util.ArrayList;

/**
 *
 * @author tweiderman
 */
public class InterfaceAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Creating all animals as objects to be used for later.
         */
        Ostrich ostrich = new Ostrich(6.6f, "Gary");
        Dolphin dolphin = new Dolphin(97.f, "Bob");
        Eagle eagle = new Eagle(6.5f, "Melinda");
        Bat bat = new Bat(105.f, "Monty");
        FlyingFish flyingFish = new FlyingFish(true, "Robert");
        Lion lion = new Lion(98.5f, "Jeb");
        Shark shark = new Shark(true, "Poly");
        Penguin penguin = new Penguin(4.5f, "Josh");
        Bass bass = new Bass(false, "Leslie");
        /**
         * Creating animal lists.
         */
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Bird> birds = new ArrayList<>();
        ArrayList<Mammal> mammals = new ArrayList<>();
        ArrayList<Fish> fishies = new ArrayList<>();
        ArrayList<IFly> flyers = new ArrayList<>();
        ArrayList<IWalk> walkers = new ArrayList<>();
        ArrayList<IMakeSound> soundMakers = new ArrayList<>();
        ArrayList<ISwim> swimmers = new ArrayList<>();
        /**
         * Adding all animals to said lists.
         */
        animals.add(ostrich);
        animals.add(dolphin);
        animals.add(eagle);
        animals.add(bat);
        animals.add(flyingFish);
        animals.add(lion);
        animals.add(shark);
        animals.add(penguin);
        animals.add(bass);
        
        fishies.add(bass);
        fishies.add(shark);
        fishies.add(flyingFish);
        
        birds.add(penguin);
        birds.add(eagle);
        birds.add(ostrich);
        
        mammals.add(dolphin);
        mammals.add(bat);
        mammals.add(lion);
        
        flyers.add(bat);
        flyers.add(flyingFish);
        flyers.add(eagle);
        
        walkers.add(penguin);
        walkers.add(ostrich);
        walkers.add(bat);
        walkers.add(eagle);
        walkers.add(lion);
       
        soundMakers.add(bat);
        soundMakers.add(eagle);
        soundMakers.add(penguin);
        soundMakers.add(ostrich);
        soundMakers.add(lion);
        soundMakers.add(dolphin);
        
        swimmers.add(dolphin);
        swimmers.add(shark);
        swimmers.add(flyingFish);
        swimmers.add(bass);
        /**
         * Looping through all animals in all lists.
         */
        for (IFly myFlyers : flyers) {
            myFlyers.fly();
        }
        
        for (IWalk myWalkers : walkers) {
            myWalkers.walk();
        }
        
        for (ISwim mySwimmers : swimmers) {
            mySwimmers.swim();
        }
        
        for (IMakeSound mySoundMakers : soundMakers) {
            mySoundMakers.makeSound();
        }
        
        for (Animal myAnimals : animals) {
            System.out.println(myAnimals.toString());
        }
    }
    
}

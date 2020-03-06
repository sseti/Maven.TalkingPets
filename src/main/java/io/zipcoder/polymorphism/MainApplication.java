package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer numberOfPets = 0;
        ArrayList<Pet> pets = new ArrayList<Pet>();

        System.out.println("Please enter number of pets (1-3).");
        numberOfPets =Integer.parseInt(scan.nextLine());

        for(int i = 1; i<=numberOfPets; i++) {

            System.out.println("Please enter pet number " + i  + ", is it a (Dog/Cat/Pig)?");
            String pet = scan.nextLine();
            System.out.println("What is your pet's name?");
            String name = scan.nextLine();

            if (pet.equalsIgnoreCase("Dog")) {
                Dog dog = new Dog(name);
                pets.add(dog);
            } else if (pet.equalsIgnoreCase("Cat")) {
                Cat cat = new Cat(name);
                pets.add(cat);
            } else if (pet.equalsIgnoreCase("Pig")) {
                Pig pig = new Pig(name);
                pets.add(pig);
            } else {
                Pet otherPet = new Pet(name);
                pets.add(otherPet);
            }
        }

        for(int i =0; i<pets.size(); i++){
            System.out.println("You have a " + pets.get(i).getClass().getSimpleName() + " named " + pets.get(i).getName() +".");
        }
    }
}



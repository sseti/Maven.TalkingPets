package io.zipcoder.polymorphism;

public class Pig extends Pet {
    public Pig(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "Oink! Oink!";

    }

}



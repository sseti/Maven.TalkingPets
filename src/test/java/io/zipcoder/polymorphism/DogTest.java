package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    //create a setName test

    @Test
    public void getNameTest(){
        Dog dog = new Dog("Max");
        String expected = "Max";
        String actual = dog.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        Dog dog = new Dog("Max");
        String expected = "Woof!";
        String actual = dog.speak();
        Assert.assertEquals(expected,actual);
    }
}

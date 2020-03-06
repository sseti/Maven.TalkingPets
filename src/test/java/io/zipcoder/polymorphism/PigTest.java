package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PigTest {

    //create a setName test

    @Test
    public void getNameTest(){
        Pig pig = new Pig();
        String expected = "Piglet";
        String actual = pig.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        Pig pig = new Pig();
        String expected = "Oink! Oink!";
        String actual = pig.speak();
        Assert.assertEquals(expected,actual);

    }

}

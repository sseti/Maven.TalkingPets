package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;

public class PetTest {

    //create a setName test

    @Test
    public void getNameTest(){
        Pet pet = new Pet();
        String expected = "George";
        String actual = pet.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        Pet pet = new Pet();
        String expected = "You are useless.";
        String actual = pet.speak();
        Assert.assertEquals(expected,actual);
    }
}

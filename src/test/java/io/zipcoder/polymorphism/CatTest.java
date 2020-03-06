package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    //create a setName test

    @Test
    public void getNameTest(){
        Cat cat = new Cat("Princess");
        String expected = "Princess";
        String actual = cat.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        Cat cat = new Cat("Princess");
        String expected = "Meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected,actual);
    }
}

package com.jenkins.cucumber;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;
    String msg;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizzBuzz() {
        msg = fizzBuzz.play(15);
        Assert.assertEquals("FizzBuzz",msg);
    }

    @Test
    public void testFizz() {
        msg = fizzBuzz.play(3);
        Assert.assertEquals("Fizz",msg);
    }

    @Test
    public void testBuzz() {
        msg = fizzBuzz.play(5);
        Assert.assertEquals("Buzz",msg);
    }

    @After
    public void tearDown(){
        fizzBuzz = null;
    }
}

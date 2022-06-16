package com.pudge.test;

import com.pudge.calculator.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void init() {
        System.out.println("method call starts");
    }

    @After
    public void close() {
        System.out.println("method call ends");
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 30);
        Assert.assertEquals(result, 40);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(10, 30);
        System.out.println(result);
    }
}

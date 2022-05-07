package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerMathTest {



    @Test
    public void shouldAddTwoIntegers() {
        IntegerMath integerMath = new IntegerMath();
        assertEquals(2,integerMath.add(1,1));

    }

    @Test
    public void shouldSubtractTwoIntegers() {
        IntegerMath integerMath = new IntegerMath();
        assertEquals(0,integerMath.subtract(1,1));

    }

    @Test
    public void multiply() {
        IntegerMath integerMath = new IntegerMath();
        assertEquals(1,integerMath.multiply(1,1));

    }

    @Test
    public void divide() {
        IntegerMath integerMath = new IntegerMath();
        assertEquals(1,integerMath.divide(1,1));

    }
}
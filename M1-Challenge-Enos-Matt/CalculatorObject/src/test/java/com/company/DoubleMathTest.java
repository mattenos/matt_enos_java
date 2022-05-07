package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleMathTest {

    @Test
    public void add() {
        DoubleMath doubleMath = new DoubleMath();
        assertEquals(2.3, doubleMath.add(1.2,1.1), 0.1);
    }

    @Test
    public void subtract() {
        DoubleMath doubleMath = new DoubleMath();
        assertEquals(0.1, doubleMath.subtract(1.25,1.12), 0.1);

    }

    @Test
    public void multiply() {
        DoubleMath doubleMath = new DoubleMath();
        assertEquals(3.75, doubleMath.multiply(1.50,2.50), 0.1);
    }

    @Test
    public void divide() {
        DoubleMath doubleMath = new DoubleMath();
        assertEquals(0.6, doubleMath.divide(1.5,2.5), 0.1);

    }
}
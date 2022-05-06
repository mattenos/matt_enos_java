package com.company;

import static org.junit.Assert.*;

public class DoubleMathTest {

    private DoubleMath doubleNumber = new DoubleMath();


    @org.junit.Test
    public void shouldReturnSumOfTwoDoubles() {
        String failMessage = "Expected calculator to handle integer addition.";

        assertEquals(failMessage, 5, doubleNumber.add(2, 3));

    }

//    @org.junit.Test
//    public void subtract() {
//    }
//
//    @org.junit.Test
//    public void multiply() {
//    }
//
//    @org.junit.Test
//    public void divide() {
//    }
}
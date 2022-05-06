package com.company;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConverterIfTest {

    @Test
    public void convertIfNumberToMonth() {
        String actualResult = "March";
        String expectedResult = "February" ;
        assertEquals(expectedResult, actualResult);
           }

    @Test
    public void convertIfNumberToDay() {
        String actualResult = "Thursday";
        String expectedResult = "Monday" ;
        assertEquals(expectedResult, actualResult);
    }
}
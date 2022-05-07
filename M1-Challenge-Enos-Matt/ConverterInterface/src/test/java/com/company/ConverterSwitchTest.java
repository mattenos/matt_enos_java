package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    @Test
    public void shouldSwitchNumberToMonth() {
        ConverterSwitch converterSwitch = new ConverterSwitch();
        String actualResult = converterSwitch.convertMonth(3);
        String expectedResult = "March" ;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldSwitchNumberToDay() {
        ConverterSwitch converterSwitch = new ConverterSwitch();
        String actualResult = converterSwitch.convertDay(4);
        String expectedResult = "Thursday" ;
        assertEquals(expectedResult, actualResult);
    }
}
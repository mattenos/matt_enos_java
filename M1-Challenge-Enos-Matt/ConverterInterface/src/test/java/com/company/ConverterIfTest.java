package com.company;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConverterIfTest {

    @Test
    public void shouldConvertANumberToTheMonthIfGivenANumber() {
        ConverterIf converterIf = new ConverterIf();
        String actualResult = converterIf.convertMonth(2);
        String expectedResult = "February" ;
        assertEquals(expectedResult, actualResult);
           }

    @Test
    public void shouldConvertANumberToTheDayIfGivenANumber() {
        ConverterIf converterIf = new ConverterIf();
        String actualResult = converterIf.convertDay(1);
        String expectedResult = "Monday" ;
        assertEquals(expectedResult, actualResult);
    }
}
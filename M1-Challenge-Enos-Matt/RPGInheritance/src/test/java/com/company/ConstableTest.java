package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    Constable constable = new Constable();
    Warrior warrior = new Warrior();
    Farmer farmer = new Farmer();

    @Test
    public void shouldReturnArrestedPlayerTrue() {
    constable.arrestPlayer(warrior);
    assertTrue(warrior.isArrested());
    }






}
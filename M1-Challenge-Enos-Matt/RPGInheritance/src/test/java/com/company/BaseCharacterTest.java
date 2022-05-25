package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseCharacterTest {

    Constable constable = new Constable();
    Warrior warrior = new Warrior();
    Farmer farmer = new Farmer();

    @Test
    public void shouldReturnLessHealthAfterBeingAttacked(){
        warrior.setHealth(100);
        constable.setAttackPower(5);

        constable.attack(warrior);
        assertEquals(95, warrior.getHealth());
    }

}
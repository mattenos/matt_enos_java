package com.company;

public class PartyBuilder {
    public static void main(String[] args) {

        Constable constable = new Constable();
        Warrior warrior = new Warrior();
        Farmer farmer = new Farmer();

        constable.setStrength(60);
        constable.setHealth(100);
        constable.setStamina(60);
        constable.setSpeed(20);
        constable.setAttackPower(5);
        constable.setRunning(false);
        constable.setArrested(false);
        constable.setJurisdiction("town");
        constable.attack(warrior);
        constable.arrestPlayer(warrior);

        warrior.setStrength(75);
        warrior.setHealth(100);
        warrior.setStamina(100);
        warrior.setSpeed(50);
        warrior.setAttackPower(10);
        warrior.setRunning(false);
        warrior.setArrested(false);
        warrior.setShieldStrength(100);
        warrior.attack(constable);

        farmer.setStrength(75);
        farmer.setHealth(100);
        farmer.setStamina(75);
        farmer.setSpeed(10);
        farmer.setAttackPower(1);
        farmer.setRunning(false);
        farmer.setArrested(false);
        farmer.setPlowing(false);
        farmer.setHarvesting(false);
        farmer.attack(warrior);

    }
}

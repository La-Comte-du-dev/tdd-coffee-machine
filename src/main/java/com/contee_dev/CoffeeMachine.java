package com.contee_dev;

public class CoffeeMachine {
    // Todo : create dedicated "reservoir" class
    private final int MIN_WATER_LVL = 20;
    private final int MAX_WATER_LVL = 100;

    private boolean isSwitchedOn;
    private int waterLvl;

    public CoffeeMachine() {
        this.isSwitchedOn = false;
        this.waterLvl = 0;
    }

    // Business logic
    public void fillWater(int quantityInCL) {
        this.waterLvl = quantityInCL;
    }

    public boolean canWork() {
        return this.waterLvl > MIN_WATER_LVL && this.waterLvl <= MAX_WATER_LVL;
    }

    // Getters & Setters de mort
    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }

    public void switchOn() {
        this.isSwitchedOn = true;
    }

    public void switchOff() {
        this.isSwitchedOn = false;
    }


}

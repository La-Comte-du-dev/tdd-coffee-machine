package com.contee_dev;

public class CoffeeMachine {
    // Todo : create dedicated "reservoir" class
    private final int MIN_WATER_LVL = 20;
    private final int MAX_WATER_LVL = 100;
    private final int CALCIFIED_THRESHOLD = 40;

    private boolean isSwitchedOn;
    private int waterLvl;
    private int calcificationPercent;

    public CoffeeMachine() {
        this.isSwitchedOn = false;
        this.waterLvl = 0;
        this.calcificationPercent = 0;
    }

    public CoffeeMachine(int calcificationPercent) {
        this.isSwitchedOn = false;
        this.waterLvl = 0;
        this.calcificationPercent = calcificationPercent;
    }

    public void fillWater(int quantityInCL) {
        this.waterLvl = quantityInCL;
    }

    public void makeACoffee() {
        if (canWork()) {
            this.waterLvl -= 10;
            this.calcificationPercent += 5;
        }
    }

    public boolean canWork() {
        return notCalcified() && enoughWater();
    }

    private boolean enoughWater() {
        return this.waterLvl > MIN_WATER_LVL && this.waterLvl <= MAX_WATER_LVL;
    }

    private boolean notCalcified() {
        return this.calcificationPercent < CALCIFIED_THRESHOLD;
    }

    public int calcificationPercent() {
        return calcificationPercent;
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

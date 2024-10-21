package com.contee_dev;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoffeeMachineTest {

    @Test
    public void shouldReturnTrue_IfMachineIsSwitchedOn() {
        // given (mes inputs)
        CoffeeMachine machine = coffeeMachineWith(0, 0);
        // when (ce qu'il se passe)
        machine.switchOn();
        boolean isSwitchedOn = machine.isSwitchedOn();
        // then (assertions / ce que j'attends / l'output)
        assertEquals(true, isSwitchedOn);
    }

    @Test
    public void shouldReturnFalse_IfMachineIsSwitchedOff() {
        CoffeeMachine machine = coffeeMachineWith(0, 0);
        machine.switchOff();
        boolean isSwitchedOn = machine.isSwitchedOn();
        assertEquals(false, isSwitchedOn);
    }

    @Test
    public void canMachineCreateCoffee_isWaterLevelIsGreaterThan20CL() {
        // given
        CoffeeMachine machine = coffeeMachineWith(21, 0);
        // when
        boolean canMachineCreateCoffee = machine.canWork();
        // then
        assertEquals(true, canMachineCreateCoffee);
    }

    @Test
    public void cannotMachineCreateCoffee_isWaterLevelIsEqualOrMinusThan20CL() {
        // given
        CoffeeMachine machine = coffeeMachineWith(20, 0);
        // when
        boolean canMachineCreateCoffee = machine.canWork();
        // then
        assertEquals(false, canMachineCreateCoffee);
    }

    @Test
    public void cannotMachineCreateCoffee_isWaterLevelIsGreaterThan100CL() {
        // given
        CoffeeMachine machine = coffeeMachineWith(101, 0);
        // when
        boolean canMachineCreateCoffee = machine.canWork();
        // then
        assertEquals(false, canMachineCreateCoffee);
    }

    @Test
    public void CannotMakeACoffee_WhenCoffeeMachineNotCalcified() {
        // given
        CoffeeMachine machine = coffeeMachineWith(21, 45);

        // when
        // then
        assertEquals(false, machine.canWork());
    }

    @Test
    public void ShouldIncrementCalcification_WhenMachineIsUsed() {
        // given
        CoffeeMachine machine = coffeeMachineWith(21, 0);

        // when
        machine.makeACoffee();

        // then
        assertEquals(5, machine.calcificationPercent());
    }

    // PILOU (OR ANOTHER PERSON) PLEASE MAKE A BUILDER HERE
    private CoffeeMachine coffeeMachineWith(int waterLvl, int calcificationPercent) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(calcificationPercent);
        coffeeMachine.fillWater(waterLvl);

        return coffeeMachine;
    }
}
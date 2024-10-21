package com.contee_dev;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoffeeMachineTest{

   @Test
   public void shouldReturnTrue_IfMachineIsSwitchedOn() {
       // given (mes inputs)
       CoffeeMachine machine = new CoffeeMachine();
       // when (ce qu'il se passe)
       machine.switchOn();
       boolean isSwitchedOn = machine.isSwitchedOn();
       // then (assertions / ce que j'attends / l'output)
       assertEquals(true, isSwitchedOn);
   }

   @Test
   public void shouldReturnFalse_IfMachineIsSwitchedOff() {
       CoffeeMachine machine = new CoffeeMachine();
       machine.switchOff();
       boolean isSwitchedOn = machine.isSwitchedOn();
       assertEquals(false, isSwitchedOn);
   }

   @Test
   public void canMachineCreateCoffee_isWaterLevelIsGreaterThan20CL() {
    // given
    CoffeeMachine machine = new CoffeeMachine();
    machine.fillWater(21);
    // when
    boolean canMachineCreateCoffee = machine.canWork();
    // then
    assertEquals(true, canMachineCreateCoffee);
   }

   @Test
   public void cannotMachineCreateCoffee_isWaterLevelIsEqualOrMinusThan20CL() {
    // given
    CoffeeMachine machine = new CoffeeMachine();
    machine.fillWater(20);
    // when
    boolean canMachineCreateCoffee = machine.canWork();
    // then
    assertEquals(false, canMachineCreateCoffee);
   }

    @Test
    public void cannotMachineCreateCoffee_isWaterLevelIsGreaterThan100CL() {
        // given
        CoffeeMachine machine = new CoffeeMachine();
        machine.fillWater(101);
        // when
        boolean canMachineCreateCoffee = machine.canWork();
        // then
        assertEquals(false, canMachineCreateCoffee);
    }


}
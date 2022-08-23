package com.inheritance;

public class Car extends MotorVehicle{
  public Car(String name, String fuelSource) {
    super(name, 4, fuelSource);
  }

  @Override
  public void beep() {
    System.out.println("The " + this.name + " has a broken horn");
  }

}

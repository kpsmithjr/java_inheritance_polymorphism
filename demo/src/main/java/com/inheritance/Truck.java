package com.inheritance;

public class Truck extends MotorVehicle{
  int bedSize;

  public Truck(String name, int numWheels, String fuelSource, int bedSize) {
    super(name, numWheels, fuelSource);    
    this.bedSize = bedSize;
  }

  @Override
  public void beep() {
    System.out.println("The " + this.name + " truck says BEEEEEEEP, BEEEEEEEEEEEEEEEEEEEP!!!!");
  }

  public void unload() {
    System.out.println("The bed is now empty!");
  }
 
}

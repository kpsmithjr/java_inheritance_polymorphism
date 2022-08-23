package com.inheritance;

import java.sql.Time;

public class MotorVehicle {
    String name;
    String fuelSource;
    int numWheels;

    public MotorVehicle(String name, int numWheels, String fuelSource) {
        this.name = name;
        this.numWheels = numWheels;
        this.fuelSource = fuelSource;
    }

    public void beep() {
        System.out.println("The " + this.name + " says beep.");
    }

    public static void main(String[] args) {
        MotorVehicle tractor = new MotorVehicle("Tractor", 4, "diesel");
        tractor.beep();

        Truck chevy = new Truck("Chevy", 6, "gas", 40);
        chevy.beep();
        chevy.unload();
        System.out.println(chevy.bedSize);
        System.out.println(chevy.name);

        MotorVehicle delorean = new TimeMachine();
        delorean.beep();

        MotorVehicle ford = new Truck("Ford", 4, "gas", 40);
        ford.beep();
    }
}

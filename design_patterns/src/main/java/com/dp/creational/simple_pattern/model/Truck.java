package com.dp.creational.simple_pattern.model;

public class Truck implements Vehicle {
    @Override
    public String getVehicleType() {
        return "Truck type";
    }

    @Override
    public Vehicle newInstance() {
        return new Truck();
    }
}

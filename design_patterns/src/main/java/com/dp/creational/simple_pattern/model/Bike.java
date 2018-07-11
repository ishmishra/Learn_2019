package com.dp.creational.simple_pattern.model;

public class Bike implements Vehicle {
    @Override
    public String getVehicleType() {
        return "Bike type";
    }

    @Override
    public Vehicle newInstance() {
        return new Bike();
    }
}

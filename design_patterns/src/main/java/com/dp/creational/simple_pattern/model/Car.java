package com.dp.creational.simple_pattern.model;

public class Car implements Vehicle {
    @Override
    public String getVehicleType() {
        return "Car type";
    }

    @Override
    public Vehicle newInstance() {
        return new Car();
    }
}

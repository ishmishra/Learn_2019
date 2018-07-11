package com.dp.creational.simple_pattern;

import com.dp.creational.factory.simple_pattern.model.Vehicle;

import java.util.HashMap;
import java.util.Map;

/**
 * We start by adding an abstract method in the base Vehicle class:
 * abstract public Vehicle newInstance();
 * <p>
 * For each product, the method declared abstract in the base class must be
 * implemented:
 *
 * @ Override
 * public Car newInstance()
 * {
 * return new Car();
 * }
 */
public class NewInstanceVehicleFactory {

    private Map<String, Vehicle> registeredProducts = new HashMap<>();

    public void registerVehicle(String vehicleId, Vehicle vehicle) {
        registeredProducts.put(vehicleId, vehicle);
    }

    public Vehicle createVehicle(String vehicleId) {
        return registeredProducts.get(vehicleId).newInstance();
    }

}

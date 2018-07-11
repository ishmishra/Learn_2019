package com.dp.creational.simple_pattern;

import com.dp.creational.factory.simple_pattern.model.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class ReflectionVehicleFactory {

    //we are going to use a map to keep the product IDs along with
    //their corresponding classes:
    private Map<String, Class> registeredProducts = new HashMap<>();

    public void registerVehicle(String vehicleId, Class vehicleClass) {
        registeredProducts.put(vehicleId, vehicleClass);
    }

    public Vehicle createVehicle(String type) throws InstantiationException,
            IllegalAccessException {
        Class productClass = registeredProducts.get(type);
        return (Vehicle) productClass.newInstance();
    }

    /**
     * In certain situations, working with reflection is either impossible or discouraged.
     * Reflection requires a runtime permission that may not be present in certain
     * environments. If performance is an issue, reflection may slow the program and
     * so should be avoided.
     */
}

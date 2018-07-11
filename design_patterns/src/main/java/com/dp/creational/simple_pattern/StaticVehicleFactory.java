package com.dp.creational.simple_pattern;

import com.dp.creational.factory.simple_pattern.model.Bike;
import com.dp.creational.factory.simple_pattern.model.Car;
import com.dp.creational.factory.simple_pattern.model.Truck;
import com.dp.creational.factory.simple_pattern.model.Vehicle;

public class StaticVehicleFactory {

    public enum VehicleType {
        BIKE, CAR, TRUCK
    }

    public static Vehicle create(VehicleType type) {
        if (type.equals(VehicleType.BIKE))
            return new Bike();
        if (type.equals(VehicleType.CAR))
            return new Car();
        if (type.equals(VehicleType.TRUCK))
            return new Truck();
        else return null;
    }

    /**
     * The factory looks very simple_pattern and is responsible for the instantiation of the
     * vehicle classes, complying with the single responsibility principle. It helps us to
     * reduce coupling because the client depends only on the Vehicle interface,
     * complying with the dependency inversion principle.
     */

    /**                        -----BUT------
     * If we need to add a new
     * vehicle class, we need to change the StaticVehicleFactory class, so the open/closed
     * principle is broken.
     */

    /**
     * We can improve the simple_pattern factory pattern to make it open for extension but
     * closed for modification by using a mechanism to register new classes that will be
     * instantiated when needed. There are two ways to achieve this:
     * --Registering product class objects and instantiating them using reflection
     * --Registering product objects and adding a newInstance method to each product
     * that returns a new instance of the same class as itself
     */
}

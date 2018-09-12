package com.ibm.jp.ignacio.control;

import com.ibm.jp.ignacio.entity.Car;
import com.ibm.jp.ignacio.entity.Specification;

import java.util.UUID;

public class CarFactory {

    public Car createCar(Specification specification) {
        Car car = new Car();
        car.setIdentifier(UUID.randomUUID().toString());
        car.setColor(specification.getColor());
        car.setEngineType(specification.getEngineType());
        return car;
    }
}
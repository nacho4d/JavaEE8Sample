package com.ibm.jp.ignacio.control;

import com.ibm.jp.ignacio.entity.Car;
import com.ibm.jp.ignacio.entity.Color;
import com.ibm.jp.ignacio.entity.Specification;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;

public class CarFactory {

    @Inject
    @Named("diesel") // Not type safe. only bounded by string
    Color defaultColor;

    @Inject
    @Diesel // Type safe way
    private Color otherDefaultColor;

    public Car createCar(Specification specification) {
        Car car = new Car();
        car.setIdentifier(UUID.randomUUID().toString());
        car.setColor(specification.getColor() == null ? defaultColor : specification.getColor());
        car.setEngineType(specification.getEngineType());
        return car;
    }
}
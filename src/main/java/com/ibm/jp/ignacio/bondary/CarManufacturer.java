package com.ibm.jp.ignacio.bondary;

import com.ibm.jp.ignacio.control.CarFactory;
import com.ibm.jp.ignacio.control.CarRepository;
import com.ibm.jp.ignacio.entity.Car;
import com.ibm.jp.ignacio.entity.Specification;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class CarManufacturer {

    @Inject
    CarFactory carFactory;

    @Inject
    CarRepository carRepository;

    public Car manufactureCar(Specification specification) {
        Car car = carFactory.createCar(specification);
        carRepository.storeCar(car);


        return car;
    }
}

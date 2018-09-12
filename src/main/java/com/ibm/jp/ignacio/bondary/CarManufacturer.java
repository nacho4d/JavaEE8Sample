package com.ibm.jp.ignacio.bondary;

import com.ibm.jp.ignacio.control.CarFactory;
import com.ibm.jp.ignacio.control.CarRepository;
import com.ibm.jp.ignacio.entity.Car;
import com.ibm.jp.ignacio.entity.Specification;

public class CarManufacturer {

    private final CarFactory carFactory = new CarFactory();
    private final CarRepository carRepository = new CarRepository();

    public Car manufactureCar(Specification specification) {
        Car car = carFactory.createCar(specification);
        carRepository.storeCar(car);

        return car;
    }

    private Car createCar(Specification specification) {
        return carFactory.createCar(specification);
    }
}

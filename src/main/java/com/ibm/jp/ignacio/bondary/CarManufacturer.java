package com.ibm.jp.ignacio.bondary;

import com.ibm.jp.ignacio.control.CarFactory;
import com.ibm.jp.ignacio.control.CarRepository;
import com.ibm.jp.ignacio.entity.Car;
import com.ibm.jp.ignacio.entity.CarCreated;
import com.ibm.jp.ignacio.entity.Specification;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class CarManufacturer {

    @Inject
    CarFactory carFactory;

    @Inject
    CarRepository carRepository;

    @Inject
    Event<CarCreated> carCreatedEvent;

    public Car manufactureCar(Specification specification) {
        Car car = carFactory.createCar(specification);
        carRepository.storeCar(car);

        carCreatedEvent.fire(new CarCreated(car.getIdentifier()));

        return car;
    }

    public List<Car> retrieveCars() {
        return carRepository.loadCars();
    }
}

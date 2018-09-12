package com.ibm.jp.ignacio.control;

import com.ibm.jp.ignacio.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    public void storeCar(Car car) {

    }

    public List<Car> loadCars() {
        List cars = new ArrayList<>();
        cars.add(new Car());
        return cars;
    }
}

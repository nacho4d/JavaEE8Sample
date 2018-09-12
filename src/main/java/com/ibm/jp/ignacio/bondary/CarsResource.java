package com.ibm.jp.ignacio.bondary;

import com.ibm.jp.ignacio.entity.Car;
import com.ibm.jp.ignacio.entity.Specification;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("cars")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarsResource {

    @Inject
    CarManufacturer carManufacturer;

    @GET
    public List<Car> retrieveCars() {
        return carManufacturer.retrieveCars();
    }

    @POST
    public void createCar(Specification specification) {
        carManufacturer.manufactureCar(specification);
    }
}

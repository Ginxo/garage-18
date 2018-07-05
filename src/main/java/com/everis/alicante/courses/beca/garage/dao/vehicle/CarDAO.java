package com.everis.alicante.courses.beca.garage.dao.vehicle;

import com.everis.alicante.courses.beca.garage.domain.vehicle.Car;

public class CarDAO extends AbstractVehicleDAO<Car> {

    private static CarDAO instance;

    private CarDAO() {
        super(Car.class);
    }

    public static CarDAO getInstance() {
        if (instance == null) {
            instance = new CarDAO();
        }
        return instance;
    }

}

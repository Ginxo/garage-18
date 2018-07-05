package com.everis.alicante.courses.beca.garage.dao.vehicle;

import com.everis.alicante.courses.beca.garage.dao.AbstractDAO;
import com.everis.alicante.courses.beca.garage.domain.vehicle.VehicleEntity;

public abstract class AbstractVehicleDAO<V extends VehicleEntity> extends AbstractDAO<V> {

    public AbstractVehicleDAO(Class<V> clazz) {
        super(clazz);
    }
}

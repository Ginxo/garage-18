package com.everis.alicante.courses.beca.garage.manager.vehicle;

import com.everis.alicante.courses.beca.garage.dao.AbstractDAO;
import com.everis.alicante.courses.beca.garage.domain.vehicle.Vehicle;
import com.everis.alicante.courses.beca.garage.manager.AbstractManager;

public abstract class AbstractVehicleManager<T extends Vehicle> extends AbstractManager<T> {

    abstract AbstractDAO<T> getDao();
}

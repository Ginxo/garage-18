package com.everis.alicante.courses.beca.garage.manager.vehicle;

import com.everis.alicante.courses.beca.garage.dao.vehicle.CarDAO;
import com.everis.alicante.courses.beca.garage.domain.vehicle.Car;

public class CarManager extends AbstractVehicleManager<Car> {

	private static CarManager instance;

	private CarManager() {
	}

	public static CarManager getInstance() {
		if (instance == null) {
			instance = new CarManager();
		}
		return instance;
	}

	@Override
	protected CarDAO getDao() {
		return CarDAO.getInstance();
	}
}

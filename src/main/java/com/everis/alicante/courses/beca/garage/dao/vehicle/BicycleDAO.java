package com.everis.alicante.courses.beca.garage.dao.vehicle;

import com.everis.alicante.courses.beca.garage.domain.vehicle.Bicycle;

public class BicycleDAO extends AbstractVehicleDAO<Bicycle> {
	
	private static BicycleDAO instance;

	private BicycleDAO() {
		super(Bicycle.class);
	}

	public static BicycleDAO getInstance() {
		if (instance == null) {
			instance = new BicycleDAO();
		}
		return instance;
	}
}

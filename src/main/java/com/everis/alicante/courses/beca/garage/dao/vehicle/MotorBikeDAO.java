package com.everis.alicante.courses.beca.garage.dao.vehicle;

import com.everis.alicante.courses.beca.garage.domain.vehicle.MotorBike;

public class MotorBikeDAO extends AbstractVehicleDAO<MotorBike> {
	
	private static MotorBikeDAO instance;

	private MotorBikeDAO() {
		super(MotorBike.class);
	}

	public static MotorBikeDAO getInstance() {
		if (instance == null) {
			instance = new MotorBikeDAO();
		}
		return instance;
	}

}

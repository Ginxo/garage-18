package com.everis.alicante.courses.beca.garage.manager.vehicle;

import com.everis.alicante.courses.beca.garage.dao.vehicle.MotorBikeDAO;
import com.everis.alicante.courses.beca.garage.domain.vehicle.MotorBike;

public class MotorBikeManager extends AbstractVehicleManager<MotorBike> {
	
	private static MotorBikeManager instance;

	private MotorBikeManager() {
	}

	public static MotorBikeManager getInstance() {
		if (instance == null) {
			instance = new MotorBikeManager();
		}
		return instance;
	}
	
	@Override
	protected MotorBikeDAO getDao() {
		return MotorBikeDAO.getInstance();
	}

	
}

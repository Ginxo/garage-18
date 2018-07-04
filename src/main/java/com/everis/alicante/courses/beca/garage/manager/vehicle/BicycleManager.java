package com.everis.alicante.courses.beca.garage.manager.vehicle;


import com.everis.alicante.courses.beca.garage.dao.vehicle.BicycleDAO;
import com.everis.alicante.courses.beca.garage.domain.vehicle.Bicycle;

public class BicycleManager extends AbstractVehicleManager<Bicycle> {
	
	private static BicycleManager instance;

	private BicycleManager() {
	}

	public static BicycleManager getInstance() {
		if (instance == null) {
			instance = new BicycleManager();
		}
		return instance;
	}
	
	@Override
	public BicycleDAO getDao() {
		return BicycleDAO.getInstance();
	}
	
}

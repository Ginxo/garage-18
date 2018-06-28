package com.everis.alicante.courses.beca.garage.dao.vehicle;

import com.everis.alicante.courses.beca.garage.domain.vehicle.Bicycle;

public class BicycleDAO extends AbstractVehicleDAO<Bicycle> {
	
	private static BicycleDAO instance;
	private String path="C:\\Users\\kiler\\git\\GarageMaven\\garage\\src\\main\\resources\\Bicycle.txt";

	private BicycleDAO() {
	}

	public static BicycleDAO getInstance() {
		if (instance == null) {
			instance = new BicycleDAO();
		}
		return instance;
	}
	
	@Override
	public String getFilePath() {
		return path;
	}

	@Override
	public Bicycle build(String... strings) {
		return new Bicycle(strings[0], strings[1]);
	}
	
	@Override
	public String toFile(Bicycle element) {
		return String.format("%s;%s", element.getColor(), element.getModel());
	}

}

package com.everis.alicante.courses.beca.garage.dao.vehicle;

import com.everis.alicante.courses.beca.garage.domain.vehicle.MotorBike;

public class MotorBikeDAO extends AbstractVehicleDAO<MotorBike> {
	
	private static MotorBikeDAO instance;
	private String path="C:\\Users\\kiler\\git\\GarageMaven\\garage\\src\\main\\resources\\MotorBike.txt";

	private MotorBikeDAO() {
	}

	public static MotorBikeDAO getInstance() {
		if (instance == null) {
			instance = new MotorBikeDAO();
		}
		return instance;
	}
	
	@Override
	public String getFilePath() {
		return path;
	}

	@Override
	public MotorBike build(String... strings) {
		return new MotorBike(strings[0], strings[1], strings[2]);
	}
	
	@Override
	public String toFile(MotorBike element) {
		return String.format("%s;%s;%s",element.getPlate(),element.getColor(),element.getModel());
	}

}

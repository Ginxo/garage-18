package com.everis.alicante.courses.beca.garage.dao.vehicle;

import com.everis.alicante.courses.beca.garage.domain.vehicle.Car;

public class CarDAO extends AbstractVehicleDAO<Car> {
	
	
	private static CarDAO instance;
	private String path="C:\\Users\\kiler\\git\\GarageMaven\\garage\\src\\main\\resources\\Car.txt";

	private CarDAO() {
	}

	public static CarDAO getInstance() {
		if (instance == null) {
			instance = new CarDAO();
		}
		return instance;
	}

	@Override
	public String getFilePath() {
		return path;
	}

	@Override
	public Car build(String... strings) {
		return new Car(strings[0], strings[1], strings[2]);
	}

	@Override
	public String toFile(Car element) {
		return String.format("%s;%s;%s",element.getPlate(),element.getColor(),element.getModel());
	}
	
	

}

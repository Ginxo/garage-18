package com.everis.alicante.courses.beca.garage.domain.vehicle;

public abstract class AbstractVehicle implements Vehicle {

	private String color, model;
	private Integer numWheels;

	public AbstractVehicle (String color, String model, Integer numWheels) {
		this.color=color;
		this.model=model;
		this.numWheels=numWheels;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public Integer getNumWheels() {
		return numWheels;
	}
}

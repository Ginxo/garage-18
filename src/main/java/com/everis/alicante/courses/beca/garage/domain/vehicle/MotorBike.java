package com.everis.alicante.courses.beca.garage.domain.vehicle;

public class MotorBike extends AbstractVehicle {

	private String plate;

	public MotorBike(String plate, String color, String model) {
		super(color,model,2);
		this.plate = plate;
	}
	
	public String getPlate() {
		return plate;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t\t%s\n",plate,getModel());
	}

}

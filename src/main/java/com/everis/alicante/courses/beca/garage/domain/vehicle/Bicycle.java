package com.everis.alicante.courses.beca.garage.domain.vehicle;

public class Bicycle extends AbstractVehicle {

	public Bicycle(String color, String model) {
		super(color,model,2);
	}
	
	@Override
	public String toString() {
		return String.format("XXXXXXX\t\t%s\n",getModel());
	}
	
}

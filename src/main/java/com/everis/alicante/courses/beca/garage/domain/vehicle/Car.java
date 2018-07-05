package com.everis.alicante.courses.beca.garage.domain.vehicle;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(VehicleType.Values.CAR_TYPE)
@Getter
@Setter
public class Car extends AbstractVehicle {

	private String plate;

	public Car() {
		super.setType(VehicleType.CAR);
		super.setNumWheels(4);
	}

	@Override
	public String toString() {
		return String.format("id: %s, type: %s, color: %s, model: %s, numWheels: %s, plate: %s", getId(), getType(), getColor(), getModel(), getNumWheels(), plate);
	}
	
}

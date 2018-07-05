package com.everis.alicante.courses.beca.garage.domain.vehicle;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(VehicleType.Values.MOTORBIKE_TYPE)
@Getter
@Setter
public class MotorBike extends AbstractVehicle {

	private String plate;

	public MotorBike() {
		super.setType(VehicleType.MOTORBIKE);
		super.setNumWheels(2);
	}
	
	@Override
	public String toString() {
		return String.format("id: %s, type: %s, color: %s, model: %s, numWheels: %s, plate: %s", getId(), getType(), getColor(), getModel(), getNumWheels(), plate);
	}

}

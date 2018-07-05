package com.everis.alicante.courses.beca.garage.domain.vehicle;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(VehicleType.Values.BICYCLE_TYPE)
@Getter
@Setter
public class Bicycle extends AbstractVehicle {

	public Bicycle() {
		super.setType(VehicleType.BICYCLE);
		super.setNumWheels(2);
	}
	
	@Override
	public String toString() {
		return String.format("id: %s, type: %s, color: %s, model: %s, numWheels: %s", getId(), getType(), getColor(), getModel(), getNumWheels());
	}
	
}

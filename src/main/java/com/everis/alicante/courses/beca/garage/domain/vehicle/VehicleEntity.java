package com.everis.alicante.courses.beca.garage.domain.vehicle;

import com.everis.alicante.courses.beca.garage.domain.GarageEntity;

public interface VehicleEntity extends GarageEntity {
	
	String getColor();
	
	String getModel();
	
	Integer getNumWheels();
	
}

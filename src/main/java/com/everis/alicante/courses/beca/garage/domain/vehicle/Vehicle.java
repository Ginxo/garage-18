package com.everis.alicante.courses.beca.garage.domain.vehicle;

import com.everis.alicante.courses.beca.garage.domain.GarageEntity;

public interface Vehicle extends GarageEntity {
	
	String getColor();
	
	String getModel();
	
	Integer getNumWheels();
	
}

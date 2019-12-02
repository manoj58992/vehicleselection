package com.vehicleservice;

import com.dto.VehicleDto;

public class VehicleService {

	public VehicleDto giveDemoVehicle() {
		VehicleDto v = new VehicleDto();
		v.setName("Honda");
		v.setModel("Accord");
		v.setType("Personal");
		return v;

	}

}

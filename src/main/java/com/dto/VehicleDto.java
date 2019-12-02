package com.dto;

public class VehicleDto {
	private String name;
	private String model;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "VehicleDto [name=" + name + ", model=" + model + ", type=" + type + "]";
	}

}

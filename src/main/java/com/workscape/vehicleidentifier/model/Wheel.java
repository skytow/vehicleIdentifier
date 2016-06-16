package com.workscape.vehicleidentifier.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Wheel {

	private Position position;
	private Material material;

	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	} 

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}

package com.workscape.vehicleidentifier.model;

import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.workscape.vehicleidentifier.jaxb.PowertrainAdapter;
import com.workscape.vehicleidentifier.jaxb.WheelsAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class Vehicle {

	private String id;

	private Frame frame;

	@XmlJavaTypeAdapter(value=WheelsAdapter.class)
	private Map<Position, Material> wheels;

	@XmlElement(name="powertrain")
	@XmlJavaTypeAdapter(value=PowertrainAdapter.class)
	private PowertrainType powertrainType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public Map<Position, Material> getWheels() {
		return wheels;
	}

	public void setWheels(Map<Position, Material> wheels) {
		this.wheels = wheels;
	}

	public PowertrainType getPowertrainType() {
		return powertrainType;
	}

	public void setPowertrainType(PowertrainType powertrainType) {
		this.powertrainType = powertrainType;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
}

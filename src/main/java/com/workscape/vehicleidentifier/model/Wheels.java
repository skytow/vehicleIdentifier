package com.workscape.vehicleidentifier.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@XmlAccessorType(XmlAccessType.FIELD)
public class Wheels {

	@XmlElement(name="wheel")
	private List<Wheel> wheels;

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}

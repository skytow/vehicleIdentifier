package com.workscape.vehicleidentifier.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "position")
@XmlEnum
public enum Position {

	@XmlEnumValue("rear")
	REAR,
	@XmlEnumValue("left rear")
	LEFT_REAR,
	@XmlEnumValue("right rear")
	RIGHT_REAR,
	@XmlEnumValue("front")
	FRONT,
	@XmlEnumValue("left front")
	LEFT_FRONT,
	@XmlEnumValue("right front")
	RIGHT_FRONT

}

package com.workscape.vehicleidentifier.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "material")
@XmlEnum
public enum Material {
	
	@XmlEnumValue("plastic")
	PLASTIC,
	@XmlEnumValue("metal")
	METAL

}
